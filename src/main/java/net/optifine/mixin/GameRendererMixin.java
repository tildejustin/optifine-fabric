package net.optifine.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.render.*;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import net.optifine.VersionThread;
import net.optifine.interfaces.WorldRendererInterface;
import org.lwjgl.opengl.ContextCapabilities;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
    @Shadow
    private Minecraft client;

    @Inject(method = "method_1331", at = @At("HEAD"))
    private void checkOnVersionThread(CallbackInfo ci) {
        World world = this.client.world;
        if (world != null && VersionThread.newRelease != null) {
            String fullNewVer = "L " + VersionThread.newRelease;
            this.client.inGameHud.getChatHud().method_898("A new §eOptiFine§f version is available: §e" + fullNewVer + "§f");
            VersionThread.newRelease = null;
        }
    }

    @Redirect(method = "renderWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;method_1374(Lnet/minecraft/entity/mob/MobEntity;ID)I"), slice = @Slice(from = @At(value = "INVOKE_STRING", target = "Lnet/minecraft/util/profiler/Profiler;swap(Ljava/lang/String;)V", args = {"ldc=outline"})))
    private int renderAllSortedRenderers1(WorldRenderer instance, MobEntity entity, int i, double d) {
        return ((WorldRendererInterface) instance).renderAllSortedRenderers(i, d);
    }

    @Redirect(method = "renderWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;method_1366(ID)V"))
    private void renderAllSortedRenderers2(WorldRenderer instance, int i, double d) {
        ((WorldRendererInterface) instance).renderAllSortedRenderers(i, d);
    }

    @Redirect(method = "*", at = @At(value = "FIELD", target = "Lorg/lwjgl/opengl/ContextCapabilities;GL_NV_fog_distance:Z"))
    private boolean noGL_NV_fog_distance(ContextCapabilities ignored) {
        return false;
    }
}
