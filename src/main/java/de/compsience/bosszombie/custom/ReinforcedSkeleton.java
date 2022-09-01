package de.compsience.bosszombie.custom;


import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntitySkeleton;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.ItemStack;


public class ReinforcedSkeleton extends EntitySkeleton {

    public ReinforcedSkeleton(EntityTypes<? extends EntitySkeleton> entitytypes, Location loc) {
        super(entitytypes, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        Skeleton skeleton = (Skeleton) this.getBukkitEntity();

        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.AQUA + "Reinforced Skeleton"));


        this.setAbsorptionHearts(40);
        skeleton.getEquipment().setItemInMainHand(Items.reSkeletonBow());
        skeleton.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        skeleton.getEquipment().setChestplate(Items.reSkeletonChestplate());
        skeleton.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));

        skeleton.getEquipment().setItemInMainHandDropChance(0.09f);
        skeleton.getEquipment().setBootsDropChance(0.09f);
        skeleton.getEquipment().setLeggingsDropChance(0.09f);
        skeleton.getEquipment().setChestplateDropChance(0.09f);
        skeleton.getEquipment().setHelmetDropChance(0.09f);


    }
    public void initPathfinder() {
        super.initPathfinder();
    }
}
