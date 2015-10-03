package fr.ozedev.item;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Lapis {
	public static ItemStack getLapisHelmet(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.BLUE);
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Armor Helmet");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.OXYGEN, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisChestPlate(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.BLUE);
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Armor Chestplate");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisLeggings(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.BLUE);
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Armor Leggings");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisBoots(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.BLUE);
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Armor Helmet");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 6, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisSword(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_SWORD);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Sword");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisHoe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_HOE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Hoe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisAxe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_AXE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Axe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisPickaxe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Pickaxe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getLapisSpade(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_SPADE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§1Lapis Lazuli Spade");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
}
