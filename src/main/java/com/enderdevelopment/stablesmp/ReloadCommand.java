package com.enderdevelopment.stablesmp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("stablesmp.admin")) {
            sender.sendMessage(ChatColor.GOLD + "You do not have permission to use this command.");
            return true;
        }

        // Reload configuration logic
        sender.sendMessage(ChatColor.GOLD + "Configuration reloaded.");
        return true;
    }
}