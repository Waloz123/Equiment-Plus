package net.walter.tools_plus.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.walter.tools_plus.ToolsPlus;
import net.walter.tools_plus.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier Amethyst = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD)),
            new ResourceLocation(ToolsPlus.MOD_ID, "amethyst"), List.of(Tiers.IRON), List.of());

}
