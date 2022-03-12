package me.xii69.bedwars1058cosmetics.Cosmetics;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import xyz.xenondevs.particle.ParticleBuilder;
import xyz.xenondevs.particle.ParticleEffect;
import xyz.xenondevs.particle.data.texture.BlockTexture;

public class KillEffects {

    public static void bloodKillEffect(Player player) {
        new ParticleBuilder(ParticleEffect.BLOCK_CRACK, player.getLocation().add(0, 0.5, 0)).setAmount(100).setParticleData(
                new BlockTexture(Material.REDSTONE_BLOCK)).display();
    }

}
