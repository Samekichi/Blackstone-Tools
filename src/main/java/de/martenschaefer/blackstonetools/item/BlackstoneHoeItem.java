package de.martenschaefer.blackstonetools.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class BlackstoneHoeItem extends HoeItem {
 
	public BlackstoneHoeItem(Item.Settings settings) {
		
		super(BlackstoneToolMaterials.TOOLS, -1, -2.0F, settings);
	}
}