package me.goodgamer123.EngineersTycoon.Events;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.Slab.Type;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.EulerAngle;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import me.goodgamer123.EngineersTycoon.Machines.Conveyer;
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
		} else if (item.equals(Miner.miner2())) {
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
		} else if (item.equals(Miner.miner3())) {
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
		} else if (item.equals(Miner.miner4())) {
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
		
//=================================================================================================================================================================//
		
		else if (item.equals(Conveyer.conveyer1())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.6, 0.05, 0.4), ArmorStand.class);
	        
	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomNameVisible(false);
	        as.setCustomName("ConveyerMK1");
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
	        
	        as.setRightArmPose(new EulerAngle(0, 0, Math.PI));
			
			ArmorStand as1 = null;
			if (e.getPlayer().getLocation().getYaw() < 45 && e.getPlayer().getLocation().getYaw() > -45) {
				as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.29, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0.5 * Math.PI, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < 135 && e.getPlayer().getLocation().getYaw() > 45) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.29), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < -135 || e.getPlayer().getLocation().getYaw() > 135) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.71, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 1.5 * Math.PI, Math.PI));
	        } else {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.71), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, Math.PI, Math.PI));
	        }
			
			as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setCustomNameVisible(false);
	        as1.setVisible(false);
	        as1.setMarker(true);
	        as1.setSmall(true);

			ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
	        SkullMeta meta = (SkullMeta) head.getItemMeta();
	        GameProfile profile = new GameProfile(UUID.randomUUID(), "");
	        profile.getProperties().put("textures", new Property("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVmMzU2YWQyYWE3YjE2NzhhZWNiODgyOTBlNWZhNWEzNDI3ZTVlNDU2ZmY0MmZiNTE1NjkwYzY3NTE3YjgifX19"));
	        Field profileField = null;
	        try {
	           profileField = meta.getClass().getDeclaredField("profile");
	           profileField.setAccessible(true);
	           profileField.set(meta, profile);
	        } catch (Exception e1) {
	           e1.printStackTrace();
	        }
	        head.setItemMeta(meta);
	        
	        as1.getEquipment().setHelmet(head);
	        
	        e.getBlock().setType(Material.POLISHED_BLACKSTONE_SLAB);
	        Slab slab = (Slab) e.getBlock().getBlockData();
	        slab.setType(Type.TOP);
	        e.getBlock().setBlockData(slab);
		}
		else if (item.equals(Conveyer.conveyer2())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.6, 0.05, 0.4), ArmorStand.class);
	        
	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
			
			ArmorStand as1 = null;
			if (e.getPlayer().getLocation().getYaw() < 45 && e.getPlayer().getLocation().getYaw() > -45) {
				as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.29, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0.5 * Math.PI, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < 135 && e.getPlayer().getLocation().getYaw() > 45) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.29), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < -135 || e.getPlayer().getLocation().getYaw() > 135) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.71, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 1.5 * Math.PI, Math.PI));
	        } else {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.71), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, Math.PI, Math.PI));
	        }
			
			as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setCustomNameVisible(false);
	        as.setCustomName("ConveyerMK2");
	        as1.setVisible(false);
	        as1.setMarker(true);
	        as1.setSmall(true);

			ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
	        SkullMeta meta = (SkullMeta) head.getItemMeta();
	        GameProfile profile = new GameProfile(UUID.randomUUID(), "");
	        profile.getProperties().put("textures", new Property("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjY3MWM0YzA0MzM3YzM4YTVjN2YzMWE1Yzc1MWY5OTFlOTZjMDNkZjczMGNkYmVlOTkzMjA2NTVjMTlkIn19fQ=="));
	        Field profileField = null;
	        try {
	           profileField = meta.getClass().getDeclaredField("profile");
	           profileField.setAccessible(true);
	           profileField.set(meta, profile);
	        } catch (Exception e1) {
	           e1.printStackTrace();
	        }
	        head.setItemMeta(meta);
	        
	        as1.getEquipment().setHelmet(head);
	        
	        e.getBlock().setType(Material.POLISHED_BLACKSTONE_SLAB);
	        Slab slab = (Slab) e.getBlock().getBlockData();
	        slab.setType(Type.TOP);
	        e.getBlock().setBlockData(slab);
		}
		else if (item.equals(Conveyer.conveyer3())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.6, 0.05, 0.4), ArmorStand.class);
	        
	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
			
			ArmorStand as1 = null;
			if (e.getPlayer().getLocation().getYaw() < 45 && e.getPlayer().getLocation().getYaw() > -45) {
				as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.29, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0.5 * Math.PI, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < 135 && e.getPlayer().getLocation().getYaw() > 45) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.29), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < -135 || e.getPlayer().getLocation().getYaw() > 135) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.71, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 1.5 * Math.PI, Math.PI));
	        } else {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.71), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, Math.PI, Math.PI));
	        }
			
			as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setCustomNameVisible(false);
	        as.setCustomName("ConveyerMK3");
	        as1.setVisible(false);
	        as1.setMarker(true);
	        as1.setSmall(true);

			ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
	        SkullMeta meta = (SkullMeta) head.getItemMeta();
	        GameProfile profile = new GameProfile(UUID.randomUUID(), "");
	        profile.getProperties().put("textures", new Property("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNmZTg4NDVhOGQ1ZTYzNWZiODc3MjhjY2M5Mzg5NWQ0MmI0ZmMyZTZhNTNmMWJhNzhjODQ1MjI1ODIyIn19fQ=="));
	        Field profileField = null;
	        try {
	           profileField = meta.getClass().getDeclaredField("profile");
	           profileField.setAccessible(true);
	           profileField.set(meta, profile);
	        } catch (Exception e1) {
	           e1.printStackTrace();
	        }
	        head.setItemMeta(meta);
	        
	        as1.getEquipment().setHelmet(head);
	        
	        e.getBlock().setType(Material.POLISHED_BLACKSTONE_SLAB);
	        Slab slab = (Slab) e.getBlock().getBlockData();
	        slab.setType(Type.TOP);
	        e.getBlock().setBlockData(slab);
		}
		else if (item.equals(Conveyer.conveyer4())) {
			ArmorStand as = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.6, 0.05, 0.4), ArmorStand.class);
	        
	        as.setGravity(false);
	        as.setCanPickupItems(false);
	        as.setCustomNameVisible(false);
	        as.setVisible(false);
	        as.setMarker(true);
	        as.setSmall(true);
			
			ArmorStand as1 = null;
			if (e.getPlayer().getLocation().getYaw() < 45 && e.getPlayer().getLocation().getYaw() > -45) {
				as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.29, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0.5 * Math.PI, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < 135 && e.getPlayer().getLocation().getYaw() > 45) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.29), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 0, Math.PI));
	        } else if (e.getPlayer().getLocation().getYaw() < -135 || e.getPlayer().getLocation().getYaw() > 135) {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.71, 0.1, 0.5), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, 1.5 * Math.PI, Math.PI));
	        } else {
	        	as1 = (ArmorStand) e.getBlock().getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.1, 0.71), ArmorStand.class);
	        	as1.setHeadPose(new EulerAngle(0.5 * Math.PI, Math.PI, Math.PI));
	        }
			
			as1.setGravity(false);
	        as1.setCanPickupItems(false);
	        as1.setCustomNameVisible(false);
	        as.setCustomName("ConveyerMK4");
	        as1.setVisible(false);
	        as1.setMarker(true);
	        as1.setSmall(true);

			ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
	        SkullMeta meta = (SkullMeta) head.getItemMeta();
	        GameProfile profile = new GameProfile(UUID.randomUUID(), "");
	        profile.getProperties().put("textures", new Property("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODA3OGUxNjg5MmEyYzljMDIzMDUyMTNjY2U2MDQ4M2FiN2FkYTQ3ZjEzYWY5YjhkYTg3Y2U2M2RkODM0NyJ9fX0="));
	        Field profileField = null;
	        try {
	           profileField = meta.getClass().getDeclaredField("profile");
	           profileField.setAccessible(true);
	           profileField.set(meta, profile);
	        } catch (Exception e1) {
	           e1.printStackTrace();
	        }
	        head.setItemMeta(meta);
	        
	        as1.getEquipment().setHelmet(head);
	        
	        e.getBlock().setType(Material.POLISHED_BLACKSTONE_SLAB);
	        Slab slab = (Slab) e.getBlock().getBlockData();
	        slab.setType(Type.TOP);
	        e.getBlock().setBlockData(slab);
		}
	}
	
}
