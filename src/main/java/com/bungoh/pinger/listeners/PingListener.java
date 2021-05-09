package com.bungoh.pinger.listeners;

import com.bungoh.pinger.files.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PingListener implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e) {
        String message = e.getMessage();
        String[] split = message.split(" ");
        String newMessage = "";
        for (String s : split) {
            if (s.length() <= 3) {
                newMessage += s + " ";
                continue;
            }

            if (s.charAt(0) == Config.getPingPrefix()) {
                String playerName = s.substring(1);
                Player target = Bukkit.getPlayer(playerName);
                if (target != null) {
                    target.playSound(target.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1f, 1f);
                    newMessage += ChatColor.YELLOW + s + " " + ChatColor.RESET;
                    continue;
                }
            }
            newMessage += s + " ";
        }

        e.setMessage(newMessage);
    }

}
