// Date: 11/1/2017 5:14:54 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M3A1frontsight extends ModelBase
{
  //fields
    ModelRenderer sight1;
    ModelRenderer sight2;
  
  public M3A1frontsight()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      sight1 = new ModelRenderer(this, 0, 0);
      sight1.addBox(0F, 0F, 0F, 1, 3, 4);
      sight1.setRotationPoint(0F, -2F, 0F);
      sight1.setTextureSize(64, 32);
      sight1.mirror = true;
      setRotation(sight1, 0.0743572F, 0F, 0F);
      sight2 = new ModelRenderer(this, 0, 0);
      sight2.addBox(0F, 0F, 0F, 1, 3, 2);
      sight2.setRotationPoint(0F, -2F, 0F);
      sight2.setTextureSize(64, 32);
      sight2.mirror = true;
      setRotation(sight2, -0.669215F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    sight1.render(f5);
    sight2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
