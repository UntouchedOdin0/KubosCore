package com.UntouchedOdin0.KubosCore.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.UntouchedOdin0.KubosCore.hooks.Vault;



public class Cookie {
	
	private Vault vault;

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(!(sender instanceof Player)) {
        	sender.sendMessage(ChatColor.GOLD + "Free cookie!");
            return true;
        }

        Player player = (Player) sender;

        if(command.getLabel().equals("cookie")) {
            // Gives the player a cookie!
        		player.getInventory().addItem(new ItemStack(Material.COOKIE)); 
                sender.sendMessage(ChatColor.GRAY + "Sup fam? " + "Have " + ChatColor.GOLD + "5 " + ChatColor.GRAY + "Cookies!");
            }
            return true;
        }
    }

