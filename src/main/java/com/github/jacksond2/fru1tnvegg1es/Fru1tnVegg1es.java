package com.github.jacksond2.fru1tnvegg1es;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Fru1tnVegg1es.MODID)
public class Fru1tnVegg1es {
    public static final String MODID = "fru1tnvegg1es";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Fru1tnVegg1es(){
        LOGGER.debug("Fru1t n Vegg1es Message!");
    }
}
