package me.goodgamer123.EngineersTycoon.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Nameable;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;

public class OnBlockInteraction implements Listener {

	@EventHandler
	private void PlayerInteractEvent(PlayerInteractEvent e) {
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
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
					inv.setItem(12, ItemExtractor.itemExtractor2Info());
					inv.setItem(14, ItemExtractor.itemExtractor3Info());
					inv.setItem(16, current);
					
					e.getPlayer().openInventory(inv);
				}
			}
		}
	}
}
