package com.lmantheminer.godlikewitches.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

import com.lmantheminer.godlikewitches.references.References;
import com.lmantheminer.godlikewitches.reg.ItemReg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab {
	public static final CreativeTabs GODLIKEWITCHES_TAB = new CreativeTabs(References.MOD_ID){
		
		public Item getTabIconItem(){
			return ItemReg.ancientingot;
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel(){
			return StatCollector.translateToLocal("key.catagories.godlikewitches");
		}
	};
}
