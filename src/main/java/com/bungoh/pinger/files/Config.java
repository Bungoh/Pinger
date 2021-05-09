package com.bungoh.pinger.files;

import com.bungoh.pinger.Pinger;

public class Config {

    private static Pinger plugin;

    public static void setup(Pinger plugin) {
        Config.plugin = plugin;

        plugin.getConfig().options().copyDefaults();
        plugin.saveDefaultConfig();
    }

    public static char getPingPrefix() {
        String prefix = plugin.getConfig().getString("ping-prefix");
        if (prefix.length() != 1) {
            return '@';
        }

        return prefix.charAt(0);
    }

}
