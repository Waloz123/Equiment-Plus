package net.walter.tools_plus.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.walter.tools_plus.ToolsPlus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ToolsPlus.MOD_ID);

    public static final RegistryObject<Item> TEMPLATE = ITEMS.register("template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.Amethyst, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.Amethyst, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.Amethyst, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.Amethyst, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.Amethyst, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword",
            () -> new SwordItem(ModToolTiers.LAPIS, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAPIS, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe",
            () -> new AxeItem(ModToolTiers.LAPIS, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel",
            () -> new ShovelItem(ModToolTiers.LAPIS, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe",
            () -> new HoeItem(ModToolTiers.LAPIS, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
