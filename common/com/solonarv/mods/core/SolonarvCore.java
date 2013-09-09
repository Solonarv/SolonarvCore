package com.solonarv.mods.core;

import net.minecraftforge.common.Configuration;

import com.solonarv.mods.core.lib.Reference;
import com.solonarv.mods.core.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * 
 * @author Solonarv
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SolonarvCore {
    @Instance(Reference.MOD_ID)
    public static SolonarvCore instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static Configuration config;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        
    }
}
