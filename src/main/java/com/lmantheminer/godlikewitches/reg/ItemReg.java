package com.lmantheminer.godlikewitches.reg;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.lmantheminer.godlikewitches.items.ItemAncientIngot;
import com.lmantheminer.godlikewitches.references.References;
import com.lmantheminer.godlikewitches.tools.ToolAncientAxe;
import com.lmantheminer.godlikewitches.tools.ToolAncientHoe;
import com.lmantheminer.godlikewitches.tools.ToolAncientPickaxe;
import com.lmantheminer.godlikewitches.tools.ToolAncientShovel;
import com.lmantheminer.godlikewitches.tools.ToolAncientSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	
	public static final Item ancientingot = new ItemAncientIngot();
	public static final ToolMaterial ancientIngot = EnumHelper.addToolMaterial("AncientIngot", 2, 251, 4.0F, 2.0F, 22);
	public static final Item ancientPickaxe = new ToolAncientPickaxe(ancientIngot);
	public static final Item ancientAxe = new ToolAncientAxe(ancientIngot);
	public static final Item ancientShovel = new ToolAncientShovel(ancientIngot);
	public static final Item ancientSword = new ToolAncientSword(ancientIngot);
	public static final Item ancientHoe = new ToolAncientHoe(ancientIngot);

	
	public static void init(){
		
		GameRegistry.registerItem(ancientingot, References.ITEM_ANCIENT_INGOT);
		GameRegistry.registerItem(ancientPickaxe, References.TOOL_ANCIENT_PICKAXE);
		GameRegistry.registerItem(ancientAxe, References.TOOL_ANCIENT_AXE);
		GameRegistry.registerItem(ancientSword, References.TOOL_ANCIENT_SWORD);
		GameRegistry.registerItem(ancientShovel, References.TOOL_ANCIENT_SHOVEL);
		GameRegistry.registerItem(ancientHoe, References.TOOL_ANCIENT_HOE);

		
		
	}

}
