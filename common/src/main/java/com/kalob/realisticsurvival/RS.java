package com.kalob.realisticsurvival;

import com.kalob.realisticsurvival.reg.ModBlocks;
import com.kalob.realisticsurvival.reg.ModCreativeTab;
import com.kalob.realisticsurvival.reg.ModWorldgen;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.minecraft.resources.ResourceLocation;

public class RS {

    public static final String MOD_ID = "realisticsurvival";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void commonInit() {

        if (PlatHelper.getPhysicalSide().isClient()) {
            RSClient.init();
        }

        ModCreativeTab.init();
        ModBlocks.init();
        ModWorldgen.init();
    }

}