package de.compsience.bosszombie.custom;


import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityZombie;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.inventory.ItemStack;


public class Zombie extends EntityZombie {

    public Zombie(Location loc) {
        super(EntityTypes.be, ((CraftWorld)loc.getWorld()).getHandle());
        org.bukkit.entity.Zombie bossZombie = (org.bukkit.entity.Zombie) this.getBukkitEntity();

        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.AQUA+ "Reinforced Zombie"));


        this.setAbsorptionHearts(40);
        bossZombie.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        bossZombie.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        bossZombie.getEquipment().setChestplate(Items.zombieChestplate());
        bossZombie.getEquipment().setItemInMainHand(Items.zombieSword());

        bossZombie.getEquipment().setItemInMainHandDropChance(0.09f);
        bossZombie.getEquipment().setBootsDropChance(0.09f);
        bossZombie.getEquipment().setLeggingsDropChance(0.09f);
        bossZombie.getEquipment().setChestplateDropChance(0.09f);
        bossZombie.getEquipment().setHelmetDropChance(0.09f);

    }

    public void initPathfinder() {
        super.initPathfinder();

    }










}
