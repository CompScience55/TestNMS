package de.compsience.bosszombie.custom;

import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntityZombie;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.inventory.ItemStack;


public class BossZombie extends EntityZombie {

    public BossZombie(EntityTypes<? extends EntityZombie> entitytypes, Location loc) {
        super(entitytypes, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        org.bukkit.entity.Zombie bossZombie = (org.bukkit.entity.Zombie) this.getBukkitEntity();

        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.RED + "Evil Ash"));
        this.setAbsorptionHearts(100);
        bossZombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(1);

        bossZombie.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        bossZombie.getEquipment().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
        bossZombie.getEquipment().setChestplate(Items.ashChestplate());
        bossZombie.getEquipment().setLeggings(Items.ashLeggings());
        bossZombie.getEquipment().setItemInMainHand(Items.ashSword());

        bossZombie.getEquipment().setItemInMainHandDropChance(0.08f);
        bossZombie.getEquipment().setBootsDropChance(0.08f);
        bossZombie.getEquipment().setLeggingsDropChance(0.08f);
        bossZombie.getEquipment().setChestplateDropChance(0.08f);
        bossZombie.getEquipment().setHelmetDropChance(0.08f);

    }

    

    public void initPathfinder() {
        super.initPathfinder();
    }
}



