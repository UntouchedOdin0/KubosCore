package com.UntouchedOdin0.KubosCore.hooks;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PlaceholderAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
     
        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
         
            Bukkit.getPluginManager().registerEvents(this, this);
         
        } else {
            throw new RuntimeException("Could not find PlaceholderAPI!! Plugin can not work without it!");
        }
    }
}