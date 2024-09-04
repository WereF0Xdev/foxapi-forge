package fox.mods.api.economy.init;

import fox.mods.api.FoxApiMod;
import fox.mods.api.economy.configuration.EconomySettingsFileConfiguration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

@Mod.EventBusSubscriber(modid = FoxApiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EconomyModConfigs {
    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        event.enqueueWork(() -> {
            ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, EconomySettingsFileConfiguration.SPEC, "Economy-config.toml");
        });
    }
}
