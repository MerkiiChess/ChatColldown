package ru.merkii.chatcolldown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import ru.merkii.chatcolldown.listeners.ChatListener;

public class ChatColldown extends JavaPlugin {
	public void onEnable() {
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);
	}
}
