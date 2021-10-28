package me.goodgamer123.EngineersTycoon.Events;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Nameable;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.goodgamer123.EngineersTycoon.Machines.Conveyer;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;
import me.goodgamer123.EngineersTycoon.Machines.Miner;

public class MachineRemove implements Listener {

	@EventHandler
	private void onBlockBreak(BlockBreakEvent e) {
		if (e.getBlock().getType().equals(Material.DISPENSER) && (((Nameable) e.getBlock().getState()).getCustomName() != null)) {
			if (((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor1().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor1());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor2().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				e.setDropItems(false);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor2());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor3().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor3());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(ItemExtractor.itemExtractor4().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.02, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ItemExtractor.itemExtractor4());
			}
		}
		
		
		
		else if (e.getBlock().getType().equals(Material.BEACON) && (((Nameable) e.getBlock().getState()).getCustomName() != null)) {
			if (((Nameable) e.getBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder1().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.15, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				
				Location max = e.getBlock().getLocation().add(2, -1, 2);
		        Location min = e.getBlock().getLocation().add(-3, -13, -3);
				
				for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
		            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
		                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
		                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
		                    if (block.getType().equals(Material.COAL_ORE) || block.getType().equals(Material.IRON_ORE) || block.getType().equals(Material.GOLD_ORE) || block.getType().equals(Material.DIAMOND_ORE) || block.getType().equals(Material.EMERALD_ORE) || block.getType().equals(Material.BEDROCK))
		                    block.setType(Material.AIR);
		                }
		            }
		        }
				
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), MineBuilder.mineBuilder1());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder2().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.15, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				
				Location max = e.getBlock().getLocation().add(2, -1, 2);
		        Location min = e.getBlock().getLocation().add(-3, -13, -3);
				
				for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
		            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
		                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
		                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
		                    if (block.getType().equals(Material.COAL_ORE) || block.getType().equals(Material.IRON_ORE) || block.getType().equals(Material.GOLD_ORE) || block.getType().equals(Material.DIAMOND_ORE) || block.getType().equals(Material.EMERALD_ORE) || block.getType().equals(Material.BEDROCK))
		                    block.setType(Material.AIR);
		                }
		            }
		        }
				
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), MineBuilder.mineBuilder2());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder3().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.15, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				
				Location max = e.getBlock().getLocation().add(2, -1, 2);
		        Location min = e.getBlock().getLocation().add(-3, -13, -3);
				
				for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
		            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
		                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
		                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
		                    if (block.getType().equals(Material.COAL_ORE) || block.getType().equals(Material.IRON_ORE) || block.getType().equals(Material.GOLD_ORE) || block.getType().equals(Material.DIAMOND_ORE) || block.getType().equals(Material.EMERALD_ORE) || block.getType().equals(Material.BEDROCK))
		                    block.setType(Material.AIR);
		                }
		            }
		        }
				
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), MineBuilder.mineBuilder3());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(MineBuilder.mineBuilder4().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.15, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				
				Location max = e.getBlock().getLocation().add(2, -1, 2);
		        Location min = e.getBlock().getLocation().add(-3, -13, -3);
				
				for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
		            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
		                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
		                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
		                    if (block.getType().equals(Material.COAL_ORE) || block.getType().equals(Material.IRON_ORE) || block.getType().equals(Material.GOLD_ORE) || block.getType().equals(Material.DIAMOND_ORE) || block.getType().equals(Material.EMERALD_ORE) || block.getType().equals(Material.BEDROCK))
		                    block.setType(Material.AIR);
		                }
		            }
		        }
				
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), MineBuilder.mineBuilder4());
			}
			
			
			
		} else if (e.getBlock().getType().equals(Material.DROPPER) && (((Nameable) e.getBlock().getState()).getCustomName() != null)) {
			if (((Nameable) e.getBlock().getState()).getCustomName().equals(Miner.miner1().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.5, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				nearbyEntites.get(1).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Miner.miner1());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(Miner.miner2().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.5, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				nearbyEntites.get(1).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Miner.miner2());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(Miner.miner3().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.5, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				nearbyEntites.get(1).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Miner.miner3());
			}
			else if (((Nameable) e.getBlock().getState()).getCustomName().equals(Miner.miner4().getItemMeta().getDisplayName())) {
				e.setDropItems(false);
				List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, -0.5, 0.5), 0.01, 0.01, 0.01);
				nearbyEntites.get(0).remove();
				nearbyEntites.get(1).remove();
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Miner.miner4());
			}
			
			
			
		} else if (e.getBlock().getType().equals(Material.POLISHED_BLACKSTONE_SLAB)) {
			List<Entity> nearbyEntites0 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.6, 0.05, 0.4), 0.01, 0.01, 0.01);
				if (!nearbyEntites0.isEmpty()) {
					if (nearbyEntites0.get(0).getCustomName() != null) {
						if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK1")) {
							List<Entity> nearbyEntites1 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.29, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites2 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.29), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites3 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.71, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites4 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.71), 0.1, 0.1, 0.1);
							if (!nearbyEntites1.isEmpty()) nearbyEntites1.get(0).remove();
							else if (!nearbyEntites2.isEmpty()) nearbyEntites2.get(0).remove();
							else if (!nearbyEntites3.isEmpty()) nearbyEntites3.get(0).remove();
							else if (!nearbyEntites4.isEmpty()) nearbyEntites4.get(0).remove();
							
							List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.6, 0.05, 0.4), 0.01, 0.01, 0.01);
							nearbyEntites.get(0).remove();
							
							e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Conveyer.conveyer1());
						} else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK2")) {
							List<Entity> nearbyEntites1 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.29, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites2 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.29), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites3 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.71, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites4 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.71), 0.1, 0.1, 0.1);
							if (!nearbyEntites1.isEmpty()) nearbyEntites1.get(0).remove();
							else if (!nearbyEntites2.isEmpty()) nearbyEntites2.get(0).remove();
							else if (!nearbyEntites3.isEmpty()) nearbyEntites3.get(0).remove();
							else if (!nearbyEntites4.isEmpty()) nearbyEntites4.get(0).remove();
							
							List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.6, 0.05, 0.4), 0.01, 0.01, 0.01);
							nearbyEntites.get(0).remove();
							
							e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Conveyer.conveyer2());
						} else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK3")) {
							List<Entity> nearbyEntites1 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.29, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites2 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.29), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites3 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.71, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites4 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.71), 0.1, 0.1, 0.1);
							if (!nearbyEntites1.isEmpty()) nearbyEntites1.get(0).remove();
							else if (!nearbyEntites2.isEmpty()) nearbyEntites2.get(0).remove();
							else if (!nearbyEntites3.isEmpty()) nearbyEntites3.get(0).remove();
							else if (!nearbyEntites4.isEmpty()) nearbyEntites4.get(0).remove();
							
							List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.6, 0.05, 0.4), 0.01, 0.01, 0.01);
							nearbyEntites.get(0).remove();
							
							e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Conveyer.conveyer3());
						} else if (nearbyEntites0.get(0).getCustomName().equals("ConveyerMK4")) {
							List<Entity> nearbyEntites1 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.29, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites2 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.29), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites3 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.71, 0.1, 0.5), 0.1, 0.1, 0.1);
							List<Entity> nearbyEntites4 = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.5, 0.1, 0.71), 0.1, 0.1, 0.1);
							if (!nearbyEntites1.isEmpty()) nearbyEntites1.get(0).remove();
							else if (!nearbyEntites2.isEmpty()) nearbyEntites2.get(0).remove();
							else if (!nearbyEntites3.isEmpty()) nearbyEntites3.get(0).remove();
							else if (!nearbyEntites4.isEmpty()) nearbyEntites4.get(0).remove();
							
							List<Entity> nearbyEntites = (List<Entity>) e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation().add(0.6, 0.05, 0.4), 0.01, 0.01, 0.01);
							nearbyEntites.get(0).remove();
							
							e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), Conveyer.conveyer4());
						}
					}
				}
		}
	}
	
}
