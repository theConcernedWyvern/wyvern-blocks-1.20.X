package net.theconcernedwyvern.wyvernblocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theconcernedwyvern.wyvernblocks.WyvernBlocks;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    //add items to ingredients tab
    private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries)
    {
        entries.add(RUBY);
    }

    public static void registerModItems()
    {
        WyvernBlocks.LOGGER.info("Registering Mod Items for " + WyvernBlocks.MOD_ID);
        //register items for ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);
    }

    private static Item registerItem(String name, Item item)
    {
        //register item & name
        return Registry.register(Registries.ITEM, new Identifier(WyvernBlocks.MOD_ID, name), item);
    }
}
