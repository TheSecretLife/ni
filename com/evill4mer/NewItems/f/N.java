package com.evill4mer.NewItems.f;

import java.util.ArrayList;
import net.minecraft.server.v1_9_R1.EntityPlayer;
import net.minecraft.server.v1_9_R1.IChatBaseComponent;
import net.minecraft.server.v1_9_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_9_R1.Item;
import net.minecraft.server.v1_9_R1.PacketPlayOutChat;
import net.minecraft.server.v1_9_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_9_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class N
  implements J
{
  public N() {}
  
  public void a(Player paramPlayer, String paramString)
  {
    IChatBaseComponent localIChatBaseComponent = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + paramString + "\"}");
    PacketPlayOutChat localPacketPlayOutChat = new PacketPlayOutChat(localIChatBaseComponent, (byte)2);
    getHandleplayerConnection.sendPacket(localPacketPlayOutChat);
  }
  
  public boolean isNumeric(String paramString)
  {
    return paramString.matches("[-+]?\\d+(\\.\\d+)?");
  }
  
  public String a(String paramString, int paramInt, char paramChar)
  {
    return paramString.substring(0, paramInt) + paramChar + paramString.substring(paramInt + 1);
  }
  
  public String a(String paramString1, String paramString2, int paramInt)
  {
    String str1 = paramString1.substring(0, paramInt);
    String str2 = paramString1.substring(paramInt);
    return str1 + paramString2 + str2;
  }
  
  public void a(Material paramMaterial, Inventory paramInventory, int paramInt, String paramString1, String paramString2)
  {
    org.bukkit.inventory.ItemStack localItemStack = new org.bukkit.inventory.ItemStack(paramMaterial);
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    localItemMeta.setDisplayName(paramString1);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    localItemMeta.setLore(localArrayList);
    localItemStack.setItemMeta(localItemMeta);
    paramInventory.setItem(paramInt, localItemStack);
  }
  
  public void a(Material paramMaterial, Inventory paramInventory, int paramInt, String paramString)
  {
    org.bukkit.inventory.ItemStack localItemStack = new org.bukkit.inventory.ItemStack(paramMaterial);
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    localItemMeta.setDisplayName(paramString);
    ArrayList localArrayList = new ArrayList();
    localItemMeta.setLore(localArrayList);
    localItemStack.setItemMeta(localItemMeta);
    paramInventory.setItem(paramInt, localItemStack);
  }
  
  public void a(Material paramMaterial, Inventory paramInventory, int paramInt)
  {
    org.bukkit.inventory.ItemStack localItemStack = new org.bukkit.inventory.ItemStack(paramMaterial);
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    ArrayList localArrayList = new ArrayList();
    localItemMeta.setLore(localArrayList);
    localItemStack.setItemMeta(localItemMeta);
    paramInventory.setItem(paramInt, localItemStack);
  }
  
  public void a(org.bukkit.inventory.ItemStack paramItemStack, Inventory paramInventory, int paramInt, String paramString1, String paramString2)
  {
    ItemMeta localItemMeta = paramItemStack.getItemMeta();
    localItemMeta.setDisplayName(paramString1);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    localItemMeta.setLore(localArrayList);
    paramItemStack.setItemMeta(localItemMeta);
    paramInventory.setItem(paramInt, paramItemStack);
  }
  
  public void a(org.bukkit.inventory.ItemStack paramItemStack, Inventory paramInventory, int paramInt, String paramString)
  {
    ItemMeta localItemMeta = paramItemStack.getItemMeta();
    localItemMeta.setDisplayName(paramString);
    paramItemStack.setItemMeta(localItemMeta);
    paramInventory.setItem(paramInt, paramItemStack);
  }
  
  public org.bukkit.inventory.ItemStack a(org.bukkit.inventory.ItemStack paramItemStack, int paramInt)
  {
    try
    {
      net.minecraft.server.v1_9_R1.ItemStack localItemStack = CraftItemStack.asNMSCopy(paramItemStack);
      localItemStack.getItem().d(paramInt);
      return CraftItemStack.asBukkitCopy(localItemStack);
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public boolean d(String paramString)
  {
    long l = Bukkit.getServer().getWorld(paramString).getTime();
    return (l < 12300L) || (l > 23850L);
  }
  
  public Block a(Player paramPlayer, int paramInt)
  {
    Location localLocation = paramPlayer.getEyeLocation();
    Vector localVector = localLocation.getDirection().normalize();
    Block localBlock = null;
    for (int i = 0; i <= paramInt; i++) {
      localBlock = localLocation.add(localVector).getBlock().getRelative(BlockFace.UP);
    }
    return localBlock;
  }
  
  public BlockFace a(Player paramPlayer)
  {
    double d = paramPlayer.getLocation().getYaw() % 360.0F;
    if (d < 0.0D) {
      d += 360.0D;
    }
    if ((0.0D <= d) && (d < 22.5D)) {
      return BlockFace.NORTH;
    }
    if ((22.5D <= d) && (d < 67.5D)) {
      return BlockFace.NORTH_EAST;
    }
    if ((67.5D <= d) && (d < 112.5D)) {
      return BlockFace.EAST;
    }
    if ((112.5D <= d) && (d < 157.5D)) {
      return BlockFace.SOUTH_EAST;
    }
    if ((157.5D <= d) && (d < 202.5D)) {
      return BlockFace.SOUTH;
    }
    if ((202.5D <= d) && (d < 247.5D)) {
      return BlockFace.SOUTH_WEST;
    }
    if ((247.5D <= d) && (d < 292.5D)) {
      return BlockFace.WEST;
    }
    if ((292.5D <= d) && (d < 337.5D)) {
      return BlockFace.NORTH_WEST;
    }
    if ((337.5D <= d) && (d < 360.0D)) {
      return BlockFace.NORTH;
    }
    return null;
  }
}
