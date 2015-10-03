package fr.ozedev.item;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class RedStone{
	public static ItemStack getRedstoneHelmet(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.RED);
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Armor Helmet");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneChestPlate(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.RED);
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Armor Chestplate");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneLeggings(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.RED);
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Armor Leggings");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneBoots(){
		ItemStack redStoneHelmet = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta redStoneHelmetMeta = (LeatherArmorMeta) redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setColor(Color.RED);
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Armor Helmet");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		redStoneHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneSword(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_SWORD);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Sword");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 2, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneHoe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_HOE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Hoe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 2, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneAxe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_AXE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Axe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 2, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstonePickaxe(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Pickaxe");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 2, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
	public static ItemStack getRedstoneSpade(){
		ItemStack redStoneHelmet = new ItemStack(Material.IRON_SPADE);
		ItemMeta redStoneHelmetMeta = redStoneHelmet.getItemMeta();
		redStoneHelmetMeta.setDisplayName("§r§4Redstone Spade");
		redStoneHelmetMeta.addEnchant(Enchantment.DURABILITY, 2, true);
		redStoneHelmetMeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		redStoneHelmet.setItemMeta(redStoneHelmetMeta);
		return redStoneHelmet;
	}
}
