package me.goodgamer123.EngineersTycoon.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;

public class InventoryClickEvents implements Listener {

	@EventHandler
	private void onInventoryClick(InventoryClickEvent e) {
		if (e.getView().getTitle().equals(ChatColor.AQUA + "§lMachines")) {
			if (e.getSlot() > e.getView().getTopInventory().getSize()) return;
			if (e.getCurrentItem() == null) return;
			
			Player p = (Player) e.getWhoClicked();
			
			if (e.getCurrentItem().equals(ItemExtractor.itemExtractor1())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(ItemExtractor.itemExtractor1());
			} else if (e.getCurrentItem().equals(ItemExtractor.itemExtractor2())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(ItemExtractor.itemExtractor2());
			} else if (e.getCurrentItem().equals(ItemExtractor.itemExtractor3())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(ItemExtractor.itemExtractor3());
			} else if (e.getCurrentItem().equals(ItemExtractor.itemExtractor4())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(ItemExtractor.itemExtractor4());
			}
			
			if (e.getCurrentItem().equals(MineBuilder.mineBuilder1())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(MineBuilder.mineBuilder1());
			} else if (e.getCurrentItem().equals(MineBuilder.mineBuilder2())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(MineBuilder.mineBuilder2());
			} else if (e.getCurrentItem().equals(MineBuilder.mineBuilder3())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(MineBuilder.mineBuilder3());
			} else if (e.getCurrentItem().equals(MineBuilder.mineBuilder4())) {
				e.setCancelled(true);
				p.updateInventory();
				p.getInventory().addItem(MineBuilder.mineBuilder4());
			}
		}
	}
}
	
