package net.theconcernedwyvern.wyvernblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theconcernedwyvern.wyvernblocks.WyvernBlocks;
import net.theconcernedwyvern.wyvernblocks.block.ModBlocks;

public class ModItemGroups {


    // display name translatable lets us put the text in the lang file properly
    //.icon: displays ruby icon
    //add custom items between curlies
    public static final ItemGroup WYVERN_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WyvernBlocks.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.LEADED_GLASS);

                    }).build());

            //(Registries.ITEM_GROUP, new Identifier(WyvernBlocks.MOD_ID, "ruby"));

    public static void registerItemGroups()
    {
        WyvernBlocks.LOGGER.info("Registering Item Groups for " + WyvernBlocks.MOD_ID);
    }

}
