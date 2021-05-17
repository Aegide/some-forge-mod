package com.aegide.aegidemoddemo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlock extends Block
{
	//private Item toCraft;
			
	public ModBlock(Material material, String blockName, Item toCraft)
    {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 1);
        //this.toCraft = toCraft;
    }
	

}
