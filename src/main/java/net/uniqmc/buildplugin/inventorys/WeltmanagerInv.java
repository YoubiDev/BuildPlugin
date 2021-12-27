package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class WeltmanagerInv {

    public static Inventory weltmanagerInv = Bukkit.createInventory(null, 5*9, "§6§lWelten Manager");
    public static void WeltManagerInvBefüllen(){

        // Glasspanes halt.

        for (int i = 0; i < 5*9; i++) {
            weltmanagerInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 14).setName("§c").build());
        }
        for (int i1 = 0; i1 < 4*9; i1++) {
            weltmanagerInv.setItem(i1, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
            
        }

        //Alle Materialen hier die im Inventar aufgelistet sind, sind hier.

        weltmanagerInv.setItem(36, new ItemAPI(Material.DARK_OAK_DOOR_ITEM).setName("§cZurück").build());
        weltmanagerInv.setItem(10, new ItemAPI(Material.REDSTONE_TORCH_ON).setName("§6§lWelt Physik").build());
        weltmanagerInv.setItem(11, new ItemAPI(Material.SKULL_ITEM, 1, (short) 0).setName("§6§lButcher").build());
        weltmanagerInv.setItem(12, new ItemAPI(Material.TNT).setName("§6§lExplosion").build());
        weltmanagerInv.setItem(13, new ItemAPI(Material.REDSTONE).setName("§6§lRedstone").build());
        weltmanagerInv.setItem(14, new ItemAPI(Material.SIGN).setName("§6§lStatus Einstellen").build());
        weltmanagerInv.setItem(15, new ItemAPI(Material.WATER_BUCKET).setName("§6§lWetter").build());
        weltmanagerInv.setItem(16, new ItemAPI(Material.WATCH).setName("§6§lTag/Nacht").build());

        //Farbstoffe werden hier gebuildet

        weltmanagerInv.setItem(19, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§a").build());
        weltmanagerInv.setItem(20, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§b").build());
        weltmanagerInv.setItem(21, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§d").build());
        weltmanagerInv.setItem(22, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§e").build());
        weltmanagerInv.setItem(23, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§1").build());
        weltmanagerInv.setItem(24, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§2").build());
        weltmanagerInv.setItem(25, new ItemAPI(Material.INK_SACK, 1, (short) 8).setName("§8§lAus§c").build());

    }
}
//18-24