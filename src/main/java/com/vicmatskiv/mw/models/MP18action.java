// Date: 9/5/2017 10:08:08 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

public class MP18action extends ModelBase
{
  //fields
    
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
  
  public MP18action()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      action1 = new ModelRenderer(this, 0, 0);
      action1.addBox(0F, 0F, 0F, 1, 1, 12);
      action1.setRotationPoint(-2.5F, -7.5F, -18F);
      action1.setTextureSize(64, 32);
      action1.mirror = true;
      setRotation(action1, 0F, 0F, 0F);
      action2 = new ModelRenderer(this, 0, 0);
      action2.addBox(0F, 0F, 0F, 1, 1, 3);
      action2.setRotationPoint(-2.5F, -7.5F, -9F);
      action2.setTextureSize(64, 32);
      action2.mirror = true;
      setRotation(action2, 0F, 0F, -1.152537F);
      action3 = new ModelRenderer(this, 0, 0);
      action3.addBox(0F, 0F, 0F, 3, 1, 1);
      action3.setRotationPoint(-4.8F, -7.5F, -18.1F);
      action3.setTextureSize(64, 32);
      action3.mirror = true;
      setRotation(action3, 0F, -0.2230717F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    action1.render(f5);
    action2.render(f5);
    action3.render(f5);
 }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}