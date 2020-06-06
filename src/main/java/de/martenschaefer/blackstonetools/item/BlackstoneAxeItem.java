package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class BlackstoneAxeItem extends AxeItem {
 
	public BlackstoneAxeItem(Item.Settings settings) {
		
		super(BlackstoneToolMaterial.BLACKSTONE, 7.0F, -3.2F, settings);
	}
}