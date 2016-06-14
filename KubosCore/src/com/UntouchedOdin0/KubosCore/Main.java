package com.UntouchedOdin0.KubosCore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().reload();
		Bukkit.getServer().reloadWhitelist();
	}
	
	public void onDisable() {
		
	}
}
