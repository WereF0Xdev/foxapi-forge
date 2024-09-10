package fox.mods.api.util;

import fox.mods.api.nodimensions.configuration.NoDimensionsFileConfiguration;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class DimensionUtils {
    public static Pair<String, String> getDimensionNamespaceAndPath(ResourceKey<Level> dimension) {
        if (dimension == null) {
            return Pair.of("", "");
        }
        String[] parts = dimension.toString().split(":");
        if (parts.length == 2) {
            return Pair.of(parts[0], parts[1]);
        }
        return Pair.of("", "");
    }

    public static List<Pair<String, String>> getDisabledDimensions() {
        return NoDimensionsFileConfiguration.getDimensionsDisabled().stream()
                .map(dim -> dim.split(":"))
                .filter(parts -> parts.length == 2)
                .map(parts -> Pair.of(parts[0], parts[1]))
                .collect(Collectors.toList());
    }
}




