package com.lmantheminer.godlikewitches;

import com.lmantheminer.godlikewitches.blocks.BlockAncientBrick;
import com.lmantheminer.godlikewitches.proxy.ProxyCommon;
import com.lmantheminer.godlikewitches.references.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.MOD_ID, version = References.VERSION)
public class GodLikeWitches
{
    @Instance(value = References.MOD_ID)
    public static GodLikeWitches instance;
    
	public static CreativeTabs tabGodLikeWitches = new CreativeTabs("God Like Witches"){
		public Item getTabIconItem(){
			return new Item();
		}
	};
    
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
    public static ProxyCommon proxy;
    		
    //Blocks and Items
	public static final Block AncientBrick = new BlockAncientBrick(2001, Material.rock);
    
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		GameRegistry.registerBlock(AncientBrick, References.BLOCK_ANCIENT_BRICK);
		GameRegistry.addSmelting(Blocks.stonebrick, new ItemStack(AncientBrick), 0.5f);
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	proxy.registerRenderer();
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabGodLikeWitches", "en_US", "God Like Witches");
    }
}
