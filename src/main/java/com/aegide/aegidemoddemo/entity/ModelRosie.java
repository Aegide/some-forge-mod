package com.aegide.aegidemoddemo.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelRosie extends ModelBase
{
    /** The back left leg model for the Ocelot. */
    ModelRenderer rosieBackLeftLeg;
    /** The back right leg model for the Ocelot. */
    ModelRenderer rosieBackRightLeg;
    /** The front left leg model for the Ocelot. */
    ModelRenderer rosieFrontLeftLeg;
    /** The front right leg model for the Ocelot. */
    ModelRenderer rosieFrontRightLeg;
    /** The tail model for the Ocelot. */
    ModelRenderer rosieTail;
    /** The second part of tail model for the Ocelot. */
    ModelRenderer rosieTail2;
    /** The head model for the Ocelot. */
    ModelRenderer rosieHead;
    /** The body model for the Ocelot. */
    ModelRenderer rosieBody;
    int modelState = 1;
    //private static final String __OBFID = "CL_00000848";
    
    boolean isFat = true;
    
    public ModelRosie()
    {
    	//Fat cat
    	float bodyScaleFactor = 2.0F;
    	
    	this.setTextureOffset("head.main", 0, 0);
        this.setTextureOffset("head.nose", 0, 24);
        this.setTextureOffset("head.ear1", 0, 10);
        this.setTextureOffset("head.ear2", 6, 10);
        this.rosieHead = new ModelRenderer(this, "head");
        this.rosieHead.addBox("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
        this.rosieHead.addBox("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
        this.rosieHead.addBox("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
        this.rosieHead.addBox("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
        this.rosieHead.setRotationPoint(0.0F, 15.0F, -9.0F);
        this.rosieBody = new ModelRenderer(this, 20, 0);
        this.rosieBody.addBox(-2.0F, 3.0F, -8.0F, 4, 16, 6, bodyScaleFactor);
        this.rosieBody.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.rosieTail = new ModelRenderer(this, 0, 15);
        this.rosieTail.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1);
        this.rosieTail.rotateAngleX = 0.9F;
        this.rosieTail.setRotationPoint(0.0F, 15.0F, 8.0F);
        this.rosieTail2 = new ModelRenderer(this, 4, 15);
        this.rosieTail2.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1);
        this.rosieTail2.setRotationPoint(0.0F, 20.0F, 14.0F);
        this.rosieBackLeftLeg = new ModelRenderer(this, 8, 13);
        this.rosieBackLeftLeg.addBox(-1.0F, 0.0F, 1.0F, 2, 6, 2);
        this.rosieBackLeftLeg.setRotationPoint(1.1F, 18.0F, 5.0F);
        this.rosieBackRightLeg = new ModelRenderer(this, 8, 13);
        this.rosieBackRightLeg.addBox(-1.0F, 0.0F, 1.0F, 2, 6, 2);
        this.rosieBackRightLeg.setRotationPoint(-1.1F, 18.0F, 5.0F);
        this.rosieFrontLeftLeg = new ModelRenderer(this, 40, 0);
        this.rosieFrontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 10, 2);
        this.rosieFrontLeftLeg.setRotationPoint(1.2F, 13.8F, -5.0F);
        this.rosieFrontRightLeg = new ModelRenderer(this, 40, 0);
        this.rosieFrontRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 10, 2);
        this.rosieFrontRightLeg.setRotationPoint(-1.2F, 13.8F, -5.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
    {
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

        if (this.isChild)
        {
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 10.0F * p_78088_7_, 4.0F * p_78088_7_);
            this.rosieHead.render(p_78088_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
            this.rosieBody.render(p_78088_7_);
            this.rosieBackLeftLeg.render(p_78088_7_);
            this.rosieBackRightLeg.render(p_78088_7_);
            this.rosieFrontLeftLeg.render(p_78088_7_);
            this.rosieFrontRightLeg.render(p_78088_7_);
            this.rosieTail.render(p_78088_7_);
            this.rosieTail2.render(p_78088_7_);
            GL11.glPopMatrix();
        }
        else
        {
            this.rosieHead.render(p_78088_7_);
            this.rosieBody.render(p_78088_7_);
            this.rosieTail.render(p_78088_7_);
            this.rosieTail2.render(p_78088_7_);
            this.rosieBackLeftLeg.render(p_78088_7_);
            this.rosieBackRightLeg.render(p_78088_7_);
            this.rosieFrontLeftLeg.render(p_78088_7_);
            this.rosieFrontRightLeg.render(p_78088_7_);
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        this.rosieHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
        this.rosieHead.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);

        if (this.modelState != 3)
        {
            this.rosieBody.rotateAngleX = ((float)Math.PI / 2F);

            if (this.modelState == 2)
            {
                this.rosieBackLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.0F * p_78087_2_;
                this.rosieBackRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + 0.3F) * 1.0F * p_78087_2_;
                this.rosieFrontLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI + 0.3F) * 1.0F * p_78087_2_;
                this.rosieFrontRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.0F * p_78087_2_;
                this.rosieTail2.rotateAngleX = 1.7278761F + ((float)Math.PI / 10F) * MathHelper.cos(p_78087_1_) * p_78087_2_;
            }
            else
            {
                this.rosieBackLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.0F * p_78087_2_;
                this.rosieBackRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.0F * p_78087_2_;
                this.rosieFrontLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.0F * p_78087_2_;
                this.rosieFrontRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.0F * p_78087_2_;

                if (this.modelState == 1)
                {
                	this.rosieTail2.rotateAngleX = 1.7278761F + ((float)Math.PI / 4F) * MathHelper.cos(p_78087_1_) * p_78087_2_;
                }
                else
                {
                	this.rosieTail2.rotateAngleX = 1.7278761F + 0.47123894F * MathHelper.cos(p_78087_1_) * p_78087_2_;
                }
            }
        }
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLivingBase entityLivingBase, float p_78086_2_, float p_78086_3_, float p_78086_4_)
    {
    	EntityRosie entityRosie = (EntityRosie)entityLivingBase;
        
        this.rosieBody.rotationPointY = 12.0F;
        this.rosieBody.rotationPointZ = -10.0F;
        this.rosieHead.rotationPointY = 15.0F;
        this.rosieHead.rotationPointZ = -9.0F;
        this.rosieTail.rotationPointY = 15.0F;
        this.rosieTail.rotationPointZ = 8.0F;
        this.rosieTail2.rotationPointY = 20.0F;
        this.rosieTail2.rotationPointZ = 14.0F;
        this.rosieFrontLeftLeg.rotationPointY = this.rosieFrontRightLeg.rotationPointY = 13.8F;
        this.rosieFrontLeftLeg.rotationPointZ = this.rosieFrontRightLeg.rotationPointZ = -5.0F;
        this.rosieBackLeftLeg.rotationPointY = this.rosieBackRightLeg.rotationPointY = 18.0F;
        this.rosieBackLeftLeg.rotationPointZ = this.rosieBackRightLeg.rotationPointZ = 5.0F;
        
        if ( entityRosie.isSneaking())
        {
            ++this.rosieBody.rotationPointY;
            this.rosieHead.rotationPointY += 2.0F;
            ++this.rosieTail.rotationPointY;
            this.rosieTail2.rotationPointY += -4.0F;
            this.rosieTail2.rotationPointZ += 2.0F;
            this.rosieTail.rotateAngleX = ((float)Math.PI / 2F);
            this.rosieTail2.rotateAngleX = ((float)Math.PI / 2F);
            this.modelState = 0;
        }
        else if (entityRosie.isSprinting())
        {
        	this.rosieTail2.rotationPointY = this.rosieTail.rotationPointY;
        	this.rosieTail2.rotationPointZ += 2.0F;
            this.rosieTail.rotateAngleX = ((float)Math.PI / 2F);
            this.rosieTail2.rotateAngleX = ((float)Math.PI / 2F);
            this.modelState = 2;
        }
        else if ( entityRosie.isSitting())
        {
            this.rosieBody.rotateAngleX = ((float)Math.PI / 4F);
            this.rosieBody.rotationPointY += -4.0F;
            this.rosieBody.rotationPointZ += 5.0F;
            this.rosieHead.rotationPointY += -3.3F;
            ++this.rosieHead.rotationPointZ;
            this.rosieTail.rotationPointY += 8.0F;
            this.rosieTail.rotationPointZ += -2.0F;
            this.rosieTail2.rotationPointY += 2.0F;
            this.rosieTail2.rotationPointZ += -0.8F;
            this.rosieTail.rotateAngleX = 1.7278761F;
            this.rosieTail2.rotateAngleX = 2.670354F;
            this.rosieFrontLeftLeg.rotateAngleX = this.rosieFrontRightLeg.rotateAngleX = -0.15707964F;
            this.rosieFrontLeftLeg.rotationPointY = this.rosieFrontRightLeg.rotationPointY = 15.8F;
            this.rosieFrontLeftLeg.rotationPointZ = this.rosieFrontRightLeg.rotationPointZ = -7.0F;
            this.rosieBackLeftLeg.rotateAngleX = this.rosieBackRightLeg.rotateAngleX = -((float)Math.PI / 2F);
            this.rosieBackLeftLeg.rotationPointY = this.rosieBackRightLeg.rotationPointY = 21.0F;
            this.rosieBackLeftLeg.rotationPointZ = this.rosieBackRightLeg.rotationPointZ = 1.0F;
            this.modelState = 3;
        }
        else
        {
        	float yTailOffset = -10.0F;
        	this.rosieTail.rotationPointY += (8.0F + yTailOffset);
            this.rosieTail2.rotationPointY += (2.0F + yTailOffset);
            this.rosieTail.rotateAngleX = 1.7278761F;
            this.rosieTail2.rotateAngleX = 2.670354F;
        	float zTailOffset = 5.0F;
        	float zHeadOffset = -2.0F;
        	this.rosieHead.rotationPointZ += zHeadOffset;
        	this.rosieTail.rotationPointZ += (zTailOffset - 2.0F);
        	this.rosieTail2.rotationPointZ += (zTailOffset - 0.8F);
            this.modelState = 1;
        }
    }
}