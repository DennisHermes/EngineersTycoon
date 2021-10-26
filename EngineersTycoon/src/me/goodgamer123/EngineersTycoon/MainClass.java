package me.goodgamer123.EngineersTycoon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import me.goodgamer123.EngineersTycoon.Events.InventoryClickEvents;
import me.goodgamer123.EngineersTycoon.Events.MachinePlace;
import me.goodgamer123.EngineersTycoon.Events.MachineRemove;
import me.goodgamer123.EngineersTycoon.Events.OnBlockInteraction;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;

public final class MainClass extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new MachinePlace(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MachineRemove(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickEvents(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OnBlockInteraction(), this);
		
		getCommand("machinelist").setExecutor(this);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK1")) ItemExtractorWorking.ExtractorWorking(as);
					}
				}
			}
		}, 120L, 120L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK2")) ItemExtractorWorking.ExtractorWorking(as);
					}
				}
			}
		}, 80L, 80L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK3")) ItemExtractorWorking.ExtractorWorking(as);
					}
				}
			}
		}, 40L, 40L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK4")) ItemExtractorWorking.ExtractorWorking(as);
					}
				}
			}
		}, 20L, 20L);
	}
  
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You need to be a player to do this!");
			return false;
		} 
		
		Player p = (Player)sender;
	    
		if (cmd.getName().equalsIgnoreCase("machinelist")) {
			Inventory inv = Bukkit.createInventory(null, 9, ChatColor.AQUA + "§lMachines");
			inv.setItem(0, ItemExtractor.itemExtractor1());
			inv.setItem(1, ItemExtractor.itemExtractor2());
			inv.setItem(2, ItemExtractor.itemExtractor3());
			inv.setItem(3, ItemExtractor.itemExtractor4());
			
			p.openInventory(inv);
		}
		
		return false; 
	}
}
