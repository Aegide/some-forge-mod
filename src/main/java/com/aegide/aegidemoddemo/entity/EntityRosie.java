package com.aegide.aegidemoddemo.entity;

import net.minecraft.world.World;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.StatCollector;

public class EntityRosie extends EntityOcelot{

	public EntityRosie(World p_i1688_1_) {
		super(p_i1688_1_);
	}	
	
	@Override public EntityRosie createChild(EntityAgeable p_90011_1_)
    {
		EntityRosie entityRosie = new EntityRosie(this.worldObj);
        if (this.isTamed())
        {
        	entityRosie.func_152115_b(this.func_152113_b());
        	entityRosie.setTamed(true);
        }
        return entityRosie;
    }
	
	@Override public boolean canMateWith(EntityAnimal p_70878_1_)
    {
		return false;
    }
	
	@Override public String getCommandSenderName()
    {
        return this.hasCustomNameTag() ? this.getCustomNameTag() : (this.isTamed() ? StatCollector.translateToLocal("entity.RosieTamed.name") : super.getCommandSenderName());
    }
}