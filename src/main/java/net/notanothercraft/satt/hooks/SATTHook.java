package net.notanothercraft.satt.hooks;

import net.notanothercraft.satt.SATTMod;
import net.notanothercraft.satt.metals.SATTMetal;

import java.util.ArrayList;

/**
 * Created by KJ4IPS on 3/1/2015.
 */
public abstract class SATTHook {
    public abstract void Engage();


    private ArrayList<Class<? extends SATTMetal>> metals = new ArrayList<Class<? extends SATTMetal>>();

    public void addMetal(Class<? extends SATTMetal> clazz) {
        metals.add(clazz);
    }

    public void registerMetals() {
        for (Class<? extends SATTMetal> clazz : metals) {
            SATTMod.getLogger().info("Registering " + clazz.getSimpleName());
            try {
                clazz.getConstructor().newInstance().registerAll();
            } catch (Exception e) {
                SATTMod.getLogger().error("Could not register " + clazz.getSimpleName());
                e.printStackTrace();
            }
        }
    }
}