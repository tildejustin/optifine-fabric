package net.optifine.interfaces;

import net.optifine.VersionThread;

public interface WorldRendererInterface {
    VersionThread getVersionThread();

    int renderAllSortedRenderers(int renderPass, double partialTicks);
}
