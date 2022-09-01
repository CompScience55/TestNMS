package de.compsience.bosszombie.Listeners;

import de.compsience.bosszombie.Utils.Items;
import de.compsience.bosszombie.custom.Azroc;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.entity.EntityTypes;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class AzrocSpawnListener implements Listener {

    @EventHandler
    public void onDrop(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlock();
        ItemMeta itemMeta = p.getItemInHand().getItemMeta();

        if (!(block.getType() == Material.WITHER_ROSE && itemMeta.getDisplayName().equals(ChatColor.GOLD + "Legendary Azroc's Rose"))) {
            return;
        }
        e.setCancelled(true);


        p.getInventory().removeItem(Items.azrocRose());
        p.sendMessage(ChatColor.WHITE + "Du hast " + ChatColor.GOLD + "Azroc" + ChatColor.WHITE + " beschworen." );
        Bukkit.broadcastMessage(ChatColor.RED + p.getName() + ChatColor.WHITE + " hat " + ChatColor.GOLD + "Azroc" + ChatColor.WHITE + " beschworen!");
        p.sendMessage(ChatColor.GOLD + "Azroc" + ChatColor.WHITE + " ist erschienen." );
        p.playSound(e.getBlock().getLocation(), Sound.AMBIENT_CAVE, 8, 4);
        Azroc azroc = new Azroc(EntityTypes.be, e.getBlock().getLocation());
        WorldServer world = ((CraftWorld)e.getBlock().getLocation().getWorld()).getHandle();
        world.addEntity(azroc);

    }


}
