package me.timof121.simpleffa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.*;

public class FFACommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sorry, but only players can teleport to FFA!");
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("joinffa")) {
        	Location loc = new Location(Bukkit.getWorld("world"), 0.5, 100, 0.5, 0, 0);
        	player.teleport(loc);
            player.sendMessage("§e§l(!) §eYou have been teleport to FFA!");
        }

        else if (cmd.getName().equalsIgnoreCase("leaveffa")) {
            player.damage(2);
            player.sendMessage("§e§l(!) §eYou have left FFA!");
        }

        return true;
    }
}