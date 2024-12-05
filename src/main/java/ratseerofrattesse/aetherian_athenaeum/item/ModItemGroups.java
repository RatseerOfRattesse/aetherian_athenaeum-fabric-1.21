package ratseerofrattesse.aetherian_athenaeum.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import ratseerofrattesse.aetherian_athenaeum.AetherianAthenaeum;

public class ModItemGroups {
    public static final ItemGroup AETHERIAN_ATHENAEUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AetherianAthenaeum.MOD_ID, "aetherian_athenaeum"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.aetherian_athenaeum.aetherian_athenaeum").formatted(Formatting.DARK_RED))
                    .icon(() -> new ItemStack(ModItems.PLACEHOLDER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLACEHOLDER);
                    }).build()
    );
    public static final ItemGroup AETHERIAN_MINERALS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AetherianAthenaeum.MOD_ID, "aetherian_minerals"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.aetherian_athenaeum.aetherian_minerals").formatted(Formatting.AQUA))
                    .icon(() -> new ItemStack(ModItems.VOIDCRYSTAL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TIN_NUGGET);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.ALUMINUM_INGOT);
                        entries.add(ModItems.ALUMINUM_NUGGET);
                        entries.add(ModItems.RAW_ALUMINUM);
                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModItems.ZINC_NUGGET);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.BISMUTH_INGOT);
                        entries.add(ModItems.BISMUTH_NUGGET);
                        entries.add(ModItems.RAW_BISMUTH);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_NUGGET);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PALLADIUM_INGOT);
                        entries.add(ModItems.PALLADIUM_NUGGET);
                        entries.add(ModItems.RAW_PALLADIUM);
                        entries.add(ModItems.COBALT_INGOT);
                        entries.add(ModItems.COBALT_NUGGET);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_NUGGET);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.IRIDIUM_INGOT);
                        entries.add(ModItems.IRIDIUM_NUGGET);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModItems.NICKEL_INGOT);
                        entries.add(ModItems.NICKEL_NUGGET);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.VENTIFACT_INGOT);
                        entries.add(ModItems.VENTIFACT_NUGGET);
                        entries.add(ModItems.RAW_VENTIFACT);
                        entries.add(ModItems.DARK_IRON_INGOT);
                        entries.add(ModItems.DARK_IRON_NUGGET);
                        entries.add(ModItems.COLD_IRON_INGOT);
                        entries.add(ModItems.COLD_IRON_NUGGET);
                        entries.add(ModItems.BRASS_INGOT);
                        entries.add(ModItems.BRASS_NUGGET);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_NUGGET);
                        entries.add(ModItems.PEWTER_INGOT);
                        entries.add(ModItems.PEWTER_NUGGET);
                        entries.add(ModItems.STERLING_SILVER_INGOT);
                        entries.add(ModItems.STERLING_SILVER_NUGGET);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.ELECTRUM_INGOT);
                        entries.add(ModItems.ELECTRUM_NUGGET);
                        entries.add(ModItems.MAGNEGOLD_INGOT);
                        entries.add(ModItems.MAGNEGOLD_NUGGET);
                        entries.add(ModItems.SPELLFORGED_STEEL_INGOT);
                        entries.add(ModItems.SPELLFORGED_STEEL_NUGGET);
                        entries.add(ModItems.VOID_IRON_INGOT);
                        entries.add(ModItems.VOID_IRON_NUGGET);
                        entries.add(ModItems.FLOWING_WATER_STEEL_INGOT);
                        entries.add(ModItems.FLOWING_WATER_STEEL_NUGGET);
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);
                        entries.add(ModItems.RED_BRASS_INGOT);
                        entries.add(ModItems.RED_BRASS_NUGGET);
                        entries.add(ModItems.BISMUTH_BRONZE_INGOT);
                        entries.add(ModItems.BISMUTH_BRONZE_NUGGET);
                        entries.add(ModItems.HEPATIZON_INGOT);
                        entries.add(ModItems.HEPATIZON_NUGGET);
                        entries.add(ModItems.BLACKSTEEL_INGOT);
                        entries.add(ModItems.BLACKSTEEL_NUGGET);
                        entries.add(ModItems.ENDERSTEEL_INGOT);
                        entries.add(ModItems.ENDERSTEEL_NUGGET);
                        entries.add(ModItems.AETHERIAN_STEEL_INGOT);
                        entries.add(ModItems.AETHERIAN_STEEL_NUGGET);
                        entries.add(ModItems.BLUESTEEL_INGOT);
                        entries.add(ModItems.BLUESTEEL_NUGGET);
                        entries.add(ModItems.REDSTEEL_INGOT);
                        entries.add(ModItems.REDSTEEL_NUGGET);
                        entries.add(ModItems.SPECTRESTEEL_INGOT);
                        entries.add(ModItems.SPECTRESTEEL_NUGGET);
                        entries.add(ModItems.MOONSILVER_INGOT);
                        entries.add(ModItems.MOONSILVER_NUGGET);
                        entries.add(ModItems.FEYSTEEL_INGOT);
                        entries.add(ModItems.FEYSTEEL_NUGGET);
                        entries.add(ModItems.BLACK_FELSTEEL_INGOT);
                        entries.add(ModItems.BLACK_FELSTEEL_NUGGET);
                        entries.add(ModItems.FELSTEEL_INGOT);
                        entries.add(ModItems.FELSTEEL_NUGGET);
                        entries.add(ModItems.ADAMANT_INGOT);
                        entries.add(ModItems.ADAMANT_NUGGET);
                        entries.add(ModItems.RAW_ADAMANT);
                        entries.add(ModItems.CRIMSONITE_INGOT);
                        entries.add(ModItems.CRIMSONITE_NUGGET);
                        entries.add(ModItems.RAW_CRIMSONITE);
                        entries.add(ModItems.FIRE_ELEMENTIUM_INGOT);
                        entries.add(ModItems.FIRE_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.WATER_ELEMENTIUM_INGOT);
                        entries.add(ModItems.WATER_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.AIR_ELEMENTIUM_INGOT);
                        entries.add(ModItems.AIR_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.EARTH_ELEMENTIUM_INGOT);
                        entries.add(ModItems.EARTH_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.LIGHT_ELEMENTIUM_INGOT);
                        entries.add(ModItems.LIGHT_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.SHADOW_ELEMENTIUM_INGOT);
                        entries.add(ModItems.SHADOW_ELEMENTIUM_NUGGET);
                        entries.add(ModItems.ELEMENTIUM_INGOT);
                        entries.add(ModItems.ELEMENTIUM_NUGGET);
                        entries.add(ModItems.RAW_ELEMENTIUM);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.MYTHRIL_NUGGET);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModItems.ORICAL);
                        entries.add(ModItems.VOIDCRYSTAL);
                        entries.add(ModItems.AETHERIAN_GOLD_INGOT);
                        entries.add(ModItems.AETHERIAN_GOLD_NUGGET);
                        entries.add(ModItems.UNDERGOLD_INGOT);
                        entries.add(ModItems.UNDERGOLD_NUGGET);
                        entries.add(ModItems.RAW_UNDERGOLD);
                        entries.add(ModItems.NOOBS_GOLD_INGOT);
                        entries.add(ModItems.NOOBS_GOLD_NUGGET);
                        entries.add(ModItems.RAW_NOOBS_GOLD);
                        entries.add(ModItems.OMNIGOLD_INGOT);
                        entries.add(ModItems.OMNIGOLD_NUGGET);
                        entries.add(ModItems.RAW_OMNIGOLD);
                        entries.add(ModItems.FROST_OPAL);
                        entries.add(ModItems.AZMARINTHE);
                        entries.add(ModItems.AETHERGLASS);
                        entries.add(ModItems.DAWNCRYSTAL);
                        entries.add(ModItems.INLAID_TOPAZ);
                        entries.add(ModItems.AZARITE);
                        entries.add(ModItems.LUNAR_CRYSTAL);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.ONYX);
                        entries.add(ModItems.VOID_TESSERACT);
                        entries.add(ModItems.AETHER_TOPAZ);
                        entries.add(ModItems.ETHEREAL_TOPAZ);
                        entries.add(ModItems.FIRE_LATTICE);
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.DARK_JADE);
                        entries.add(ModItems.MALACHITE);
                    }).build()
    );

    public static void registerModItemGroups() {
        AetherianAthenaeum.LOGGER.info("[AetherianAthenaeum]: Updating... Initializing Item Groups");
    }
}
