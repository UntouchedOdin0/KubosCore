package com.UntouchedOdin0.KubosCore.Events;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Join extends JavaPlugin implements Listener { 

    public void onEnable() { 
    saveDefaultConfig(); 
    //save config on startup/reload 
    } 

    @EventHandler 
    public void onJoin(PlayerJoinEvent event) {
    	
            for (Player player: Bukkit.getServer().getOnlinePlayers()) { 

                  if (player.hasPermission("lobby.join.sound")) { 
                  //check for player has permission 
                	  
                	  event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.BLOCK_NOTE_PLING, 1, 1);

                      event.setJoinMessage(getConfig().getString("join-message").replace("&", "§").replace("%player%", player.getDisplayName())); 
                      //set player join message by config 

                 } else { 
                 event.setJoinMessage(""); 
                 //if player has no permission set message to null 
                 } 
        } 

} 

@EventHandler 
public void onQuit(PlayerQuitEvent event) {
		for(Player player: Bukkit.getServer().getOnlinePlayers()) {
        
        event.setQuitMessage(getConfig().getString("leave-message").replace("&", "§").replace("%player%", player.getDisplayName())); 
      } 
		
}
} 