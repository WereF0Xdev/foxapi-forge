package fox.mods.api.nodimensions.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class NoDimensionsFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> NETHER_ENABLED;
    public static final ForgeConfigSpec.ConfigValue<Boolean> END_ENABLED;

    static {
        BUILDER.push("No Dimensions Settings");
        NETHER_ENABLED = BUILDER.comment("Defines if the Nether dimension is accessible (true) or not (false).").define("netherEnabled", false);
        END_ENABLED = BUILDER.comment("Defines if the End dimension is accessible (true) or not (false).").define("endEnabled", false);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}