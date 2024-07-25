package net.apple70cents.wordoverflow.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(BookScreen.class)
public abstract class BookScreenMixin {
    @Shadow
    private List<OrderedText> cachedPage;

    @ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Ljava/lang/Math;min(II)I"))
    private int doNotTrimLines1(int original) {
        return this.cachedPage.size();
    }

    @ModifyExpressionValue(method = "getTextStyleAt", at = @At(value = "INVOKE", target = "Ljava/lang/Math;min(II)I"))
    private int doNotTrimLines2(int original) {
        return this.cachedPage.size();
    }

}
