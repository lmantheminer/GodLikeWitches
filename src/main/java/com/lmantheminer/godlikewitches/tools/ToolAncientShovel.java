package com.lmantheminer.godlikewitches.tools;

import com.lmantheminer.godlikewitches.creativetabs.CreativeTab;
import com.lmantheminer.godlikewitches.references.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAncientShovel extends ItemSpade{
	
	public ToolAncientShovel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MOD_ID + ":" + References.TOOL_ANCIENT_SHOVEL);
		this.setCreativeTab(CreativeTab.GODLIKEWITCHES_TAB);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
