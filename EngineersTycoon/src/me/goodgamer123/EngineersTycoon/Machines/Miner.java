package me.goodgamer123.EngineersTycoon.Machines;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Miner {

	public static ItemStack miner1() {
		ItemStack miner = new ItemStack(Material.DROPPER);
		ItemMeta minerMeta = miner.getItemMeta();
		
		minerMeta.setDisplayName(ChatColor.GREEN + "Miner MK1");
		
		List<String> minerLore = new ArrayList<String>();
		minerLore.add("");
		minerLore.add(ChatColor.WHITE + "Mines blocks beneath");
		minerLore.add(ChatColor.WHITE + "it in a 3x3 range.");
		minerMeta.setLore(minerLore);
		
		minerMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		minerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		miner.setItemMeta(minerMeta);
		
		return miner;
	}
	
	public static ItemStack miner2() {
		ItemStack miner = new ItemStack(Material.DROPPER);
		ItemMeta minerMeta = miner.getItemMeta();
		
		minerMeta.setDisplayName(ChatColor.BLUE + "Miner MK2");
		
		List<String> minerLore = new ArrayList<String>();
		minerLore.add("");
		minerLore.add(ChatColor.WHITE + "Mines blocks beneath");
		minerLore.add(ChatColor.WHITE + "it in a 3x3 range.");
		minerMeta.setLore(minerLore);
		
		minerMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		minerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		miner.setItemMeta(minerMeta);
		
		return miner;
	}
	
	public static ItemStack miner3() {
		ItemStack miner = new ItemStack(Material.DROPPER);
		ItemMeta minerMeta = miner.getItemMeta();
		
		minerMeta.setDisplayName(ChatColor.RED + "Miner MK3");
		
		List<String> minerLore = new ArrayList<String>();
		minerLore.add("");
		minerLore.add(ChatColor.WHITE + "Mines blocks beneath");
		minerLore.add(ChatColor.WHITE + "it in a 3x3 range.");
		minerMeta.setLore(minerLore);
		
		minerMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		minerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		miner.setItemMeta(minerMeta);
		
		return miner;
	}
	
	public static ItemStack miner4() {
		ItemStack miner = new ItemStack(Material.DROPPER);
		ItemMeta minerMeta = miner.getItemMeta();
		
		minerMeta.setDisplayName(ChatColor.DARK_PURPLE + "Miner MK4");
		
		List<String> minerLore = new ArrayList<String>();
		minerLore.add("");
		minerLore.add(ChatColor.WHITE + "Mines blocks beneath");
		minerLore.add(ChatColor.WHITE + "it in a 3x3 range.");
		minerMeta.setLore(minerLore);
		
		minerMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		minerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		miner.setItemMeta(minerMeta);
		
		return miner;
	}
	
	public static ItemStack miner1Info() {
		ItemStack minerInfo = new ItemStack(Material.IRON_INGOT);
		ItemMeta minerInfoMeta = minerInfo.getItemMeta();
		
		minerInfoMeta.setDisplayName(ChatColor.GREEN + "Miner MK1");
		
		List<String> minerInfoLore = new ArrayList<String>();
		minerInfoLore.add("");
		minerInfoLore.add(ChatColor.GREEN + "Mark: " + ChatColor.DARK_GREEN + "1");
		minerInfoLore.add(ChatColor.GREEN + "Blocks/minute: " + ChatColor.DARK_GREEN + "10");
		minerInfoMeta.setLore(minerInfoLore);
		minerInfo.setItemMeta(minerInfoMeta);
		
		return minerInfo;
	}
	
	public static ItemStack miner2Info() {
		ItemStack minerInfo = new ItemStack(Material.GOLD_INGOT);
		ItemMeta minerInfoMeta = minerInfo.getItemMeta();
		
		minerInfoMeta.setDisplayName(ChatColor.BLUE + "Miner MK2");
		
		List<String> minerInfoLore = new ArrayList<String>();
		minerInfoLore.add("");
		minerInfoLore.add(ChatColor.BLUE + "Mark: " + ChatColor.DARK_BLUE + "2");
		minerInfoLore.add(ChatColor.BLUE + "Blocks/minute: " + ChatColor.DARK_BLUE + "15");
		minerInfoMeta.setLore(minerInfoLore);
		minerInfo.setItemMeta(minerInfoMeta);
		
		return minerInfo;
	}
	
	public static ItemStack miner3Info() {
		ItemStack minerInfo = new ItemStack(Material.DIAMOND);
		ItemMeta minerInfoMeta = minerInfo.getItemMeta();
		
		minerInfoMeta.setDisplayName(ChatColor.RED + "Miner MK3");
		
		List<String> minerInfoLore = new ArrayList<String>();
		minerInfoLore.add("");
		minerInfoLore.add(ChatColor.RED + "Mark: " + ChatColor.DARK_RED + "3");
		minerInfoLore.add(ChatColor.RED + "Blocks/minute: " + ChatColor.DARK_RED + "30");
		minerInfoMeta.setLore(minerInfoLore);
		minerInfo.setItemMeta(minerInfoMeta);
		
		return minerInfo;
	}
	
	public static ItemStack miner4Info() {
		ItemStack minerInfo = new ItemStack(Material.EMERALD);
		ItemMeta minerInfoMeta = minerInfo.getItemMeta();
		
		minerInfoMeta.setDisplayName(ChatColor.DARK_PURPLE + "Miner MK4");
		
		List<String> minerInfoLore = new ArrayList<String>();
		minerInfoLore.add("");
		minerInfoLore.add(ChatColor.LIGHT_PURPLE + "Mark: " + ChatColor.DARK_PURPLE + "4");
		minerInfoLore.add(ChatColor.LIGHT_PURPLE + "Blocks/minute: " + ChatColor.DARK_PURPLE + "60");
		minerInfoMeta.setLore(minerInfoLore);
		minerInfo.setItemMeta(minerInfoMeta);
		
		return minerInfo;
	}
	
}
