package me.goodgamer123.EngineersTycoon.Events;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.util.EulerAngle;

import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;
import me.goodgamer123.EngineersTycoon.Machines.Miner;

public class MachinePlace implements Listener {

	@EventHandler
	private void onBlockPlace(BlockPlaceEvent e) {
		
		ItemStack item = e.getItemInHand();
		item.setAmount(1);
		
//=================================================================================================================================================================//
		
		if (item.equals(ItemExtractor.itemExtractor1())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.02, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("ItemExtractorMK1");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        ItemStack lchest = new ItemStack(Material.LEATHER_HELMET, 1);
	        LeatherArmorMeta lch = (LeatherArmorMeta)lchest.getItemMeta();
	        lch.setColor(Color.fromRGB(0, 255, 0));
	        lchest.setItemMeta(lch);
	        
	        as.getEquipment().setHelmet(lchest);
		}
		
		else if (item.equals(ItemExtractor.itemExtractor2())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.02, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("ItemExtractorMK2");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        ItemStack lchest = new ItemStack(Material.LEATHER_HELMET, 1);
	        LeatherArmorMeta lch = (LeatherArmorMeta)lchest.getItemMeta();
	        lch.setColor(Color.fromRGB(0, 0, 255));
	        lchest.setItemMeta(lch);
	        
	        as.getEquipment().setHelmet(lchest);
		}
		
		else if (item.equals(ItemExtractor.itemExtractor3())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.02, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("ItemExtractorMK3");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        ItemStack lchest = new ItemStack(Material.LEATHER_HELMET, 1);
	        LeatherArmorMeta lch = (LeatherArmorMeta)lchest.getItemMeta();
	        lch.setColor(Color.fromRGB(255, 0, 0));
	        lchest.setItemMeta(lch);
	        
	        as.getEquipment().setHelmet(lchest);
		}
		
		else if (item.equals(ItemExtractor.itemExtractor4())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.02, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("ItemExtractorMK4");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        ItemStack lchest = new ItemStack(Material.LEATHER_HELMET, 1);
	        LeatherArmorMeta lch = (LeatherArmorMeta)lchest.getItemMeta();
	        lch.setColor(Color.fromRGB(255, 0, 255));
	        lchest.setItemMeta(lch);
	        
	        as.getEquipment().setHelmet(lchest);
		}
		
//=================================================================================================================================================================//
		
		else if (item.equals(MineBuilder.mineBuilder1())) {
			Location max = e.getBlock().getLocation().add(2, -1, 2);
	        Location min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    if (!block.getType().equals(Material.AIR)) {
	                    	e.setCancelled(true);
	                    	e.getPlayer().sendMessage(ChatColor.RED + "You need to clear a 5x13x5 area under the mine generator.");
	                    	return;
	                    }
	                }
	            }
	        }
			
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.15, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MineBuilderMK1");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.LIME_CONCRETE));
	        
	        max = e.getBlock().getLocation().add(2, -2, 2);
	        min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    block.setType(Material.BEDROCK);
	                }
	            }
	        }
	        
	        max = e.getBlock().getLocation().add(1, -2, 1);
	        min = e.getBlock().getLocation().add(-2, -12, -2);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    if (new Random().nextInt(2) == 0) block.setType(Material.COAL_ORE); else block.setType(Material.IRON_ORE);
	                }
	            }
	        }
		}
		
		else if (item.equals(MineBuilder.mineBuilder2())) {
			Location max = e.getBlock().getLocation().add(2, -1, 2);
	        Location min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    if (!block.getType().equals(Material.AIR)) {
	                    	e.setCancelled(true);
	                    	e.getPlayer().sendMessage(ChatColor.RED + "You need to clear a 5x13x5 area under the mine generator.");
	                    	return;
	                    }
	                }
	            }
	        }
			
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.15, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MineBuilderMK2");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.LIGHT_BLUE_CONCRETE));
	        
	        max = e.getBlock().getLocation().add(2, -2, 2);
	        min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    block.setType(Material.BEDROCK);
	                }
	            }
	        }
	        
	        max = e.getBlock().getLocation().add(1, -2, 1);
	        min = e.getBlock().getLocation().add(-2, -12, -2);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(3);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
		}
		
		else if (item.equals(MineBuilder.mineBuilder3())) {
			Location max = e.getBlock().getLocation().add(2, -1, 2);
	        Location min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    if (!block.getType().equals(Material.AIR)) {
	                    	e.setCancelled(true);
	                    	e.getPlayer().sendMessage(ChatColor.RED + "You need to clear a 5x13x5 area under the mine generator.");
	                    	return;
	                    }
	                }
	            }
	        }
			
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.15, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MineBuilderMK3");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.RED_CONCRETE));

	        max = e.getBlock().getLocation().add(2, -2, 2);
	        min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    block.setType(Material.BEDROCK);
	                }
	            }
	        }
	        
	        max = e.getBlock().getLocation().add(1, -2, 1);
	        min = e.getBlock().getLocation().add(-2, -12, -2);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(4);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else if (random == 2) block.setType(Material.DIAMOND_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
		}
		
		else if (item.equals(MineBuilder.mineBuilder4())) {
			Location max = e.getBlock().getLocation().add(2, -1, 2);
	        Location min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    if (!block.getType().equals(Material.AIR)) {
	                    	e.setCancelled(true);
	                    	e.getPlayer().sendMessage(ChatColor.RED + "You need to clear a 5x13x5 area under the mine generator.");
	                    	return;
	                    }
	                }
	            }
	        }
			
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.15, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MineBuilderMK4");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.PURPLE_CONCRETE));

	        max = e.getBlock().getLocation().add(2, -2, 2);
	        min = e.getBlock().getLocation().add(-3, -13, -3);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    block.setType(Material.BEDROCK);
	                }
	            }
	        }
	        
	        max = e.getBlock().getLocation().add(1, -2, 1);
	        min = e.getBlock().getLocation().add(-2, -12, -2);
	        
	        for(int x = (int) Math.ceil(max.getBlockX()); x > (int) Math.floor(min.getBlockX()); x--) {
	            for(int y = (int) Math.ceil(max.getBlockY()); y > (int) Math.floor(min.getBlockY()); y--) {
	                for(int z = (int) Math.ceil(max.getBlockZ()); z > (int) Math.floor(min.getBlockZ()); z--) {
	                    Block block = e.getBlock().getWorld().getBlockAt(x, y, z);
	                    int random = new Random().nextInt(5);
	                    if (random == 0) block.setType(Material.COAL_ORE); else if (random == 1) block.setType(Material.IRON_ORE); else if (random == 2) block.setType(Material.DIAMOND_ORE); else if (random == 3) block.setType(Material.EMERALD_ORE); else block.setType(Material.GOLD_ORE);
	                }
	            }
	        }
	        
//=================================================================================================================================================================//
	        
		} else if (item.equals(Miner.miner1())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);
			ArmorStand as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MinerMK1");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        
	        as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setVisible(false);
	        as1.setMarker(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.GREEN_STAINED_GLASS));
	        as1.getEquipment().setHelmet(new ItemStack(Material.GREEN_STAINED_GLASS));
	        
	        as.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, 0));
	        as1.setHeadPose(new EulerAngle(-0.5 * Math.PI, 0, 0));
		}  else if (item.equals(Miner.miner2())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);
			ArmorStand as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MinerMK2");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        
	        as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setVisible(false);
	        as1.setMarker(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.BLUE_STAINED_GLASS));
	        as1.getEquipment().setHelmet(new ItemStack(Material.BLUE_STAINED_GLASS));
	        
	        as.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, 0));
	        as1.setHeadPose(new EulerAngle(-0.5 * Math.PI, 0, 0));
		}  else if (item.equals(Miner.miner3())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);
			ArmorStand as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MinerMK3");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        
	        as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setVisible(false);
	        as1.setMarker(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.RED_STAINED_GLASS));
	        as1.getEquipment().setHelmet(new ItemStack(Material.RED_STAINED_GLASS));
	        
	        as.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, 0));
	        as1.setHeadPose(new EulerAngle(-0.5 * Math.PI, 0, 0));
		}  else if (item.equals(Miner.miner4())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);
			ArmorStand as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, -0.5, 0.5), ArmorStand.class);

	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomName("MinerMK4");
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        
	        as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setVisible(false);
	        as1.setMarker(true);
	        
	        as.getEquipment().setHelmet(new ItemStack(Material.PURPLE_STAINED_GLASS));
	        as1.getEquipment().setHelmet(new ItemStack(Material.PURPLE_STAINED_GLASS));
	        
	        as.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, 0));
	        as1.setHeadPose(new EulerAngle(-0.5 * Math.PI, 0, 0));
		}
	}
	
}
