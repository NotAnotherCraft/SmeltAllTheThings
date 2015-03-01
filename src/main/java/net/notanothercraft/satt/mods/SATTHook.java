package net.notanothercraft.satt.mods;

import net.notanothercraft.satt.SATTMod;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public abstract class SATTHook {
    public abstract void Engage();

    public static SATTHook getBotania(SATTMod sattMod) {
        return new SATTBotaniaHook(sattMod);
    }
}
