package net.walter.tools_plus.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEMPLATE_BLOCK.get())
                .pattern("$$$")
                .pattern("$$$")
                .pattern("$$$")
                .define('$', ModItems.TEMPLATE.get())
                .unlockedBy(getHasName(ModItems.TEMPLATE.get()), has(ModItems.TEMPLATE.get()))
                .save(pWriter);
    }
}
