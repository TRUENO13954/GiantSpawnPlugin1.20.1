package com.github.trueno13954.giantspawn;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GiantSpawnPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        Listeners listeners = new Listeners();
        Bukkit.getPluginManager().registerEvents(listeners, this);

        super.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
}
