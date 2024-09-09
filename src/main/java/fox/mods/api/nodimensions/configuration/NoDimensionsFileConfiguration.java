package fox.mods.api.nodimensions.configuration;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class NoDimensionsFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> DIMENSIONS_DISABLED;

    static {
        BUILDER.push("No Dimensions Settings");
        DIMENSIONS_DISABLED = BUILDER.comment("Defines a list of dimensions that are disabled. If no dimensions are in this list, they'll be enabled by default.").defineListAllowEmpty("dimensionsDisabled", Lists.newArrayList("minecraft:the_nether", "minecraft:the_end"), e -> e instanceof String && ((String) e).contains(":"));
        BUILDER.pop();

        SPEC = BUILDER.build();
    }

    public static List<? extends String> getDimensionsDisabled() {
        return DIMENSIONS_DISABLED.get();
    }
}