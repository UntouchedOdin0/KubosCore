package com.UntouchedOdin0.KubosCore.AntiBot;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Wool;

public class Menu implements Listener{

	private Inventory inv;
	private ItemStack y, n;
	
	public Menu() {
		inv = Bukkit.getServer().createInventory(null, InventoryType.HOPPER, "Anti Bot");
		
		y = createItem(DyeColor.GREEN, "Yes");
		n = createItem(DyeColor.RED, "No");
		
		inv.setItem(2, y);
		inv.setItem(4, n);
	}
	
    private ItemStack createItem(DyeColor dc, String name) {
        ItemStack i = new Wool(dc).toItemStack(1);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(name);
        im.setLore(Arrays.asList("Please choose ", "either wool "));
        i.setItemMeta(im);
        return i;
}
    
    public void show(Player p) {
    	p.openInventory(inv);
    }
    
    @EventHandler
    public void onClick(InventoryClickEvent e) {
    	if (!e.getInventory().equals(inv)) return;
    	if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Yes"));
    	e.getWhoClicked().sendMessage(ChatColor.GREEN + "Thank you!");
    	e.getWhoClicked().sendMessage(ChatColor.GREEN + "We know you're a player! :)");
    	
    	if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("No"));
    	
    	e.getWhoClicked().sendMessage(ChatColor.RED + "Please accept the rules!");
    	}
    }
