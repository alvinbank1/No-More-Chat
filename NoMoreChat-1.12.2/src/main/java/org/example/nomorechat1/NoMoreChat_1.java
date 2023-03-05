package org.example.nomorechat1;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoMoreChat_1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[No More Chat] Loaded!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[No More Chat] Disabled!");
    }

    @EventHandler
    public void disablechat(PlayerChatEvent e){
        Player p = e.getPlayer();
        e.setCancelled(true);
        p.sendMessage("§e§l[!] §eYou Can't Chat!");
    }
}
