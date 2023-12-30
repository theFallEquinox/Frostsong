package net.theFallEquinox.frostsong.registry.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.theFallEquinox.frostsong.Frostsong;
import net.theFallEquinox.frostsong.content.item.FishingSpearItem;
import net.theFallEquinox.frostsong.registry.armor.ArmorMaterialsRegistry;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Frostsong.MOD_ID);

    public static final RegistryObject<Item> TRAVELSIZED_JOURNAL = ITEMS.register("travelsized_journal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CIRUNELEK_FUR = ITEMS.register("cirunelek_fur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AATAAK_HIDE = ITEMS.register("aataak_hide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITTLED_STICK = ITEMS.register("whittled_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FISHING_SPEAR = ITEMS.register("fishing_spear",
            () -> new FishingSpearItem(new Item.Properties()));

    // ARMOR
    public static final RegistryObject<Item> COLD_WEATHER_HOOD = ITEMS.register("cold_weather_hood",
            () -> new ArmorItem(ArmorMaterialsRegistry.COLD_WEATHER_GARMENTS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PARKA = ITEMS.register("parka",
            () -> new ArmorItem(ArmorMaterialsRegistry.COLD_WEATHER_GARMENTS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COLD_WEATHER_PANTS = ITEMS.register("cold_weather_pants",
            () -> new ArmorItem(ArmorMaterialsRegistry.COLD_WEATHER_GARMENTS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COLD_WEATHER_BOOTS = ITEMS.register("cold_weather_boots",
            () -> new ArmorItem(ArmorMaterialsRegistry.COLD_WEATHER_GARMENTS, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
