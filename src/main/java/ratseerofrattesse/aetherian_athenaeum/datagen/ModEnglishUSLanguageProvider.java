package ratseerofrattesse.aetherian_athenaeum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import ratseerofrattesse.aetherian_athenaeum.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishUSLanguageProvider extends FabricLanguageProvider {
    public ModEnglishUSLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.PLACEHOLDER, "Placeholder");

        translationBuilder.add(ModItems.LEAD_INGOT, "Lead Ingot");
        translationBuilder.add(ModItems.LEAD_NUGGET, "Lead Nugget");
        translationBuilder.add(ModItems.RAW_LEAD, "Raw Lead");
        translationBuilder.add(ModItems.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(ModItems.SILVER_NUGGET, "Silver Nugget");
        translationBuilder.add(ModItems.RAW_SILVER, "Raw Silver");
        translationBuilder.add(ModItems.TIN_INGOT, "Tin Ingot");
        translationBuilder.add(ModItems.TIN_NUGGET, "Tin Nugget");
        translationBuilder.add(ModItems.RAW_TIN, "Raw Tin");
        translationBuilder.add(ModItems.ALUMINUM_INGOT, "Aluminum Ingot");
        translationBuilder.add(ModItems.ALUMINUM_NUGGET, "Aluminum Nugget");
        translationBuilder.add(ModItems.RAW_ALUMINUM, "Raw Aluminum");
        translationBuilder.add(ModItems.ZINC_INGOT, "Zinc Ingot");
        translationBuilder.add(ModItems.ZINC_NUGGET, "Zinc Nugget");
        translationBuilder.add(ModItems.RAW_ZINC, "Raw Zinc");
        translationBuilder.add(ModItems.BISMUTH_INGOT, "Bismuth Ingot");
        translationBuilder.add(ModItems.BISMUTH_NUGGET, "Bismuth Nugget");
        translationBuilder.add(ModItems.RAW_BISMUTH, "Raw Bismuth");
        translationBuilder.add(ModItems.PLATINUM_INGOT, "Platinum Ingot");
        translationBuilder.add(ModItems.PLATINUM_NUGGET, "Platinum Nugget");
        translationBuilder.add(ModItems.RAW_PLATINUM, "Raw Platinum");
        translationBuilder.add(ModItems.PALLADIUM_INGOT, "Palladium Ingot");
        translationBuilder.add(ModItems.PALLADIUM_NUGGET, "Palladium Nugget");
        translationBuilder.add(ModItems.RAW_PALLADIUM, "Raw Palladium");
        translationBuilder.add(ModItems.COBALT_INGOT, "Cobalt Ingot");
        translationBuilder.add(ModItems.COBALT_NUGGET, "Cobalt Nugget");
        translationBuilder.add(ModItems.RAW_COBALT, "Raw Cobalt");
        translationBuilder.add(ModItems.TITANIUM_INGOT, "Titanium Ingot");
        translationBuilder.add(ModItems.TITANIUM_NUGGET, "Titanium Nugget");
        translationBuilder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        translationBuilder.add(ModItems.TUNGSTEN_INGOT, "Tungsten Ingot");
        translationBuilder.add(ModItems.TUNGSTEN_NUGGET, "Tungsten Nugget");
        translationBuilder.add(ModItems.RAW_TUNGSTEN, "Raw Tungsten");
        translationBuilder.add(ModItems.IRIDIUM_INGOT, "Iridium Ingot");
        translationBuilder.add(ModItems.IRIDIUM_NUGGET, "Iridium Nugget");
        translationBuilder.add(ModItems.RAW_IRIDIUM, "Raw Iridium");
        translationBuilder.add(ModItems.NICKEL_INGOT, "Nickel Ingot");
        translationBuilder.add(ModItems.NICKEL_NUGGET, "Nickel Nugget");
        translationBuilder.add(ModItems.RAW_NICKEL, "Raw Nickel");
        translationBuilder.add(ModItems.VENTIFACT_INGOT, "Ventifact Ingot");
        translationBuilder.add(ModItems.VENTIFACT_NUGGET, "Ventifact Nugget");
        translationBuilder.add(ModItems.RAW_VENTIFACT, "Raw Ventifact");
        translationBuilder.add(ModItems.DARK_IRON_INGOT, "Dark Iron Ingot");
        translationBuilder.add(ModItems.DARK_IRON_NUGGET, "Dark Iron Nugget");
        translationBuilder.add(ModItems.COLD_IRON_INGOT, "Cold Iron Ingot");
        translationBuilder.add(ModItems.COLD_IRON_NUGGET, "Cold Iron Nugget");
        translationBuilder.add(ModItems.BRASS_INGOT, "Brass Ingot");
        translationBuilder.add(ModItems.BRASS_NUGGET, "Brass Nugget");
        translationBuilder.add(ModItems.BRONZE_INGOT, "Bronze Ingot");
        translationBuilder.add(ModItems.BRONZE_NUGGET, "Bronze Nugget");
        translationBuilder.add(ModItems.PEWTER_INGOT, "Pewter Ingot");
        translationBuilder.add(ModItems.PEWTER_NUGGET, "Pewter Nugget");
        translationBuilder.add(ModItems.STERLING_SILVER_INGOT, "Sterling Silver Ingot");
        translationBuilder.add(ModItems.STERLING_SILVER_NUGGET, "Sterling Silver Ingot");
        translationBuilder.add(ModItems.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(ModItems.STEEL_NUGGET, "Steel Nugget");
        translationBuilder.add(ModItems.ELECTRUM_INGOT, "Electrum Ingot");
        translationBuilder.add(ModItems.ELECTRUM_NUGGET, "Electrum Nugget");
        translationBuilder.add(ModItems.MAGNEGOLD_INGOT, "Magnegold Ingot");
        translationBuilder.add(ModItems.MAGNEGOLD_NUGGET, "Magnegold_Nugget");
        translationBuilder.add(ModItems.SPELLFORGED_STEEL_INGOT, "Spellforged Steel Ingot");
        translationBuilder.add(ModItems.SPELLFORGED_STEEL_NUGGET, "Spellforged Steel Nugget");
        translationBuilder.add(ModItems.VOID_IRON_INGOT, "Void Iron Ingot");
        translationBuilder.add(ModItems.VOID_IRON_NUGGET, "Void Iron Nugget");
        translationBuilder.add(ModItems.FLOWING_WATER_STEEL_INGOT, "Flowing Water Steel Ingot");
        translationBuilder.add(ModItems.FLOWING_WATER_STEEL_NUGGET, "Flowing Water Steel Nugget");
        translationBuilder.add(ModItems.ROSE_GOLD_INGOT, "Rose Gold Ingot");
        translationBuilder.add(ModItems.ROSE_GOLD_NUGGET, "Rose Gold Nugget");
        translationBuilder.add(ModItems.RED_BRASS_INGOT, "Red Brass Ingot");
        translationBuilder.add(ModItems.RED_BRASS_NUGGET, "Red Brass Nugget");
        translationBuilder.add(ModItems.BISMUTH_BRONZE_INGOT, "Bismuth Bronze Ingot");
        translationBuilder.add(ModItems.BISMUTH_BRONZE_NUGGET, "Bismuth Bronze Nugget");
        translationBuilder.add(ModItems.HEPATIZON_INGOT, "Hepatizon Ingot");
        translationBuilder.add(ModItems.HEPATIZON_NUGGET, "Hepatizon Nugget");
        translationBuilder.add(ModItems.BLACKSTEEL_INGOT, "Blacksteel_Ingot");
        translationBuilder.add(ModItems.BLACKSTEEL_NUGGET, "Blacksteel_Nugget");
        translationBuilder.add(ModItems.ENDERSTEEL_INGOT, "Endersteel Ingot");
        translationBuilder.add(ModItems.ENDERSTEEL_NUGGET, "Endersteel_Nugget");
        translationBuilder.add(ModItems.AETHERIAN_STEEL_INGOT, "Aetherian Steel Ingot");
        translationBuilder.add(ModItems.AETHERIAN_STEEL_NUGGET, "Aetherian Steel Nugget");
        translationBuilder.add(ModItems.BLUESTEEL_INGOT, "Bluesteel Ingot");
        translationBuilder.add(ModItems.BLUESTEEL_NUGGET, "Bluesteel Nugget");
        translationBuilder.add(ModItems.REDSTEEL_INGOT, "Redsteel Ingot");
        translationBuilder.add(ModItems.REDSTEEL_NUGGET, "Redsteel Nugget");
        translationBuilder.add(ModItems.SPECTRESTEEL_INGOT, "Spectresteel Ingot");
        translationBuilder.add(ModItems.SPECTRESTEEL_NUGGET, "Spectresteel Ingot");
        translationBuilder.add(ModItems.MOONSILVER_INGOT, "Moonsilver Ingot");
        translationBuilder.add(ModItems.MOONSILVER_NUGGET, "Moonsilver Nugget");
        translationBuilder.add(ModItems.FEYSTEEL_INGOT, "Feysteel Ingot");
        translationBuilder.add(ModItems.FEYSTEEL_NUGGET, "Feysteel Nugget");
        translationBuilder.add(ModItems.BLACK_FELSTEEL_INGOT, "Black Felsteel Ingot");
        translationBuilder.add(ModItems.BLACK_FELSTEEL_NUGGET, "Black Felsteel Nugget");
        translationBuilder.add(ModItems.FELSTEEL_INGOT, "Felsteel Ingot");
        translationBuilder.add(ModItems.FELSTEEL_NUGGET, "Felsteel Nugget");
        translationBuilder.add(ModItems.ADAMANT_INGOT, "Adamant Ingot");
        translationBuilder.add(ModItems.ADAMANT_NUGGET, "Adamant Nugget");
        translationBuilder.add(ModItems.RAW_ADAMANT, "Raw Adamant");
        translationBuilder.add(ModItems.CRIMSONITE_INGOT, "Crimsonite Ingot");
        translationBuilder.add(ModItems.CRIMSONITE_NUGGET, "Crimsonite Nugget");
        translationBuilder.add(ModItems.RAW_CRIMSONITE, "Raw Crimsonite");
        translationBuilder.add(ModItems.FIRE_ELEMENTIUM_INGOT, "Fire Elementium Ingot");
        translationBuilder.add(ModItems.FIRE_ELEMENTIUM_NUGGET, "Fire Elementium Nugget");
        translationBuilder.add(ModItems.WATER_ELEMENTIUM_INGOT, "Water Elementium Ingot");
        translationBuilder.add(ModItems.WATER_ELEMENTIUM_NUGGET, "Water Elementium Nugget");
        translationBuilder.add(ModItems.LIGHT_ELEMENTIUM_INGOT, "Air Elementium Ingot");
        translationBuilder.add(ModItems.LIGHT_ELEMENTIUM_NUGGET, "Air Elementium Nugget");
        translationBuilder.add(ModItems.SHADOW_ELEMENTIUM_INGOT, "Shadow Elementium Ingot");
        translationBuilder.add(ModItems.SHADOW_ELEMENTIUM_NUGGET, "Shadow Elementium Nugget");
        translationBuilder.add(ModItems.ELEMENTIUM_INGOT, "Elementium Ingot");
        translationBuilder.add(ModItems.ELEMENTIUM_NUGGET, "Elementium Nugget");
        translationBuilder.add(ModItems.RAW_ELEMENTIUM, "Raw Elementium");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(ModItems.MYTHRIL_NUGGET, "Mythril Nugget");
        translationBuilder.add(ModItems.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(ModItems.ORICAL, "Orical");
        translationBuilder.add(ModItems.VOIDCRYSTAL, "Voidcrystal");
        translationBuilder.add(ModItems.AETHERIAN_GOLD_INGOT, "Aetherian Gold Ingot");
        translationBuilder.add(ModItems.AETHERIAN_GOLD_NUGGET, "Aetherian Gold Nugget");
        translationBuilder.add(ModItems.UNDERGOLD_INGOT, "Undergold Ingot");
        translationBuilder.add(ModItems.UNDERGOLD_NUGGET, "Undergold Nugget");
        translationBuilder.add(ModItems.RAW_UNDERGOLD, "Raw Undergold");
        translationBuilder.add(ModItems.NOOBS_GOLD_INGOT, "Noob's Gold Ingot");
        translationBuilder.add(ModItems.NOOBS_GOLD_NUGGET, "Noob's Gold Nugget");
        translationBuilder.add(ModItems.RAW_NOOBS_GOLD, "Raw Noob's Gold");
        translationBuilder.add(ModItems.OMNIGOLD_INGOT, "Omnigold Ingot");
        translationBuilder.add(ModItems.OMNIGOLD_NUGGET, "Omnigold Nugget");
        translationBuilder.add(ModItems.RAW_OMNIGOLD, "Raw Omnigold");
        translationBuilder.add(ModItems.FROST_OPAL, "Frost Opal");
        translationBuilder.add(ModItems.AZMARINTHE, "Azmarinthe");
        translationBuilder.add(ModItems.AETHERGLASS, "Aetherglass");
        translationBuilder.add(ModItems.DAWNCRYSTAL, "Dawncrystal");
        translationBuilder.add(ModItems.INLAID_TOPAZ, "Inlaid Topaz");
        translationBuilder.add(ModItems.AZARITE, "Azarite");
        translationBuilder.add(ModItems.LUNAR_CRYSTAL, "Lunar Crystal");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(ModItems.ONYX, "Onyx");
        translationBuilder.add(ModItems.VOID_TESSERACT, "Void Tesseract");
        translationBuilder.add(ModItems.AETHER_TOPAZ, "Aether Topaz");
        translationBuilder.add(ModItems.ETHEREAL_TOPAZ, "Ethereal Topaz");
        translationBuilder.add(ModItems.FIRE_LATTICE, "Fire Lattice");
        translationBuilder.add(ModItems.JADE, "Jade");
        translationBuilder.add(ModItems.DARK_JADE, "Dark Jade");
        translationBuilder.add(ModItems.MALACHITE, "Malachite");



        translationBuilder.add("itemgroup.aetherian_athenaeum.aetherian_athenaeum", "Aetherian Athenaeum");
        translationBuilder.add("itemgroup.aetherian_athenaeum.aetherian_minerals", "Aetherian Minerals");



        translationBuilder.add("rarity.aetherian_athenaeum.common.name", "Common");
        translationBuilder.add("rarity.aetherian_athenaeum.uncommon.name", "Uncommon");
        translationBuilder.add("rarity.aetherian_athenaeum.rare.name", "Rare");
        translationBuilder.add("rarity.aetherian_athenaeum.epic.name", "Epic");
        translationBuilder.add("rarity.aetherian_athenaeum.legendary.name", "Legendary");
        translationBuilder.add("rarity.aetherian_athenaeum.mythic.name", "Mythic");
        translationBuilder.add("rarity.aetherian_athenaeum.divine.name", "Divine");
    }
}
