package me.timof121.simpleffa;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;


public class MainClass extends JavaPlugin {
    // Triggered when plugin is enabled ez
    @Override
    public void onEnable() {
    	this.getCommand("leaveffa").setExecutor(new FFACommand());  
    	this.getCommand("joinffa").setExecutor(new FFACommand());    
    }
    // no shit
    @Override
    public void onDisable() {

    }
}
