package fr.ozedev.ultraArmor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import fr.ozedev.item.*;

public class UltraArmor extends JavaPlugin{
	public void onEnable(){
		ShapedRecipe redstoneHelmet = new ShapedRecipe(RedStone.getRedstoneHelmet()).shape("///", "***", "*/*").setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneChestplate = new ShapedRecipe(RedStone.getRedstoneChestPlate()).shape("*/*", "***", "***").setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneLeggings = new ShapedRecipe(RedStone.getRedstoneLeggings()).shape("***", "*/*", "*/*").setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneBoots = new ShapedRecipe(RedStone.getRedstoneBoots()).shape("///", "*/*", "*/*").setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneSword = new ShapedRecipe(RedStone.getRedstoneSword()).shape("/*/", "/*/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstonePickaxe = new ShapedRecipe(RedStone.getRedstonePickaxe()).shape("***", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneSpade = new ShapedRecipe(RedStone.getRedstoneSpade()).shape("/*/", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneHoe = new ShapedRecipe(RedStone.getRedstoneHoe()).shape("/**", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.REDSTONE_BLOCK);
		ShapedRecipe redstoneAxe = new ShapedRecipe(RedStone.getRedstoneAxe()).shape("/**", "/%*", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.REDSTONE_BLOCK);
		
		ShapedRecipe lapisHelmet = new ShapedRecipe(Lapis.getLapisHelmet()).shape("///", "***", "*/*").setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisChestplate = new ShapedRecipe(Lapis.getLapisChestPlate()).shape("*/*", "***", "***").setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisLeggings = new ShapedRecipe(Lapis.getLapisLeggings()).shape("***", "*/*", "*/*").setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisBoots = new ShapedRecipe(Lapis.getLapisBoots()).shape("///", "*/*", "*/*").setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisSword = new ShapedRecipe(Lapis.getLapisSword()).shape("/*/", "/*/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisPickaxe = new ShapedRecipe(Lapis.getLapisPickaxe()).shape("***", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisSpade = new ShapedRecipe(Lapis.getLapisSpade()).shape("/*/", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisHoe = new ShapedRecipe(Lapis.getLapisHoe()).shape("/**", "/%/", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.LAPIS_BLOCK);
		ShapedRecipe lapisAxe = new ShapedRecipe(Lapis.getLapisAxe()).shape("/**", "/%*", "/%/").setIngredient('%', Material.STICK).setIngredient('*', Material.LAPIS_BLOCK);
		
		Bukkit.getServer().addRecipe(lapisHelmet);
		Bukkit.getServer().addRecipe(lapisChestplate);
		Bukkit.getServer().addRecipe(lapisLeggings);
		Bukkit.getServer().addRecipe(lapisBoots);
		Bukkit.getServer().addRecipe(lapisSword);
		Bukkit.getServer().addRecipe(lapisPickaxe);
		Bukkit.getServer().addRecipe(lapisSpade);
		Bukkit.getServer().addRecipe(lapisHoe);
		Bukkit.getServer().addRecipe(lapisAxe);
		
		Bukkit.getServer().addRecipe(redstoneHelmet);
		Bukkit.getServer().addRecipe(redstoneChestplate);
		Bukkit.getServer().addRecipe(redstoneLeggings);
		Bukkit.getServer().addRecipe(redstoneBoots);
		Bukkit.getServer().addRecipe(redstoneSword);
		Bukkit.getServer().addRecipe(redstonePickaxe);
		Bukkit.getServer().addRecipe(redstoneSpade);
		Bukkit.getServer().addRecipe(redstoneHoe);
		Bukkit.getServer().addRecipe(redstoneAxe);
	}
}
