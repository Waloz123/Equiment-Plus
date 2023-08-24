package net.walter.tools_plus.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.walter.tools_plus.block.ModBlocks;
import net.walter.tools_plus.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_SWORD.get())
                .pattern(" $ ")
                .pattern(" $ ")
                .pattern(" I ")
                .define('$', Items.AMETHYST_SHARD)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.AMETHYST_SWORD.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_PICKAXE.get())
                .pattern("$$$")
                .pattern(" I ")
                .pattern(" I ")
                .define('$', Items.AMETHYST_SHARD)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.AMETHYST_PICKAXE.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_AXE.get())
                .pattern(" $$")
                .pattern(" I$")
                .pattern(" I ")
                .define('$', Items.AMETHYST_SHARD)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.AMETHYST_AXE.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_SHOVEL.get())
                .pattern(" $ ")
                .pattern(" I ")
                .pattern(" I ")
                .define('$', Items.AMETHYST_SHARD)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.AMETHYST_SHOVEL.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_HOE.get())
                .pattern(" $$")
                .pattern(" I ")
                .pattern(" I ")
                .define('$', Items.AMETHYST_SHARD)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.AMETHYST_HOE.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_HELMET.get())
                .pattern("$$$")
                .pattern("$ $")
                .pattern("   ")
                .define('$', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.AMETHYST_HELMET.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_CHESTPLATE.get())
                .pattern("$ $")
                .pattern("$$$")
                .pattern("$$$")
                .define('$', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.AMETHYST_CHESTPLATE.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_LEGGINGS.get())
                .pattern("$$$")
                .pattern("$ $")
                .pattern("$ $")
                .define('$', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.AMETHYST_LEGGINGS.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_BOOTS.get())
                .pattern("   ")
                .pattern("$ $")
                .pattern("$ $")
                .define('$', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModItems.AMETHYST_BOOTS.get()), has(Items.AMETHYST_SHARD))
                .save(pWriter);

    }
}
