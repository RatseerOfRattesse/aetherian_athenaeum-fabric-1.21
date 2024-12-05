package ratseerofrattesse.aetherian_athenaeum;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import ratseerofrattesse.aetherian_athenaeum.datagen.ModEnglishCALanguageProvider;
import ratseerofrattesse.aetherian_athenaeum.datagen.ModEnglishUSLanguageProvider;
import ratseerofrattesse.aetherian_athenaeum.datagen.ModModelProvider;

public class AetherianAthenaeumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModEnglishCALanguageProvider::new);
		pack.addProvider(ModEnglishUSLanguageProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
