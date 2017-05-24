package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Deagle;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Deagle44Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Deagle50")
//      .withAmmo(CommonProxy.M9Mag)
//      .withAmmoCapacity(10)
        .withFireRate(0.2f)
        .withRecoil(7f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("Deagle")
        .withSilencedShootSound("silencer")
        .withReloadSound("PistolReload")
        .withUnloadSound("Unload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withInaccuracy(5)
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.2f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(ModernWarfareMod.PistolsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 6.5", 
        "Caliber: .50 Action Express", "Magazines:", "7rnd .50 Action Express Magazine", "Fire Rate: Semi"))
         .withCompatibleAttachment(CommonProxy.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Deagle44Top, true, (model) -> {
//          GL11.glTranslatef(0.1F, -0.5F, -1F);
//          GL11.glRotatef(45F, 0f, 1f, 0f);
//          GL11.glScaled(0.55F, 0.55F, 0.55F);
        })
        .withCompatibleAttachment(CommonProxy.Deagle50Mag, (model) -> {
            GL11.glTranslatef(-0.03F, -0.1F, 0.14F);
            GL11.glScaled(0.7F, 1F, 1F);
            })
//        .withCompatibleAttachment(CommonProxy.Silencer357, (model) -> {
//            GL11.glTranslatef(-0.25F, -1.18F, -5.15F);
//            GL11.glScaled(1.5F, 1.5F, 1.7F);
//        })
        .withTextureNames("Deagle44", "DeagleGold", "Electric")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Deagle())
            //.withTextureName("XEagle")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.6F, -1F, 1.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                    GL11.glTranslatef(0.1F, -0.5F, -1F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.1F, -0.5F, -1F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
                GL11.glRotatef(-10F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.Deagle44Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.Deagle44Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.Deagle50Mag, (renderContext) -> {})
            
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.Deagle50Mag, (renderContext) -> {})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glTranslatef(-0.3F, -0.2F, -0.5F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);

                // Zoom
                GL11.glTranslatef(0.23F, -1.32f, 1.3f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                
            /*  // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.3f, 1f);
                } */
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.5f, 0.7f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.38F, -1.115f, 3.2f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(CommonProxy.Deagle50Mag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(CommonProxy.Deagle44Top.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
                        GL11.glRotatef(0F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                    
                        GL11.glRotatef(-60F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(1F, -1.2F, 0F);
                    }, 250, 500),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
                        GL11.glRotatef(0F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                    
                        GL11.glRotatef(-30F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(1F, -1.2F, 0F);
                    }, 250, 1000),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
                    GL11.glRotatef(0F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                    GL11.glRotatef(-30F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glTranslatef(1F, -1.2F, 0F);
                }, 50, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
                    GL11.glRotatef(0F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                    GL11.glRotatef(-60F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glTranslatef(1F, -1.2F, 0F);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
                    GL11.glRotatef(0F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                    GL11.glRotatef(-60F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glTranslatef(1F, -1.2F, 0F);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(CommonProxy.Deagle50Mag,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.3F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.Deagle50Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.3F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
                    
                    
            .withFirstPersonCustomPositioningUnloading(CommonProxy.Deagle44Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.Deagle44Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(45F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(-0.3F, -0.2F, -0.5F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);

                // Zoom
                GL11.glTranslatef(0.23F, -1.27f, 1.3f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                
            /*  // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.3f, 1f);
                } */
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0.01F, 0.44f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.37F, -1.226f, 3.2f);
                }
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glTranslatef(0.1F, -1.5F, -1F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-50F, 1f, 0f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(1.2F, 1.2F, 1.2F);
                    GL11.glRotatef(-35F, 2f, 1f, 1f);
                    GL11.glTranslatef(-1F, 0.1F, 0F);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.6f, -0.1f, 0.4f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-40f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(1.6f, 1.6f, 1.6f);
                         GL11.glTranslatef(1.5f, 0.1f, -0.2f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-10f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
        .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.9f, 0.8f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 20f, 20f, -20f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.5f, 0.5f, 0.3f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-30f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 0f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.5f, 0.5f, 0.3f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-30f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 0f, 1f, 0f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.8f, 0.1f, 0.6f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-30f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 0f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.8f, 0.1f, 0.6f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-30f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 0f, 1f, 0f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.4f, -0.1f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-120f, 1f, 0f, 0f);
                         GL11.glRotatef(10f, 0f, 0f, 1f);
                     })
            .build())
        .withSpawnEntityDamage(6.3f)
        .withSpawnEntityGravityVelocity(0.016f)
       
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}