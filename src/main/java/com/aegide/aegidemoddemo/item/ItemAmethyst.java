package com.aegide.aegidemoddemo.item;

import com.aegide.aegidemoddemo.main.Config;
import com.aegide.aegidemoddemo.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemAmethyst extends Item
{
    public ItemAmethyst()
    {
    	String itemName = "amethyst";
    	
        this.setUnlocalizedName(itemName);
        this.setTextureName(Main.MODID + ":" + itemName);
        this.setCreativeTab(Config.tabAmethyst);
        GameRegistry.registerItem(this, itemName);
    }
}