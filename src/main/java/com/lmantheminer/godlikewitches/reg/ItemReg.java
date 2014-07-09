package com.lmantheminer.godlikewitches.reg;

import net.minecraft.item.Item;

import com.lmantheminer.godlikewitches.items.ItemAncientIngot;
import com.lmantheminer.godlikewitches.references.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	
	public static final Item ancientingot = new ItemAncientIngot();
	
	public static void init(){
		
		GameRegistry.registerItem(ancientingot, References.ITEM_ANCIENT_INGOT);
		
		
	}

}
