package com.aegide.aegidemoddemo.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "aegidemoddemo";
    public static final String VERSION = "1.0.8";
    
    private Config modConfig;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

    	this.modConfig = new Config();
    	
    	this.modConfig.setupBlocks();
		this.modConfig.setupItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    	this.modConfig.setupRecipes();
    	this.modConfig.setupWorldGeneration();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("postInit");
    }
}