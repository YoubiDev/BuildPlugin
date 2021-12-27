package net.uniqmc.buildplugin.inventorys;

import net.uniqmc.buildplugin.util.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;

public class Inventorys {

    public static Inventory mainInv = Bukkit.createInventory(null, 3*9, "§6§lBau Navigator");
    public static void MainInvBefüllen(){
        for (int i = 0; i < 27; i++) {
            mainInv.setItem(i, new ItemAPI(Material.STAINED_GLASS_PANE, 1, (short) 15).setName("§c").build());
        }
        mainInv.setItem(11, new ItemAPI(Material.GRASS).setName("§a§lWelten").build());
        mainInv.setItem(12, new ItemAPI(Material.REDSTONE_COMPARATOR).setName("§c§lSettings").build());
        mainInv.setItem(13, new ItemAPI(Material.NAME_TAG).setName("§6§lWelten Manager").build());
        mainInv.setItem(14, new ItemAPI(Material.REDSTONE_BLOCK).setName("§c§lPrivate Welten").setEntchant(Enchantment.LUCK, 1, true)
                .setItemFlag(ItemFlag.HIDE_ENCHANTS).build());
        mainInv.setItem(16, new ItemAPI(Material.BOOK).setName("§d§lArchiv").setEntchant(Enchantment.LUCK, 1, true)
                .setItemFlag(ItemFlag.HIDE_ENCHANTS).build());
    }
}
