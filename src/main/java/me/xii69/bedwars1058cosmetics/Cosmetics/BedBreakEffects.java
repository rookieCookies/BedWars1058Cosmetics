package me.xii69.bedwars1058cosmetics.Cosmetics;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class BedBreakEffects {

    public static void TNTBedBreakEffect(Player player, Location bedLocation, double range) {
        for (Entity entity : player.getNearbyEntities(range, range, range)) {
            if (entity instanceof Player) {
                Player p = (Player) entity;
                p.playSound(bedLocation, Sound.EXPLODE, 5, 1);
                bedLocation.getWorld().playEffect(bedLocation, Effect.EXPLOSION_HUGE, 1);
            }
        }
    }

}
