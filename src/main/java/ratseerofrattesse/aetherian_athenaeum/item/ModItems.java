package ratseerofrattesse.aetherian_athenaeum.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ratseerofrattesse.aetherian_athenaeum.AetherianAthenaeum;
import ratseerofrattesse.aetherian_athenaeum.util.ModRarity;

public class ModItems{

    //Util
        //Placeholder Item
        public static final Item PLACEHOLDER = registerItem("placeholder", new Item(new Item.Settings().rarity(ModRarity.DIVINE)));
    //Minerals
        //Base Metals
            //Lead
            public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
            public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Settings()));
            public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
            //Silver
            public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
            public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()));
            public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
            //Tin
            public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
            public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new Item.Settings()));
            public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
            //Aluminum
            public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new Item.Settings()));
            public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new Item.Settings()));
            public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new Item.Settings()));
            //Zinc
            public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));
            public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new Item.Settings()));
            public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new Item.Settings()));
            //Bismuth
            public static final Item BISMUTH_INGOT = registerItem("bismuth_ingot", new Item(new Item.Settings()));
            public static final Item BISMUTH_NUGGET = registerItem("bismuth_nugget", new Item(new Item.Settings()));
            public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item(new Item.Settings()));
            //Platinum
            public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));
            public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new Item.Settings()));
            public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()));
            //Palladium
            public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot", new Item(new Item.Settings()));
            public static final Item PALLADIUM_NUGGET = registerItem("palladium_nugget", new Item(new Item.Settings()));
            public static final Item RAW_PALLADIUM = registerItem("raw_palladium", new Item(new Item.Settings()));
            //Cobalt
            public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new Item.Settings()));
            public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item(new Item.Settings()));
            public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new Item.Settings()));
            //Titanium
            public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
            public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new Item.Settings()));
            public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));
            //Tungsten
            public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));
            public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new Item.Settings()));
            public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));
            //Iridium
            public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item(new Item.Settings()));
            public static final Item IRIDIUM_NUGGET = registerItem("iridium_nugget", new Item(new Item.Settings()));
            public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item(new Item.Settings()));
            //Nickel
            public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
            public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new Item.Settings()));
            public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new Item.Settings()));



        //Tier II Metals
            //Ventifact
            public static final Item VENTIFACT_INGOT = registerItem("ventifact_ingot", new Item(new Item.Settings()));
            public static final Item VENTIFACT_NUGGET = registerItem("ventifact_nugget", new Item(new Item.Settings()));
            public static final Item RAW_VENTIFACT = registerItem("raw_ventifact", new Item(new Item.Settings()));
            //Dark_Iron
            public static final Item DARK_IRON_INGOT = registerItem("dark_iron_ingot", new Item(new Item.Settings()));
            public static final Item DARK_IRON_NUGGET = registerItem("dark_iron_nugget", new Item(new Item.Settings()));
            //Cold Iron
            public static final Item COLD_IRON_INGOT = registerItem("cold_iron_ingot", new Item(new Item.Settings()));
            public static final Item COLD_IRON_NUGGET = registerItem("cold_iron_nugget", new Item(new Item.Settings()));
            //Brass
            public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
            public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new Item.Settings()));
            //Bronze
            public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
            public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new Item.Settings()));
            //Pewter
            public static final Item PEWTER_INGOT = registerItem("pewter_ingot", new Item(new Item.Settings()));
            public static final Item PEWTER_NUGGET = registerItem("pewter_nugget", new Item(new Item.Settings()));
            //Sterling Silver
            public static final Item STERLING_SILVER_INGOT = registerItem("sterling_silver_ingot", new Item(new Item.Settings()));
            public static final Item STERLING_SILVER_NUGGET = registerItem("sterling_silver_nugget", new Item(new Item.Settings()));
            //Steel
            public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
            public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
            //Electrum
            public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new Item.Settings()));
            public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget", new Item(new Item.Settings()));
            //Magnegold
            public static final Item MAGNEGOLD_INGOT = registerItem("magnegold_ingot", new Item(new Item.Settings()));
            public static final Item MAGNEGOLD_NUGGET = registerItem("magnegold_nugget", new Item(new Item.Settings()));
            //Spellforged Steel
            public static final Item SPELLFORGED_STEEL_INGOT = registerItem("spellforged_steel_ingot", new Item(new Item.Settings()));
            public static final Item SPELLFORGED_STEEL_NUGGET = registerItem("spellforged_steel_nugget", new Item(new Item.Settings()));


        //Tier III Metals
            //Void Iron
            public static final Item VOID_IRON_INGOT = registerItem("void_iron_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item VOID_IRON_NUGGET = registerItem("void_iron_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Flowing Water Steel
            public static final Item FLOWING_WATER_STEEL_INGOT = registerItem("flowing_water_steel_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item FLOWING_WATER_STEEL_NUGGET = registerItem("flowing_water_steel_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Rose Gold
            public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Red Brass
            public static final Item RED_BRASS_INGOT = registerItem("red_brass_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item RED_BRASS_NUGGET = registerItem("red_brass_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Bismuth Bronze
            public static final Item BISMUTH_BRONZE_INGOT = registerItem("bismuth_bronze_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item BISMUTH_BRONZE_NUGGET = registerItem("bismuth_bronze_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Hepatizon
            public static final Item HEPATIZON_INGOT = registerItem("hepatizon_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item HEPATIZON_NUGGET = registerItem("hepatizon_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Blacksteel
            public static final Item BLACKSTEEL_INGOT = registerItem("blacksteel_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item BLACKSTEEL_NUGGET = registerItem("blacksteel_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));



        //Tier IV Metals
            //Endersteel
            public static final Item ENDERSTEEL_INGOT = registerItem("endersteel_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item ENDERSTEEL_NUGGET = registerItem("endersteel_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Aetherian Steel
            public static final Item AETHERIAN_STEEL_INGOT = registerItem("aetherian_steel_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item AETHERIAN_STEEL_NUGGET = registerItem("aetherian_steel_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Bluesteel
            public static final Item BLUESTEEL_INGOT = registerItem("bluesteel_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item BLUESTEEL_NUGGET = registerItem("bluesteel_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Redsteel
            public static final Item REDSTEEL_INGOT = registerItem("redsteel_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item REDSTEEL_NUGGET = registerItem("redsteel_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));



        //Tier V Metals
            //Spectresteel
            public static final Item SPECTRESTEEL_INGOT = registerItem("spectresteel_ingot", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            public static final Item SPECTRESTEEL_NUGGET = registerItem("spectresteel_nugget", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Moonsilver
            public static final Item MOONSILVER_INGOT = registerItem("moonsilver_ingot", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            public static final Item MOONSILVER_NUGGET = registerItem("moonsilver_nugget", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Feysteel
            public static final Item FEYSTEEL_INGOT = registerItem("feysteel_ingot", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            public static final Item FEYSTEEL_NUGGET = registerItem("feysteel_nugget", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Black Felsteel
            public static final Item BLACK_FELSTEEL_INGOT = registerItem("black_felsteel_ingot", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            public static final Item BLACK_FELSTEEL_NUGGET = registerItem("black_felsteel_nugget", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Felsteel
            public static final Item FELSTEEL_INGOT = registerItem("felsteel_ingot", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            public static final Item FELSTEEL_NUGGET = registerItem("felsteel_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));





        //Legendary Materials
            //Adamant
            public static final Item ADAMANT_INGOT = registerItem("adamant_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item ADAMANT_NUGGET = registerItem("adamant_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item RAW_ADAMANT = registerItem("raw_adamant", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            //Crimsonite
            public static final Item CRIMSONITE_INGOT = registerItem("crimsonite_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item CRIMSONITE_NUGGET = registerItem("crimsonite_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item RAW_CRIMSONITE = registerItem("raw_crimsonite", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            //Elementium
                //Fire
                public static final Item FIRE_ELEMENTIUM_INGOT = registerItem("fire_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item FIRE_ELEMENTIUM_NUGGET = registerItem("fire_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Water
                public static final Item WATER_ELEMENTIUM_INGOT = registerItem("water_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item WATER_ELEMENTIUM_NUGGET = registerItem("water_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Air
                public static final Item AIR_ELEMENTIUM_INGOT = registerItem("air_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item AIR_ELEMENTIUM_NUGGET = registerItem("air_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Earth
                public static final Item EARTH_ELEMENTIUM_INGOT = registerItem("earth_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item EARTH_ELEMENTIUM_NUGGET = registerItem("earth_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Light
                public static final Item LIGHT_ELEMENTIUM_INGOT = registerItem("light_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item LIGHT_ELEMENTIUM_NUGGET = registerItem("light_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Shadow
                public static final Item SHADOW_ELEMENTIUM_INGOT = registerItem("shadow_elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item SHADOW_ELEMENTIUM_NUGGET = registerItem("shadow_elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                //Elementium
                public static final Item ELEMENTIUM_INGOT = registerItem("elementium_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item ELEMENTIUM_NUGGET = registerItem("elementium_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
                public static final Item RAW_ELEMENTIUM = registerItem("raw_elementium", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            //Mythril
            public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            //Orical
            public static final Item ORICAL = registerItem("orical", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));
            //Voidcrystal
            public static final Item VOIDCRYSTAL = registerItem("voidcrystal", new Item(new Item.Settings().rarity(ModRarity.LEGENDARY)));



        //Other Metals
            //Aetherian Gold
            public static final Item AETHERIAN_GOLD_INGOT = registerItem("aetherian_gold_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item AETHERIAN_GOLD_NUGGET = registerItem("aetherian_gold_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Undergold
            public static final Item UNDERGOLD_INGOT = registerItem("undergold_ingot", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item UNDERGOLD_NUGGET = registerItem("undergold_nugget", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            public static final Item RAW_UNDERGOLD = registerItem("raw_undergold", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Noob's Gold
            public static final Item NOOBS_GOLD_INGOT= registerItem("noobs_gold_ingot", new Item(new Item.Settings()));
            public static final Item NOOBS_GOLD_NUGGET = registerItem("noobs_gold_nugget", new Item(new Item.Settings()));
            public static final Item RAW_NOOBS_GOLD = registerItem("raw_noobs_gold", new Item(new Item.Settings()));
            //Omnigold
            public static final Item OMNIGOLD_INGOT= registerItem("omnigold_ingot", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item OMNIGOLD_NUGGET = registerItem("omnigold_nugget", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            public static final Item RAW_OMNIGOLD = registerItem("raw_omnigold", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));



        //Gemstones
            //Frost Opal
            public static final Item FROST_OPAL = registerItem("frost_opal", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Azmarinthe
            public static final Item AZMARINTHE = registerItem("azmarinthe", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Aetherglass
            public static final Item AETHERGLASS = registerItem("aetherglass", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Dawncrystal
            public static final Item DAWNCRYSTAL = registerItem("dawncrystal", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Inlaid Topaz
            public static final Item INLAID_TOPAZ = registerItem("inlaid_topaz", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Azarite
            public static final Item AZARITE = registerItem("azarite", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Lunar Crystal
            public static final Item LUNAR_CRYSTAL = registerItem("lunar_crystal", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Ruby
            public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Sapphire
            public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Onyx
            public static final Item ONYX = registerItem("onyx", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Void Tesseract
            public static final Item VOID_TESSERACT = registerItem("void_tesseract", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Aether Topaz
            public static final Item AETHER_TOPAZ = registerItem("aether_topaz", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Ethereal Topaz
            public static final Item ETHEREAL_TOPAZ = registerItem("ethereal_topaz", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Fire Lattice
            public static final Item FIRE_LATTICE = registerItem("fire_lattice", new Item(new Item.Settings().rarity(ModRarity.EPIC)));
            //Jade
            public static final Item JADE = registerItem("jade", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));
            //Dark Jade
            public static final Item DARK_JADE = registerItem("dark_jade", new Item(new Item.Settings().rarity(ModRarity.RARE)));
            //Malachite
            public static final Item MALACHITE = registerItem("malachite", new Item(new Item.Settings().rarity(ModRarity.UNCOMMON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AetherianAthenaeum.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AetherianAthenaeum.LOGGER.info("[AetherianAthenaeum]: Updating... Initializing Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.LEAD_INGOT);
        });
    }

}
