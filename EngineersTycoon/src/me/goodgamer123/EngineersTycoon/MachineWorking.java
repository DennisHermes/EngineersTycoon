package me.goodgamer123.EngineersTycoon;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Container;
import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;

public class MachineWorking {
	
	public static void ExtractorWorking(ArmorStand as) {
		
		Block block = as.getLocation().add(-0.5, 0, -0.5).getBlock();
		
		@SuppressWarnings("deprecation")
		BlockFace targetFace = ((org.bukkit.material.Dispenser) block.getState().getData()).getFacing();
		
		if (targetFace.equals(BlockFace.DOWN)) {
			if ((block.getLocation().add(0, -1, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 1, 0).getBlock().getState() instanceof Container)) {
				for(int i = 0; i < ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(0, 1, -0).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.UP)) {
			if ((block.getLocation().add(0, -1, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 1, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, -1, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 1, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(0, -1, -0).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.NORTH)) {
			if ((block.getLocation().add(0, 0, -1).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 0, 1).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.SOUTH)) {
			if ((block.getLocation().add(0, 0, -1).getBlock().getState() instanceof Container) && (block.getLocation().add(0, 0, 1).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(0, 0, 1).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(0, 0, -1).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.EAST)) {
			if ((block.getLocation().add(1, 0, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(-1, 0, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		} else if (targetFace.equals(BlockFace.WEST)) {
			if ((block.getLocation().add(1, 0, 0).getBlock().getState() instanceof Container) && (block.getLocation().add(-1, 0, 0).getBlock().getState() instanceof Container)) {
				for (int i = 0; i < ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getSize(); i++) {
					ItemStack item = ((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().getItem(i);
					if (item != null) {
						int count = 0;
						for (ItemStack is : ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) count = count + is.getAmount();
				        }
						int newAmount = item.getAmount() - 1;
						item.setAmount(1);
						((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().addItem(item);
						int newCount = 0;
						for (ItemStack is : ((Container) block.getLocation().add(-1, 0, 0).getBlock().getState()).getInventory().getContents()) {
							if (is != null) newCount = newCount + is.getAmount();
				        }
						if (count != newCount) {
							item.setAmount(newAmount);
							((Container) block.getLocation().add(1, 0, 0).getBlock().getState()).getInventory().setItem(i, item);
						}
						return;
					}
		        }
			}
		}
	}
	
	public static void MineGeneratorWorking(ArmorStand as, int tier) {
		
		Block locBlock = as.getLocation().add(-0.5, 0.15, -0.5).getBlock();
		
		Location max = locBlock.getLocation().add(1, -2, 1);
		Location min = locBlock.getLocation().add(-2, -12, -2);
        
		if (tier == 1) {
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = locBlock.getWorld().getBlockAt(x, y, z);
	                    if (new Random().nextInt(2) == 0) block.setType(Material.COAL_ORE); else block.setType(Material.IRON_ORE);
	                }
	            }
	        }
		} else if (tier == 2) {
			for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = locBlock.getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(3);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
		} else if (tier == 3) {
			for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = locBlock.getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(4);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else if (random == 2) block.setType(Material.DIAMOND_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
		} else if (tier == 4) {
			for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = locBlock.getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(5);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else if (random == 2) block.setType(Material.DIAMOND_ORE); else if (random == 3) block.setType(Material.EMERALD_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
		}
	}
	
	public static void MinerWorking(ArmorStand as) {
		
		Block locBlock = as.getLocation().add(-0.5, 0.5, -0.5).getBlock();
		
		Location max = locBlock.getLocation().add(1, -1, 1);
		Location min = locBlock.getLocation().add(-2, -11, -2);
        

		for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
			for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
				for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
                	Block block = locBlock.getWorld().getBlockAt(x, y, z);
                    if (block.getType() == Material.COAL_ORE) {
                    	block.setType(Material.AIR);
                    	((Container) locBlock.getState()).getInventory().addItem(new ItemStack(Material.COAL_ORE));
                    	return;
                    } else if (block.getType() == Material.IRON_ORE) {
                    	block.setType(Material.AIR);
                    	((Container) locBlock.getState()).getInventory().addItem(new ItemStack(Material.IRON_ORE));
                    	return;
                    } else if (block.getType() == Material.GOLD_ORE) {
                    	block.setType(Material.AIR);
                    	((Container) locBlock.getState()).getInventory().addItem(new ItemStack(Material.GOLD_ORE));
                    	return;
                    } else if (block.getType() == Material.DIAMOND_ORE) {
                    	block.setType(Material.AIR);
                    	((Container) locBlock.getState()).getInventory().addItem(new ItemStack(Material.DIAMOND_ORE));
                    	return;
                    } else if (block.getType() == Material.EMERALD_ORE) {
                    	block.setType(Material.AIR);
                    	((Container) locBlock.getState()).getInventory().addItem(new ItemStack(Material.EMERALD_ORE));
                    	return;
                    }
                }
            }
        }
	}
	
}
