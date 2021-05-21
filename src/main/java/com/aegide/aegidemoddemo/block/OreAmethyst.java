package com.aegide.aegidemoddemo.block;

import java.util.Random;

import com.aegide.aegidemoddemo.main.Config;
import com.aegide.aegidemoddemo.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreAmethyst extends Block
{
	private Item toDrop;
			
	public OreAmethyst()
    {
		super(Material.rock);
		String blockName = "amethystOre";
		
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setCreativeTab(Config.tabAmethyst);
        this.setHardness(4.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.toDrop = Config.amethyst;
        GameRegistry.registerBlock(this, blockName);
    }
	
	@Override
    public Item getItemDropped(int i, Random random, int j)
    {
        if(toDrop != null)
        {
            return toDrop;
        }
        else return Item.getItemFromBlock(this);
    }
}
