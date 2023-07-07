package net.walter.tools_plus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier AMETHYST = new ForgeTier(3, 1400, 50f,
            50f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
}
