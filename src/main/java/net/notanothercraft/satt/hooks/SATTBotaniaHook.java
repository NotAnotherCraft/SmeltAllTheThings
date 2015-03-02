package net.notanothercraft.satt.hooks;

import net.notanothercraft.satt.SATTMod;
import net.notanothercraft.satt.metals.SATTMetal;
import net.notanothercraft.satt.metals.botania.MetalManaSteel;
import net.notanothercraft.satt.metals.botania.MetalTerraSteel;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public class SATTBotaniaHook extends SATTHook{


    @Override
    public void Engage() {
        addMetal(MetalManaSteel.class);
        addMetal(MetalTerraSteel.class);
        registerMetals();
    }
}
