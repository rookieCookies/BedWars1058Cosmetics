package me.xii69.bedwars1058cosmetics.Listeners;

import me.xii69.bedwars1058cosmetics.GUI.GUI;
import me.xii69.bedwars1058cosmetics.GUI.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        if (!(event.getWhoClicked() instanceof Player)) {
            return;
        }

        if (!(event.getWhoClicked() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem().equals(Items.menuItem)) {
            event.setCancelled(true);
        }

        if (event.getClickedInventory().getName().equals(GUI.getCosmeticsMenu().getTitle())) {
            event.setCancelled(true);
            if (event.getCurrentItem().equals(Items.deathCriesItem)) {
                player.closeInventory();
                GUI.openDeathCriesMenu(player);
            } else if (event.getCurrentItem().equals(Items.bedBreakEffectsItem)) {
                player.closeInventory();
                GUI.openBedBreakEffectsMenu(player);
            } else if (event.getCurrentItem().equals(Items.closeItem)) {
                player.closeInventory();
            }
        }

        if (event.getClickedInventory().getName().equals(GUI.getDeathCriesMenu().getTitle())) {
            event.setCancelled(true);
            if (event.getCurrentItem().equals(Items.backItem)) {
                player.closeInventory();
                GUI.openMainMenu(player);
            }
        }

        if (event.getClickedInventory().getName().equals(GUI.getBedBreakEffectsMenu().getTitle())) {
            event.setCancelled(true);
            if (event.getCurrentItem().equals(Items.backItem)) {
                player.closeInventory();
                GUI.openMainMenu(player);
            }
        }

    }

}
