package com.aegide.aegidemoddemo.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.util.ResourceLocation;

public class RenderRosie extends RenderOcelot{

	private static final ResourceLocation siameseOcelotTextures = new ResourceLocation("textures/entity/cat/siamese.png");
	
	public RenderRosie(ModelBase p_i1264_1_, float p_i1264_2_) {
		super(p_i1264_1_, p_i1264_2_);
	}

	@Override protected ResourceLocation getEntityTexture(EntityOcelot p_110775_1_)
    {
        return siameseOcelotTextures;
    }
}