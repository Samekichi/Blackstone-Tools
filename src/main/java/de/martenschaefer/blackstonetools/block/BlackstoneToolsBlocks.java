package de.martenschaefer.blackstonetools.block;

import java.util.function.ToIntFunction;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.Material;
import net.minecraft.state.property.Properties;

public class BlackstoneToolsBlocks {
 
	public static final FurnaceBlock BLACKSTONE_FURNACE = new BlackstoneFurnaceBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.8f, 3.8f).lightLevel(createLightLevelFromBlockState(13)));

	private static ToIntFunction<BlockState> createLightLevelFromBlockState(int litLevel) {
  return (blockState) -> blockState.get(Properties.LIT)? litLevel : 0;
}
}