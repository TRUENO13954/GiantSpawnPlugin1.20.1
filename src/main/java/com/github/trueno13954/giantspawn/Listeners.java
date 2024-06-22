package com.github.trueno13954.giantspawn;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class Listeners implements Listener {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(50) + 100;
        System.out.println(num);
    }

    @EventHandler
    public void onSpawnZombie(EntitySpawnEvent e){}

}
