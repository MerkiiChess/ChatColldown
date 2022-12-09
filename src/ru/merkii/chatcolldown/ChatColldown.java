package ru.merkii.chatcolldown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import ru.merkii.chatcolldown.listeners.ChatListener;

public class ChatColldown extends JavaPlugin {
	private static ChatCollDown instance;
	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);
	}
	public static ChatCollDown getInstance() {
		return instance;
	}
}
