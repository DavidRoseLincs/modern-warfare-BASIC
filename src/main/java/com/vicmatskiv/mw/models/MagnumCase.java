// Date: 1/17/2017 5:11:41 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MagnumCase extends ModelBase
{
  //fields
    ModelRenderer gun78;
    ModelRenderer gun79;
    ModelRenderer gun80;
    ModelRenderer gun81;
    ModelRenderer gun90;
    ModelRenderer gun91;
    ModelRenderer gun92;
    ModelRenderer gun93;
    ModelRenderer gun94;
    ModelRenderer gun95;
    ModelRenderer gun96;
    ModelRenderer gun98;
    ModelRenderer gun99;
    ModelRenderer gun100;
    ModelRenderer gun101;
  
  public MagnumCase()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      gun78 = new ModelRenderer(this, 100, 0);
      gun78.addBox(0F, 0F, 0F, 3, 3, 5);
      gun78.setRotationPoint(-3F, -14.3F, -13F);
      gun78.setTextureSize(64, 32);
      gun78.mirror = true;
      setRotation(gun78, 0F, 0F, 0F);
      gun79 = new ModelRenderer(this, 100, 0);
      gun79.addBox(0F, 0F, 0F, 3, 2, 5);
      gun79.setRotationPoint(-3F, -11.7F, -13F);
      gun79.setTextureSize(64, 32);
      gun79.mirror = true;
      setRotation(gun79, 0F, 0F, 0F);
      gun80 = new ModelRenderer(this, 100, 0);
      gun80.addBox(0F, 0F, 0F, 3, 1, 1);
      gun80.setRotationPoint(-3F, -10.7F, -8.5F);
      gun80.setTextureSize(64, 32);
      gun80.mirror = true;
      setRotation(gun80, 0F, 0F, 0F);
      gun81 = new ModelRenderer(this, 100, 0);
      gun81.addBox(0F, 0F, 0F, 3, 4, 1);
      gun81.setRotationPoint(-3F, -14.3F, -8.5F);
      gun81.setTextureSize(64, 32);
      gun81.mirror = true;
      setRotation(gun81, 0F, 0F, 0F);
      gun90 = new ModelRenderer(this, 100, 0);
      gun90.addBox(0F, 0F, 0F, 2, 1, 5);
      gun90.setRotationPoint(0F, -14.3F, -13F);
      gun90.setTextureSize(64, 32);
      gun90.mirror = true;
      setRotation(gun90, 0F, 0F, 0.7063936F);
      gun91 = new ModelRenderer(this, 100, 0);
      gun91.addBox(0F, 0F, 0F, 1, 2, 5);
      gun91.setRotationPoint(-3F, -14.3F, -13F);
      gun91.setTextureSize(64, 32);
      gun91.mirror = true;
      setRotation(gun91, 0F, 0F, 0.8922867F);
      gun92 = new ModelRenderer(this, 100, 0);
      gun92.addBox(0F, 0F, 0F, 2, 2, 1);
      gun92.setRotationPoint(0F, -14.3F, -8.5F);
      gun92.setTextureSize(64, 32);
      gun92.mirror = true;
      setRotation(gun92, 0F, 0F, 0.7063936F);
      gun93 = new ModelRenderer(this, 100, 0);
      gun93.addBox(0F, 0F, 0F, 2, 2, 1);
      gun93.setRotationPoint(-3F, -14.3F, -8.5F);
      gun93.setTextureSize(64, 32);
      gun93.mirror = true;
      setRotation(gun93, 0F, 0F, 0.8922867F);
      gun94 = new ModelRenderer(this, 100, 0);
      gun94.addBox(0F, 0F, 0F, 2, 1, 5);
      gun94.setRotationPoint(-3F, -9.7F, -13F);
      gun94.setTextureSize(64, 32);
      gun94.mirror = true;
      setRotation(gun94, 0F, 0F, -2.453788F);
      gun95 = new ModelRenderer(this, 100, 0);
      gun95.addBox(0F, 0F, 0F, 2, 2, 1);
      gun95.setRotationPoint(-3F, -9.7F, -8.5F);
      gun95.setTextureSize(64, 32);
      gun95.mirror = true;
      setRotation(gun95, 0F, 0F, -2.453788F);
      gun96 = new ModelRenderer(this, 100, 0);
      gun96.addBox(0F, 0F, 0F, 1, 2, 5);
      gun96.setRotationPoint(0F, -9.7F, -13F);
      gun96.setTextureSize(64, 32);
      gun96.mirror = true;
      setRotation(gun96, 0F, 0F, -2.305074F);
      gun98 = new ModelRenderer(this, 100, 0);
      gun98.addBox(0F, 0F, 0F, 2, 2, 1);
      gun98.setRotationPoint(0F, -9.7F, -8.5F);
      gun98.setTextureSize(64, 32);
      gun98.mirror = true;
      setRotation(gun98, 0F, 0F, -2.305074F);
      gun99 = new ModelRenderer(this, 100, 0);
      gun99.addBox(0F, 0F, 0F, 1, 2, 2);
      gun99.setRotationPoint(0.5F, -13F, -9.5F);
      gun99.setTextureSize(64, 32);
      gun99.mirror = true;
      setRotation(gun99, 0F, 0F, 0F);
      gun100 = new ModelRenderer(this, 100, 0);
      gun100.addBox(0F, 0F, 0F, 1, 2, 2);
      gun100.setRotationPoint(-4.5F, -13F, -9.5F);
      gun100.setTextureSize(64, 32);
      gun100.mirror = true;
      setRotation(gun100, 0F, 0F, 0F);
      gun101 = new ModelRenderer(this, 100, 0);
      gun101.addBox(0F, 0F, 0F, 5, 2, 4);
      gun101.setRotationPoint(-4F, -13F, -13F);
      gun101.setTextureSize(64, 32);
      gun101.mirror = true;
      setRotation(gun101, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun78.render(f5);
    gun79.render(f5);
    gun80.render(f5);
    gun81.render(f5);
    gun90.render(f5);
    gun91.render(f5);
    gun92.render(f5);
    gun93.render(f5);
    gun94.render(f5);
    gun95.render(f5);
    gun96.render(f5);
    gun98.render(f5);
    gun99.render(f5);
    gun100.render(f5);
    gun101.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
