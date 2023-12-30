package net.theFallEquinox.frostsong.content.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.Level;

public class FishingSpearItem extends Item implements Vanishable {
    private static final int THROWN_THRESHOLD_TIME = 8;
    private static final float BASE_DAMAGE = 8.0f;
    private static final float SHOOT_POWER = 3.5f;

    public FishingSpearItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.SPEAR;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 62000;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity livingEntity, int timeRemaining) {
        if(livingEntity instanceof Player player) {
            int i = this.getUseDuration(stack) - timeRemaining;
        }
    }
}