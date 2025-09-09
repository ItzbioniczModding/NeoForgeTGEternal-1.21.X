package net.itzbionicz.tgeternal.datagen;

import net.itzbionicz.tgeternal.TGEternal;
import net.itzbionicz.tgeternal.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TGEternal.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FARVIN_STONE.get())
                .add(ModBlocks.FARVIN_COBBLESTONE.get())
                .add(ModBlocks.DEVON_STONE.get())
                .add(ModBlocks.DEVON_COBBLESTONE.get())
                .add(ModBlocks.SABBOTH_STONE.get())
                .add(ModBlocks.SABBOTH_COBBLESTONE.get())

                .add(ModBlocks.FARVINITE_BLOCK.get())
                .add(ModBlocks.DEVONITE_BLOCK.get())
                .add(ModBlocks.SABBOTHITE_BLOCK.get());


        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FARVIN_LOG.get())
                .add(ModBlocks.STRIPPED_FARVIN_LOG.get())
                .add(ModBlocks.FARVIN_WOOD.get())
                .add(ModBlocks.STRIPPED_FARVIN_WOOD.get())
                .add(ModBlocks.FARVIN_PLANKS.get())
                .add(ModBlocks.FARVIN_STAIRS.get())
                .add(ModBlocks.FARVIN_SLAB.get())
                .add(ModBlocks.FARVIN_PRESSURE_PLATE.get())
                .add(ModBlocks.FARVIN_BUTTON.get())
                .add(ModBlocks.FARVIN_FENCE.get())
                .add(ModBlocks.FARVIN_FENCE_GATE.get())
                .add(ModBlocks.FARVIN_DOOR.get())
                .add(ModBlocks.FARVIN_TRAPDOOR.get())

                .add(ModBlocks.DEVON_LOG.get())
                .add(ModBlocks.STRIPPED_DEVON_LOG.get())
                .add(ModBlocks.DEVON_WOOD.get())
                .add(ModBlocks.STRIPPED_DEVON_WOOD.get())
                .add(ModBlocks.DEVON_PLANKS.get())
                .add(ModBlocks.DEVON_STAIRS.get())
                .add(ModBlocks.DEVON_SLAB.get())
                .add(ModBlocks.DEVON_PRESSURE_PLATE.get())
                .add(ModBlocks.DEVON_BUTTON.get())
                .add(ModBlocks.DEVON_FENCE.get())
                .add(ModBlocks.DEVON_FENCE_GATE.get())
                .add(ModBlocks.DEVON_DOOR.get())
                .add(ModBlocks.DEVON_TRAPDOOR.get())

                .add(ModBlocks.SABBOTH_LOG.get())
                .add(ModBlocks.STRIPPED_SABBOTH_LOG.get())
                .add(ModBlocks.SABBOTH_WOOD.get())
                .add(ModBlocks.STRIPPED_SABBOTH_WOOD.get())
                .add(ModBlocks.SABBOTH_PLANKS.get())
                .add(ModBlocks.SABBOTH_STAIRS.get())
                .add(ModBlocks.SABBOTH_SLAB.get())
                .add(ModBlocks.SABBOTH_PRESSURE_PLATE.get())
                .add(ModBlocks.SABBOTH_BUTTON.get())
                .add(ModBlocks.SABBOTH_FENCE.get())
                .add(ModBlocks.SABBOTH_FENCE_GATE.get())
                .add(ModBlocks.SABBOTH_DOOR.get())
                .add(ModBlocks.SABBOTH_TRAPDOOR.get());


        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.FARVIN_GRASS_BLOCK.get())
                .add(ModBlocks.FARVIN_DIRT.get())
                .add(ModBlocks.DEVON_GRASS_BLOCK.get())
                .add(ModBlocks.DEVON_DIRT.get())
                .add(ModBlocks.SABBOTH_GRASS_BLOCK.get())
                .add(ModBlocks.SABBOTH_DIRT.get());


        tag(BlockTags.FENCES).add(ModBlocks.FARVIN_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.FARVIN_FENCE_GATE.get());
        tag(BlockTags.FENCES).add(ModBlocks.DEVON_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.DEVON_FENCE_GATE.get());
        tag(BlockTags.FENCES).add(ModBlocks.SABBOTH_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SABBOTH_FENCE_GATE.get());
    }
}
