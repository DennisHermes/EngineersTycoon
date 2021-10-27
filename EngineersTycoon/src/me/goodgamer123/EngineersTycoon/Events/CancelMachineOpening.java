package me.goodgamer123.EngineersTycoon.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

import me.goodgamer123.EngineersTycoon.Machines.Conveyer;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;
import me.goodgamer123.EngineersTycoon.Machines.Miner;

public class CancelMachineOpening implements Listener {

	@EventHandler
	private void PlayerInteractEvent(InventoryOpenEvent e) {
		Player p = (Player) e.getPlayer();
		if (p.isSneaking()) {
			if (e.getView().getTitle().equals(ItemExtractor.itemExtractor1().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(ItemExtractor.itemExtractor2().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(ItemExtractor.itemExtractor3().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(ItemExtractor.itemExtractor4().getItemMeta().getDisplayName())) e.setCancelled(true);
			
			else if (e.getView().getTitle().equals(Conveyer.conveyer1().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Conveyer.conveyer2().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Conveyer.conveyer3().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Conveyer.conveyer4().getItemMeta().getDisplayName())) e.setCancelled(true);
			
			else if (e.getView().getTitle().equals(Miner.miner1().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Miner.miner2().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Miner.miner3().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(Miner.miner4().getItemMeta().getDisplayName())) e.setCancelled(true);
			
			else if (e.getView().getTitle().equals(MineBuilder.mineBuilder1().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(MineBuilder.mineBuilder2().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(MineBuilder.mineBuilder3().getItemMeta().getDisplayName())) e.setCancelled(true);
			else if (e.getView().getTitle().equals(MineBuilder.mineBuilder4().getItemMeta().getDisplayName())) e.setCancelled(true);
		}
	}
}
