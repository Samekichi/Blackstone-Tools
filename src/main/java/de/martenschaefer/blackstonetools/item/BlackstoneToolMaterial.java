package de.martenschaefer.blackstonetools.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public class BlackstoneToolMaterial implements ToolMaterial {
 
	public static final BlackstoneToolMaterial BLACKSTONE = new BlackstoneToolMaterial();
	
	private final Lazy<Ingredient> repairIngredient = new Lazy<Ingredient>(() -> {
		
  return Ingredient.ofItems(Blocks.BLACKSTONE);
 });
	
	@Override
	public int getDurability() {
  
		return 171;
	}

	@Override
	public float getMiningSpeedMultiplier() {
  
		return 4.6f;
	}

	@Override
	public float getAttackDamage() {
  
		return 1.0f;
	}

	@Override
	public int getMiningLevel() {
  
		return 1;
	}

	@Override
	public int getEnchantability() {
  
		return 7;
	}

	@Override
	public Ingredient getRepairIngredient() {
  
		return this.repairIngredient.get();
	}
}
