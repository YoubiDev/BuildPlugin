package net.uniqmc.buildplugin.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemAPI extends ItemStack {

    private ItemStack item;
    private ItemMeta meta;

    public ItemAPI(Material material, Integer amount){
        item = new ItemStack(material, amount);
        meta = item.getItemMeta();
    }

    public ItemAPI(Material material, Integer amount, Short SubID){
        item = new ItemStack(material, amount, SubID);
        meta = item.getItemMeta();
    }

    public ItemAPI(Material material){
        item = new ItemStack(material);
        meta = item.getItemMeta();
    }


    public ItemAPI setName(String displayname){
        meta.setDisplayName(displayname);
        return this;
    }

    public ItemAPI setEntchant(Enchantment entchant, Integer level, Boolean b){
        meta.addEnchant(entchant, level, b);
        return this;
    }

    public ItemAPI setUnbreakable(Boolean b){
        meta.spigot().setUnbreakable(b);
        return this;
    }

    public ItemAPI setItemFlag(ItemFlag flag){
        meta.addItemFlags(flag);
        return this;
    }

    public ItemAPI setLore(String... lore) {
        meta.setLore(Arrays.asList(lore));
        return this;
    }
    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }
}
