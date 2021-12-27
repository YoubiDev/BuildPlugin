package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class SetInv {

    public static Inventory setInv = Bukkit.createInventory(null, 5*9, "§c§lSettings");
    public static void SetInvBefüllen(){
        for (int i = 0; i < 5*9; i++) {
            setInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
        }


    }
}
