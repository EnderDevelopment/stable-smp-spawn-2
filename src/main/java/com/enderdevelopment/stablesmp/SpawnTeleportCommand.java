package com.enderdevelopment.stablesmp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnTeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.GOLD + "Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        Location spawnLocation = Bukkit.getWorld("world").getSpawnLocation();
        player.teleport(spawnLocation);
        player.sendMessage(ChatColor.GOLD + "You have been teleported to spawn.");
        return true;
    }
}