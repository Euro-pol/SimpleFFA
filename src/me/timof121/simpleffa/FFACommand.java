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
        	Location ffa = new Location(Bukkit.getWorld("test"), 10.5, 65, 4.5, -45, 0);
        	player.teleport(ffa);
            player.sendMessage("�e�l(!) �eYou have been teleported to FFA!");
        }

        else if (cmd.getName().equalsIgnoreCase("leaveffa")) {
        	Location spawn = new Location(Bukkit.getWorld("test"), 0.5, 69, 0.5, -90, 0);
        	player.teleport(spawn);
            player.sendMessage("�e�l(!) �eYou have left FFA!");
        }

        return true;
    }
}
