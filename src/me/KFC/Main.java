package me.KFC;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	//test hello god help me
	public void onEnable() {
		this.getCommand("twitter").setExecutor(new Help(this));
	}
	
	@Override
	public void onDisable() {
		
	}

}
