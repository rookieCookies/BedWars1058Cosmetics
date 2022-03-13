package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GUI {

    private static final static Inventory cosmeticsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("CosmeticsMenu.title"));
    private static final static Inventory deathCriesMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("DeathCriesMenu.title"));
    private static final static Inventory killEffectsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("KillEffectsMenu.title"));
    private static final static Inventory bedBreakEffectsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("BedBreakEffectsMenu.title"));
    private static final int[] glasses = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44};

    public static void setupGUIs() {

        // Main GUI
        cosmeticsMenu.setItem(Utils.getInt("CosmeticsMenu.items.deathCries.slot"), Items.deathCriesItem);
        cosmeticsMenu.setItem(Utils.getInt("CosmeticsMenu.items.killEffects.slot"), Items.killEffectsItem);
        cosmeticsMenu.setItem(Utils.getInt("CosmeticsMenu.items.bedBreakEffects.slot"), Items.bedBreakEffectsItem);
        cosmeticsMenu.setItem(40, Items.closeItem);

        for (int i : glasses) {
            if ((cosmeticsMenu.getItem(i) == null) || (cosmeticsMenu.getItem(i).getType() == Material.AIR)) {
                cosmeticsMenu.setItem(i, Items.glassItem);
            }
        }

        // Death Cries GUI
        deathCriesMenu.setItem(40, Items.backItem);
        deathCriesMenu.setItem(Utils.getInt("DeathCriesMenu.cosmetics.BatCry.slot"), Items.batCryItem);
        for (int i : glasses) {
            if ((deathCriesMenu.getItem(i) == null) || (deathCriesMenu.getItem(i).getType() == Material.AIR)) {
                deathCriesMenu.setItem(i, Items.glassItem);
            }
        }

        // Kill Effects GUI
        killEffectsMenu.setItem(40, Items.backItem);
        killEffectsMenu.setItem(Utils.getInt("KillEffectsMenu.cosmetics.BloodKillEffect.slot"), Items.bloodKillEffectItem);
        for (int i : glasses) {
            if ((killEffectsMenu.getItem(i) == null) || (killEffectsMenu.getItem(i).getType() == Material.AIR)) {
                killEffectsMenu.setItem(i, Items.glassItem);
            }
        }

        // Bed Break Effects GUI
        bedBreakEffectsMenu.setItem(40, Items.backItem);
        bedBreakEffectsMenu.setItem(Utils.getInt("BedBreakEffectsMenu.cosmetics.TNTEffect.slot"), Items.TNTBedEffectsItem);
        for (int i : glasses) {
            if ((bedBreakEffectsMenu.getItem(i) == null) || (bedBreakEffectsMenu.getItem(i).getType() == Material.AIR)) {
                bedBreakEffectsMenu.setItem(i, Items.glassItem);
            }
        }

    }

    public static void openMainMenu(Player player) {
        player.openInventory(cosmeticsMenu);
    }

    public static void openDeathCriesMenu(Player player) {
        player.openInventory(deathCriesMenu);
    }

    public static void openKillEffectsMenu(Player player) {
        player.openInventory(killEffectsMenu);
    }

    public static void openBedBreakEffectsMenu(Player player) {
        player.openInventory(bedBreakEffectsMenu);
    }

    public static Inventory getCosmeticsMenu() {
        return cosmeticsMenu;
    }

    public static Inventory getDeathCriesMenu() {
        return deathCriesMenu;
    }

    public static Inventory getKillEffectsMenu() {
        return killEffectsMenu;
    }

    public static Inventory getBedBreakEffectsMenu() {
        return bedBreakEffectsMenu;
    }

}
