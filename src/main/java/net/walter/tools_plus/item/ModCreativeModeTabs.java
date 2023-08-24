package net.walter.tools_plus.item;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.walter.tools_plus.ToolsPlus;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToolsPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOOLS_PLUS = CREATIVE_MODE_TABS.register("tools_plus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST_SWORD.get()))
                    .title(Component.translatable("creativetab.tools_plus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AMETHYST_SWORD.get());
                        pOutput.accept(ModItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(ModItems.AMETHYST_AXE.get());
                        pOutput.accept(ModItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(ModItems.AMETHYST_HOE.get());

                        pOutput.accept(ModItems.AMETHYST_HELMET.get());
                        pOutput.accept(ModItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(ModItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(ModItems.AMETHYST_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
