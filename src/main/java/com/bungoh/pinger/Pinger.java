package com.bungoh.pinger;

import com.bungoh.pinger.files.Config;
import com.bungoh.pinger.listeners.PingListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Pinger extends JavaPlugin {

    @Override
    public void onEnable() {
        Config.setup(this);
        Bukkit.getPluginManager().registerEvents(new PingListener(), this);
        getLogger().info("Pinger by Bungoh has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Pinger by Bungoh has been disabled!");
    }
}
