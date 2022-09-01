package de.compsience.bosszombie.custom;

import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityZombie;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;


public class Azroc extends EntityZombie {

    public Azroc(EntityTypes<? extends EntityZombie> entitytypes, Location loc) {
        super(entitytypes, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        org.bukkit.entity.Zombie azroc = (org.bukkit.entity.Zombie) this.getBukkitEntity();

        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.GOLD + "Azroc"));
        this.setAbsorptionHearts(140);
        azroc.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.8);
        azroc.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);

        azroc.getEquipment().setBoots(Items.azrocBoots());
        azroc.getEquipment().setHelmet(Items.azrocHelmet());
        azroc.getEquipment().setChestplate(Items.azrocChest());
        azroc.getEquipment().setLeggings(Items.azrocLeggings());
        azroc.getEquipment().setItemInMainHand(Items.azrocSword());

        azroc.getEquipment().setItemInMainHandDropChance(0.03f);
        azroc.getEquipment().setBootsDropChance(0.03f);
        azroc.getEquipment().setLeggingsDropChance(0.03f);
        azroc.getEquipment().setChestplateDropChance(0.03f);
        azroc.getEquipment().setHelmetDropChance(0.03f);

    }
    public void initPathfinder() {
        super.initPathfinder();
    }
}
