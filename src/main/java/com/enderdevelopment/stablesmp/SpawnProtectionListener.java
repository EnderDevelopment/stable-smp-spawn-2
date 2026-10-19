package com.enderdevelopment.stablesmp;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SpawnProtectionListener implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
            Player attacker = (Player) event.getDamager();
            Player victim = (Player) event.getEntity();
            Location spawnLocation = attacker.getWorld().getSpawnLocation();

            if (attacker.getLocation().distance(spawnLocation) <= 45 && victim.getLocation().distance(spawnLocation) <= 45) {
                event.setCancelled(true);
                attacker.sendMessage(ChatColor.GOLD + "You cannot PvP within 45 blocks of spawn.");
            }
        }
    }
}