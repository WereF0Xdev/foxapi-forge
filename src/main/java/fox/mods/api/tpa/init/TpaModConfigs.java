package fox.mods.api.tpa.init;

import fox.mods.api.FoxApiMod;
import fox.mods.api.tpa.configuration.TpaFileConfiguration;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = FoxApiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TpaModConfigs {
    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        if (ModList.get().isLoaded("tpa")) {
            event.enqueueWork(() -> {
                ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, TpaFileConfiguration.SPEC, "TPA-config.toml");
            });
        }
    }
}
