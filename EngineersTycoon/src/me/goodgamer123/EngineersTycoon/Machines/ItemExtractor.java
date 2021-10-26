package me.goodgamer123.EngineersTycoon.Machines;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemExtractor {

	public static ItemStack itemExtractor1() {
		ItemStack itemExtractor = new ItemStack(Material.DISPENSER);
		ItemMeta itemExtractorMeta = itemExtractor.getItemMeta();
		
		itemExtractorMeta.setDisplayName(ChatColor.GREEN + "Item extractor MK1");
		
		List<String> itemExtractorLore = new ArrayList<String>();
		itemExtractorLore.add("");
		itemExtractorLore.add(ChatColor.WHITE + "Extracts items from chests and");
		itemExtractorLore.add(ChatColor.WHITE + "places them on the conveyor belt.");
		itemExtractorMeta.setLore(itemExtractorLore);
		
		itemExtractorMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		itemExtractorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		itemExtractor.setItemMeta(itemExtractorMeta);
		
		return itemExtractor;
	}
	
	public static ItemStack itemExtractor2() {
		ItemStack itemExtractor = new ItemStack(Material.DISPENSER);
		ItemMeta itemExtractorMeta = itemExtractor.getItemMeta();
		
		itemExtractorMeta.setDisplayName(ChatColor.BLUE + "Item extractor MK2");
		
		List<String> itemExtractorLore = new ArrayList<String>();
		itemExtractorLore.add("");
		itemExtractorLore.add(ChatColor.WHITE + "Extracts items from chests and");
		itemExtractorLore.add(ChatColor.WHITE + "places them on the conveyor belt.");
		itemExtractorMeta.setLore(itemExtractorLore);
		
		itemExtractorMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		itemExtractorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		itemExtractor.setItemMeta(itemExtractorMeta);
		
		return itemExtractor;
	}
	
	public static ItemStack itemExtractor3() {
		ItemStack itemExtractor = new ItemStack(Material.DISPENSER);
		ItemMeta itemExtractorMeta = itemExtractor.getItemMeta();
		
		itemExtractorMeta.setDisplayName(ChatColor.RED + "Item extractor MK3");
		
		List<String> itemExtractorLore = new ArrayList<String>();
		itemExtractorLore.add("");
		itemExtractorLore.add(ChatColor.WHITE + "Extracts items from chests and");
		itemExtractorLore.add(ChatColor.WHITE + "places them on the conveyor belt.");
		itemExtractorMeta.setLore(itemExtractorLore);
		
		itemExtractorMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		itemExtractorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		itemExtractor.setItemMeta(itemExtractorMeta);
		
		return itemExtractor;
	}
	
	public static ItemStack itemExtractor4() {
		ItemStack itemExtractor = new ItemStack(Material.DISPENSER);
		ItemMeta itemExtractorMeta = itemExtractor.getItemMeta();
		
		itemExtractorMeta.setDisplayName(ChatColor.DARK_PURPLE + "Item extractor MK4");
		
		List<String> itemExtractorLore = new ArrayList<String>();
		itemExtractorLore.add("");
		itemExtractorLore.add(ChatColor.WHITE + "Extracts items from chests and");
		itemExtractorLore.add(ChatColor.WHITE + "places them on the conveyor belt.");
		itemExtractorMeta.setLore(itemExtractorLore);
		
		itemExtractorMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		itemExtractorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		itemExtractor.setItemMeta(itemExtractorMeta);
		
		return itemExtractor;
	}
	
	public static ItemStack itemExtractor1Info() {
		ItemStack itemExtractorInfo = new ItemStack(Material.IRON_INGOT);
		ItemMeta itemExtractorInfoMeta = itemExtractorInfo.getItemMeta();
		
		itemExtractorInfoMeta.setDisplayName(ChatColor.GREEN + "Item extractor MK1");
		
		List<String> itemExtractorInfoLore = new ArrayList<String>();
		itemExtractorInfoLore.add("");
		itemExtractorInfoLore.add(ChatColor.GREEN + "Mark: " + ChatColor.DARK_GREEN + "1");
		itemExtractorInfoLore.add(ChatColor.GREEN + "Items/minutes: " + ChatColor.DARK_GREEN + "10");
		itemExtractorInfoMeta.setLore(itemExtractorInfoLore);
		itemExtractorInfo.setItemMeta(itemExtractorInfoMeta);
		
		return itemExtractorInfo;
	}
	
	public static ItemStack itemExtractor2Info() {
		ItemStack itemExtractorInfo = new ItemStack(Material.GOLD_INGOT);
		ItemMeta itemExtractorInfoMeta = itemExtractorInfo.getItemMeta();
		
		itemExtractorInfoMeta.setDisplayName(ChatColor.BLUE + "Item extractor MK2");
		
		List<String> itemExtractorInfoLore = new ArrayList<String>();
		itemExtractorInfoLore.add("");
		itemExtractorInfoLore.add(ChatColor.BLUE + "Mark: " + ChatColor.DARK_BLUE + "2");
		itemExtractorInfoLore.add(ChatColor.BLUE + "Items/minutes: " + ChatColor.DARK_BLUE + "15");
		itemExtractorInfoMeta.setLore(itemExtractorInfoLore);
		itemExtractorInfo.setItemMeta(itemExtractorInfoMeta);
		
		return itemExtractorInfo;
	}
	
	public static ItemStack itemExtractor3Info() {
		ItemStack itemExtractorInfo = new ItemStack(Material.DIAMOND);
		ItemMeta itemExtractorInfoMeta = itemExtractorInfo.getItemMeta();
		
		itemExtractorInfoMeta.setDisplayName(ChatColor.RED + "Item extractor MK3");
		
		List<String> itemExtractorInfoLore = new ArrayList<String>();
		itemExtractorInfoLore.add("");
		itemExtractorInfoLore.add(ChatColor.RED + "Mark: " + ChatColor.DARK_RED + "3");
		itemExtractorInfoLore.add(ChatColor.RED + "Items/minutes: " + ChatColor.DARK_RED + "30");
		itemExtractorInfoMeta.setLore(itemExtractorInfoLore);
		itemExtractorInfo.setItemMeta(itemExtractorInfoMeta);
		
		return itemExtractorInfo;
	}
	
	public static ItemStack itemExtractor4Info() {
		ItemStack itemExtractorInfo = new ItemStack(Material.EMERALD);
		ItemMeta itemExtractorInfoMeta = itemExtractorInfo.getItemMeta();
		
		itemExtractorInfoMeta.setDisplayName(ChatColor.DARK_PURPLE + "Item extractor MK4");
		
		List<String> itemExtractorInfoLore = new ArrayList<String>();
		itemExtractorInfoLore.add("");
		itemExtractorInfoLore.add(ChatColor.LIGHT_PURPLE + "Mark: " + ChatColor.DARK_PURPLE + "4");
		itemExtractorInfoLore.add(ChatColor.LIGHT_PURPLE + "Items/minutes: " + ChatColor.DARK_PURPLE + "60");
		itemExtractorInfoMeta.setLore(itemExtractorInfoLore);
		itemExtractorInfo.setItemMeta(itemExtractorInfoMeta);
		
		return itemExtractorInfo;
	}
	
}
