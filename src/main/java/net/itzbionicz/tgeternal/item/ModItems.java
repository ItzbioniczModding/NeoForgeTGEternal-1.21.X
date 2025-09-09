package net.itzbionicz.tgeternal.item;

import net.itzbionicz.tgeternal.TGEternal;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TGEternal.MODID);

    public static final DeferredItem<Item> FARVINITE_INGOT = ITEMS.register("farvinite_ingot",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FARVINITE = ITEMS.register("farvinite",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FARVINITE_NUGGET = ITEMS.register("farvinite_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEVONITE_INGOT = ITEMS.register("devonite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVONITE = ITEMS.register("devonite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVONITE_NUGGET = ITEMS.register("devonite_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SABBOTHITE_INGOT = ITEMS.register("sabbothite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SABBOTHITE = ITEMS.register("sabbothite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SABBOTHITE_NUGGET = ITEMS.register("sabbothite_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
