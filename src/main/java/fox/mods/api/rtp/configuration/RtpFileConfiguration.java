package fox.mods.api.rtp.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class RtpFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> COOLDOWN;
    public static final ForgeConfigSpec.ConfigValue<Integer> TELEPORT_TIME;
    public static final ForgeConfigSpec.ConfigValue<Double> MIN_X;
    public static final ForgeConfigSpec.ConfigValue<Double> MAX_X;
    public static final ForgeConfigSpec.ConfigValue<Double> MIN_Z;
    public static final ForgeConfigSpec.ConfigValue<Double> MAX_Z;
    public static final ForgeConfigSpec.ConfigValue<String> PREFIX;
    public static final ForgeConfigSpec.ConfigValue<String> MESSAGE_ON_TELEPORT_INITIATED;
    public static final ForgeConfigSpec.ConfigValue<String> MESSAGE_ON_TELEPORT_CONCLUDED;
    public static final ForgeConfigSpec.ConfigValue<String> ERROR_ON_COOLDOWN;

    static {
        BUILDER.push("RTP Gameplay Settings");
        COOLDOWN = BUILDER.comment("This defines the cooldown seconds after the RTP command is used").define("cooldown", 30);
        TELEPORT_TIME = BUILDER.comment("This defines the time it takes to teleport after using the RTP command.").define("teleportationTime", 5);
        MIN_X = BUILDER.comment("Minimum X Coordinate for the RTP radius").define("minimumX", 1000.0);
        MAX_X = BUILDER.comment("Maximum X Coordinate for the RTP radius").define("maximumX", 3000.0);
        MIN_Z = BUILDER.comment("Minimum Z Coordinate for the RTP radius").define("minimumZ", 1000.0);
        MAX_Z = BUILDER.comment("Maximum Z Coordinate for the RTP radius").define("maximumZ", 3000.0);
        BUILDER.pop();
        BUILDER.push("RTP Messages Settings");
        PREFIX = BUILDER.comment("This defines the prefix of every message sent by RTP.").define("prefix", "§2§lRTP ");
        MESSAGE_ON_TELEPORT_INITIATED = BUILDER.comment("This defines the message sent by RTP when a player uses the RTP command.").define("messageOnRTPUsed", "§aTeleporting in %tptime% seconds!");
        MESSAGE_ON_TELEPORT_CONCLUDED = BUILDER.comment("This defines the message sent by RTP when a player is teleported after using the RTP command.").define("messageOnRTPFinished", "§aTeleported!");
        ERROR_ON_COOLDOWN = BUILDER.comment("This defines the error message sent by RTP when a player tries to use the RTP command while in cooldown.").define("errorRTPWhileInCooldown", "§cYou're still in cooldown! ");
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}