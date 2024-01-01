package net.optifine.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.*;
import net.minecraft.client.render.*;
import net.minecraft.client.render.world.ListedChunkRenderManager;
import net.minecraft.client.texture.PlayerSkinTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.optifine.*;
import net.optifine.interfaces.WorldRendererInterface;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import java.nio.IntBuffer;

@SuppressWarnings({"OverwriteAuthorRequired", "AddedMixinMembersNamePattern"})
@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin implements WorldRendererInterface {
    @Shadow
    private Minecraft client;

    @Shadow
    public abstract void reload();

    @Shadow
    private BufferBuilder[] field_1912;

    @Shadow
    private int field_1893;

    @Shadow
    private int field_1897;

    @Shadow
    private int field_1894;

    @Shadow
    private boolean field_1921;

    @Shadow
    private int field_1895;

    @Shadow
    private int field_1896;

    @Shadow
    @Final
    private TextureManager textureManager;
    @Shadow
    private ListedChunkRenderManager[] field_1901;
    @Unique
    private VersionThread versionThread = new VersionThread();

    @Unique
    private IntBuffer glListBuffer;

    @Override
    public VersionThread getVersionThread() {
        return versionThread;
    }

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/world/ListedChunkRenderManager;<init>()V", shift = At.Shift.AFTER, ordinal = 0))
    private void ListedChunkRenderManager1(Minecraft textureManager, TextureManager par2, CallbackInfo ci) {
        this.field_1901 = null;
    }

    @Inject(method = "<init>", at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/WorldRenderer;client:Lnet/minecraft/client/Minecraft;", opcode = Opcodes.PUTFIELD))
    private void runOptifineInit(Minecraft textureManager, TextureManager par2, CallbackInfo ci) {
        VersionThread.checkOpenGlCaps();
        this.versionThread = new VersionThread();
        this.versionThread.start();
        this.glListBuffer = BufferUtils.createIntBuffer(65536);
    }

    @ModifyExpressionValue(method = "reload", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;cameraEntity:Lnet/minecraft/entity/mob/MobEntity;"))
    private MobEntity checkCameraEntityNull(MobEntity original) {
        return original == null ? this.client.playerEntity : original;
    }

    @Inject(method = "getEntitiesDebugString", at = @At("RETURN"), cancellable = true)
    private void addOptifineString(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(cir.getReturnValue() + ", " + VersionThread.VERSION);
    }

    @Inject(method = "method_1374", at = @At(value = "INVOKE", target = "Ljava/util/Arrays;sort([Ljava/lang/Object;Ljava/util/Comparator;)V", shift = At.Shift.AFTER))
    private void setGlobalChunkOffsets(MobEntity mobEntity, int i, double d, CallbackInfoReturnable<Integer> cir) {
        int playerX = (int) mobEntity.x;
        int playerZ = (int) mobEntity.z;
        int step = 2000;
        if(Math.abs(playerX - BufferBuilderHelper.globalChunkOffsetX) > step || Math.abs(playerZ - BufferBuilderHelper.globalChunkOffsetZ) > step) {
            BufferBuilderHelper.globalChunkOffsetX = playerX;
            BufferBuilderHelper.globalChunkOffsetZ = playerZ;
            this.reload();
        }
    }

    @Overwrite
    private int method_1368(int startIndex, int endIndex, int renderPass, double partialTicks) {
        this.glListBuffer.clear();
        int l = 0;

        for (int i = startIndex; i < endIndex; i++) {
            BufferBuilder wr = this.field_1912[i];
            if(renderPass == 0) {
                this.field_1893++;
                if(wr.field_1791[renderPass]) {
                    this.field_1897++;
                } else if(!wr.field_1790) {
                    this.field_1894++;
                } else if(this.field_1921 && !wr.field_1798) {
                    this.field_1895++;
                } else {
                    this.field_1896++;
                }
            }

            if(!wr.field_1791[renderPass] && wr.field_1790 && (!this.field_1921 || wr.field_1798)) {
                int glCallList = wr.method_1308(renderPass);
                if(glCallList >= 0) {
                    this.glListBuffer.put(glCallList);
                    l++;
                }
            }
        }

        this.glListBuffer.flip();
        MobEntity entityliving = this.client.cameraEntity;
        double partialX = entityliving.prevTickX + (entityliving.x - entityliving.prevTickX) * partialTicks - (double) BufferBuilderHelper.globalChunkOffsetX;
        double partialY = entityliving.prevTickY + (entityliving.y - entityliving.prevTickY) * partialTicks;
        double partialZ = entityliving.prevTickZ + (entityliving.z - entityliving.prevTickZ) * partialTicks - (double) BufferBuilderHelper.globalChunkOffsetZ;
        this.client.gameRenderer.beforeWorldRender(partialTicks);
        GL11.glTranslatef((float) (-partialX), (float) (-partialY), (float) (-partialZ));
        GL11.glCallLists(this.glListBuffer);
        GL11.glTranslatef((float) partialX, (float) partialY, (float) partialZ);
        this.client.gameRenderer.afterWorldRender(partialTicks);
        return l;
    }

    @Overwrite
    public void method_1366(int var1, double var2) {
    }

    // TODO: check injection, fix name
    @SuppressWarnings("InvalidInjectorMethodSignature")
    @ModifyVariable(method = "spawnParticleInternal", at = @At(value = "STORE", ordinal = 0), name = "var22")
    private double critOptimization(double var22, String particleName) {
        if(particleName.equals("crit")) {
            return 196.0;
        }
        return var22;
    }

    @Inject(method = "onEntitySpawned", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/TextureManager;addPlayerSkin(Ljava/lang/String;Lnet/minecraft/client/render/BufferedImageSkinProvider;)Lnet/minecraft/client/texture/PlayerSkinTexture;"))
    private void capturePlayerEntitySpawn(Entity entity, CallbackInfo ci) {
        if(entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            PlayerSkinTexture tdid = this.textureManager.addPlayerSkin(player.field_3236, new DownloadedSkinParser());
            this.textureManager.removePlayerSkin(player.field_3236);
            String urlStr = "http://optifine.net/capes/" + player.username + ".png";
            class_526 playerSkinTextureDownloader = new class_526(tdid, urlStr, new DownloadedSkinParser());
            playerSkinTextureDownloader.start();
        }
    }

    @Inject(method = "dispatchEvent", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;spawnParticle(Ljava/lang/String;DDDDDD)V", ordinal = 0, shift = At.Shift.AFTER), cancellable = true)
    private void returnEarlySmokeParticle(CallbackInfo ci, @Local(ordinal = 7) int i) {
        if(i > 10) {
            ci.cancel();
        }
    }

    @Override
    public int renderAllSortedRenderers(int renderPass, double partialTicks) {
        return this.method_1368(0, this.field_1912.length, renderPass, partialTicks);
    }
}
