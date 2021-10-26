package me.goodgamer123.EngineersTycoon.Events;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;

public class MachinePlace implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	private void onBlockPlace(BlockPlaceEvent e) {
		
		ItemStack item = e.getItemInHand();
		item.setAmount(1);
		
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
	        
	        as.setHelmet(lchest);
		}
		
		if (item.equals(ItemExtractor.itemExtractor2())) {
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
	        
	        as.setHelmet(lchest);
		}
		
		if (item.equals(ItemExtractor.itemExtractor3())) {
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
	        
	        as.setHelmet(lchest);
		}
		
		if (item.equals(ItemExtractor.itemExtractor4())) {
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
	        
	        as.setHelmet(lchest);
		}
		
	}
	
}
