package com.lmantheminer.godlikewitches.blocks;

import com.lmantheminer.godlikewitches.references.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAncientBrick extends Block{

	public BlockAncientBrick(int i, Material rock) {
		super(rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(6f);
		this.setResistance(6f);
		this.setStepSound(soundTypeStone);
		this.setBlockName(References.BLOCK_ANCIENT_BRICK);
		
		
	}

}
