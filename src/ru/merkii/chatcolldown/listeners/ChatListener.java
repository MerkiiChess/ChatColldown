package ru.merkii.chatcolldown.listeners;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.merkii.chatcolldown.ChatColldown;

public class ChatListener implements Listener {
	private ChatColldown plugin;
	public ChatListener(ChatColldown plugin) {
		this.plugin = plugin;
	}
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		int sec = p.getStatistic(Statistic.PLAY_ONE_TICK) / 20;
		if(sec < this.plugin.getConfig().getInt("sec-need-time") && !p.hasPermission("chatcolldown.bypass")) {
			e.setCancelled(true);
			p.sendMessage(this.plugin.getConfig().getString("message").replace("&", "§"));
		}
	}
}