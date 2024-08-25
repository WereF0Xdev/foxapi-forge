package fox.mods.api.tpa.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class TpaFileConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BACKENABLED;
    public static final ForgeConfigSpec.ConfigValue<Double> COOLDOWNTIME;
    public static final ForgeConfigSpec.ConfigValue<Double> TELEPORTATIONTIME;
    public static final ForgeConfigSpec.ConfigValue<String> PREFIX;
    public static final ForgeConfigSpec.ConfigValue<String> TPISSENT;
    public static final ForgeConfigSpec.ConfigValue<String> TPISRECEIVED;
    public static final ForgeConfigSpec.ConfigValue<String> TPISACCEPTEDACCEPTER;
    public static final ForgeConfigSpec.ConfigValue<String> TPISACCEPTEDSENDER;
    public static final ForgeConfigSpec.ConfigValue<String> TPHAPPENED;
    public static final ForgeConfigSpec.ConfigValue<String> TPHEREISSENT;
    public static final ForgeConfigSpec.ConfigValue<String> TPHEREISRECEIVED;
    public static final ForgeConfigSpec.ConfigValue<String> BACKPOSSETBACKENABLED;
    public static final ForgeConfigSpec.ConfigValue<String> BACKPOSSETBACKDISABLED;
    public static final ForgeConfigSpec.ConfigValue<String> TPTOGGLEENABLED;
    public static final ForgeConfigSpec.ConfigValue<String> TPTOGGLEDISABLED;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORSELFTP;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORSELFACCEPT;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORNOTP;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORNOBACKPOS;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORNOPERMS;
    public static final ForgeConfigSpec.ConfigValue<String> ERRORTPAINCOOLDOWN;
    static {
        BUILDER.push("TPA Gameplay Settings");
        BACKENABLED = BUILDER.comment("This defines if /back is enabled (true) or disabled (false)").define("/back Enabled?", false);
        COOLDOWNTIME = BUILDER.comment("This is the time (in seconds) it takes for TPA commands to be available again after use").define("Cooldown Time", (double) 30);
        TELEPORTATIONTIME = BUILDER.comment("This is the time it takes for the teleportation after a TPA request is accepted").define("Teleportation Time", (double) 5);
        BUILDER.pop();
        BUILDER.push("TPA Messages Settings");
        PREFIX = BUILDER.comment("This is the prefix that is added before every message.").define("Message Prefix", "§c§l<<§6§lTPA§c§l>>§r ");
        TPISSENT = BUILDER.comment("This is the message that is sent when a teleport request is sent").define("Message on TPA Sent", "§6You sent a teleport request!");
        TPISRECEIVED = BUILDER.comment("This is the message that is sent when a teleport request is received. Use %tpauser% to insert the name of the player who sent the TPA request").define("Message on TPA Received",
                "§6You received a teleport request from %tpauser%! To accept it, type /tpaccept");
        TPISACCEPTEDACCEPTER = BUILDER.comment("This is the message that is sent TO THE PLAYER WHO ACCEPTED when a TPA request is accepted").define("Message to Accepter on TPA Accepted", "§6You accepted the teleport request!");
        TPISACCEPTEDSENDER = BUILDER.comment("This is the message that is sent TO THE PLAYER WHO SENT  THE TPA REQUEST when it's accepted. Use %tptime% to display the time it will take to teleport the player")
                .define("Message to Sender on TPA Accepted", "§6Teleporting in %tptime% seconds...");
        TPHAPPENED = BUILDER.comment("This is the message that is sent when the teleportation has finished happening").define("Message on Teleport Finished", "§6Teleported!");
        TPHEREISSENT = BUILDER.comment("This is the message that is sent when a TPAHERE request is sent").define("Message on TPAHERE sent", "§6You sent a teleport here request!");
        TPHEREISRECEIVED = BUILDER.comment("This is the message that is sent when a TPAHERE request is received").define("Message on TPAHERE Received", "§6You received a teleport here request from %tpauser%! To accept it, type /tpaccept");
        BACKPOSSETBACKENABLED = BUILDER.comment("This is the message that will be sent when a player dies IF /BACK IS ENABLED. Use %x%, %y%, %z% to display the coordinates the player died at").define("Message on death /back Enabled",
                "§6You died at %x% %y% %z%! Use /back to go back to your death location!");
        BACKPOSSETBACKDISABLED = BUILDER.comment("This is the message that will be sent when a player dies IF /BACK IS DISABLED. Use %x%, %y%, %z% to display the coordinates the player died at").define("Message on death /back Disabled",
                "§6You died at %x% %y% %z%!");
        TPTOGGLEENABLED = BUILDER.comment("This is the message that is sent when a player ENABLES TPAToggle").define("Message on TPAToggle Enabled", "§6You are now automatically §laccepting§r§6 teleport requests");
        TPTOGGLEDISABLED = BUILDER.comment("This is the message that is sent when a player DISABLES TPAToggle").define("Message on TPAToggle Disabled", "§6You are no longer automatically §laccepting §r§6teleport requests.");
        ERRORSELFTP = BUILDER.comment("This is the error message that is sent when a player tries to teleport to himself").define("Error message on self TPA", "§cYou can't teleport to yourself!");
        ERRORSELFACCEPT = BUILDER.comment("This is the Error message that is sent when a player tries to accept his own teleport request").define("Error message on self TPA Accept", "§cYou can't accept your own teleport request!");
        ERRORNOTP = BUILDER.comment("This is the Error message that is sent when a player tries to accept an invalid teleport request").define("Error message on TPA Invalid", "§cYou don't have a teleport request!");
        ERRORNOBACKPOS = BUILDER.comment("This is the Error message that is sent when a player tries to use /back without a back position").define("Error message on /back invalid", "§cYou don't have a back location!");
        ERRORNOPERMS = BUILDER.comment("This is the Error message that is sent when a player tries to use /back with no permission").define("Error message on /back Disabled", "§cYou don't have permission to use this command.");
        ERRORTPAINCOOLDOWN = BUILDER.comment("This is the message that is sent when a player tries to send a teleport request while in cooldown.").define("Error message on TPA in cooldown", "§cYou're still in cooldown!");
        BUILDER.pop();

        SPEC = BUILDER.build();
    }

}