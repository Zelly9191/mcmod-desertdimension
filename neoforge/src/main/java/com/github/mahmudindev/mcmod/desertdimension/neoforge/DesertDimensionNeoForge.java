package com.github.mahmudindev.mcmod.desertdimension.neoforge;

import com.github.mahmudindev.mcmod.desertdimension.DesertDimension;
import net.neoforged.fml.common.Mod;

@Mod(DesertDimension.MOD_ID)
public final class DesertDimensionNeoForge {
    public DesertDimensionNeoForge() {
        // Run our common setup.
        DesertDimension.init();
    }
}
