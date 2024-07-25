package net.apple70cents.wordoverflow.mixins;

import net.minecraft.block.entity.HangingSignBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HangingSignBlockEntity.class)
public abstract class HangingSignBlockEntityMixin {
    @Inject(method = "getMaxTextWidth", at = @At("RETURN"), cancellable = true)
    private void modifyMaxTextWidth(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Integer.MAX_VALUE);
    }
}
