package me.goodgamer123.EngineersTycoon.Events;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.Nameable;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;

public class MachineRemove implements Listener {

	@EventHandler
	private void onBlockBreak(BlockBreakEvent e) {
		if (e.getBlock().getType().equals(Material.DISPENSER) && ((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor1().getItemMeta().getDisplayName())) {
			List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
			nearbyEntites.get(0).remove();
			e.setDropItems(false);
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor1());
		}
		
		if (e.getBlock().getType().equals(Material.DISPENSER) && ((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor2().getItemMeta().getDisplayName())) {
			List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
			nearbyEntites.get(0).remove();
			e.setDropItems(false);
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor2());
		}
		
		if (e.getBlock().getType().equals(Material.DISPENSER) && ((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor3().getItemMeta().getDisplayName())) {
			List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
			nearbyEntites.get(0).remove();
			e.setDropItems(false);
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor3());
		}
		
		if (e.getBlock().getType().equals(Material.DISPENSER) && ((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor4().getItemMeta().getDisplayName())) {
			List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
			nearbyEntites.get(0).remove();
			e.setDropItems(false);
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor4());
		}
	}
	
}
