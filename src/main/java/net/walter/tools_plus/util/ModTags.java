package net.walter.tools_plus.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.walter.tools_plus.ToolsPlus;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = tag("needs_amethyst_tool");
        public static final TagKey<Block> NEEDS_LAPIS_TOOL = tag("needs_lapis_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ToolsPlus.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ToolsPlus.MOD_ID, name));
        }
    }
}
