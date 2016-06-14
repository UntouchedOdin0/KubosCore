package com.UntouchedOdin0.KubosCore.Scoreboard;

import java.util.ArrayList;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class Scoreboard extends JavaPlugin implements Listener, org.bukkit.scoreboard.Scoreboard {

	static ArrayList<String> A = new ArrayList<String>();
	
	
	/*
	 * text: Programmed by UntouchedOdin0
	 * @return
	 */
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Scoreboard hooked into KubosCore ");
	}
	
	public void add(final Player player) {
		final ScoreboardManager manager = Bukkit.getScoreboardManager();
		final Scoreboard board = (Scoreboard) manager.getNewScoreboard();
		
		Objective objective = board.registerNewObjective("Scoreboard", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score spacer = objective.getScore("§d");
		spacer.setScore(2);
		
		Score score = objective.getScore(ChatColor.WHITE + "Hai.");
		score.setScore(1);
		
		A.clear();
		A.add("1");
		
		BukkitScheduler Scheduler = Bukkit.getServer().getScheduler();
		Scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
				Integer i = A.size();
				
				/*
				 * text: Messages
				 * @return
				 */
				
				if(i == 1) {
					objective.setDisplayName(Format("&e&lKubos"));
					A.add("A");
				}
				if(i == 2) {
					objective.setDisplayName(Format("&6&lKubos"));
					A.add("B");
				}
				if(i == 3) {
					objective.setDisplayName(Format("&f&lKubos"));
					A.add("C");
				}
				if(i == 3) {
				 // Clear Messages and Start One Message
					A.clear();
					A.add("1");
				}
			}
		}, 0, 5);
		player.setScoreboard(board);
	}
	
	public static String Format(String text) {
		return text.replaceAll("&", "§");
	}
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		this.add(p);
	}

	@Override
	public void clearSlot(DisplaySlot arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getEntryTeam(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objective getObjective(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objective getObjective(DisplaySlot arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Objective> getObjectives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Objective> getObjectivesByCriteria(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getPlayerTeam(OfflinePlayer arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<OfflinePlayer> getPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Score> getScores(OfflinePlayer arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Score> getScores(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getTeam(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Team> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objective registerNewObjective(String arg0, String arg1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team registerNewTeam(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetScores(OfflinePlayer arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetScores(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}
	
}