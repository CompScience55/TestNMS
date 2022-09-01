package de.compsience.bosszombie.Listeners;

import de.compsience.bosszombie.custom.ReinforcedSkeleton;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.entity.EntityTypes;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SkeletonSpawner implements Listener {

    @EventHandler
    public void onSpawn(EntitySpawnEvent e) {
        if (!(e.getEntity() instanceof Skeleton))
            return;
        if (e.getLocation().getBlock().isLiquid())
            return;
        if (e.getEntity() instanceof org.bukkit.entity.Zombie && e.getEntity().getCustomName() != null && e.getEntity().getCustomName().equals(ChatColor.RED + "Skelly")) {
            return;
        }
        if ((int) (Math.random() * 5) == 1) {
            e.setCancelled(true);
            ReinforcedSkeleton skeleton = new ReinforcedSkeleton(EntityTypes.aB, e.getLocation());
            WorldServer world = ((CraftWorld) e.getLocation().getWorld()).getHandle();
            world.addEntity(skeleton);
        }
    }

}
