package me.xii69.bedwars1058cosmetics.Listeners;

import com.andrei1058.bedwars.api.events.player.PlayerBedBreakEvent;
import me.xii69.bedwars1058cosmetics.Cosmetics.BedBreakEffects;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BedBreakListener implements Listener {

    @EventHandler
    public void onBedBreak(PlayerBedBreakEvent event) {
        BedBreakEffects.TNTBedBreakEffect(event.getPlayer(), event.getVictimTeam().getBed(), 5);
    }

}
