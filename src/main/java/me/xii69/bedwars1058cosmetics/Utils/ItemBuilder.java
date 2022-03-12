package me.xii69.bedwars1058cosmetics.Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

    public static ItemStack createItem(String itemName, int durability, String displayName, String loreConfigPath, boolean enchanted) {

        List<String> lore = new ArrayList<>();
        ItemStack itemStack = new ItemStack(Material.valueOf(itemName.toUpperCase()));
        ItemMeta itemMeta = itemStack.getItemMeta();

        if (!displayName.equals("")) {
            itemMeta.setDisplayName(Utils.colorize(displayName));
        } else {
            itemMeta.setDisplayName(" ");
        }

        if (durability != 0) {
            itemStack.setDurability((short) durability);
        }

        for (String string : new ArrayList<>(Utils.getStringList(loreConfigPath))) {
            lore.add(Utils.colorize(string));
        }

        if (enchanted) {
            itemMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }

        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;

    }

    public static ItemStack createEggItem(String displayName, EntityType entityType, String loreConfigPath, boolean enchanted) {

        List<String> lore = new ArrayList<>();
        ItemStack itemStack = new ItemStack(Material.MONSTER_EGG, 1, entityType.getTypeId());
        ItemMeta itemMeta = itemStack.getItemMeta();

        if (!displayName.equals("")) {
            itemMeta.setDisplayName(Utils.colorize(displayName));
        } else {
            itemMeta.setDisplayName(" ");
        }

        for (String string : new ArrayList<>(Utils.getStringList(loreConfigPath))) {
            lore.add(Utils.colorize(string));
        }

        if (enchanted) {
            itemMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }

        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;

    }

}
