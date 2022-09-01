package de.compsience.bosszombie.Listeners;

import de.compsience.bosszombie.Utils.Items;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Random;


public class EntityDeathEvent implements Listener {

    @EventHandler
    public void onMobDeath(org.bukkit.event.entity.EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();

        if (entity instanceof Zombie && entity.getCustomName() != null && entity.getCustomName().equals(ChatColor.AQUA + "Reinforced Zombie")) {

            Random random = new Random();
            int i = random.nextInt(100);

            if (!(i < 9)) {
                return;
            }
            entity.getLocation().getWorld().dropItem(entity.getLocation(), Items.bossItem());
        }

        if (entity instanceof Zombie && entity.getCustomName() != null && entity.getCustomName().equals(ChatColor.RED + "Evil Ash")) {
            Random random = new Random();
            int i = random.nextInt(100);

            if (!(i < 6)) {
                return;
            }
            entity.getLocation().getWorld().dropItem(entity.getLocation(), Items.summonItem());
        }

        if (entity instanceof Skeleton && entity.getCustomName() != null && entity.getCustomName().equals(ChatColor.AQUA + "Reinforced Skeleton")) {

            Random random = new Random();
            int i = random.nextInt(100);

            if (!(i < 16)) {
                return;
            }
            entity.getLocation().getWorld().dropItem(entity.getLocation(), Items.skellySpawner());
        }
    }
}
