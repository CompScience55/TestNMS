package de.compsience.bosszombie.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static ItemStack bossItem() {
        ItemStack itemStack = new ItemStack(Material.ZOMBIE_HEAD);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Evil Ash's Head");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "The head of a powerful boss.");
        lore.add(ChatColor.WHITE + "To summon the boss place this head.");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack zombieSword() {
        ItemStack itemStack = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Sword of Reinforced Zombie");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Sword dropped by a Reinforced Zombie");
        lore.add(ChatColor.GREEN + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack zombieChestplate() {
        ItemStack itemStack = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Chestplate of Reinforced Zombie");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Chestplate dropped by a Reinforced Zombie");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);

        LeatherArmorMeta colorMetaOfReinforcedZombie = (LeatherArmorMeta) itemStack.getItemMeta();
        colorMetaOfReinforcedZombie.setColor(Color.BLACK);
        itemStack.setItemMeta(colorMetaOfReinforcedZombie);

        return itemStack;
    }

    public static ItemStack ashSword() {
        ItemStack itemStack = new ItemStack(Material.STONE_SWORD);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Special Sword of Ash Evil");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 9, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Sword dropped by Ash Evil");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack ashChestplate() {
        ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Special Chestplate of Ash Evil");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Armor Piece dropped by Ash Evil");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack ashLeggings() {
        ItemStack itemStack = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Special Leggings of Ash Evil");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Armor Piece dropped by Ash Evil");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack reSkeletonBow() {
        ItemStack itemStack = new ItemStack(Material.BOW);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "UNCOMMON Bow of Reinforced Skeleton");
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Bow dropped by a Reinforced Zombie");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack reSkeletonChestplate() {
        ItemStack itemStack = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Chestplate of Reinforced Skeleton");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Chestplate dropped by a Reinforced Skeleton");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);

        LeatherArmorMeta colorMetaOfReinforcedZombie = (LeatherArmorMeta) itemStack.getItemMeta();
        colorMetaOfReinforcedZombie.setColor(Color.BLACK);
        itemStack.setItemMeta(colorMetaOfReinforcedZombie);

        return itemStack;
    }

    public static ItemStack summonItem() {
        ItemStack itemStack = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mythic Summoning Ingredient");
        meta.addEnchant(Enchantment.LUCK,1,true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Flesh of a powerful Boss");
        lore.add(ChatColor.WHITE + "Can be used to crafted a summoning item");
        lore.add(ChatColor.LIGHT_PURPLE + "MYTHIC ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocRose() {
        ItemStack itemStack = new ItemStack(Material.WITHER_ROSE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Azroc's Rose");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Summoning Item for Azroc" );
        lore.add(ChatColor.GOLD + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocSword() {
        ItemStack itemStack = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Sword of Azroc");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Sword dropped by Azroc");
        lore.add(ChatColor.RED + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocChest() {
        ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Chestplate of Azroc");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Chestplate dropped by Azroc");
        lore.add(ChatColor.RED + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocHelmet() {
        ItemStack itemStack = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Helmet of Azroc");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Helmet dropped by Azroc");
        lore.add(ChatColor.RED + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocLeggings() {
        ItemStack itemStack = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Leggings of Azroc");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Leggings dropped by Azroc");
        lore.add(ChatColor.RED + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack azrocBoots() {
        ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Boots( of Azroc");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Boots( dropped by Azroc");
        lore.add(ChatColor.RED + "LEGENDARY ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack stalkerChestplate() {
        ItemStack itemStack = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Chestplate of Reinforced Zombie");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Chestplate dropped by a Reinforced Zombie");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);

        LeatherArmorMeta colorMetaOfReinforcedZombie = (LeatherArmorMeta) itemStack.getItemMeta();
        colorMetaOfReinforcedZombie.setColor(Color.BLACK);
        itemStack.setItemMeta(colorMetaOfReinforcedZombie);

        return itemStack;
    }

    public static ItemStack stalkerLeggings() {
        ItemStack itemStack = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Leggings of Stalker");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Leggings dropped by a Stalkere");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");;
        meta.setLore(lore);
        itemStack.setItemMeta(meta);

        LeatherArmorMeta colorMetaOfReinforcedZombie = (LeatherArmorMeta) itemStack.getItemMeta();
        colorMetaOfReinforcedZombie.setColor(Color.BLACK);
        itemStack.setItemMeta(colorMetaOfReinforcedZombie);

        return itemStack;
    }

    public static ItemStack stalkerBoots() {
        ItemStack itemStack = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Uncommon Boots of Stalker");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Boots dropped by a Stalkere");
        lore.add(ChatColor.BLUE + "UNCOMMON ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);

        LeatherArmorMeta colorMetaOfReinforcedZombie = (LeatherArmorMeta) itemStack.getItemMeta();
        colorMetaOfReinforcedZombie.setColor(Color.BLACK);
        itemStack.setItemMeta(colorMetaOfReinforcedZombie);

        return itemStack;
    }

    public static ItemStack stalkerWeapon() {
        ItemStack itemStack = new ItemStack(Material.IRON_AXE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_BLUE + "Rare Battle Axe of Stalker");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Battle Axe dropped by Stalker");
        lore.add(ChatColor.DARK_BLUE + "RARE ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    //Skeleton Boss Items
    public static ItemStack skellyWeapon() {
        ItemStack itemStack = new ItemStack(Material.BOW);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Special Bow of Skelly");
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 6, true);
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Bow dropped by Skelly");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack skellyChest() {
        ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_BLUE + "Rare Chestplate of Skelly");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Chestplate dropped by Skelly");
        lore.add(ChatColor.DARK_BLUE + "RARE ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
    public static ItemStack skellyHelmet() {
        ItemStack itemStack = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_BLUE + "Rare Helmet of Skelly");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Helmet dropped by Skelly");
        lore.add(ChatColor.DARK_BLUE + "RARE ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public static ItemStack skellySpawner() {
        ItemStack itemStack = new ItemStack(Material.SKELETON_SKULL);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Skelly's Head");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + "Head of Skelly");
        lore.add(ChatColor.WHITE + "Place to spawn Skelly");
        lore.add(ChatColor.RED + "SPECIAL ITEM");
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
