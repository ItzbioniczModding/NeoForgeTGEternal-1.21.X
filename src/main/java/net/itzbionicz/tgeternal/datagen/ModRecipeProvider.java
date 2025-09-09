package net.itzbionicz.tgeternal.datagen;

import net.itzbionicz.tgeternal.block.ModBlocks;
import net.itzbionicz.tgeternal.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> FARVINITE_SMELTABLES = List.of(ModItems.FARVINITE);
        List<ItemLike> DEVONITE_SMELTABLES = List.of(ModItems.DEVONITE);
        List<ItemLike> SABBOTHITE_SMELTABLES = List.of(ModItems.SABBOTHITE);
        List<ItemLike> FARVIN_SMELTABLES = List.of(ModBlocks.FARVIN_COBBLESTONE);
        List<ItemLike> DEVON_SMELTABLES = List.of(ModBlocks.DEVON_COBBLESTONE);
        List<ItemLike> SABBOTH_SMELTABLES = List.of(ModBlocks.SABBOTH_COBBLESTONE);

        // -------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FARVINITE_INGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.FARVINITE_NUGGET.get())
                .unlockedBy("has_farvinite_nuggets", has(ModItems.FARVINITE_NUGGET))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FARVINITE_NUGGET.get(), 9)
                .requires(ModItems.FARVINITE_INGOT)
                .unlockedBy("has_farvinite_ingot", has(ModItems.FARVINITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEVONITE_INGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.DEVONITE_NUGGET.get())
                .unlockedBy("has_devonite_nuggets", has(ModItems.DEVONITE_NUGGET))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DEVONITE_NUGGET.get(), 9)
                .requires(ModItems.DEVONITE_INGOT)
                .unlockedBy("has_devonite_ingot", has(ModItems.DEVONITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SABBOTHITE_INGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.SABBOTHITE_NUGGET.get())
                .unlockedBy("has_sabbothite_nuggets", has(ModItems.SABBOTHITE_NUGGET))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SABBOTHITE_NUGGET.get(), 9)
                .requires(ModItems.SABBOTHITE_INGOT)
                .unlockedBy("has_sabbothite_ingot", has(ModItems.SABBOTHITE_INGOT))
                .save(recipeOutput);


// -------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FARVIN_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.FARVIN_LOG.get())
                .unlockedBy("has_farvin_log", has(ModBlocks.FARVIN_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_FARVIN_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_FARVIN_LOG.get())
                .unlockedBy("has_stripped_farvin_log", has(ModBlocks.STRIPPED_FARVIN_LOG))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FARVIN_PLANKS.get(), 4)
                .requires(ModBlocks.FARVIN_LOG)
                .unlockedBy("has_farvin_log", has(ModBlocks.FARVIN_LOG))
                .save(recipeOutput, "tgeternal:farvin_planks_from_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FARVIN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_FARVIN_LOG)
                .unlockedBy("has_stripped_farvin_log", has(ModBlocks.STRIPPED_FARVIN_LOG))
                .save(recipeOutput, "tgeternal:farvin_planks_from_stripped_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FARVIN_PLANKS.get(), 4)
                .requires(ModBlocks.FARVIN_WOOD)
                .unlockedBy("has_farvin_wood", has(ModBlocks.FARVIN_WOOD))
                .save(recipeOutput, "tgeternal:farvin_planks_from_wood");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FARVIN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_FARVIN_WOOD)
                .unlockedBy("has_stripped_farvin_wood", has(ModBlocks.STRIPPED_FARVIN_WOOD))
                .save(recipeOutput, "tgeternal:farvin_planks_from_stripped_wood");


        stairBuilder(ModBlocks.FARVIN_STAIRS.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS)).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FARVIN_SLAB.get(), ModBlocks.FARVIN_PLANKS.get());


        buttonBuilder(ModBlocks.FARVIN_BUTTON.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS.get())).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.FARVIN_PRESSURE_PLATE.get(), ModBlocks.FARVIN_PLANKS.get());


        fenceBuilder(ModBlocks.FARVIN_FENCE.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS.get())).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.FARVIN_FENCE_GATE.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS.get())).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.FARVIN_DOOR.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS.get())).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.FARVIN_TRAPDOOR.get(), Ingredient.of(ModBlocks.FARVIN_PLANKS.get())).group("farvin")
                .unlockedBy("has_farvin_planks", has(ModBlocks.FARVIN_PLANKS.get())).save(recipeOutput);


// -------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEVON_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.DEVON_LOG.get())
                .unlockedBy("has_devon_log", has(ModBlocks.DEVON_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_DEVON_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_DEVON_LOG.get())
                .unlockedBy("has_stripped_devon_log", has(ModBlocks.STRIPPED_DEVON_LOG))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DEVON_PLANKS.get(), 4)
                .requires(ModBlocks.DEVON_LOG)
                .unlockedBy("has_devon_log", has(ModBlocks.DEVON_LOG))
                .save(recipeOutput, "tgeternal:devon_planks_from_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DEVON_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_DEVON_LOG)
                .unlockedBy("has_stripped_devon_log", has(ModBlocks.STRIPPED_DEVON_LOG))
                .save(recipeOutput, "tgeternal:devon_planks_from_stripped_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DEVON_PLANKS.get(), 4)
                .requires(ModBlocks.DEVON_WOOD)
                .unlockedBy("has_devon_wood", has(ModBlocks.DEVON_WOOD))
                .save(recipeOutput, "tgeternal:devon_planks_from_wood");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DEVON_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_DEVON_WOOD)
                .unlockedBy("has_stripped_devon_wood", has(ModBlocks.STRIPPED_DEVON_WOOD))
                .save(recipeOutput, "tgeternal:devon_planks_from_stripped_wood");



        stairBuilder(ModBlocks.DEVON_STAIRS.get(), Ingredient.of(ModBlocks.DEVON_PLANKS)).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEVON_SLAB.get(), ModBlocks.DEVON_PLANKS.get());


        buttonBuilder(ModBlocks.DEVON_BUTTON.get(), Ingredient.of(ModBlocks.DEVON_PLANKS.get())).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.DEVON_PRESSURE_PLATE.get(), ModBlocks.DEVON_PLANKS.get());


        fenceBuilder(ModBlocks.DEVON_FENCE.get(), Ingredient.of(ModBlocks.DEVON_PLANKS.get())).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.DEVON_FENCE_GATE.get(), Ingredient.of(ModBlocks.DEVON_PLANKS.get())).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.DEVON_DOOR.get(), Ingredient.of(ModBlocks.DEVON_PLANKS.get())).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.DEVON_TRAPDOOR.get(), Ingredient.of(ModBlocks.DEVON_PLANKS.get())).group("devon")
                .unlockedBy("has_devon_planks", has(ModBlocks.DEVON_PLANKS.get())).save(recipeOutput);


// -------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SABBOTH_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.SABBOTH_LOG.get())
                .unlockedBy("has_sabboth_log", has(ModBlocks.SABBOTH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_SABBOTH_WOOD.get(),3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_SABBOTH_LOG.get())
                .unlockedBy("has_stripped_sabboth_log", has(ModBlocks.STRIPPED_SABBOTH_LOG))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SABBOTH_PLANKS.get(), 4)
                .requires(ModBlocks.SABBOTH_LOG)
                .unlockedBy("has_sabboth_log", has(ModBlocks.SABBOTH_LOG))
                .save(recipeOutput, "tgeternal:sabboth_planks_from_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SABBOTH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_SABBOTH_LOG)
                .unlockedBy("has_stripped_sabboth_log", has(ModBlocks.STRIPPED_SABBOTH_LOG))
                .save(recipeOutput, "tgeternal:sabboth_planks_from_stripped_log");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SABBOTH_PLANKS.get(), 4)
                .requires(ModBlocks.SABBOTH_WOOD)
                .unlockedBy("has_sabboth_wood", has(ModBlocks.SABBOTH_WOOD))
                .save(recipeOutput, "tgeternal:sabboth_planks_from_wood");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SABBOTH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_SABBOTH_WOOD)
                .unlockedBy("has_stripped_sabboth_wood", has(ModBlocks.STRIPPED_SABBOTH_WOOD))
                .save(recipeOutput, "tgeternal:sabboth_planks_from_stripped_wood");



        stairBuilder(ModBlocks.SABBOTH_STAIRS.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS)).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SABBOTH_SLAB.get(), ModBlocks.SABBOTH_PLANKS.get());


        buttonBuilder(ModBlocks.SABBOTH_BUTTON.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS.get())).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.SABBOTH_PRESSURE_PLATE.get(), ModBlocks.SABBOTH_PLANKS.get());


        fenceBuilder(ModBlocks.SABBOTH_FENCE.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS.get())).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.SABBOTH_FENCE_GATE.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS.get())).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.SABBOTH_DOOR.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS.get())).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SABBOTH_TRAPDOOR.get(), Ingredient.of(ModBlocks.SABBOTH_PLANKS.get())).group("sabboth")
                .unlockedBy("has_sabboth_planks", has(ModBlocks.SABBOTH_PLANKS.get())).save(recipeOutput);



        // -------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FARVINITE_BLOCK.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.FARVINITE_INGOT.get())
                .unlockedBy("has_farvinite_ingots", has(ModItems.FARVINITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEVONITE_BLOCK.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.DEVONITE_INGOT.get())
                .unlockedBy("has_devonite_ingots", has(ModItems.DEVONITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SABBOTHITE_BLOCK.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.SABBOTHITE_INGOT.get())
                .unlockedBy("has_sabbothite_ingots", has(ModItems.SABBOTHITE_INGOT))
                .save(recipeOutput);



// -------------------------------------------------------------------------------------------------------------------------------
        oreSmelting(recipeOutput, FARVINITE_SMELTABLES, RecipeCategory.MISC, ModItems.FARVINITE_INGOT.get(), 0.25f, 200, "farvinite");
        oreBlasting(recipeOutput, FARVINITE_SMELTABLES, RecipeCategory.MISC, ModItems.FARVINITE_INGOT.get(), 0.25f, 100, "farvinite");
        oreSmelting(recipeOutput, DEVONITE_SMELTABLES, RecipeCategory.MISC, ModItems.DEVONITE_INGOT.get(), 0.25f, 200, "devonite");
        oreBlasting(recipeOutput, DEVONITE_SMELTABLES, RecipeCategory.MISC, ModItems.DEVONITE_INGOT.get(), 0.25f, 100, "devonite");
        oreSmelting(recipeOutput, SABBOTHITE_SMELTABLES, RecipeCategory.MISC, ModItems.SABBOTHITE_INGOT.get(), 0.25f, 200, "sabbothite");
        oreBlasting(recipeOutput, SABBOTHITE_SMELTABLES, RecipeCategory.MISC, ModItems.SABBOTHITE_INGOT.get(), 0.25f, 100, "sabbothite");
        oreSmelting(recipeOutput, FARVIN_SMELTABLES, RecipeCategory.MISC, ModBlocks.FARVIN_STONE.get(), 0.25f, 200, "farvin_stone");
        oreSmelting(recipeOutput, DEVON_SMELTABLES, RecipeCategory.MISC, ModBlocks.DEVON_STONE.get(), 0.25f, 200, "devon_stone");


    }
}
