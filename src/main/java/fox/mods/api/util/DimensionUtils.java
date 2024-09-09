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
        String namespace = dimension.location().getNamespace();
        String path = dimension.location().getPath();
        return Pair.of(namespace, path);
    }
    public static List<Pair<String, String>> getEnabledDimensions() {
        List<? extends String> dimensions = NoDimensionsFileConfiguration.getDimensionsDisabled();
        return dimensions.stream()
                .map(dim -> {
                    String[] parts = dim.split(":");
                    return Pair.of(parts[0], parts[1]);
                })
                .collect(Collectors.toList());
    }
}
