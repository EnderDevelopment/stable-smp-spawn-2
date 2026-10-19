package com.enderdevelopment.stablesmp;

import org.bukkit.plugin.java.JavaPlugin;

public class StableSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register commands
        this.getCommand("spawn").setExecutor(new SpawnTeleportCommand());
        this.getCommand("setspawn").setExecutor(new SetSpawnCommand());
        this.getCommand("reload").setExecutor(new ReloadCommand());

        // Register events
        getServer().getPluginManager().registerEvents(new SpawnProtectionListener(), this);
        getServer().getPluginManager().registerEvents(new BedlessDeathListener(), this);
    }
}