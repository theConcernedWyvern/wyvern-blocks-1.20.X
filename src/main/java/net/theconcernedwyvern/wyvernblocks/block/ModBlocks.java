package net.theconcernedwyvern.wyvernblocks.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theconcernedwyvern.wyvernblocks.WyvernBlocks;

public class ModBlocks {

    //do .create instead of .copyOf to make custom settings
    public static final Block LEADED_GLASS = registerBlock("leaded_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS)));



    public static void registerModBlocks()
    {
        WyvernBlocks.LOGGER.info("Registering Modblocks for " + WyvernBlocks.MOD_ID);

    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(WyvernBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WyvernBlocks.MOD_ID, name), block);
    }

}
