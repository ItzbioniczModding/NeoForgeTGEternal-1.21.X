package net.itzbionicz.tgeternal.item;

import net.itzbionicz.tgeternal.TGEternal;
import net.itzbionicz.tgeternal.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TGEternal.MODID);

public static final Supplier<CreativeModeTab> TGETERNALS_TAB = CREATIVE_MODE_TAB.register("tgeternals_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.FARVINITE_INGOT.get()))
                .title(Component.translatable("creativetab.tgeternal.tgteternal_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.FARVIN_GRASS_BLOCK);
                    output.accept(ModBlocks.FARVIN_DIRT);
                    output.accept(ModBlocks.FARVIN_STONE);
                    output.accept(ModBlocks.FARVIN_COBBLESTONE);
                    output.accept(ModBlocks.FARVIN_LOG);
                    output.accept(ModBlocks.STRIPPED_FARVIN_LOG);
                    output.accept(ModBlocks.FARVIN_WOOD);
                    output.accept(ModBlocks.STRIPPED_FARVIN_WOOD);
                    output.accept(ModBlocks.FARVIN_PLANKS);
                    output.accept(ModBlocks.FARVIN_STAIRS);
                    output.accept(ModBlocks.FARVIN_SLAB);
                    output.accept(ModBlocks.FARVIN_FENCE);
                    output.accept(ModBlocks.FARVIN_FENCE_GATE);
                    output.accept(ModBlocks.FARVIN_DOOR);
                    output.accept(ModBlocks.FARVIN_TRAPDOOR);
                    output.accept(ModBlocks.FARVIN_PRESSURE_PLATE);
                    output.accept(ModBlocks.FARVIN_BUTTON);

                    output.accept(ModBlocks.DEVON_GRASS_BLOCK);
                    output.accept(ModBlocks.DEVON_DIRT);
                    output.accept(ModBlocks.DEVON_STONE);
                    output.accept(ModBlocks.DEVON_COBBLESTONE);
                    output.accept(ModBlocks.DEVON_LOG);
                    output.accept(ModBlocks.STRIPPED_DEVON_LOG);
                    output.accept(ModBlocks.DEVON_WOOD);
                    output.accept(ModBlocks.STRIPPED_DEVON_WOOD);
                    output.accept(ModBlocks.DEVON_PLANKS);
                    output.accept(ModBlocks.DEVON_STAIRS);
                    output.accept(ModBlocks.DEVON_SLAB);
                    output.accept(ModBlocks.DEVON_FENCE);
                    output.accept(ModBlocks.DEVON_FENCE_GATE);
                    output.accept(ModBlocks.DEVON_DOOR);
                    output.accept(ModBlocks.DEVON_TRAPDOOR);
                    output.accept(ModBlocks.DEVON_PRESSURE_PLATE);
                    output.accept(ModBlocks.DEVON_BUTTON);

                    output.accept(ModBlocks.SABBOTH_GRASS_BLOCK);
                    output.accept(ModBlocks.SABBOTH_DIRT);
                    output.accept(ModBlocks.SABBOTH_STONE);
                    output.accept(ModBlocks.SABBOTH_COBBLESTONE);
                    output.accept(ModBlocks.SABBOTH_LOG);
                    output.accept(ModBlocks.STRIPPED_SABBOTH_LOG);
                    output.accept(ModBlocks.SABBOTH_WOOD);
                    output.accept(ModBlocks.STRIPPED_SABBOTH_WOOD);
                    output.accept(ModBlocks.SABBOTH_PLANKS);
                    output.accept(ModBlocks.SABBOTH_STAIRS);
                    output.accept(ModBlocks.SABBOTH_SLAB);
                    output.accept(ModBlocks.SABBOTH_FENCE);
                    output.accept(ModBlocks.SABBOTH_FENCE_GATE);
                    output.accept(ModBlocks.SABBOTH_DOOR);
                    output.accept(ModBlocks.SABBOTH_TRAPDOOR);
                    output.accept(ModBlocks.SABBOTH_PRESSURE_PLATE);
                    output.accept(ModBlocks.SABBOTH_BUTTON);
                    output.accept(ModBlocks.FARVINITE_BLOCK);
                    output.accept(ModItems.FARVINITE_INGOT);
                    output.accept(ModItems.FARVINITE_NUGGET);
                    output.accept(ModItems.FARVINITE);
                    output.accept(ModBlocks.DEVONITE_BLOCK);
                    output.accept(ModItems.DEVONITE_INGOT);
                    output.accept(ModItems.DEVONITE_NUGGET);
                    output.accept(ModItems.DEVONITE);
                    output.accept(ModBlocks.SABBOTHITE_BLOCK);
                    output.accept(ModItems.SABBOTHITE_INGOT);
                    output.accept(ModItems.SABBOTHITE_NUGGET);
                    output.accept(ModItems.SABBOTHITE);




                })
                .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
