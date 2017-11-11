package com.evill4mer.NewItems.f;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract interface J
{
  public abstract void a(Player paramPlayer, String paramString);
  
  public abstract void a(Material paramMaterial, Inventory paramInventory, int paramInt, String paramString);
  
  public abstract boolean isNumeric(String paramString);
  
  public abstract boolean d(String paramString);
  
  public abstract void a(Material paramMaterial, Inventory paramInventory, int paramInt, String paramString1, String paramString2);
  
  public abstract ItemStack a(ItemStack paramItemStack, int paramInt);
  
  public abstract BlockFace a(Player paramPlayer);
}
