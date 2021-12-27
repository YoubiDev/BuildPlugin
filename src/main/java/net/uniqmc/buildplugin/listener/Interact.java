package net.uniqmc.buildplugin.listener;

import net.uniqmc.buildplugin.BuildPlugin;
import net.uniqmc.buildplugin.inventorys.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.IOException;

import static net.uniqmc.buildplugin.inventorys.PrivateweltInv.PrivateWeltInvBefüllen;

public class Interact implements Listener {

    FileConfiguration cfg = BuildPlugin.getPlugin().getConfig();

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        try {
            if (e.getItem().getType() == Material.COMPASS) {
                Inventorys.MainInvBefüllen();
                p.openInventory(Inventorys.mainInv);
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    @EventHandler
    public void onInventory(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().equals(Inventorys.mainInv) || e.getClickedInventory().equals(WeltInv.weltInv) || e.getClickedInventory().equals(WeltmanagerInv.weltmanagerInv)) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GRASS) {
                p.closeInventory();
                WeltInv.WeltInvBefüllen();
                p.openInventory(WeltInv.weltInv);
            } else if (e.getCurrentItem().getType() == Material.REDSTONE_COMPARATOR) {
                p.closeInventory();
                SetInv.SetInvBefüllen();
                p.openInventory(SetInv.setInv);
            } else if (e.getCurrentItem().getType() == Material.NAME_TAG) {
                p.closeInventory();
                WeltmanagerInv.WeltManagerInvBefüllen();
                p.openInventory(WeltmanagerInv.weltmanagerInv);
            } else if (e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
                e.setCancelled(true);
                p.closeInventory();
                PrivateweltInv.PrivateWeltInvBefüllen();
                p.openInventory(PrivateweltInv.privateweltInv);
            } else if (e.getCurrentItem().getType() == Material.BOOK) {
                p.closeInventory();
                //ArchivInv.ArchivInvBefüllen();
                p.openInventory(ArchivInv.archivInv);
            } else if (e.getCurrentItem().getType() == Material.REDSTONE_TORCH_ON) {
                cfg.set("TEST", Boolean.TRUE);
                BuildPlugin.getPlugin().saveConfig();
            } else if (e.getCurrentItem().getType() == Material.TNT) {
                cfg.set("TEST", Boolean.FALSE);
                BuildPlugin.getPlugin().saveConfig();
            } else if (e.getCurrentItem().getType() == Material.DARK_OAK_DOOR_ITEM) {
                p.closeInventory();
                Inventorys.MainInvBefüllen();
                p.openInventory(Inventorys.mainInv);
            }


        }
    }
    @EventHandler
    public void onPhysik(BlockPhysicsEvent e){
        if (cfg.getBoolean("TEST") == Boolean.FALSE){
            e.setCancelled(false);
        }else if (cfg.getBoolean("TEST") == Boolean.TRUE){
            e.setCancelled(true);
        }else
            return;
    }

    @EventHandler
    public void onWater(BlockSpreadEvent e){
        if (cfg.getBoolean("TEST") == Boolean.FALSE){
            e.setCancelled(false);
        }else if (cfg.getBoolean("TEST") == Boolean.TRUE){
            e.setCancelled(true);
        }else
            return;
    }

    @EventHandler
    public void onWater2(BlockFromToEvent e){
        int id = e.getBlock().getTypeId();
        if(id == 8 || id == 9) {
            if (cfg.getBoolean("TEST") == Boolean.FALSE){
                e.setCancelled(false);
            }else if (cfg.getBoolean("TEST") == Boolean.TRUE){
                e.setCancelled(true);
            }else
                return;
        }
    }


}

