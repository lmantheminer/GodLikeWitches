package com.lmantheminer.godlikewitches.tools;

import com.lmantheminer.godlikewitches.creativetabs.CreativeTab;
import com.lmantheminer.godlikewitches.references.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAncientAxe extends ItemAxe{
	
	public ToolAncientAxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MOD_ID + ":" + References.TOOL_ANCIENT_AXE);
		this.setCreativeTab(CreativeTab.GODLIKEWITCHES_TAB);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
