package com.enderdevelopment.stablesmp;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class BedlessDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location spawnLocation = player.getWorld().getSpawnLocation();
        player.teleport(spawnLocation);
        player.sendMessage(ChatColor.GOLD + "You have been teleported to spawn.");
    }
}