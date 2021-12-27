package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class ArchivInv {


    public static Inventory archivInv = Bukkit.createInventory(null, 4*3, "§6§lBau Navigator");

    /*
    public static void ArchivInvBefüllen(){
        for (int i = 0; i < 27; i++) {
            archivInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
        }
    }

     */
}
