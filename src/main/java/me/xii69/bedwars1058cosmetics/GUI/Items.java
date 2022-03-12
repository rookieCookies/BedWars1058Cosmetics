package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.ItemBuilder;
import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class Items {

    // Cosmetics main menu items
    public static ItemStack menuItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("on-join-items.item"),
            Utils.getInt("on-join-items.durability"),
            Utils.getColorizedConfig("on-join-items.name"),
            "on-join-items.lore", Utils.getBoolean("on-join-items.enchanted")
    );
    public static ItemStack closeItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.close.item"),
            Utils.getInt("CosmeticsMenu.items.close.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.close.name"),
            "CosmeticsMenu.items.close.lore", true
    );
    public static ItemStack backItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.back.item"),
            Utils.getInt("CosmeticsMenu.items.back.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.back.name"),
            "CosmeticsMenu.items.back.lore", true
    );
    public static ItemStack glassItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.glass.item"),
            Utils.getInt("CosmeticsMenu.items.glass.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.glass.name"),
            "CosmeticsMenu.items.glass.lore", false
    );

    // Cosmetics DeathCries menu items
    public static ItemStack deathCriesItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.deathCries.item"),
            Utils.getInt("CosmeticsMenu.items.deathCries.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.deathCries.name"),
            "CosmeticsMenu.items.deathCries.lore", false
    );
    public static ItemStack batCryItem = ItemBuilder.createEggItem(
            Utils.getColorizedConfig("DeathCriesMenu.cosmetics.BatCry.name"),
            EntityType.BAT, "DeathCriesMenu.cosmetics.BatCry.lore", false
    );

    // Cosmetics KillEffects menu items
    public static ItemStack killEffectsItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.killEffects.item"),
            Utils.getInt("CosmeticsMenu.items.killEffects.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.killEffects.name"),
            "CosmeticsMenu.items.killEffects.lore", false
    );
    public static ItemStack bloodKillEffectItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("KillEffectsMenu.cosmetics.BloodKillEffect.item"),
            Utils.getInt("KillEffectsMenu.cosmetics.BloodKillEffect.durability"),
            Utils.getColorizedConfig("KillEffectsMenu.cosmetics.BloodKillEffect.name"),
            "KillEffectsMenu.cosmetics.BloodKillEffect.lore", false
    );

    // Cosmetics BedBreakEffects menu items
    public static ItemStack bedBreakEffectsItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("CosmeticsMenu.items.bedBreakEffects.item"),
            Utils.getInt("CosmeticsMenu.items.bedBreakEffects.durability"),
            Utils.getColorizedConfig("CosmeticsMenu.items.bedBreakEffects.name"),
            "CosmeticsMenu.items.bedBreakEffects.lore", false
    );
    public static ItemStack TNTBedEffectsItem = ItemBuilder.createItem(
            Utils.getColorizedConfig("BedBreakEffectsMenu.cosmetics.TNTEffect.item"),
            Utils.getInt("BedBreakEffectsMenu.cosmetics.TNTEffect.durability"),
            Utils.getColorizedConfig("BedBreakEffectsMenu.cosmetics.TNTEffect.name"),
            "BedBreakEffectsMenu.cosmetics.TNTEffect.lore", false
    );

}
