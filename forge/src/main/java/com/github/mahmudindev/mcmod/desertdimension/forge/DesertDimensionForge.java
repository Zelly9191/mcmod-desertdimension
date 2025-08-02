package com.github.mahmudindev.mcmod.desertdimension.forge;

import com.github.mahmudindev.mcmod.desertdimension.DesertDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(DesertDimension.MOD_ID)
public final class DesertDimensionForge {
    public DesertDimensionForge() {
        // Run our common setup.
        DesertDimension.init();
    }
}
