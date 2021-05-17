package com.aegide.aegidemoddemo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;






@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "aegidemoddemo";
    public static final String VERSION = "1.0.5";
    
    public static Item amethyst;
    public static Block amethystOre;
    public static Block amethystBlock;
    
	ItemStack output;
	ItemStack input;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
    	System.out.println("Bonjour");
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        
        
        
        String amethystName = "amethyst";
        amethyst = new ModItem(amethystName);
        GameRegistry.registerItem(amethyst, amethystName);
        
        String amethystOreName = "amethystOre";
        amethystOre = new ModOre(Material.rock, amethystOreName, amethyst);
        GameRegistry.registerBlock(amethystOre, amethystOreName);
        
        String amethystBlockName = "amethystBlock";
        amethystBlock = new ModBlock(Material.iron, amethystBlockName, amethyst);
        GameRegistry.registerBlock(amethystBlock, amethystBlockName);
        
        
        
        output = new ItemStack(amethyst, 9);
        GameRegistry.addShapelessRecipe(output,
				new ItemStack(amethystBlock, 1)
		);
        
        output = new ItemStack(amethystBlock);
        GameRegistry.addRecipe(output,
				"aaa", "aaa", "aaa",
				'a', amethyst
		);
        
        input = new ItemStack(amethystOre);
        output = new ItemStack(amethyst);
        GameRegistry.addSmelting(input, output, 1);
        
        
        
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre, 6), 0);
    }
    
    
    
}
