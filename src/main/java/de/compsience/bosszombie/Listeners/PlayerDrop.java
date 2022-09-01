package de.compsience.bosszombie.Listeners;

import de.compsience.bosszombie.Utils.Items;
import de.compsience.bosszombie.custom.BossZombie;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.entity.EntityTypes;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import org.bukkit.inventory.meta.ItemMeta;


public class PlayerDrop implements Listener {

    @EventHandler
    public void onDrop(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlock();
        ItemMeta itemMeta = p.getItemInHand().getItemMeta();


        if (!(block.getType() == Material.ZOMBIE_HEAD && itemMeta.getDisplayName().equals(ChatColor.RED + "Evil Ash's Head"))) {
            return;
        }
        e.setCancelled(true);

        p.getInventory().removeItem(Items.bossItem());
        p.sendMessage(ChatColor.WHITE + "Du hast " + ChatColor.RED + "Evil Ash" + ChatColor.WHITE + " beschworen." );
        p.sendMessage(ChatColor.RED + "Evil Ash" + ChatColor.WHITE + " ist erschienen." );
        p.playSound(e.getBlock().getLocation(), Sound.ITEM_TOTEM_USE, 5, 4);
        BossZombie miniBoss = new BossZombie(EntityTypes.be,e.getBlock().getLocation());
        WorldServer world = ((CraftWorld)e.getBlock().getLocation().getWorld()).getHandle();
        world.addEntity(miniBoss);

    }


}
