package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class PrivateweltInv {

    public static Inventory privateweltInv = Bukkit.createInventory(null, 3*9, "§c§lPrivate Welten");
    public static void PrivateWeltInvBefüllen(){
        for (int i = 0; i < 27; i++) {
            privateweltInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
        }
    }
}
