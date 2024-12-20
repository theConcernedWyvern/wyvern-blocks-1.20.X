package net.theconcernedwyvern.wyvernblocks;

import net.fabricmc.api.ModInitializer;

import net.theconcernedwyvern.wyvernblocks.block.ModBlocks;
import net.theconcernedwyvern.wyvernblocks.item.ModItemGroups;
import net.theconcernedwyvern.wyvernblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WyvernBlocks implements ModInitializer {
	public static final String MOD_ID = "wyvern-blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

	}
}