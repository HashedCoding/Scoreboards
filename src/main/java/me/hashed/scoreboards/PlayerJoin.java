package me.hashed.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitScheduler;

/**
 * Created by Hashed on 18-6-2017.
 */
public class PlayerJoin implements Listener {

    ScoreboardManager manager = new ScoreboardManager();
    Main plugin = new Main();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        if(!plugin.getConfig().isConfigurationSection(player.getUniqueId() + ".kills") || (!plugin.getConfig().isConfigurationSection(player.getUniqueId() + ".deaths"))) {
            plugin.getConfig().set(player.getUniqueId() + ".kills", 0);
            plugin.getConfig().set(player.getUniqueId() + ".deaths", 0);

            BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
            scheduler.scheduleSyncDelayedTask(plugin, new Runnable() {


                public void run() {
                manager.setScoreboard(player);
                }
            }, 10);
        }

        }

    }

