package net.theconcernedwyvern.wyvernblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.theconcernedwyvern.wyvernblocks.block.ModBlocks;

public class WyvernBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEADED_GLASS, RenderLayer.getCutout());

    }
}
