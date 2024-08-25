package fox.mods.api.rtp.init;

import fox.mods.api.FoxApiMod;
import fox.mods.api.rtp.configuration.RtpFileConfiguration;
import fox.mods.api.tpa.configuration.TpaFileConfiguration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = FoxApiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RtpModConfigs {
    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        event.enqueueWork(() -> {
            ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, RtpFileConfiguration.SPEC, "RTP-config.toml");
        });
    }
}
