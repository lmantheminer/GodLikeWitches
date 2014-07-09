package com.lmantheminer.godlikewitches;

import com.lmantheminer.godlikewitches.blocks.BlockAncientBrick;
import com.lmantheminer.godlikewitches.proxy.ProxyCommon;
import com.lmantheminer.godlikewitches.references.References;
import com.lmantheminer.godlikewitches.reg.BlockReg;
import com.lmantheminer.godlikewitches.reg.ItemReg;
import com.lmantheminer.godlikewitches.reg.RecipeReg;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.MOD_ID, version = References.VERSION)
public class GodLikeWitches
{
    @Instance(value = References.MOD_ID)
    public static GodLikeWitches instance;
    
    
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
    public static ProxyCommon proxy;
    		
    
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		BlockReg.init();
		ItemReg.init();
		RecipeReg.init();
    }
    
	
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	proxy.registerRenderer();
    }
}
