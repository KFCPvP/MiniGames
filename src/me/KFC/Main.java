package me.KFC;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		this.getCommand("twitter").setExecutor(new Help(this));
	}
	
	@Override
	public void onDisable() {
		
	}

}
