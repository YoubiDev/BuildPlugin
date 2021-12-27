package net.uniqmc.buildplugin.listener;

import net.uniqmc.buildplugin.BuildPlugin;
import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;

public class Join implements Listener {

    FileConfiguration cfg = BuildPlugin.getPlugin().getConfig();

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage("§8§l» §a" + p.getName());
        p.getInventory().setItem(0, new ItemAPI(Material.COMPASS).setName("§6§lBau Navigator").setEntchant(Enchantment.LUCK, 1, true)
                .setItemFlag(ItemFlag.HIDE_ENCHANTS).build());
    }
}
