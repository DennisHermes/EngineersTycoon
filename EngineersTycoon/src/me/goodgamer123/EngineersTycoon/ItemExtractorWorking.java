package me.goodgamer123.EngineersTycoon;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Container;
import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;

public class ItemExtractorWorking {
	
	public static void ExtractorWorking(ArmorStand as) {
		
		Block block = as.getLocation().add(-0.5, 0, -0.5).getBlock();
		
		@SuppressWarnings("deprecation")
		BlockFace targetFace = ((org.bukkit.material.Dispenser) block.getState().getData()).getFacing();
		
		if (targetFace.equals(BlockFace.DOWN)) {
			if ((block.getLocation().add(0, -1, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 1, 0).getBlock().getState() instanceof Container)) {
				for(int i = 0; i < ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(0, 1, -0).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.UP)) {
			if ((block.getLocation().add(0, -1, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 1, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(0, -1, -0).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.NORTH)) {
			if ((block.getLocation().add(0, 0, -1).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 0, 1).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.SOUTH)) {
			if ((block.getLocation().add(0, 0, -1).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 0, 1).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.EAST)) {
			if ((block.getLocation().add(1, 0, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(-1, 0, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.WEST)) {
			if ((block.getLocation().add(1, 0, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(-1, 0, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().addItem(item);
						item.setAmount(newAmount);
						((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().setItem(i, item);
						return;
					}
		        }
			}
		}
	}
	
}
