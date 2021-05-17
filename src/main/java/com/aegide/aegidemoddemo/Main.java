package com.aegide.aegidemoddemo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "aegidemoddemo";
    public static final String VERSION = "1.2";
    
    public static Item amethyst;
    public static Block amethystOre;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        
        amethyst = new ModItem("amethyst");
        GameRegistry.registerItem(amethyst, "amethyst");
        
        amethystOre = new ModBlock(Material.rock, "amethystOre", amethyst);
        GameRegistry.registerBlock(amethystOre, "amethystOre");
        
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre, 6), 0);
    }
    
    
    
}
