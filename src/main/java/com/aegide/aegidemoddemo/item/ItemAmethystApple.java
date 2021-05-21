package com.aegide.aegidemoddemo.item;

import com.aegide.aegidemoddemo.main.Config;
import com.aegide.aegidemoddemo.main.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAmethystApple extends ItemFood {
    public ItemAmethystApple()
    {
    	super(4, 9.6f, false);
    	String itemName = "amethystApple";
    	
    	this.setUnlocalizedName(itemName);
    	this.setTextureName(Main.MODID + ":" + itemName);
    	this.setCreativeTab(Config.tabAmethyst);
    	this.setAlwaysEdible();
        GameRegistry.registerItem(this, itemName);
    }
    
    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60*20, 1));
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 60*20, 1));
        }
    }
}