package net.optifine.mixin;

import net.minecraft.util.profiler.*;
import org.spongepowered.asm.mixin.*;

import java.util.*;

@SuppressWarnings("OverwriteAuthorRequired")
// unideal for mcsr so i'll just remove it from the mixins list
@Mixin(Profiler.class)
public abstract class ProfilerMixin {
    @Overwrite
    public void reset() {
    }

    @Overwrite
    public void push(String location) {
    }

    @Overwrite
    public void pop() {
    }

    @Overwrite
    public void swap(String location) {
    }

    @Overwrite
    public List<class_840> getData(String location) {
        ArrayList<class_840> list = new ArrayList<>();
        list.add(new class_840("root", 0.0, 0.0));
        return list;
    }
}
