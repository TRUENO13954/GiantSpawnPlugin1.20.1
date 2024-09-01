package com.github.trueno13954.giantspawn;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.Random;

public class Listeners implements Listener {

    Random rand = new Random();
    int num = rand.nextInt(50) + 100;

    @EventHandler
    public void onSpawnZombie(EntitySpawnEvent e) {
        if (e.getEntityType() == EntityType.ZOMBIE) {
            num--;
            Bukkit.broadcastMessage("今" + num);
            if (num == 0) {
                e.setCancelled(true);
                Bukkit.broadcastMessage("生まれたよ");
                
            }
        }
    }

}