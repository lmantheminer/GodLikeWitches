package com.lmantheminer.godlikewitches.reg;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.lmantheminer.godlikewitches.blocks.BlockAncientBrick;
import com.lmantheminer.godlikewitches.references.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockReg {
	
	public static final Block ancientbrick = new BlockAncientBrick();
	
	public static void init(){
		GameRegistry.registerBlock(ancientbrick, References.BLOCK_ANCIENT_BRICK);
	}
	
}
