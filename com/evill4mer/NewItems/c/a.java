package com.evill4mer.NewItems.c;

import a.a.a.e;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.G;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class a
  implements Listener
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  public String b = "17384";
  String l = "401248028";
  boolean d = false;
  List jdField_a_of_type_JavaUtilList = new ArrayList();
  boolean e = false;
  
  public a(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  @EventHandler
  public void d(InventoryClickEvent paramInventoryClickEvent)
  {
    if (!paramInventoryClickEvent.getInventory().getName().equals(ChatColor.BLUE + ChatColor.BOLD + jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.name"))) {
      return;
    }
    Player localPlayer = (Player)paramInventoryClickEvent.getWhoClicked();
    if ((paramInventoryClickEvent.getCurrentItem() == null) || (paramInventoryClickEvent.getCurrentItem().getType() == Material.AIR)) {
      return;
    }
    e localE = new e(paramInventoryClickEvent.getCurrentItem());
    a(localPlayer, localE.getInteger("category").intValue(), 0, 1);
    paramInventoryClickEvent.setCancelled(true);
  }
  
  public void a(Player paramPlayer, int paramInt1, int paramInt2, int paramInt3)
  {
    Inventory localInventory = Bukkit.createInventory(null, 54, ChatColor.BLUE + ChatColor.BOLD + jdField_a_of_type_ComEvill4merNewItemsMain.b.l(new StringBuilder("categories.category").append(paramInt1).append(".name").toString()));
    int i = 0;
    ArrayList localArrayList = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.b.getConfig().getStringList("categories.category" + paramInt1 + ".items");
    Object localObject2;
    Object localObject3;
    for (int j = paramInt2; j < paramInt2 + 54; j++)
    {
      if (j >= localArrayList.size()) {
        break;
      }
      localObject1 = null;
      localObject2 = null;
      localObject3 = null;
      Object localObject4 = null;
      String str = (String)localArrayList.get(j);
      if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(str))
      {
        localObject1 = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(str, true);
        localObject2 = new e((ItemStack)localObject1);
        localObject3 = ((ItemStack)localObject1).getItemMeta();
        if (((ItemMeta)localObject3).hasLore()) {
          localObject4 = ((ItemMeta)localObject3).getLore();
        } else {
          localObject4 = new ArrayList();
        }
        ((List)localObject4).add(" ");
        ((List)localObject4).add(m.k(jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.getConfig().getString("id")) + ChatColor.GOLD + ((e)localObject2).getString("NItype") + ((e)localObject2).getInteger("NIid"));
        ((ItemMeta)localObject3).setLore((List)localObject4);
        ((ItemStack)localObject1).setItemMeta((ItemMeta)localObject3);
        localInventory.setItem(i, (ItemStack)localObject1);
        i++;
      }
      else
      {
        jdField_a_of_type_JavaUtilList.add(str);
        d = true;
      }
      if (i > 44)
      {
        ItemStack localItemStack2 = new ItemStack(Material.ARROW);
        ItemMeta localItemMeta = localItemStack2.getItemMeta();
        localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.nextPageButton.name"));
        localItemStack2.setItemMeta(localItemMeta);
        e localE = new e(localItemStack2);
        localE.a("category", Integer.valueOf(paramInt1));
        localE.a("page", Integer.valueOf(paramInt3));
        localItemStack2 = localE.getItem();
        localInventory.setItem(53, localItemStack2);
        break;
      }
    }
    ItemStack localItemStack1 = new ItemStack(Material.BED);
    Object localObject1 = localItemStack1.getItemMeta();
    ((ItemMeta)localObject1).setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.backButton.name"));
    localItemStack1.setItemMeta((ItemMeta)localObject1);
    localInventory.setItem(51, localItemStack1);
    if (paramInt2 > 0)
    {
      localItemStack1 = new ItemStack(Material.SPIDER_EYE);
      localObject1 = localItemStack1.getItemMeta();
      ((ItemMeta)localObject1).setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.previousPageButton.name"));
      localItemStack1.setItemMeta((ItemMeta)localObject1);
      localObject2 = new e(localItemStack1);
      ((e)localObject2).a("category", Integer.valueOf(paramInt1));
      ((e)localObject2).a("page", Integer.valueOf(paramInt3));
      localItemStack1 = ((e)localObject2).getItem();
      localInventory.setItem(52, localItemStack1);
    }
    if (d)
    {
      Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.YELLOW + "Warning: Can't add some items to the menu. " + ChatColor.YELLOW + "Maybe they are disabled in configuration file or some names are wrong in customMenu.yml:");
      localObject3 = jdField_a_of_type_JavaUtilList.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        Bukkit.getConsoleSender().sendMessage(" - " + (String)localObject2);
      }
      jdField_a_of_type_JavaUtilList.clear();
      d = false;
    }
    paramPlayer.openInventory(localInventory);
  }
  
  private boolean a(Inventory paramInventory)
  {
    try
    {
      for (int i = 0; i < paramInventory.getSize(); i++) {
        if ((jdField_a_of_type_ComEvill4merNewItemsMain.b.getConfig().contains("categories.category" + i)) && (paramInventory.getName().equals(ChatColor.BLUE + ChatColor.BOLD + jdField_a_of_type_ComEvill4merNewItemsMain.b.l(new StringBuilder("categories.category").append(i).append(".name").toString())))) {
          return true;
        }
      }
    }
    catch (NullPointerException localNullPointerException) {}
    return false;
  }
  
  @EventHandler
  public void e(InventoryClickEvent paramInventoryClickEvent)
  {
    if (!a(paramInventoryClickEvent.getInventory())) {
      return;
    }
    paramInventoryClickEvent.setCancelled(true);
    Player localPlayer = (Player)paramInventoryClickEvent.getWhoClicked();
    try
    {
      int i;
      Object localObject2;
      if (paramInventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName().equals(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.nextPageButton.name")))
      {
        i = 0;
        localObject2 = new e(paramInventoryClickEvent.getCurrentItem());
        i = ((e)localObject2).getInteger("page").intValue();
        a(localPlayer, ((e)localObject2).getInteger("category").intValue(), 44 * i, i + 1);
      }
      else
      {
        int j;
        if (paramInventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName().equals(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.previousPageButton.name")))
        {
          i = 0;
          localObject2 = new e(paramInventoryClickEvent.getCurrentItem());
          i = ((e)localObject2).getInteger("page").intValue();
          j = i - 1;
          j *= 44;
          j -= 44;
          a(localPlayer, ((e)localObject2).getInteger("category").intValue(), j, i - 1);
        }
        else if (paramInventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName().equals(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.backButton.name")))
        {
          localPlayer.closeInventory();
          a(localPlayer);
        }
        else
        {
          Object localObject1;
          Object localObject4;
          if (jdField_a_of_type_ComEvill4merNewItemsMain.b().equals("v1_12_R1"))
          {
            localObject1 = new HashMap();
            ((HashMap)localObject1).put(Integer.valueOf(1), Integer.valueOf(12));
            ((HashMap)localObject1).put(Integer.valueOf(2), Integer.valueOf(13));
            ((HashMap)localObject1).put(Integer.valueOf(3), Integer.valueOf(14));
            ((HashMap)localObject1).put(Integer.valueOf(4), Integer.valueOf(21));
            ((HashMap)localObject1).put(Integer.valueOf(5), Integer.valueOf(22));
            ((HashMap)localObject1).put(Integer.valueOf(6), Integer.valueOf(23));
            ((HashMap)localObject1).put(Integer.valueOf(7), Integer.valueOf(30));
            ((HashMap)localObject1).put(Integer.valueOf(8), Integer.valueOf(31));
            ((HashMap)localObject1).put(Integer.valueOf(9), Integer.valueOf(32));
            localObject2 = Bukkit.createInventory(null, 45, ChatColor.RED + ChatColor.GREEN + ChatColor.AQUA + ChatColor.BOLD + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("crafting-guide"));
            for (j = 0; j < ((Inventory)localObject2).getSize(); j++) {
              ((Inventory)localObject2).setItem(j, new ItemStack(Material.STAINED_GLASS_PANE));
            }
            ((Inventory)localObject2).setItem(12, null);
            ((Inventory)localObject2).setItem(13, null);
            ((Inventory)localObject2).setItem(14, null);
            ((Inventory)localObject2).setItem(21, null);
            ((Inventory)localObject2).setItem(22, null);
            ((Inventory)localObject2).setItem(23, null);
            ((Inventory)localObject2).setItem(30, null);
            ((Inventory)localObject2).setItem(31, null);
            ((Inventory)localObject2).setItem(32, null);
            ((Inventory)localObject2).setItem(25, paramInventoryClickEvent.getCurrentItem().clone());
            if (paramInventoryClickEvent.getCurrentItem() != null) {
              try
              {
                Object localObject3 = new HashMap();
                if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(paramInventoryClickEvent.getCurrentItem())) {
                  localObject3 = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFG.b(paramInventoryClickEvent.getCurrentItem());
                }
                if (localObject3 == null) {
                  return;
                }
                Iterator localIterator = ((Map)localObject3).entrySet().iterator();
                while (localIterator.hasNext())
                {
                  localObject4 = (Map.Entry)localIterator.next();
                  ((Inventory)localObject2).setItem(((Integer)((HashMap)localObject1).get(Integer.valueOf(((Integer)((Map.Entry)localObject4).getKey()).intValue() + 1))).intValue(), (ItemStack)((Map.Entry)localObject4).getValue());
                }
                jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(Material.BED, (Inventory)localObject2, ((Inventory)localObject2).getSize() - 1, ChatColor.GREEN + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem"), jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("back"));
                localPlayer.openInventory((Inventory)localObject2);
              }
              catch (IllegalArgumentException localIllegalArgumentException2) {}
            }
          }
          else
          {
            localObject1 = Bukkit.createInventory(null, InventoryType.WORKBENCH);
            if (paramInventoryClickEvent.getCurrentItem() != null) {
              try
              {
                localObject2 = new HashMap();
                if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(paramInventoryClickEvent.getCurrentItem())) {
                  localObject2 = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFG.b(paramInventoryClickEvent.getCurrentItem());
                }
                if (localObject2 == null) {
                  return;
                }
                localObject4 = ((Map)localObject2).entrySet().iterator();
                while (((Iterator)localObject4).hasNext())
                {
                  Map.Entry localEntry = (Map.Entry)((Iterator)localObject4).next();
                  ((Inventory)localObject1).setItem(((Integer)localEntry.getKey()).intValue() + 1, (ItemStack)localEntry.getValue());
                }
                jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(Material.BED, (Inventory)localObject1, 0, ChatColor.GREEN + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem"), jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("back"));
                localPlayer.openInventory((Inventory)localObject1);
              }
              catch (IllegalArgumentException localIllegalArgumentException1) {}
            }
          }
        }
      }
      return;
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  @EventHandler
  public void f(InventoryClickEvent paramInventoryClickEvent)
  {
    try
    {
      ItemStack[] arrayOfItemStack = paramInventoryClickEvent.getInventory().getContents();
      for (int i = 0; i < arrayOfItemStack.length; i++) {
        try
        {
          if ((arrayOfItemStack[i].hasItemMeta()) && (arrayOfItemStack[i].getItemMeta().hasDisplayName()) && (arrayOfItemStack[i].getItemMeta().getDisplayName().equals(ChatColor.GREEN + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem")))) {
            paramInventoryClickEvent.setCancelled(true);
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
      if ((paramInventoryClickEvent.getCurrentItem().hasItemMeta()) && (paramInventoryClickEvent.getCurrentItem().getItemMeta().hasDisplayName()) && (paramInventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem"))))
      {
        paramInventoryClickEvent.getWhoClicked().closeInventory();
        a((Player)paramInventoryClickEvent.getWhoClicked());
      }
    }
    catch (NullPointerException localNullPointerException1) {}
  }
  
  public void a(Player paramPlayer)
  {
    int i = jdField_a_of_type_ComEvill4merNewItemsMain.b.getConfig().getInt("menuSettings.sizeY");
    if (i > 6) {
      i = 6;
    }
    if (i <= 0) {
      i = 1;
    }
    Inventory localInventory = Bukkit.createInventory(null, 9 * i, ChatColor.BLUE + ChatColor.BOLD + jdField_a_of_type_ComEvill4merNewItemsMain.b.l("menuSettings.name"));
    ItemStack localItemStack = new ItemStack(Material.BARRIER);
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    try
    {
      for (int j = 0; j < localInventory.getSize(); j++) {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.b.getConfig().contains("categories.category" + j + ".icon"))
        {
          String str = jdField_a_of_type_ComEvill4merNewItemsMain.b.l("categories.category" + j + ".icon");
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(str, true);
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.b.l("categories.category" + j + ".name"));
          localItemMeta.setLore(null);
          localItemStack.setItemMeta(localItemMeta);
          e localE = new e(localItemStack);
          localE.a("category", Integer.valueOf(j));
          localItemStack = localE.getItem();
          localInventory.setItem(j, localItemStack);
        }
      }
    }
    catch (NullPointerException localNullPointerException) {}
    paramPlayer.openInventory(localInventory);
  }
  
  public boolean isEmpty(List paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      if (paramList.get(i) != null) {
        return false;
      }
    }
    return true;
  }
  
  ItemStack c(ItemStack paramItemStack)
  {
    ItemMeta localItemMeta = paramItemStack.getItemMeta();
    List localList = localItemMeta.getLore();
    localList.remove(localList.size() - 1);
    localItemMeta.setLore(localList);
    paramItemStack.setItemMeta(localItemMeta);
    return paramItemStack;
  }
}
