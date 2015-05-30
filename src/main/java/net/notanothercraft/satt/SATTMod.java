package net.notanothercraft.satt;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.notanothercraft.satt.hooks.SATTBotaniaHook;
import net.notanothercraft.satt.hooks.SATTHook;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

@Mod(name=SATTConstants.name, modid=SATTConstants.modid, version=SATTConstants.version, acceptedMinecraftVersions = SATTConstants.mcversion)
public class SATTMod {

    @Mod.Instance
    private static SATTMod INSTANCE;
    private Logger modLog;

    private final int baseMetalID = 500;

    private Collection<SATTHook> hooks = new ArrayList<SATTHook>();

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e){
        modLog = e.getModLog();
        if (Loader.isModLoaded("Botania"))
            hooks.add(new SATTBotaniaHook());

    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent e){
        for(SATTHook hook : hooks){
            hook.Engage();
        }
    }

    public static SATTMod getInstance() {
        return INSTANCE;
    }
    public static Logger getLogger() {return INSTANCE.modLog;}
    public int getBaseMetalID() {return baseMetalID;}
}
