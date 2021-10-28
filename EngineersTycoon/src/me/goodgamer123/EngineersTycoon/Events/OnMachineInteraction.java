package me.goodgamer123.EngineersTycoon.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Nameable;
import org.bukkit.block.Container;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.goodgamer123.EngineersTycoon.Machines.Conveyer;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;
import me.goodgamer123.EngineersTycoon.Machines.Miner;

public class OnMachineInteraction implements Listener {

	@EventHandler
	private void PlayerInteractEvent(PlayerInteractEvent e) {
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && !e.getPlayer().isSneaking()) {
			if (e.getClickedBlock().getType().equals(Material.DISPENSER) && (((Nameable) e.getClickedBlock().getState()).getCustomName() != null)) {
				if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor1().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
					
			        ItemStack upgradeble = ItemExtractor.itemExtractor2Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = ItemExtractor.itemExtractor1Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, current);
					inv.setItem(12, upgradeble);
					inv.setItem(14, ItemExtractor.itemExtractor3Info());
					inv.setItem(16, ItemExtractor.itemExtractor4Info());
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor2().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
					
			        ItemStack upgradeble = ItemExtractor.itemExtractor3Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = ItemExtractor.itemExtractor2Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, ItemExtractor.itemExtractor1Info());
					inv.setItem(12, current);
					inv.setItem(14, upgradeble);
					inv.setItem(16, ItemExtractor.itemExtractor4Info());
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor3().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
					
			        ItemStack upgradeble = ItemExtractor.itemExtractor4Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = ItemExtractor.itemExtractor3Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, ItemExtractor.itemExtractor1Info());
					inv.setItem(12, ItemExtractor.itemExtractor2Info());
					inv.setItem(14, current);
					inv.setItem(16, upgradeble);
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor4().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack current = ItemExtractor.itemExtractor4Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, ItemExtractor.itemExtractor1Info());
					inv.setItem(12, ItemExtractor.itemExtractor2Info());
					inv.setItem(14, ItemExtractor.itemExtractor3Info());
					inv.setItem(16, current);
					
					e.getPlayer().openInventory(inv);
				}
				
				
				
			} else if (e.getClickedBlock().getType().equals(Material.BEACON) && (((Nameable) e.getClickedBlock().getState()).getCustomName() != null)) {
				if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder1().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(Filling1Meta);
			        
			        ItemStack upgradeble = MineBuilder.mineBuilder2Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = MineBuilder.mineBuilder1Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, current);
					inv.setItem(12, upgradeble);
					inv.setItem(14, MineBuilder.mineBuilder3Info());
					inv.setItem(16, MineBuilder.mineBuilder4Info());
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder2().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack upgradeble = MineBuilder.mineBuilder3Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = MineBuilder.mineBuilder2Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, MineBuilder.mineBuilder1Info());
					inv.setItem(12, current);
					inv.setItem(14, upgradeble);
					inv.setItem(16, MineBuilder.mineBuilder4Info());
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder3().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack upgradeble = MineBuilder.mineBuilder4Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = MineBuilder.mineBuilder3Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, MineBuilder.mineBuilder1Info());
					inv.setItem(12, MineBuilder.mineBuilder2Info());
					inv.setItem(14, current);
					inv.setItem(16, upgradeble);
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder4().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack current = MineBuilder.mineBuilder4Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
					Inventory inv = Bukkit.createInventory(null, 27, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, MineBuilder.mineBuilder1Info());
					inv.setItem(12, MineBuilder.mineBuilder2Info());
					inv.setItem(14, MineBuilder.mineBuilder3Info());
					inv.setItem(16, current);
					
					e.getPlayer().openInventory(inv);
				}
				
				
				
				
			} else if (e.getClickedBlock().getType().equals(Material.DROPPER) && (((Nameable) e.getClickedBlock().getState()).getCustomName() != null)) {
				if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(Miner.miner1().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack upgradeble = Miner.miner2Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = Miner.miner1Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
			        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
			        ItemMeta Filling2Meta = Filling2.getItemMeta();
			        Filling2Meta.setDisplayName(" ");
			        Filling2.setItemMeta(Filling2Meta);
			        
			        Inventory dropper = ((Container) e.getClickedBlock().getState()).getInventory();
			        
					Inventory inv = Bukkit.createInventory(null, 45, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, current);
					inv.setItem(12, upgradeble);
					inv.setItem(14, Miner.miner3Info());
					inv.setItem(16, Miner.miner4Info());
					for (int i = 27; i < 36; i++) {
						inv.setItem(i, Filling2);
					}
					for (int i = 0; i < 9; i++) {
						inv.setItem(i + 36, dropper.getItem(i));
					}
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(Miner.miner2().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack upgradeble = Miner.miner3Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = Miner.miner2Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
			        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
			        ItemMeta Filling2Meta = Filling2.getItemMeta();
			        Filling2Meta.setDisplayName(" ");
			        Filling2.setItemMeta(Filling2Meta);
			        
			        Inventory dropper = ((Container) e.getClickedBlock().getState()).getInventory();
			        
					Inventory inv = Bukkit.createInventory(null, 45, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, Miner.miner1Info());
					inv.setItem(12, current);
					inv.setItem(14, upgradeble);
					inv.setItem(16, Miner.miner4Info());
					for (int i = 27; i < 36; i++) {
						inv.setItem(i, Filling2);
					}
					for (int i = 0; i < 9; i++) {
						inv.setItem(i + 36, dropper.getItem(i));
					}
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(Miner.miner3().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack upgradeble = Miner.miner4Info();
			        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
			        List<String> upgradebleLore = upgradebleMeta.getLore();
			        upgradebleLore.add("");
			        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
			        upgradebleMeta.setLore(upgradebleLore);
			        upgradeble.setItemMeta(upgradebleMeta);
			        
			        ItemStack current = Miner.miner3Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
			        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
			        ItemMeta Filling2Meta = Filling2.getItemMeta();
			        Filling2Meta.setDisplayName(" ");
			        Filling2.setItemMeta(Filling2Meta);
			        
			        Inventory dropper = ((Container) e.getClickedBlock().getState()).getInventory();
			        
					Inventory inv = Bukkit.createInventory(null, 45, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, Miner.miner1Info());
					inv.setItem(12, Miner.miner2Info());
					inv.setItem(14, current);
					inv.setItem(16, upgradeble);
					for (int i = 27; i < 36; i++) {
						inv.setItem(i, Filling2);
					}
					for (int i = 0; i < 9; i++) {
						inv.setItem(i + 36, dropper.getItem(i));
					}
					
					e.getPlayer().openInventory(inv);
				} else if (((Nameable) e.getClickedBlock().getState()).getCustomName().equals(Miner.miner4().getItemMeta().getDisplayName())) {
					e.setCancelled(true);
					
					ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
			        ItemMeta FillingMeta = Filling.getItemMeta();
			        FillingMeta.setDisplayName(" ");
			        Filling.setItemMeta(FillingMeta);
			        
			        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			        ItemMeta Filling1Meta = Filling1.getItemMeta();
			        Filling1Meta.setDisplayName(" ");
			        Filling1.setItemMeta(FillingMeta);
			        
			        ItemStack current = Miner.miner4Info();
			        ItemMeta currentMeta = current.getItemMeta();
			        List<String> currentLore = currentMeta.getLore();
			        currentLore.add("");
			        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
			        currentMeta.setLore(currentLore);
			        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			        current.setItemMeta(currentMeta);
			        
			        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
			        ItemMeta Filling2Meta = Filling2.getItemMeta();
			        Filling2Meta.setDisplayName(" ");
			        Filling2.setItemMeta(Filling2Meta);
			        
			        Inventory dropper = ((Container) e.getClickedBlock().getState()).getInventory();
			        
					Inventory inv = Bukkit.createInventory(null, 45, ((Nameable) e.getClickedBlock().getState()).getCustomName());
					for (int i = 0; i < inv.getSize(); i++) {
						if (i % 2 == 0) inv.setItem(i, Filling);
						else inv.setItem(i, Filling1);
					}
					inv.setItem(10, Miner.miner1Info());
					inv.setItem(12, Miner.miner2Info());
					inv.setItem(14, Miner.miner3Info());
					inv.setItem(16, current);
					for (int i = 27; i < 36; i++) {
						inv.setItem(i, Filling2);
					}
					for (int i = 0; i < 9; i++) {
						inv.setItem(i + 36, dropper.getItem(i));
					}
					
					e.getPlayer().openInventory(inv);
				}
			} else if (e.getClickedBlock().getType().equals(Material.POLISHED_BLACKSTONE_SLAB)) {
				List<Entity> nearbyEntites0 = (List<Entity>) e.getClickedBlock().getWorld().getNearbyEntities(e.getClickedBlock().getLocation().add(0.5, 0, 0.5), 0.01, 0.01, 0.01);
				if (!nearbyEntites0.isEmpty()) {
					if (nearbyEntites0.get(0).getCustomName() != null) {
						if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK1")) {
							ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
					        ItemMeta FillingMeta = Filling.getItemMeta();
					        FillingMeta.setDisplayName(" ");
					        Filling.setItemMeta(FillingMeta);
					        
					        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
					        ItemMeta Filling1Meta = Filling1.getItemMeta();
					        Filling1Meta.setDisplayName(" ");
					        Filling1.setItemMeta(FillingMeta);
					        
					        ItemStack upgradeble = Conveyer.conveyer2Info();
					        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
					        List<String> upgradebleLore = upgradebleMeta.getLore();
					        upgradebleLore.add("");
					        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
					        upgradebleMeta.setLore(upgradebleLore);
					        upgradeble.setItemMeta(upgradebleMeta);
					        
					        ItemStack current = Conveyer.conveyer1Info();
					        ItemMeta currentMeta = current.getItemMeta();
					        List<String> currentLore = currentMeta.getLore();
					        currentLore.add("");
					        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
					        currentMeta.setLore(currentLore);
					        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					        current.setItemMeta(currentMeta);
					        
					        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
					        ItemMeta Filling2Meta = Filling2.getItemMeta();
					        Filling2Meta.setDisplayName(" ");
					        Filling2.setItemMeta(Filling2Meta);
					        
							Inventory inv = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Conveyer MK1");
							for (int i = 0; i < inv.getSize(); i++) {
								if (i % 2 == 0) inv.setItem(i, Filling);
								else inv.setItem(i, Filling1);
							}
							inv.setItem(10, current);
							inv.setItem(12, upgradeble);
							inv.setItem(14, Conveyer.conveyer3Info());
							inv.setItem(16, Conveyer.conveyer4Info());
							
							e.getPlayer().openInventory(inv);
						}
						else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK2")) {
							ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
					        ItemMeta FillingMeta = Filling.getItemMeta();
					        FillingMeta.setDisplayName(" ");
					        Filling.setItemMeta(FillingMeta);
					        
					        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
					        ItemMeta Filling1Meta = Filling1.getItemMeta();
					        Filling1Meta.setDisplayName(" ");
					        Filling1.setItemMeta(FillingMeta);
					        
					        ItemStack upgradeble = Conveyer.conveyer3Info();
					        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
					        List<String> upgradebleLore = upgradebleMeta.getLore();
					        upgradebleLore.add("");
					        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
					        upgradebleMeta.setLore(upgradebleLore);
					        upgradeble.setItemMeta(upgradebleMeta);
					        
					        ItemStack current = Conveyer.conveyer2Info();
					        ItemMeta currentMeta = current.getItemMeta();
					        List<String> currentLore = currentMeta.getLore();
					        currentLore.add("");
					        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
					        currentMeta.setLore(currentLore);
					        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					        current.setItemMeta(currentMeta);
					        
					        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
					        ItemMeta Filling2Meta = Filling2.getItemMeta();
					        Filling2Meta.setDisplayName(" ");
					        Filling2.setItemMeta(Filling2Meta);
					        
							Inventory inv = Bukkit.createInventory(null, 27, ChatColor.BLUE + "Conveyer MK2");
							for (int i = 0; i < inv.getSize(); i++) {
								if (i % 2 == 0) inv.setItem(i, Filling);
								else inv.setItem(i, Filling1);
							}
							inv.setItem(10, Conveyer.conveyer1Info());
							inv.setItem(12, current);
							inv.setItem(14, upgradeble);
							inv.setItem(16, Conveyer.conveyer4Info());
							
							e.getPlayer().openInventory(inv);
						}
						else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK3")) {
							ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
					        ItemMeta FillingMeta = Filling.getItemMeta();
					        FillingMeta.setDisplayName(" ");
					        Filling.setItemMeta(FillingMeta);
					        
					        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
					        ItemMeta Filling1Meta = Filling1.getItemMeta();
					        Filling1Meta.setDisplayName(" ");
					        Filling1.setItemMeta(FillingMeta);
					        
					        ItemStack upgradeble = Conveyer.conveyer4Info();
					        ItemMeta upgradebleMeta = upgradeble.getItemMeta();
					        List<String> upgradebleLore = upgradebleMeta.getLore();
					        upgradebleLore.add("");
					        upgradebleLore.add(ChatColor.YELLOW + "Click to upgrade!");
					        upgradebleMeta.setLore(upgradebleLore);
					        upgradeble.setItemMeta(upgradebleMeta);
					        
					        ItemStack current = Conveyer.conveyer3Info();
					        ItemMeta currentMeta = current.getItemMeta();
					        List<String> currentLore = currentMeta.getLore();
					        currentLore.add("");
					        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
					        currentMeta.setLore(currentLore);
					        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					        current.setItemMeta(currentMeta);
					        
					        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
					        ItemMeta Filling2Meta = Filling2.getItemMeta();
					        Filling2Meta.setDisplayName(" ");
					        Filling2.setItemMeta(Filling2Meta);
					        
							Inventory inv = Bukkit.createInventory(null, 27, ChatColor.RED + "Conveyer MK3");
							for (int i = 0; i < inv.getSize(); i++) {
								if (i % 2 == 0) inv.setItem(i, Filling);
								else inv.setItem(i, Filling1);
							}
							inv.setItem(10, Conveyer.conveyer1Info());
							inv.setItem(12, Conveyer.conveyer2Info());
							inv.setItem(14, current);
							inv.setItem(16, upgradeble);
							
							e.getPlayer().openInventory(inv);
						}
						else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK4")) {
							ItemStack Filling = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
					        ItemMeta FillingMeta = Filling.getItemMeta();
					        FillingMeta.setDisplayName(" ");
					        Filling.setItemMeta(FillingMeta);
					        
					        ItemStack Filling1 = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
					        ItemMeta Filling1Meta = Filling1.getItemMeta();
					        Filling1Meta.setDisplayName(" ");
					        Filling1.setItemMeta(FillingMeta);
					        
					        ItemStack current = Conveyer.conveyer4Info();
					        ItemMeta currentMeta = current.getItemMeta();
					        List<String> currentLore = currentMeta.getLore();
					        currentLore.add("");
					        currentLore.add(ChatColor.YELLOW + "Current machine mark.");
					        currentMeta.setLore(currentLore);
					        currentMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					        currentMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					        current.setItemMeta(currentMeta);
					        
					        ItemStack Filling2 = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
					        ItemMeta Filling2Meta = Filling2.getItemMeta();
					        Filling2Meta.setDisplayName(" ");
					        Filling2.setItemMeta(Filling2Meta);
					        
							Inventory inv = Bukkit.createInventory(null, 27, ChatColor.DARK_PURPLE + "Conveyer MK4");
							for (int i = 0; i < inv.getSize(); i++) {
								if (i % 2 == 0) inv.setItem(i, Filling);
								else inv.setItem(i, Filling1);
							}
							inv.setItem(10, Conveyer.conveyer1Info());
							inv.setItem(12, Conveyer.conveyer2Info());
							inv.setItem(14, Conveyer.conveyer3Info());
							inv.setItem(16, current);
							
							e.getPlayer().openInventory(inv);
						}
					}
				}
			}
		}
	}
}
