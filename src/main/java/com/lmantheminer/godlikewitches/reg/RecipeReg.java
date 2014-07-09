package com.lmantheminer.godlikewitches.reg;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeReg {
	
	public static void init(){
		
		GameRegistry.addSmelting(Blocks.stonebrick, new ItemStack(BlockReg.ancientbrick), 0.5f);
		GameRegistry.addShapedRecipe(new ItemStack(ItemReg.ancientingot), "X X", " Y ", "X X", 'X', BlockReg.ancientbrick, 'Y', Items.iron_ingot);
	}
	
}
