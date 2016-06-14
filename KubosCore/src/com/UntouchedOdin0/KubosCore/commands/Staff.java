package com.UntouchedOdin0.KubosCore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.UntouchedOdin0.KubosCore.hooks.Vault;

public class Staff {
	
	private Vault vault;

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        if(command.getLabel().equals("staff")) {
            //Gives the staff list!
        	
        	sender.sendMessage(ChatColor.GOLD + "===============");
        	sender.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "OWNER " + " owner-name");
        	sender.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "ADMIN " + " admin-name");
        	sender.sendMessage("" + ChatColor.GREEN + ChatColor.BOLD + "MOD " + " mod-name");
        	sender.sendMessage(ChatColor.GOLD + "===============");
        }
            return true;
        }
    }
