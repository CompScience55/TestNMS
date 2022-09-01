package de.compsience.bosszombie.Listeners;

import de.compsience.bosszombie.Utils.Items;
import de.compsience.bosszombie.custom.FirstSkeletonBoss;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.entity.EntityTypes;
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

public class SkellySpawner implements Listener {

    @EventHandler
    public void onDrop(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlock();
        ItemMeta itemMeta = p.getItemInHand().getItemMeta();


        if (!(block.getType() == Material.SKELETON_SKULL && itemMeta.getDisplayName().equals(ChatColor.RED + "Skelly's Head"))) {
            return;
        }
        e.setCancelled(true);

        p.getInventory().removeItem(Items.skellySpawner());
        p.sendMessage(ChatColor.WHITE + "Du hast " + ChatColor.RED + "Skelly" + ChatColor.WHITE + " beschworen." );
        p.sendMessage(ChatColor.RED + "Skelly" + ChatColor.WHITE + " ist erschienen." );
        p.playSound(e.getBlock().getLocation(), Sound.ITEM_TOTEM_USE, 5, 4);
        FirstSkeletonBoss skelly = new FirstSkeletonBoss(EntityTypes.aB, e.getBlock().getLocation());
        WorldServer world = ((CraftWorld)e.getBlock().getLocation().getWorld()).getHandle();
        world.addEntity(skelly);

    }
}
