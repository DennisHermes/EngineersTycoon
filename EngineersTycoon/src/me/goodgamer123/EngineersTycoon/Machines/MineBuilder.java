package me.goodgamer123.EngineersTycoon.Machines;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MineBuilder {

	public static ItemStack mineBuilder1() {
		ItemStack mineBuilder = new ItemStack(Material.BEACON);
		ItemMeta mineBuilderMeta = mineBuilder.getItemMeta();
		
		mineBuilderMeta.setDisplayName(ChatColor.GREEN + "Mine builder MK1");
		
		List<String> mineBuilderLore = new ArrayList<String>();
		mineBuilderLore.add("");
		mineBuilderLore.add(ChatColor.WHITE + "Builds a mine where you");
		mineBuilderLore.add(ChatColor.WHITE + "can place your miners in.");
		mineBuilderMeta.setLore(mineBuilderLore);
		
		mineBuilderMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		mineBuilderMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mineBuilder.setItemMeta(mineBuilderMeta);
		
		return mineBuilder;
	}
	
	public static ItemStack mineBuilder2() {
		ItemStack mineBuilder = new ItemStack(Material.BEACON);
		ItemMeta mineBuilderMeta = mineBuilder.getItemMeta();
		
		mineBuilderMeta.setDisplayName(ChatColor.BLUE + "Mine builder MK2");
		
		List<String> mineBuilderLore = new ArrayList<String>();
		mineBuilderLore.add("");
		mineBuilderLore.add(ChatColor.WHITE + "Builds a mine where you");
		mineBuilderLore.add(ChatColor.WHITE + "can place your miners in.");
		mineBuilderMeta.setLore(mineBuilderLore);
		
		mineBuilderMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		mineBuilderMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mineBuilder.setItemMeta(mineBuilderMeta);
		
		return mineBuilder;
	}
	
	public static ItemStack mineBuilder3() {
		ItemStack mineBuilder = new ItemStack(Material.BEACON);
		ItemMeta mineBuilderMeta = mineBuilder.getItemMeta();
		
		mineBuilderMeta.setDisplayName(ChatColor.RED + "Mine builder MK3");
		
		List<String> mineBuilderLore = new ArrayList<String>();
		mineBuilderLore.add("");
		mineBuilderLore.add(ChatColor.WHITE + "Builds a mine where you");
		mineBuilderLore.add(ChatColor.WHITE + "can place your miners in.");
		mineBuilderMeta.setLore(mineBuilderLore);
		
		mineBuilderMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		mineBuilderMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mineBuilder.setItemMeta(mineBuilderMeta);
		
		return mineBuilder;
	}
	
	public static ItemStack mineBuilder4() {
		ItemStack mineBuilder = new ItemStack(Material.BEACON);
		ItemMeta mineBuilderMeta = mineBuilder.getItemMeta();
		
		mineBuilderMeta.setDisplayName(ChatColor.DARK_PURPLE + "Mine builder MK4");
		
		List<String> mineBuilderLore = new ArrayList<String>();
		mineBuilderLore.add("");
		mineBuilderLore.add(ChatColor.WHITE + "Builds a mine where you");
		mineBuilderLore.add(ChatColor.WHITE + "can place your miners in.");
		mineBuilderMeta.setLore(mineBuilderLore);
		
		mineBuilderMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		mineBuilderMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mineBuilder.setItemMeta(mineBuilderMeta);
		
		return mineBuilder;
	}
	
	public static ItemStack mineBuilder1Info() {
		ItemStack mineBuilderInfo = new ItemStack(Material.IRON_INGOT);
		ItemMeta mineBuilderInfoMeta = mineBuilderInfo.getItemMeta();
		
		mineBuilderInfoMeta.setDisplayName(ChatColor.GREEN + "Mine builder MK1");
		
		List<String> mineBuilderInfoLore = new ArrayList<String>();
		mineBuilderInfoLore.add("");
		mineBuilderInfoLore.add(ChatColor.GREEN + "Mark: " + ChatColor.DARK_GREEN + "1");
		mineBuilderInfoLore.add(ChatColor.GREEN + "Respawn time: " + ChatColor.DARK_GREEN + "9 minutes");
		mineBuilderInfoLore.add(ChatColor.GREEN + "Resources: " + ChatColor.DARK_GREEN + "Coal, Iron");
		mineBuilderInfoMeta.setLore(mineBuilderInfoLore);
		mineBuilderInfo.setItemMeta(mineBuilderInfoMeta);
		
		return mineBuilderInfo;
	}
	
	public static ItemStack mineBuilder2Info() {
		ItemStack mineBuilderInfo = new ItemStack(Material.GOLD_INGOT);
		ItemMeta mineBuilderInfoMeta = mineBuilderInfo.getItemMeta();
		
		mineBuilderInfoMeta.setDisplayName(ChatColor.BLUE + "Mine builder MK2");
		
		List<String> mineBuilderInfoLore = new ArrayList<String>();
		mineBuilderInfoLore.add("");
		mineBuilderInfoLore.add(ChatColor.BLUE + "Mark: " + ChatColor.DARK_BLUE + "2");
		mineBuilderInfoLore.add(ChatColor.BLUE + "Respawn time: " + ChatColor.DARK_BLUE + "6 minutes");
		mineBuilderInfoLore.add(ChatColor.BLUE + "Resources: " + ChatColor.DARK_BLUE + "Coal, Iron, Gold");
		mineBuilderInfoMeta.setLore(mineBuilderInfoLore);
		mineBuilderInfo.setItemMeta(mineBuilderInfoMeta);
		
		return mineBuilderInfo;
	}
	
	public static ItemStack mineBuilder3Info() {
		ItemStack mineBuilderInfo = new ItemStack(Material.DIAMOND);
		ItemMeta mineBuilderInfoMeta = mineBuilderInfo.getItemMeta();
		
		mineBuilderInfoMeta.setDisplayName(ChatColor.RED + "Mine builder MK3");
		
		List<String> mineBuilderInfoLore = new ArrayList<String>();
		mineBuilderInfoLore.add("");
		mineBuilderInfoLore.add(ChatColor.RED + "Mark: " + ChatColor.DARK_RED + "3");
		mineBuilderInfoLore.add(ChatColor.RED + "Respawn time: " + ChatColor.DARK_RED + "2 minutes");
		mineBuilderInfoLore.add(ChatColor.RED + "Resources: " + ChatColor.DARK_RED + "Coal, Iron, Gold, Diamond");
		mineBuilderInfoMeta.setLore(mineBuilderInfoLore);
		mineBuilderInfo.setItemMeta(mineBuilderInfoMeta);
		
		return mineBuilderInfo;
	}
	
	public static ItemStack mineBuilder4Info() {
		ItemStack mineBuilderInfo = new ItemStack(Material.EMERALD);
		ItemMeta mineBuilderInfoMeta = mineBuilderInfo.getItemMeta();
		
		mineBuilderInfoMeta.setDisplayName(ChatColor.DARK_PURPLE + "Mine builder MK4");
		
		List<String> mineBuilderInfoLore = new ArrayList<String>();
		mineBuilderInfoLore.add("");
		mineBuilderInfoLore.add(ChatColor.LIGHT_PURPLE + "Mark: " + ChatColor.DARK_PURPLE + "4");
		mineBuilderInfoLore.add(ChatColor.LIGHT_PURPLE + "Respawn time: " + ChatColor.DARK_PURPLE + "1 minutes");
		mineBuilderInfoLore.add(ChatColor.LIGHT_PURPLE + "Resources: " + ChatColor.DARK_PURPLE + "Coal, Iron, Gold, Diamond, Emerald");
		mineBuilderInfoMeta.setLore(mineBuilderInfoLore);
		mineBuilderInfo.setItemMeta(mineBuilderInfoMeta);
		
		return mineBuilderInfo;
	}
	
}
