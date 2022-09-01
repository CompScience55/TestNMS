package de.compsience.bosszombie.custom;

import de.compsience.bosszombie.Utils.Items;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.EntitySkeleton;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.entity.Skeleton;

public class FirstSkeletonBoss extends EntitySkeleton {

    public FirstSkeletonBoss(EntityTypes<? extends EntitySkeleton> entitytypes, Location loc) {
        super(entitytypes, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(loc.getX(),loc.getY(),loc.getZ());
        Skeleton skeleton = (Skeleton) this.getBukkitEntity();

        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.RED + "Skelly"));
        this.setAbsorptionHearts(70);

        skeleton.getEquipment().setHelmet(Items.skellyHelmet());
        skeleton.getEquipment().setChestplate(Items.skellyChest());
        skeleton.getEquipment().setItemInMainHand(Items.skellyWeapon());

        skeleton.getEquipment().setItemInMainHandDropChance(0.08f);
        skeleton.getEquipment().setChestplateDropChance(0.07f);
        skeleton.getEquipment().setHelmetDropChance(0.07f);
    }
    public void initPathfinder() {
        super.initPathfinder();
    }
}
