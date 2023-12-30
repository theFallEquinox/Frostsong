package net.theFallEquinox.frostsong.registry.creative;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.theFallEquinox.frostsong.Frostsong;
import net.theFallEquinox.frostsong.registry.block.BlockRegistry;
import net.theFallEquinox.frostsong.registry.item.ItemRegistry;

public class CreativeModeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Frostsong.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FROSTSONG_TAB = CREATIVE_MODE_TABS.register("frostsong_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.COLD_WEATHER_BOOTS.get()))
                    .title(Component.translatable("creativetab.frostsong_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ItemRegistry.TRAVELSIZED_JOURNAL.get());
                        output.accept(ItemRegistry.AATAAK_HIDE.get());
                        output.accept(ItemRegistry.CIRUNELEK_FUR.get());
                        output.accept(ItemRegistry.WHITTLED_STICK.get());
                        output.accept(ItemRegistry.FISHING_SPEAR.get());

                        output.accept(ItemRegistry.COLD_WEATHER_HOOD.get());
                        output.accept(ItemRegistry.PARKA.get());
                        output.accept(ItemRegistry.COLD_WEATHER_PANTS.get());
                        output.accept(ItemRegistry.COLD_WEATHER_BOOTS.get());

                        output.accept(BlockRegistry.SNOW_BRICKS.get());

                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}