package net.itzbionicz.tgeternal.datagen;

import net.itzbionicz.tgeternal.TGEternal;
import net.itzbionicz.tgeternal.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TGEternal.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithitem(ModBlocks.FARVIN_DIRT);
        blockWithitem(ModBlocks.FARVIN_STONE);
        blockWithitem(ModBlocks.FARVIN_COBBLESTONE);
        blockWithitem(ModBlocks.FARVIN_PLANKS);

        logBlock(((RotatedPillarBlock)ModBlocks.FARVIN_LOG.get()));
        logBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_FARVIN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FARVIN_WOOD.get()), blockTexture(ModBlocks.FARVIN_LOG.get()), blockTexture(ModBlocks.FARVIN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FARVIN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FARVIN_LOG.get()), blockTexture(ModBlocks.STRIPPED_FARVIN_LOG.get()));

        blockItem(ModBlocks.FARVIN_LOG);
        blockItem(ModBlocks.STRIPPED_FARVIN_LOG);
        blockItem(ModBlocks.FARVIN_WOOD);
        blockItem(ModBlocks.STRIPPED_FARVIN_WOOD);
        stairsBlock(ModBlocks.FARVIN_STAIRS.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()));
        slabBlock(ModBlocks.FARVIN_SLAB.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()), blockTexture(ModBlocks.FARVIN_PLANKS.get()));
        buttonBlock(ModBlocks.FARVIN_BUTTON.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()));
        pressurePlateBlock(ModBlocks.FARVIN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()));
        fenceBlock(ModBlocks.FARVIN_FENCE.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()));
        fenceGateBlock(ModBlocks.FARVIN_FENCE_GATE.get(), blockTexture(ModBlocks.FARVIN_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.FARVIN_DOOR.get(), modLoc("block/farvin_door_bottom"), modLoc("block/farvin_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.FARVIN_TRAPDOOR.get(), modLoc("block/farvin_trapdoor"), true,"cutout");

        blockItem(ModBlocks.FARVIN_STAIRS);
        blockItem(ModBlocks.FARVIN_SLAB);
        blockItem(ModBlocks.FARVIN_PRESSURE_PLATE);
        blockItem(ModBlocks.FARVIN_FENCE_GATE);
        blockItem(ModBlocks.FARVIN_TRAPDOOR, "_bottom");

        blockWithitem(ModBlocks.DEVON_DIRT);
        blockWithitem(ModBlocks.DEVON_STONE);
        blockWithitem(ModBlocks.DEVON_COBBLESTONE);
        blockWithitem(ModBlocks.DEVON_PLANKS);

        logBlock(((RotatedPillarBlock)ModBlocks.DEVON_LOG.get()));
        logBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_DEVON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DEVON_WOOD.get()), blockTexture(ModBlocks.DEVON_LOG.get()), blockTexture(ModBlocks.DEVON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DEVON_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DEVON_LOG.get()), blockTexture(ModBlocks.STRIPPED_DEVON_LOG.get()));

        blockItem(ModBlocks.DEVON_LOG);
        blockItem(ModBlocks.STRIPPED_DEVON_LOG);
        blockItem(ModBlocks.DEVON_WOOD);
        blockItem(ModBlocks.STRIPPED_DEVON_WOOD);
        stairsBlock(ModBlocks.DEVON_STAIRS.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()));
        slabBlock(ModBlocks.DEVON_SLAB.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()), blockTexture(ModBlocks.DEVON_PLANKS.get()));
        buttonBlock(ModBlocks.DEVON_BUTTON.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()));
        pressurePlateBlock(ModBlocks.DEVON_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()));
        fenceBlock(ModBlocks.DEVON_FENCE.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()));
        fenceGateBlock(ModBlocks.DEVON_FENCE_GATE.get(), blockTexture(ModBlocks.DEVON_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.DEVON_DOOR.get(), modLoc("block/devon_door_bottom"), modLoc("block/devon_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.DEVON_TRAPDOOR.get(), modLoc("block/devon_trapdoor"), true,"cutout");

        blockItem(ModBlocks.DEVON_STAIRS);
        blockItem(ModBlocks.DEVON_SLAB);
        blockItem(ModBlocks.DEVON_PRESSURE_PLATE);
        blockItem(ModBlocks.DEVON_FENCE_GATE);
        blockItem(ModBlocks.DEVON_TRAPDOOR, "_bottom");



        blockWithitem(ModBlocks.SABBOTH_DIRT);
        blockWithitem(ModBlocks.SABBOTH_STONE);
        blockWithitem(ModBlocks.SABBOTH_COBBLESTONE);
        blockWithitem(ModBlocks.SABBOTH_PLANKS);

        logBlock(((RotatedPillarBlock)ModBlocks.SABBOTH_LOG.get()));
        logBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_SABBOTH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SABBOTH_WOOD.get()), blockTexture(ModBlocks.SABBOTH_LOG.get()), blockTexture(ModBlocks.SABBOTH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SABBOTH_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SABBOTH_LOG.get()), blockTexture(ModBlocks.STRIPPED_SABBOTH_LOG.get()));

        blockItem(ModBlocks.SABBOTH_LOG);
        blockItem(ModBlocks.STRIPPED_SABBOTH_LOG);
        blockItem(ModBlocks.SABBOTH_WOOD);
        blockItem(ModBlocks.STRIPPED_SABBOTH_WOOD);
        stairsBlock(ModBlocks.SABBOTH_STAIRS.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));
        slabBlock(ModBlocks.SABBOTH_SLAB.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));
        buttonBlock(ModBlocks.SABBOTH_BUTTON.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));
        pressurePlateBlock(ModBlocks.SABBOTH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));
        fenceBlock(ModBlocks.SABBOTH_FENCE.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));
        fenceGateBlock(ModBlocks.SABBOTH_FENCE_GATE.get(), blockTexture(ModBlocks.SABBOTH_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.SABBOTH_DOOR.get(), modLoc("block/sabboth_door_bottom"), modLoc("block/sabboth_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SABBOTH_TRAPDOOR.get(), modLoc("block/sabboth_trapdoor"), true,"cutout");

        blockItem(ModBlocks.SABBOTH_STAIRS);
        blockItem(ModBlocks.SABBOTH_SLAB);
        blockItem(ModBlocks.SABBOTH_PRESSURE_PLATE);
        blockItem(ModBlocks.SABBOTH_FENCE_GATE);
        blockItem(ModBlocks.SABBOTH_TRAPDOOR, "_bottom");

        blockWithitem(ModBlocks.FARVINITE_BLOCK);
        blockWithitem(ModBlocks.DEVONITE_BLOCK);
        blockWithitem(ModBlocks.SABBOTHITE_BLOCK);


    }

    private void blockWithitem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tgeternal:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tgeternal:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
