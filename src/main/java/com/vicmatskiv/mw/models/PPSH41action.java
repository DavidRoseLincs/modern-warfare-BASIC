// Date: 9/2/2017 12:42:56 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

public class PPSH41action extends ModelWithAttachments
{
  //fields
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action5;
    ModelRenderer action6;
  
  public PPSH41action()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      action1 = new ModelRenderer(this, 0, 0);
      action1.addBox(0F, 0F, 0F, 1, 1, 15);
      action1.setRotationPoint(-2.4F, -8F, -15F);
      action1.setTextureSize(64, 32);
      action1.mirror = true;
      setRotation(action1, 0F, 0F, 0F);
      action2 = new ModelRenderer(this, 0, 0);
      action2.addBox(0F, 0F, 0F, 2, 1, 1);
      action2.setRotationPoint(-4.3F, -7.9F, -14F);
      action2.setTextureSize(64, 32);
      action2.mirror = true;
      setRotation(action2, 0F, 0F, 0F);
      action3 = new ModelRenderer(this, 0, 0);
      action3.addBox(0F, 0F, 0F, 2, 1, 1);
      action3.setRotationPoint(-4.3F, -7.9F, -14.2F);
      action3.setTextureSize(64, 32);
      action3.mirror = true;
      setRotation(action3, 0F, 0F, 0F);
      action4 = new ModelRenderer(this, 0, 0);
      action4.addBox(0F, 0F, 0F, 1, 1, 1);
      action4.setRotationPoint(-4.2F, -8.1F, -14.1F);
      action4.setTextureSize(64, 32);
      action4.mirror = true;
      setRotation(action4, 0F, 0F, 0F);
      action5 = new ModelRenderer(this, 0, 0);
      action5.addBox(0F, 0F, 0F, 1, 1, 1);
      action5.setRotationPoint(-3.7F, -8F, -14.1F);
      action5.setTextureSize(64, 32);
      action5.mirror = true;
      setRotation(action5, 0F, 0F, 0F);
      action6 = new ModelRenderer(this, 0, 0);
      action6.addBox(0F, 0F, 0F, 2, 1, 4);
      action6.setRotationPoint(-2F, -8.5F, -20F);
      action6.setTextureSize(64, 32);
      action6.mirror = true;
      setRotation(action6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    action1.render(f5);
    action2.render(f5);
    action3.render(f5);
    action4.render(f5);
    action5.render(f5);
    action6.render(f5);
  }

}