package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class BlackstoneShovelItem extends ShovelItem {
 
	public BlackstoneShovelItem(Item.Settings settings) {
		
		super(BlackstoneToolMaterial.BLACKSTONE, 1.5F, -3.0F, settings);
	}
}