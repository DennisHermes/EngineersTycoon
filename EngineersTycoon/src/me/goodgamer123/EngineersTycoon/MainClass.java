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
import me.goodgamer123.EngineersTycoon.Events.OnMachineInteraction;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;

public final class MainClass extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new MachinePlace(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MachineRemove(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickEvents(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OnMachineInteraction(), this);
		
		getCommand("machinelist").setExecutor(this);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("MineBuilderMK1")) MachineWorking.MineGeneratorWorking(as, 1);
					}
				}
			}
		}, 20L * 60 * 9, 20L * 60 * 9);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("MineBuilderMK2")) MachineWorking.MineGeneratorWorking(as, 2);
					}
				}
			}
		}, 20L * 60 * 6, 20L * 60 * 6);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("MineBuilderMK3")) MachineWorking.MineGeneratorWorking(as, 3);
					}
				}
			}
		}, 20L * 60 * 3, 20L * 60 * 3);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("MineBuilderMK4")) MachineWorking.MineGeneratorWorking(as, 4);
					}
				}
			}
		}, 20L * 90, 20L * 90);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK1")) MachineWorking.ExtractorWorking(as);
					}
				}
			}
		}, 120L, 120L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK2")) MachineWorking.ExtractorWorking(as);
					}
				}
			}
		}, 80L, 80L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK3")) MachineWorking.ExtractorWorking(as);
					}
				}
			}
		}, 40L, 40L);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (World world : Bukkit.getWorlds()) {
					for (ArmorStand as : world.getEntitiesByClass(ArmorStand.class)) {
						if (as.getCustomName().equals("ItemExtractorMK4")) MachineWorking.ExtractorWorking(as);
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
			Inventory inv = Bukkit.createInventory(null, 18, ChatColor.AQUA + "§lMachines");
			inv.setItem(0, ItemExtractor.itemExtractor1());
			inv.setItem(1, ItemExtractor.itemExtractor2());
			inv.setItem(2, ItemExtractor.itemExtractor3());
			inv.setItem(3, ItemExtractor.itemExtractor4());
			inv.setItem(9, MineBuilder.mineBuilder1());
			inv.setItem(10, MineBuilder.mineBuilder2());
			inv.setItem(11, MineBuilder.mineBuilder3());
			inv.setItem(12, MineBuilder.mineBuilder4());
			
			p.openInventory(inv);
		}
		
		return false; 
	}
}
