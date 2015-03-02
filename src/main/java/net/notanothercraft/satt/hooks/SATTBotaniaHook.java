package net.notanothercraft.satt.hooks;

import net.notanothercraft.satt.SATTMod;
import net.notanothercraft.satt.metals.SATTMetal;
import net.notanothercraft.satt.metals.botania.MetalManaSteel;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class SATTBotaniaHook extends SATTHook{

    @Override
    public void Engage() {
        SATTMod.getLogger().info("Registering Manasteel");
        SATTMetal manasteel = new MetalManaSteel();
        manasteel.registerAll(null);
    }
}
