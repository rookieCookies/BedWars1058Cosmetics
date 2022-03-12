package me.xii69.bedwars1058cosmetics.Listeners;

import com.andrei1058.bedwars.api.events.player.PlayerKillEvent;
import me.xii69.bedwars1058cosmetics.Cosmetics.DeathCries;
import me.xii69.bedwars1058cosmetics.Cosmetics.KillEffects;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerKillListener implements Listener {

    @EventHandler
    public void onKill(PlayerKillEvent event) {
        DeathCries.batDeathCry(event.getKiller());
        KillEffects.bloodKillEffect(event.getVictim());
    }

}
