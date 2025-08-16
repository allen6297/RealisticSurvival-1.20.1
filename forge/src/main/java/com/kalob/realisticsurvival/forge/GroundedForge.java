package com.kalob.realisticsurvival.forge;

import com.kalob.realisticsurvival.Grounded;
import net.minecraftforge.fml.common.Mod;

@Mod(Grounded.MOD_ID)
public class GroundedForge {
    public static final String MOD_ID = Grounded.MOD_ID;

    public GroundedForge() {
        Grounded.commonInit();
    }
}

