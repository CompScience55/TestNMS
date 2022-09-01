package de.compsience.bosszombie.Utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadBuilder {

    public static ItemStack createSkull(Player player) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName(player.getName());
        skullMeta.setOwningPlayer(player);
        skull.setItemMeta(skullMeta);

        return skull;
    }
}
