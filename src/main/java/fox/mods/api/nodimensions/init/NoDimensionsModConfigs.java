package fox.mods.api.nodimensions.init;

import fox.mods.api.FoxApiMod;
import fox.mods.api.nodimensions.configuration.NoDimensionsFileConfiguration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = FoxApiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NoDimensionsModConfigs {
    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        if (ModList.get().isLoaded("nodimensions")) {
            event.enqueueWork(() -> {
                ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, NoDimensionsFileConfiguration.SPEC, "NoDimensions-config.toml");
            });
        }
    }
}
