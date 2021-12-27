package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class WeltInv {

    public static Inventory weltInv = Bukkit.createInventory(null, 3*9, "§a§lWelten");
    public static void WeltInvBefüllen(){
        for (int i = 0; i < 27; i++) {
            weltInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
        }
        weltInv.setItem(1, new ItemAPI(Material.DARK_OAK_DOOR_ITEM).setName("c").build());
    }
}
    