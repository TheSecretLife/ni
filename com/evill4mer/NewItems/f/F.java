package com.evill4mer.NewItems.f;

import com.evill4mer.NewItems.Main;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

public class F
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  public Map l = new HashMap();
  ShapedRecipe jdField_a_of_type_OrgBukkitInventoryShapedRecipe;
  public ItemStack a;
  String[] jdField_a_of_type_ArrayOfJavaLangString;
  
  public F(Main paramMain, ItemStack paramItemStack)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
    jdField_a_of_type_OrgBukkitInventoryItemStack = paramItemStack;
    jdField_a_of_type_OrgBukkitInventoryShapedRecipe = new ShapedRecipe(paramItemStack);
  }
  
  public void b(String[] paramArrayOfString, Map paramMap)
  {
    c(paramArrayOfString, paramMap);
    jdField_a_of_type_ArrayOfJavaLangString = paramArrayOfString;
    l = paramMap;
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEntry.setValue(((ItemStack)localEntry.getValue()).clone());
    }
    a(jdField_a_of_type_OrgBukkitInventoryShapedRecipe, paramArrayOfString, paramMap);
  }
  
  public void x()
  {
    jdField_a_of_type_ComEvill4merNewItemsMain.getServer().addRecipe(jdField_a_of_type_OrgBukkitInventoryShapedRecipe);
    jdField_a_of_type_ComEvill4merNewItemsMain.a.a(this);
  }
  
  public boolean a(Map paramMap)
  {
    int i = 0;
    ArrayList localArrayList1 = new ArrayList(paramMap.values());
    ArrayList localArrayList2 = new ArrayList(a(jdField_a_of_type_ArrayOfJavaLangString, a(l)).values());
    if (i != 0)
    {
      Bukkit.getConsoleSender().sendMessage(" ");
      Bukkit.getConsoleSender().sendMessage("tempRecipeToCheck: ");
      Iterator localIterator = localArrayList1.iterator();
      ItemStack localItemStack;
      while (localIterator.hasNext())
      {
        localItemStack = (ItemStack)localIterator.next();
        if (localItemStack.getItemMeta().hasLore()) {
          Bukkit.getConsoleSender().sendMessage((String)localItemStack.getItemMeta().getLore().get(0) + "|" + localItemStack.getType());
        } else {
          Bukkit.getConsoleSender().sendMessage(localItemStack.getType());
        }
      }
      Bukkit.getConsoleSender().sendMessage("tempThisRecipe: ");
      localIterator = localArrayList2.iterator();
      while (localIterator.hasNext())
      {
        localItemStack = (ItemStack)localIterator.next();
        if (localItemStack.getItemMeta().hasLore()) {
          Bukkit.getConsoleSender().sendMessage((String)localItemStack.getItemMeta().getLore().get(0) + "|" + localItemStack.getType());
        } else {
          Bukkit.getConsoleSender().sendMessage(localItemStack.getType());
        }
      }
    }
    return Arrays.equals(a(localArrayList1), a(localArrayList2));
  }
  
  Map a(String[] paramArrayOfString, Map paramMap)
  {
    String str = paramArrayOfString[0] + paramArrayOfString[1] + paramArrayOfString[2];
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < str.length(); i++) {
      if (paramMap.containsKey(Character.valueOf(str.charAt(i)))) {
        localHashMap.put(Integer.valueOf(i), (ItemStack)paramMap.get(Character.valueOf(str.charAt(i))));
      }
    }
    return localHashMap;
  }
  
  void c(String[] paramArrayOfString, Map paramMap)
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
  
  void a(ShapedRecipe paramShapedRecipe, String[] paramArrayOfString, Map paramMap)
  {
    paramShapedRecipe.shape(new String[] { paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2] });
    try
    {
      Field localField = ShapedRecipe.class.getDeclaredField("ingredients");
      localField.setAccessible(true);
      localField.set(jdField_a_of_type_OrgBukkitInventoryShapedRecipe, paramMap);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: Wrong recipe syntax. Please check the recipe of the item: " + jdField_a_of_type_OrgBukkitInventoryItemStack.getItemMeta().getDisplayName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: Wrong recipe syntax. Please check the recipe of the item: " + jdField_a_of_type_OrgBukkitInventoryItemStack.getItemMeta().getDisplayName());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: A material does not appear in the recipe pattern of: " + jdField_a_of_type_OrgBukkitInventoryItemStack.getItemMeta().getDisplayName());
    }
  }
  
  Map a(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramMap);
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ItemStack localItemStack = ((ItemStack)localEntry.getValue()).clone();
      ItemMeta localItemMeta = localItemStack.getItemMeta();
      localItemMeta.setDisplayName(null);
      localItemStack.setItemMeta(localItemMeta);
      localEntry.setValue(localItemStack);
    }
    return localHashMap;
  }
  
  ItemStack[] a(List paramList)
  {
    ItemStack[] arrayOfItemStack = new ItemStack[paramList.size()];
    int i = 0;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      ItemStack localItemStack = (ItemStack)localIterator.next();
      arrayOfItemStack[i] = localItemStack;
      i++;
    }
    return arrayOfItemStack;
  }
}
