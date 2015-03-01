package net.notanothercraft.satt;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.notanothercraft.satt.mods.SATTHook;

import java.util.ArrayList;
import java.util.Collection;

@Mod(modid="satt")
public class SATTMod {

    @Mod.Instance
    private SATTMod INSTANCE;

    private Collection<SATTHook> hooks = new ArrayList<SATTHook>();

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e){
        if (Loader.isModLoaded("botania"))
            hooks.add(SATTHook.getBotania(this));

    }

    public void onPostInit(FMLPostInitializationEvent e){
        for(SATTHook hook : hooks){
            hook.Engage();
        }
    }

    public SATTMod getInstance() {
        return INSTANCE;
    }
}
