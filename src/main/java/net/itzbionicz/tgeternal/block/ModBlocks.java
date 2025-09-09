package net.itzbionicz.tgeternal.block;

import net.itzbionicz.tgeternal.TGEternal;
import net.itzbionicz.tgeternal.block.custom.ModRotatedPillarBlock;
import net.itzbionicz.tgeternal.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TGEternal.MODID);

    public static final DeferredBlock<Block> FARVIN_GRASS_BLOCK = registerBlock("farvin_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(SoundType.GRASS)));

public static final DeferredBlock<Block> FARVIN_DIRT = registerBlock("farvin_dirt",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(0.5f)
                .sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> FARVIN_STONE = registerBlock("farvin_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> FARVIN_COBBLESTONE = registerBlock("farvin_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> FARVIN_LOG = registerBlock("farvin_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_FARVIN_LOG = registerBlock("stripped_farvin_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> FARVIN_WOOD = registerBlock("farvin_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_FARVIN_WOOD = registerBlock("stripped_farvin_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> FARVIN_PLANKS = registerBlock("farvin_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<StairBlock> FARVIN_STAIRS = registerBlock("farvin_stairs",
            () -> new StairBlock(ModBlocks.FARVIN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> FARVIN_SLAB = registerBlock("farvin_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));

    public static final DeferredBlock<PressurePlateBlock> FARVIN_PRESSURE_PLATE = registerBlock("farvin_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> FARVIN_BUTTON = registerBlock("farvin_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD).noCollission()));

    public static final DeferredBlock<FenceBlock> FARVIN_FENCE = registerBlock("farvin_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> FARVIN_FENCE_GATE = registerBlock("farvin_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));

    public static final DeferredBlock<DoorBlock> FARVIN_DOOR = registerBlock("farvin_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> FARVIN_TRAPDOOR = registerBlock("farvin_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD).noOcclusion()));





    public static final DeferredBlock<Block> DEVON_GRASS_BLOCK = registerBlock("devon_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(SoundType.GRASS)));

    public static final DeferredBlock<Block> DEVON_DIRT = registerBlock("devon_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> DEVON_STONE = registerBlock("devon_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEVON_COBBLESTONE = registerBlock("devon_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEVON_LOG = registerBlock("devon_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_DEVON_LOG = registerBlock("stripped_devon_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> DEVON_WOOD = registerBlock("devon_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_DEVON_WOOD = registerBlock("stripped_devon_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> DEVON_PLANKS = registerBlock("devon_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<StairBlock> DEVON_STAIRS = registerBlock("devon_stairs",
            () -> new StairBlock(ModBlocks.DEVON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> DEVON_SLAB = registerBlock("devon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<PressurePlateBlock> DEVON_PRESSURE_PLATE = registerBlock("devon_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> DEVON_BUTTON = registerBlock("devon_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noCollission()));

    public static final DeferredBlock<FenceBlock> DEVON_FENCE = registerBlock("devon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> DEVON_FENCE_GATE = registerBlock("devon_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<DoorBlock> DEVON_DOOR = registerBlock("devon_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> DEVON_TRAPDOOR = registerBlock("devon_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noOcclusion()));



    public static final DeferredBlock<Block> SABBOTH_GRASS_BLOCK = registerBlock("sabboth_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(SoundType.GRASS)));

    public static final DeferredBlock<Block> SABBOTH_DIRT = registerBlock("sabboth_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> SABBOTH_STONE = registerBlock("sabboth_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SABBOTH_COBBLESTONE = registerBlock("sabboth_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0F, 6.0F)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SABBOTH_LOG = registerBlock("sabboth_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_SABBOTH_LOG = registerBlock("stripped_sabboth_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> SABBOTH_WOOD = registerBlock("sabboth_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_SABBOTH_WOOD = registerBlock("stripped_sabboth_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> SABBOTH_PLANKS = registerBlock("sabboth_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<StairBlock> SABBOTH_STAIRS = registerBlock("sabboth_stairs",
            () -> new StairBlock(ModBlocks.SABBOTH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                            .sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> SABBOTH_SLAB = registerBlock("sabboth_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<PressurePlateBlock> SABBOTH_PRESSURE_PLATE = registerBlock("sabboth_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> SABBOTH_BUTTON = registerBlock("sabboth_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noCollission()));

    public static final DeferredBlock<FenceBlock> SABBOTH_FENCE = registerBlock("sabboth_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> SABBOTH_FENCE_GATE = registerBlock("sabboth_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));

    public static final DeferredBlock<DoorBlock> SABBOTH_DOOR = registerBlock("sabboth_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> SABBOTH_TRAPDOOR = registerBlock("sabboth_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD).noOcclusion()));


    public static final DeferredBlock<Block> FARVINITE_BLOCK = registerBlock("farvinite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.METAL)));
    public static final DeferredBlock<Block> DEVONITE_BLOCK = registerBlock("devonite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SABBOTHITE_BLOCK = registerBlock("sabbothite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.METAL)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    @Deprecated
    private static Block legacyStair(Block baseBlock) {
        return new StairBlock(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(baseBlock));
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
