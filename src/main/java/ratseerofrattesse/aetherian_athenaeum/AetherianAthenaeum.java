package ratseerofrattesse.aetherian_athenaeum;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratseerofrattesse.aetherian_athenaeum.item.ModItemGroups;
import ratseerofrattesse.aetherian_athenaeum.item.ModItems;

public class AetherianAthenaeum implements ModInitializer {
	public static final String MOD_ID = "aetherian_athenaeum";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("[AetherianAthenaeum]: Receiving update from main branch 'Entity303/Aetheria' - initializing " + AetherianAthenaeum.MOD_ID + "...");
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		if (FabricLoader.getInstance().isModLoaded("durtleminer")) {
			LOGGER.info("[AetherianAthenaeum]: AHHHHH THERE'S DURTLES");
		}
	}
}