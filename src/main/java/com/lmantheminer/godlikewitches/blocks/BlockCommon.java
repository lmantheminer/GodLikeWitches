package com.lmantheminer.godlikewitches.blocks;

import com.lmantheminer.godlikewitches.creativetabs.CreativeTab;
import com.lmantheminer.godlikewitches.references.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockCommon extends Block{
	
	public BlockCommon() {
		super(Material.rock);
	}

	public BlockCommon(Material m){
		super(m);
		this.setCreativeTab(CreativeTab.GODLIKEWITCHES_TAB);
	}
	
	 @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", References.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }

}
