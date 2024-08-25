package fox.mods.api.economy.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class EconomyFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Double> START_MONEY;
    public static final ForgeConfigSpec.ConfigValue<String> PREFIX;

    static {
        BUILDER.push("Economy Gameplay Settings");
        START_MONEY = BUILDER.comment("This defines the balance new players start with.").define("Starting Balance", 0.0);
        BUILDER.pop();
        BUILDER.push("Economy Messages Settings");
        PREFIX = BUILDER.comment("This defines the Prefix that is sent before every message by Economy.").define("Prefix", "§2§lEconomy");

        SPEC = BUILDER.build();
    }
}