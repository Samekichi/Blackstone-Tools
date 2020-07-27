package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class BlackstoneShovelItem extends ShovelItem {
 
	public BlackstoneShovelItem(Item.Settings settings) {
		
		super(BlackstoneToolMaterials.TOOLS, 1.5F, -3.0F, settings);
	}
}