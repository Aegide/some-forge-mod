package com.aegide.aegidemoddemo.main;

import com.aegide.aegidemoddemo.block.BlockAmethyst;
import com.aegide.aegidemoddemo.block.ModWorldGenerator;
import com.aegide.aegidemoddemo.block.OreAmethyst;
import com.aegide.aegidemoddemo.entity.EntityRosie;
import com.aegide.aegidemoddemo.entity.ModelRosie;
import com.aegide.aegidemoddemo.entity.RenderRosie;
import com.aegide.aegidemoddemo.item.ItemAmethyst;
import com.aegide.aegidemoddemo.item.ItemAmethystApple;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Config {

	public static Item amethyst;
	public static ItemFood amethystApple;
	
	public static Block amethystBlock;
    public static Block amethystOre;
	
    public Main mod;
    
	public Config(Main mod)
	{
		this.mod = mod;
	}
	
	public void setupBlocks() {
		amethystBlock = new BlockAmethyst();
		amethystOre = new OreAmethyst();
	}

	public void setupItems() {
		amethyst = new ItemAmethyst();
		amethystApple = new ItemAmethystApple();
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
	    
	    output = new ItemStack(amethystApple);
	    GameRegistry.addRecipe(output,
				"aaa", "aAa", "aaa",
				'a', amethyst,
				'A', Items.apple
		);
	}
	
	public void setupWorldGeneration() {
		GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre, 6), 0);
	}

	public void setupEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityRosie.class, new RenderRosie(new ModelRosie(), 0.5F));
		EntityRegistry.registerModEntity(EntityRosie.class, "Rosie", 210, this.mod, 80, 1, true);
		EntityList.addMapping(EntityRosie.class, "Rosie", 210, 16382457, 12369084);	
	}
	
	public static CreativeTabs tabAmethyst = new CreativeTabs(Main.MODID) {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(amethyst).getItem();
		}
	};
}