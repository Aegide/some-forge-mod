package com.aegide.aegidemoddemo.main;

import com.aegide.aegidemoddemo.block.BlockAmethyst;
import com.aegide.aegidemoddemo.block.ModWorldGenerator;
import com.aegide.aegidemoddemo.block.OreAmethyst;
import com.aegide.aegidemoddemo.item.ItemAmethyst;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Config {

    public static Item amethyst;
    public static Block amethystOre;
    public static Block amethystBlock;

	public Config()
	{
	}

	public void setupBlocks() {
		amethystOre = new OreAmethyst();
		amethystBlock = new BlockAmethyst();
	}

	public void setupItems() {
		amethyst = new ItemAmethyst();
	}

	public void setupRecipes() {
		ItemStack output;
		ItemStack input;
		
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
	}
	
	public void setupWorldGeneration() {
		GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre, 6), 0);
	}
}