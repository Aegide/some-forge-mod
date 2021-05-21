package com.aegide.aegidemoddemo.block;

import com.aegide.aegidemoddemo.main.Config;
import com.aegide.aegidemoddemo.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAmethyst extends Block
{		
	public BlockAmethyst()
    {
        super(Material.iron);
        String blockName = "amethystBlock";
        
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setCreativeTab(Config.tabAmethyst);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 1);
        GameRegistry.registerBlock(this, blockName);
    }
}