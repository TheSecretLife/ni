package com.evill4mer.NewItems;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class b
{
  public b() {}
  
  void a(Main paramMain, String[] paramArrayOfString, Map paramMap, ItemStack paramItemStack)
  {
    a(paramArrayOfString, paramMap);
    ShapedRecipe localShapedRecipe = new ShapedRecipe(paramItemStack);
    localShapedRecipe.shape(new String[] { paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2] });
    try
    {
      Field localField = ShapedRecipe.class.getDeclaredField("ingredients");
      localField.setAccessible(true);
      localField.set(localShapedRecipe, paramMap);
      Bukkit.getServer().addRecipe(localShapedRecipe);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: Wrong recipe syntax. Please check the recipe of the item: " + paramItemStack.getItemMeta().getDisplayName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: Wrong recipe syntax. Please check the recipe of the item: " + paramItemStack.getItemMeta().getDisplayName());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: A material does not appear in the recipe pattern of: " + paramItemStack.getItemMeta().getDisplayName());
    }
  }
  
  void a(String[] paramArrayOfString, Map paramMap)
  {
    String str = paramArrayOfString[0] + paramArrayOfString[1] + paramArrayOfString[2];
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!str.contains(((Character)localEntry.getKey()).toString())) {
        localIterator.remove();
      }
    }
  }
}
