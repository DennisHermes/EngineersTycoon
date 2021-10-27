package me.goodgamer123.EngineersTycoon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import me.goodgamer123.EngineersTycoon.Events.InventoryClickEvents;
import me.goodgamer123.EngineersTycoon.Events.MachinePlace;
import me.goodgamer123.EngineersTycoon.Events.MachineRemove;
import me.goodgamer123.EngineersTycoon.Events.OnMachineInteraction;
import me.goodgamer123.EngineersTycoon.Machines.ItemExtractor;
import me.goodgamer123.EngineersTycoon.Machines.MineBuilder;
import me.goodgamer123.EngineersTycoon.Machines.Miner;

public final class MainClass extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new MachinePlace(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MachineRemove(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickEvents(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OnMachineInteraction(), this);
		
		getCommand("machinelist").setExecutor(this);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				WorkingHandler.Handler();
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
			Inventory inv = Bukkit.createInventory(null, 27, ChatColor.AQUA + "§lMachines");
			inv.setItem(0, ItemExtractor.itemExtractor1());
			inv.setItem(1, ItemExtractor.itemExtractor2());
			inv.setItem(2, ItemExtractor.itemExtractor3());
			inv.setItem(3, ItemExtractor.itemExtractor4());
			inv.setItem(9, MineBuilder.mineBuilder1());
			inv.setItem(10, MineBuilder.mineBuilder2());
			inv.setItem(11, MineBuilder.mineBuilder3());
			inv.setItem(12, MineBuilder.mineBuilder4());
			inv.setItem(18, Miner.miner1());
			inv.setItem(19, Miner.miner2());
			inv.setItem(20, Miner.miner3());
			inv.setItem(21, Miner.miner4());
			
			p.openInventory(inv);
		}
		
		return false; 
	}
}
