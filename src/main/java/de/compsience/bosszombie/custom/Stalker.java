package de.compsience.bosszombie.custom;

import de.compsience.bosszombie.Utils.HeadBuilder;
import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityZombie;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Player;

import java.util.Objects;
import java.util.Random;

public class Stalker extends EntityZombie {

    public Stalker(EntityTypes<? extends EntityZombie> entitytypes, Location loc) {
        super(entitytypes, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        org.bukkit.entity.Zombie stalker = (org.bukkit.entity.Zombie) this.getBukkitEntity();

        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.BLACK + "Stalker"));

        this.setBaby(true);
        stalker.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.3);
        this.setAbsorptionHearts(20);

        Player[] players = Bukkit.getOnlinePlayers().toArray(new Player[0]);
        Random random = new Random();
        int lengh = players.length;
        int index = random.nextInt(lengh - 0) + 0;

        Objects.requireNonNull(stalker.getEquipment()).setBoots(Items.stalkerBoots());
        stalker.getEquipment().setHelmet(HeadBuilder.createSkull(players[index]));
        stalker.getEquipment().setChestplate(Items.stalkerChestplate());
        stalker.getEquipment().setLeggings(Items.stalkerLeggings());
        stalker.getEquipment().setItemInMainHand(Items.stalkerWeapon());

        stalker.getEquipment().setItemInMainHandDropChance(0.05f);
        stalker.getEquipment().setBootsDropChance(0.12f);
        stalker.getEquipment().setLeggingsDropChance(0.12f);
        stalker.getEquipment().setChestplateDropChance(0.12f);
        stalker.getEquipment().setHelmetDropChance(0.02f);

    }
    public void initPathfinder() {
        super.initPathfinder();
    }

}
