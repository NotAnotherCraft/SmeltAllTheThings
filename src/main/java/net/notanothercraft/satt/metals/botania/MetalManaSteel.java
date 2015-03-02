package net.notanothercraft.satt.metals.botania;

import net.minecraft.item.ItemStack;
import net.notanothercraft.satt.metals.SATTMetal;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class MetalManaSteel extends SATTMetal {
    public MetalManaSteel() {
        super();

        this.unlocalizedName = "satt.botania.manasteel";
        this.unlocalizedFluidName = "satt.botania.manasteel.molten";
        this.fluidBlockName = "molten_manasteel";
        this.fluidTextureName = "molten_manasteel";
        this.castingDelay = 80;
        this.meltingPoint = 800;


        this.ingotItem = new ItemStack(ModItems.manaResource,1,0);
        this.blockItem = new ItemStack(ModBlocks.storage,1,0);
        this.smelteryRenderBlock = blockItem;
    }
}
