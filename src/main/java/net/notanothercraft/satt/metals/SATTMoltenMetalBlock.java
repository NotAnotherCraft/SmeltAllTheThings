package net.notanothercraft.satt.metals;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class SATTMoltenMetalBlock extends BlockFluidClassic {
    private String texturename;
    //private IIcon icons[] = new IIcon[2];


    public SATTMoltenMetalBlock(Fluid fluid, Material material, String texturename) {
        super(fluid, material);
        this.texturename = texturename;
    }
/*  //removed for testing
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        icons[0] = iconRegister.registerIcon("satt:"+texturename);
        icons[1] = iconRegister.registerIcon("satt:"+texturename+"_flow");
        this.getFluid().setIcons(icons[0], icons[1]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if(side == 0 || side == 1)
            return icons[0];
        return icons[1];
    }
    */
}
