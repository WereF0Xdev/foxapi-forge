package fox.mods.api.economy.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class EconomySettingsFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Double> START_MONEY;
    public static final ForgeConfigSpec.ConfigValue<String> PREFIX;
    public static final ForgeConfigSpec.ConfigValue<String> SELLING_MESSAGE;
    public static final ForgeConfigSpec.ConfigValue<String> BUYING_MESSAGE;
    public static final ForgeConfigSpec.ConfigValue<String> PAY_MESSAGE;
    public static final ForgeConfigSpec.ConfigValue<String> ERROR_SELL_AIR;
    public static final ForgeConfigSpec.ConfigValue<String> ERROR_INSUFFICIENT_MONEY;

    static {
        BUILDER.push("Economy Gameplay Settings");
        START_MONEY = BUILDER.comment("This defines the balance new players start with.").define("Starting Balance", 0.0);
        BUILDER.pop();
        BUILDER.push("Economy Messages Settings");
        PREFIX = BUILDER.comment("This defines the Prefix that is sent before every message by Economy.").define("Prefix", "§2§lEconomy");
        SELLING_MESSAGE = BUILDER.comment("Message sent when selling something.").define("Sell Message", "§aYou sold %itemsamount%x %itemsname% for $%moneyamount%!");
        BUYING_MESSAGE = BUILDER.comment("Message sent when buying something.").define("Buy Message", "§aYou bought %itemsamount%x %itemsname% for $%moneyamount%!");
        PAY_MESSAGE = BUILDER.comment("Message sent when paying a player.").define("Pay Message", "§aYou paid $%moneyamount% to %playername%.");
        ERROR_SELL_AIR = BUILDER.comment("Error Message when a player tries selling air").define("Error on sell AIR", "§cYou can't sell air!");
        ERROR_INSUFFICIENT_MONEY = BUILDER.comment("Error Message when a player tries spending more money than he has.").define("Error on insufficient Balance", "§cYou don't have enough money!");

        SPEC = BUILDER.build();
    }
}