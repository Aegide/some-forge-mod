package com.aegide.aegidemoddemo.item;

import com.aegide.aegidemoddemo.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAmethyst extends Item
{
    public ItemAmethyst()
    {
    	String itemName = "amethyst";
    	
        this.setUnlocalizedName(itemName);
        this.setTextureName(Main.MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(this, itemName);
    }
}