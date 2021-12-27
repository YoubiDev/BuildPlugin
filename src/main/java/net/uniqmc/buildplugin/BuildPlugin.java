package net.uniqmc.buildplugin;



import net.uniqmc.buildplugin.listener.Interact;
import net.uniqmc.buildplugin.listener.Join;
import net.uniqmc.buildplugin.listener.Quit;
import net.uniqmc.buildplugin.listener.WeltenCatcher;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class BuildPlugin extends JavaPlugin {

    public static BuildPlugin plugin;




    @Override
    public void onEnable() {
        plugin = this;
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Join(), this);
        pm.registerEvents(new Quit(), this);
        pm.registerEvents(new Interact(), this);
        pm.registerEvents(new WeltenCatcher(), this);


    }

    @Override
    public void onDisable() {

    }

    public static BuildPlugin getPlugin() {
        return plugin;
    }

}
