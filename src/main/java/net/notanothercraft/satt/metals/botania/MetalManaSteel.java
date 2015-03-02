package net.notanothercraft.satt.metals.botania;

import net.minecraft.item.ItemStack;
import net.notanothercraft.satt.metals.SATTMetal;
import tconstruct.library.tools.ToolMaterial;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class MetalManaSteel extends SATTMetal {
    public MetalManaSteel() {
        super();

        this.metalOffset = 1;
        this.unlocalizedName = "satt.botania.manasteel";
        this.unlocalizedFluidName = "satt.botania.manasteel.molten";
        this.fluidBlockName = "molten_manasteel";
        this.fluidTextureName = "molten_manasteel";
        this.castingDelay = 80;
        this.meltingPoint = 800;

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

        this.ingotItem = new ItemStack(ModItems.manaResource,1,0);
        this.blockItem = new ItemStack(ModBlocks.storage,1,0);
        this.smelteryRenderBlock = blockItem;
    }
}
