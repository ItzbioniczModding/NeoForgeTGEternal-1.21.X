package net.itzbionicz.tgeternal.datagen;

import net.itzbionicz.tgeternal.TGEternal;
import net.itzbionicz.tgeternal.block.ModBlocks;
import net.itzbionicz.tgeternal.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TGEternal.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FARVINITE_INGOT.get());
        basicItem(ModItems.FARVINITE.get());
        basicItem(ModItems.FARVINITE_NUGGET.get());
        basicItem(ModItems.DEVONITE_INGOT.get());
        basicItem(ModItems.DEVONITE.get());
        basicItem(ModItems.DEVONITE_NUGGET.get());
        basicItem(ModItems.SABBOTHITE_INGOT.get());
        basicItem(ModItems.SABBOTHITE.get());
        basicItem(ModItems.SABBOTHITE_NUGGET.get());

        buttonItem(ModBlocks.FARVIN_BUTTON, ModBlocks.FARVIN_PLANKS);
        fenceItem(ModBlocks.FARVIN_FENCE, ModBlocks.FARVIN_PLANKS);

        buttonItem(ModBlocks.DEVON_BUTTON, ModBlocks.DEVON_PLANKS);
        fenceItem(ModBlocks.DEVON_FENCE, ModBlocks.DEVON_PLANKS);

        buttonItem(ModBlocks.SABBOTH_BUTTON, ModBlocks.SABBOTH_PLANKS);
        fenceItem(ModBlocks.SABBOTH_FENCE, ModBlocks.SABBOTH_PLANKS);

        basicItem(ModBlocks.FARVIN_DOOR.asItem());
        basicItem(ModBlocks.DEVON_DOOR.asItem());
        basicItem(ModBlocks.SABBOTH_DOOR.asItem());
    }
    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TGEternal.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TGEternal.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(TGEternal.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
