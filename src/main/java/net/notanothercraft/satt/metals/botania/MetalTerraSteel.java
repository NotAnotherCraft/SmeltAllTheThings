package net.notanothercraft.satt.metals.botania;

import net.minecraft.item.ItemStack;
import net.notanothercraft.satt.metals.SATTMetal;
import tconstruct.library.tools.ToolMaterial;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class MetalTerraSteel extends SATTMetal {
    public MetalTerraSteel() {
        super();

        this.metalOffset = 2;
        this.unlocalizedName = "satt.botania.terrasteel";
        this.unlocalizedFluidName = "satt.botania.terrasteel.molten";
        this.fluidBlockName = "molten_terrasteel";
        this.fluidTextureName = "molten_terrasteel";
        this.castingDelay = 100;
        this.meltingPoint = 1000;

        this.toolMaterial = new ToolMaterial(
                "botania.manasteel",
                "botania.manasteel",
                /*Harvest Level*/ 1,
                /*Durability*/ 1,
                /*Mining Speed*/ 1,
                /*Attack Damage*/ 1,
                /*Handle Modifier*/ 1,
                /*Reinforced*/ 0,
                /*Stonebound*/ 0,
                /*Tooltip Sytle*/ "",
                /*Primary Color*/ 0x4199DF
                );

        this.ingotItem = new ItemStack(ModItems.manaResource,1,4);
        this.blockItem = new ItemStack(ModBlocks.storage,1,1);
        this.smelteryRenderBlock = blockItem;
    }
}
