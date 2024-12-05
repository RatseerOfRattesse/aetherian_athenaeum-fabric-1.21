package ratseerofrattesse.aetherian_athenaeum.mixin;

import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ratseerofrattesse.aetherian_athenaeum.util.ModRarity;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(Rarity.class)
public class RarityMixin {

    //Code from https://github.com/Gauraaaaaaaa/RankingOfThings
    //Thank you Gauraaaaaaaa!

    @SuppressWarnings("InvokerTarget")
    @Invoker("<init>")
    private static Rarity newRarity(String internalName, int internalId, int id, String name, Formatting formatting) {

        throw new AssertionError();
    }

    @SuppressWarnings("ShadowTarget")
    @Shadow
    @Final
    @Mutable
    private static Rarity[] field_8905;

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "<clinit>", at = @At(value = "FIELD", opcode = Opcodes.PUTSTATIC, target = "Lnet/minecraft/util/Rarity;field_8905:[Lnet/minecraft/util/Rarity;", shift = At.Shift.AFTER))
    private static void addCustomRarity(CallbackInfo ci) {

        var rarities = new ArrayList<>(Arrays.asList(field_8905));
        var last = rarities.getLast();

        ModRarity.COMMON = newRarity("COMMON", last.ordinal() + 1, last.ordinal() + 1, "common",Formatting.WHITE);
        ModRarity.UNCOMMON = newRarity("UNCOMMON", last.ordinal() + 2, last.ordinal() + 2, "uncommon",Formatting.GREEN);
        ModRarity.RARE = newRarity("RARE", last.ordinal() + 3, last.ordinal() + 3, "rare",Formatting.AQUA);
        ModRarity.EPIC = newRarity("EPIC", last.ordinal() + 4, last.ordinal() + 4, "epic",Formatting.LIGHT_PURPLE);
        ModRarity.LEGENDARY = newRarity("LEGENDARY", last.ordinal() + 5, last.ordinal() + 5, "legendary",Formatting.YELLOW);
        ModRarity.MYTHIC = newRarity("MYTHIC", last.ordinal() + 6, last.ordinal() + 6, "mythic",Formatting.GOLD);
        ModRarity.DIVINE = newRarity("DIVINE", last.ordinal() + 7, last.ordinal() + 7, "divine",Formatting.DARK_RED);


        rarities.add(ModRarity.COMMON);
        rarities.add(ModRarity.UNCOMMON);
        rarities.add(ModRarity.RARE);
        rarities.add(ModRarity.EPIC);
        rarities.add(ModRarity.LEGENDARY);
        rarities.add(ModRarity.MYTHIC);
        rarities.add(ModRarity.DIVINE);


        field_8905 = rarities.toArray(new Rarity[0]);
    }
    
}
