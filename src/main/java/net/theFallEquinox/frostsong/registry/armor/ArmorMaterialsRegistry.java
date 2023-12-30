package net.theFallEquinox.frostsong.registry.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.theFallEquinox.frostsong.Frostsong;
import net.theFallEquinox.frostsong.registry.item.ItemRegistry;

import java.util.function.Supplier;

public enum ArmorMaterialsRegistry implements ArmorMaterial {
    COLD_WEATHER_GARMENTS("cold_weather_garments", 22, new int[]{4, 6, 4, 3}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ItemRegistry.CIRUNELEK_FUR.get())
            );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmount;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairItem;

    private static final int[] BASE_DURABILITY = {6, 11, 10, 8};

    ArmorMaterialsRegistry(String name, int durabilityMultiplier, int[] protectionAmount, int enchantability,
                           SoundEvent equipSound, float toughness, float knockbackResistance,
                           Supplier<Ingredient> repairItem) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmount = protectionAmount;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairItem = repairItem;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmount[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairItem.get();
    }

    @Override
    public String getName() {
        return Frostsong.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
