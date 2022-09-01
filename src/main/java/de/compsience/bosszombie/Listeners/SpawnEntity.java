package de.compsience.bosszombie.Listeners;



import de.compsience.bosszombie.custom.Stalker;
import de.compsience.bosszombie.custom.Zombie;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.entity.EntityTypes;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;


public class SpawnEntity implements Listener {

    @EventHandler
    public void onSpawn(EntitySpawnEvent e) {

        if (!(e.getEntity() instanceof org.bukkit.entity.Zombie))
            return;
        if (e.getLocation().getBlock().isLiquid())
            return;
        if (e.getEntity() instanceof org.bukkit.entity.Zombie && e.getEntity().getCustomName() != null && e.getEntity().getCustomName().equals(ChatColor.RED + "Evil Ash")) {
            return;
        }
        if (e.getEntity() instanceof org.bukkit.entity.Zombie && e.getEntity().getCustomName() != null && e.getEntity().getCustomName().equals(ChatColor.GOLD + "Azroc")) {
            return;
        }
        if ((int) (Math.random() * 5) == 1) {
            e.setCancelled(true);
            Zombie z = new Zombie(e.getLocation());
            WorldServer world = ((CraftWorld)e.getLocation().getWorld()).getHandle();
            world.addEntity(z);
            Location loc = e.getLocation();

            /*for (Player p: Bukkit.getOnlinePlayers()) {
                p.sendMessage("Zombie bei: " + ChatColor.GOLD + loc.getX() + ", " + ChatColor.GOLD + loc.getY() + ", "
                        + ChatColor.GOLD + loc.getZ());
            }*/
        }
        if ((int) (Math.random() * 5) == 1) {
            e.setCancelled(true);
            Stalker stalker = new Stalker(EntityTypes.be, e.getLocation());
            WorldServer world = ((CraftWorld) e.getLocation().getWorld()).getHandle();
            world.addEntity(stalker);
            Location loc = e.getLocation();
        }
    }
}
