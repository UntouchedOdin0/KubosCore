package com.UntouchedOdin0.KubosCore.hooks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;
import be.maximvdw.placeholderapi.PlaceholderReplacer;

public class MVdWPlaceholderAPI extends JavaPlugin implements Listener {

	//Broken due to 1.9 Error, Needs too be fixed!
	
	@Override
	public void onEnable() {
		super.onEnable();

		// Register listener
		Bukkit.getPluginManager().registerEvents(this, this);

		// Check if the MVdWPlaceholderAPI plugin is present
		if (Bukkit.getPluginManager().isPluginEnabled("MVdWPlaceholderAPI")) {
			// The plugin is enabled
			// PlaceholderAPI.registerPlaceholder(this, "servermanger_staff",
					new PlaceholderReplacer() {

						@Override
						public String onPlaceholderReplace(
								PlaceholderReplaceEvent event) {
							// Check if the placeholder is requested while
							// the player is online.
							boolean online = event.isOnline();
							// The player if he is online
							// NULL: If the player is not online
							Player player = event.getPlayer();
							// The offline player if he is not online
							// NULL: If the placeholder is requested without
							// a player (like the console) DO CHECKS YOURSELF
							OfflinePlayer offlinePlayer = event.getPlayer();
							// The placeholder that is requested to be replaced
							// (more about this in a later API example)
							String placeholder = event.getPlaceholder();

							if (offlinePlayer == null) {
								return "Player needed!";
							}
							// Return a colored player name
							return ChatColor.YELLOW + offlinePlayer.getName();
						}

					};
		}
	}
}