package net.optifine.mixin;

import net.minecraft.client.render.*;
import net.optifine.BufferBuilderHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(BufferBuilder.class)
public abstract class BufferBuilderMixin {
    @ModifyConstant(method = "method_1309", constant = @Constant(floatValue = 6.0F, ordinal = 0))
    private float var4(float constant) {
        return 0.0f;
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPopMatrix()V"))
    private void popMatrix() {
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPushMatrix()V"))
    private void pushMatrix() {
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glTranslatef(FFF)V"))
    private void glTranslatef(float x, float y, float z) {
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glScalef(FFF)V"))
    private void glScalef(float x, float y, float z) {
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/BufferBuilder;method_1317()V"))
    private void method_1317(BufferBuilder instance) {
    }

    @Redirect(method = "method_1307", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Tessellator;offset(DDD)V"))
    private void offset(Tessellator instance, double y, double z, double v) {
        instance.offset(-BufferBuilderHelper.globalChunkOffsetX, 0, -BufferBuilderHelper.globalChunkOffsetZ);
    }
}
