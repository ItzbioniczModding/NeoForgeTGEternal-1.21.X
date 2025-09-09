package net.itzbionicz.tgeternal.datagen;

import net.itzbionicz.tgeternal.block.ModBlocks;
import net.itzbionicz.tgeternal.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropOther(ModBlocks.FARVIN_GRASS_BLOCK.get(), ModBlocks.FARVIN_DIRT.get());
        dropSelf(ModBlocks.FARVIN_DIRT.get());
        dropOther(ModBlocks.FARVIN_STONE.get(), ModBlocks.FARVIN_COBBLESTONE.get());
        dropSelf(ModBlocks.FARVIN_COBBLESTONE.get());
        dropSelf(ModBlocks.FARVIN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_FARVIN_LOG.get());
        dropSelf(ModBlocks.FARVIN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_FARVIN_WOOD.get());
        dropSelf(ModBlocks.FARVIN_PLANKS.get());
        dropSelf(ModBlocks.FARVIN_STAIRS.get());
        add(ModBlocks.FARVIN_SLAB.get(),
        block -> createSlabItemTable(ModBlocks.FARVIN_SLAB.get()));
        dropSelf(ModBlocks.FARVIN_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.FARVIN_BUTTON.get());
        dropSelf(ModBlocks.FARVIN_FENCE.get());
        dropSelf(ModBlocks.FARVIN_FENCE_GATE.get());
        add(ModBlocks.FARVIN_DOOR.get(),
                block -> createDoorTable(ModBlocks.FARVIN_DOOR.get()));
        dropSelf(ModBlocks.FARVIN_TRAPDOOR.get());


        dropOther(ModBlocks.DEVON_GRASS_BLOCK.get(), ModBlocks.DEVON_DIRT.get());
        dropSelf(ModBlocks.DEVON_DIRT.get());
        dropOther(ModBlocks.DEVON_STONE.get(), ModBlocks.DEVON_COBBLESTONE.get());
        dropSelf(ModBlocks.DEVON_COBBLESTONE.get());
        dropSelf(ModBlocks.DEVON_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DEVON_LOG.get());
        dropSelf(ModBlocks.DEVON_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DEVON_WOOD.get());
        dropSelf(ModBlocks.DEVON_PLANKS.get());
        dropSelf(ModBlocks.DEVON_STAIRS.get());
        add(ModBlocks.DEVON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEVON_SLAB.get()));
        dropSelf(ModBlocks.DEVON_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.DEVON_BUTTON.get());
        dropSelf(ModBlocks.DEVON_FENCE.get());
        dropSelf(ModBlocks.DEVON_FENCE_GATE.get());
        add(ModBlocks.DEVON_DOOR.get(),
                block -> createDoorTable(ModBlocks.DEVON_DOOR.get()));
        dropSelf(ModBlocks.DEVON_TRAPDOOR.get());


        dropOther(ModBlocks.SABBOTH_GRASS_BLOCK.get(), ModBlocks.SABBOTH_DIRT.get());
        dropSelf(ModBlocks.SABBOTH_DIRT.get());
        dropOther(ModBlocks.SABBOTH_STONE.get(), ModBlocks.SABBOTH_COBBLESTONE.get());
        dropSelf(ModBlocks.SABBOTH_COBBLESTONE.get());
        dropSelf(ModBlocks.SABBOTH_LOG.get());
        dropSelf(ModBlocks.STRIPPED_SABBOTH_LOG.get());
        dropSelf(ModBlocks.SABBOTH_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_SABBOTH_WOOD.get());
        dropSelf(ModBlocks.SABBOTH_PLANKS.get());
        dropSelf(ModBlocks.SABBOTH_STAIRS.get());
        add(ModBlocks.SABBOTH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SABBOTH_SLAB.get()));
        dropSelf(ModBlocks.SABBOTH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SABBOTH_BUTTON.get());
        dropSelf(ModBlocks.SABBOTH_FENCE.get());
        dropSelf(ModBlocks.SABBOTH_FENCE_GATE.get());
        add(ModBlocks.SABBOTH_DOOR.get(),
                block -> createDoorTable(ModBlocks.SABBOTH_DOOR.get()));
        dropSelf(ModBlocks.SABBOTH_TRAPDOOR.get());


        dropSelf(ModBlocks.FARVINITE_BLOCK.get());
        dropSelf(ModBlocks.DEVONITE_BLOCK.get());
        dropSelf(ModBlocks.SABBOTHITE_BLOCK.get());


        //add(ModBlocks.FARVINITE_ORE.get(),
                //block -> createOreDrop(ModBlocks.FARVINITE_ORE.get(), ModItems.FARVINITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
