package com.enderdevelopment.stablesmp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.GOLD + "Only players can use this command.");
            return true;
        }

        if (!sender.hasPermission("stablesmp.admin")) {
            sender.sendMessage(ChatColor.GOLD + "You do not have permission to use this command.");
            return true;
        }

        Player player = (Player) sender;
        player.getWorld().setSpawnLocation(player.getLocation());
        player.sendMessage(ChatColor.GOLD + "Spawn location has been set.");
        return true;
    }
}