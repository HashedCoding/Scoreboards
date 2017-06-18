package me.hashed.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Hashed on 18-6-2017.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

}
