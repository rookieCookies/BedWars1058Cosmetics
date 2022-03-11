package me.xii69.bedwars1058cosmetics.GUI;

import me.xii69.bedwars1058cosmetics.Utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GUI {

    static Inventory cosmeticsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("CosmeticsMenu.title"));
    static Inventory deathCriesMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("DeathCriesMenu.title"));
    static Inventory bedBreakEffectsMenu = Bukkit.createInventory(null, 45, Utils.getColorizedConfig("BedBreakEffectsMenu.title"));

    public static void setupGUIs() {

        // Main GUI
        int[] glasses = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44};
        cosmeticsMenu.setItem(Utils.getInt("CosmeticsMenu.items.bedBreakEffects.slot"), Items.bedBreakEffectsItem);
        cosmeticsMenu.setItem(Utils.getInt("CosmeticsMenu.items.deathCries.slot"), Items.deathCriesItem);
        cosmeticsMenu.setItem(40, Items.closeItem);

        for (int i : glasses) {
            if ((cosmeticsMenu.getItem(i) == null) || (cosmeticsMenu.getItem(i).getType() == Material.AIR)) {
                cosmeticsMenu.setItem(i, Items.glassItem);
            }
        }

        // Death Cries GUI
        deathCriesMenu.setItem(40, Items.backItem);
        for (int i : glasses) {
            if ((deathCriesMenu.getItem(i) == null) || (deathCriesMenu.getItem(i).getType() == Material.AIR)) {
                deathCriesMenu.setItem(i, Items.glassItem);
            }
        }

        // Bed Break Effects GUI
        bedBreakEffectsMenu.setItem(40, Items.backItem);
        bedBreakEffectsMenu.setItem(22, Items.TNTBedEffectsItem);
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

    public static void openBedBreakEffectsMenu(Player player) {
        player.openInventory(bedBreakEffectsMenu);
    }

    public static Inventory getCosmeticsMenu() {
        return cosmeticsMenu;
    }

    public static Inventory getDeathCriesMenu() {
        return deathCriesMenu;
    }

    public static Inventory getBedBreakEffectsMenu() {
        return bedBreakEffectsMenu;
    }

}
