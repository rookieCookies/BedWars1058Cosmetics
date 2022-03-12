package me.xii69.bedwars1058cosmetics.Cosmetics;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class DeathCries {

    public static void batDeathCry(Player player) {
        player.playSound(player.getLocation(), Sound.BAT_DEATH, 5, 1);
    }

}
