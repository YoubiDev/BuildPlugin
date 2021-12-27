package net.uniqmc.buildplugin.listener;

import net.uniqmc.buildplugin.BuildPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeltenCatcher implements Listener {

    FileConfiguration cfg = BuildPlugin.getPlugin().getConfig();


    @EventHandler
    public void onWeltJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if (cfg.getString("Welten." + p.getWorld().getName() + ".Name") != p.getWorld().getName()) {
            cfg.set("Welten." + p.getWorld().getName() + ".Name", p.getWorld().getName());
            cfg.set("Welten." + p.getWorld().getName() + ".WeltPhysik", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Explosion", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Redstone", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Status", "Aufbau");
            cfg.set("Welten." + p.getWorld().getName() + ".Wetter", "Klar");
            cfg.set("Welten." + p.getWorld().getName() + ".Tag/Nacht", "Tag");
            BuildPlugin.getPlugin().saveConfig();
        }
    }

    @EventHandler
    public void onWeltTeleport(PlayerChangedWorldEvent e){
        Player p = e.getPlayer();
        if (cfg.getString("Welten." + p.getWorld().getName() + ".Name") != p.getWorld().getName()) {
            cfg.set("Welten." + p.getWorld().getName() + ".Name", p.getWorld().getName());
            cfg.set("Welten." + p.getWorld().getName() + ".WeltPhysik", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Explosion", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Redstone", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Status", "Aufbau");
            cfg.set("Welten." + p.getWorld().getName() + ".Wetter", "Klar");
            cfg.set("Welten." + p.getWorld().getName() + ".Tag/Nacht", "Tag");
            BuildPlugin.getPlugin().saveConfig();
        }
    }

    @EventHandler
    public void onPlayerWeltTeleport(PlayerTeleportEvent e){
        Player p = e.getPlayer();
        if (cfg.getString("Welten." + p.getWorld().getName() + ".Name") != p.getWorld().getName()) {
            cfg.set("Welten." + p.getWorld().getName() + ".Name", p.getWorld().getName());
            cfg.set("Welten." + p.getWorld().getName() + ".WeltPhysik", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Explosion", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Redstone", Boolean.FALSE);
            cfg.set("Welten." + p.getWorld().getName() + ".Status", "Aufbau");
            cfg.set("Welten." + p.getWorld().getName() + ".Wetter", "Klar");
            cfg.set("Welten." + p.getWorld().getName() + ".Tag/Nacht", "Tag");
            BuildPlugin.getPlugin().saveConfig();
        }
    }
    @EventHandler
    public void test(WeatherChangeEvent e){

    }
}
