package com.github.trueno13954.giantspawn;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GiantSpawnPlugin extends JavaPlugin {

    private static JavaPlugin plugin;
    private Listeners listeners;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.listeners = new Listeners();
        Bukkit.getPluginManager().registerEvents(this.listeners, this);

        super.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    public static JavaPlugin getPlugin(){
        return plugin;
    }
}
