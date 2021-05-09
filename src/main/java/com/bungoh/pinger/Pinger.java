package com.bungoh.pinger;

import org.bukkit.plugin.java.JavaPlugin;

public final class Pinger extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Pinger by Bungoh has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Pinger by Bungoh has been disabled!");
    }
}
