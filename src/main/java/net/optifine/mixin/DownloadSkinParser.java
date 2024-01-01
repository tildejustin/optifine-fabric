package net.optifine.mixin;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import net.minecraft.client.render.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.awt.image.BufferedImage;

@Mixin(DownloadedSkinParser.class)
public abstract class DownloadSkinParser implements BufferedImageSkinProvider {
    @Shadow
    private int width;

    @Shadow
    private int height;

    @Shadow
    protected abstract void setOpaque(int uMin, int vMin, int uMax, int vMax);

    @Shadow protected abstract void setTransparent(int uMin, int vMin, int uMax, int vMax);

    @Inject(method = "parseSkin", at = @At(value = "INVOKE", target = "Ljava/awt/image/BufferedImage;<init>(III)V"))
    private void doubleHeight(BufferedImage image, CallbackInfoReturnable<BufferedImage> cir) {
        for (; this.width < image.getWidth() || this.height < image.getHeight(); this.height *= 2) {
            this.width *= 2;
        }
    }

    @Redirect(method = "parseSkin", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/DownloadedSkinParser;setOpaque(IIII)V", ordinal = 0))
    private void setOpaque1(DownloadedSkinParser instance, int vMin, int uMax, int vMax, int i, @Share("w") LocalIntRef w, @Share("h") LocalIntRef h) {
        w.set(this.height);
        h.set(this.height);
        this.setOpaque(0, 0, w.get() / 2, h.get() / 2);
    }

    @Redirect(method = "parseSkin", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/DownloadedSkinParser;setTransparent(IIII)V"))
    private void setTransparent1(DownloadedSkinParser instance, int vMin, int uMax, int vMax, int i, @Share("w") LocalIntRef w, @Share("h") LocalIntRef h) {
        this.setTransparent(w.get() / 2, 0, w.get(), h.get());
    }

    @Redirect(method = "parseSkin", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/DownloadedSkinParser;setOpaque(IIII)V", ordinal = 1))
    private void setOpaque2(DownloadedSkinParser instance, int vMin, int uMax, int vMax, int i, @Share("w") LocalIntRef w, @Share("h") LocalIntRef h) {
        this.setOpaque(0, h.get() / 2, w.get(), h.get());
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 32, ordinal = 5))
    private int replace32_1(int constant, @Share("w") LocalIntRef w) {
        return w.get() / 2;
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 32, ordinal = 6))
    private int replace32_2(int constant, @Share("w") LocalIntRef w) {
        return w.get() / 2;
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 64, ordinal = 3))
    private int replace64_1(int constant, @Share("w") LocalIntRef w) {
        return w.get();
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 64, ordinal = 4))
    private int replace64_2(int constant, @Share("w") LocalIntRef w) {
        return w.get();
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 64, ordinal = 5))
    private int replace64_3(int constant, @Share("w") LocalIntRef w) {
        return w.get();
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 64, ordinal = 6))
    private int replace64_4(int constant, @Share("w") LocalIntRef w) {
        return w.get();
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 16, ordinal = 2))
    private int replace16_1(int constant, @Share("h") LocalIntRef h) {
        return h.get() / 2;
    }

    @ModifyConstant(method = "parseSkin", constant = @Constant(intValue = 16, ordinal = 3))
    private int replace16_2(int constant, @Share("h") LocalIntRef h) {
        return h.get() / 2;
    }
}
