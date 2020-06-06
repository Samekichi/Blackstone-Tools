package de.martenschaefer.blackstonetools;

import de.martenschaefer.blackstonetools.block.BlackstoneToolsBlocks;
import de.martenschaefer.blackstonetools.item.BlackstoneToolsItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlackstoneToolsMod implements ModInitializer {
 
 public static final String MOD_ID = "blackstonetools";
 
 @Override
 public void onInitialize() {
  
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_pickaxe"), BlackstoneToolsItems.BLACKSTONE_PICKAXE);
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_sword"), BlackstoneToolsItems.BLACKSTONE_SWORD);
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_axe"), BlackstoneToolsItems.BLACKSTONE_AXE);
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_shovel"), BlackstoneToolsItems.BLACKSTONE_SHOVEL);
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_hoe"), BlackstoneToolsItems.BLACKSTONE_HOE);
 	
 	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "blackstone_furnace"), BlackstoneToolsBlocks.BLACKSTONE_FURNACE);
 	Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackstone_furnace"), new BlockItem(BlackstoneToolsBlocks.BLACKSTONE_FURNACE, new Item.Settings().group(ItemGroup.MISC)));
 }
}