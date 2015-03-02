package net.notanothercraft.satt.metals;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.TConstruct;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.FluidType;
import tconstruct.library.crafting.LiquidCasting;
import tconstruct.library.crafting.Smeltery;
import tconstruct.smeltery.TinkerSmeltery;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public abstract class SATTMetal {
    protected String unlocalizedName;

    protected String unlocalizedFluidName;
    protected String fluidBlockName;
    protected String fluidTextureName;
    protected int density;
    protected int viscosity;
    protected int temperature;
    protected Material fluidMaterial;

    protected ItemStack smelteryRenderBlock;
    protected int meltingPoint;
    protected boolean isForTools;


    //Used when casting, and melting if OreDict is not used for that
    protected ItemStack ingotItem;
    protected ItemStack blockItem;
    protected ItemStack nuggetItem;
    protected int castingDelay;

    //So it can be used in the smeltery
    protected FluidType fluidType;
    protected Fluid fluid;

    protected static final ItemStack ingotCast = new ItemStack(TinkerSmeltery.metalPattern,1,0);
    protected static final ItemStack nuggetcast = new ItemStack(TinkerSmeltery.metalPattern,2,0);
    protected static final LiquidCasting tableCasting = TConstructRegistry.getTableCasting();
    protected static final LiquidCasting basinCasting = TConstructRegistry.getBasinCasting();

    public SATTMetal(){
        this.density = 3000;
        this.viscosity = 6000;
        this.temperature = 1300;
        this.fluidMaterial = Material.lava;
    }

    public void registerFluidWithTcon(){
        this.fluid = TinkerSmeltery.registerFluid(this.unlocalizedName, this.unlocalizedFluidName, this.fluidBlockName,
                this.fluidTextureName, this.density, this.viscosity, this.temperature, this.fluidMaterial);
        this.fluidType = new FluidType(Block.getBlockFromItem(this.smelteryRenderBlock.getItem()),
                this.smelteryRenderBlock.getItemDamage(),
                this.meltingPoint, this.fluid, this.isForTools);
    }

    public void registerCastingRecipes(){
        if(nuggetItem != null)
            tableCasting.addCastingRecipe(this.nuggetItem, new FluidStack(this.fluid, TConstruct.nuggetLiquidValue),
                    nuggetcast,false, 80);
        if(ingotItem != null)
            tableCasting.addCastingRecipe(this.ingotItem, new FluidStack(this.fluid, TConstruct.ingotLiquidValue),
                    ingotCast, false, this.castingDelay);
        if(blockItem != null)
            basinCasting.addCastingRecipe(this.blockItem, new FluidStack(this.fluid, TConstruct.blockLiquidValue),
                    this.castingDelay);
    }

    public void registerOreDictMelting(String name){
        Smeltery.addDictionaryMelting("ingot" + name, this.fluidType, -50, TConstruct.ingotLiquidValue);
        Smeltery.addDictionaryMelting("block" + name, this.fluidType, 100, TConstruct.blockLiquidValue);
        Smeltery.addDictionaryMelting("nugget"+ name, this.fluidType, -100, TConstruct.nuggetLiquidValue);
    }

    public void registerStaticMelting(){
        if(nuggetItem != null)
            Smeltery.addMelting(this.fluidType, this.nuggetItem,-100, TConstruct.nuggetLiquidValue);
        if(ingotItem != null)
            Smeltery.addMelting(this.fluidType, this.ingotItem, -50, TConstruct.ingotLiquidValue);
        if(blockItem != null)
            Smeltery.addMelting(this.fluidType, this.blockItem, 100, TConstruct.blockLiquidValue);
    }

    public void registerAll(String oreName){
        this.registerFluidWithTcon();
        this.registerCastingRecipes();
        this.registerStaticMelting();
        if(oreName != null)
        this.registerOreDictMelting(oreName);
    };

}
