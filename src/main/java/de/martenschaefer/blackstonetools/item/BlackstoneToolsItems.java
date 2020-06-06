package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlackstoneToolsItems {
 
	public static final Item BLACKSTONE_PICKAXE = new BlackstonePickaxeItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_SWORD = new BlackstoneSwordItem(new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item BLACKSTONE_AXE = new BlackstoneAxeItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_SHOVEL = new BlackstoneShovelItem(new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item BLACKSTONE_HOE = new BlackstoneHoeItem(new Item.Settings().group(ItemGroup.TOOLS));
}