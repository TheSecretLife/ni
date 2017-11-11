package com.evill4mer.NewItems;

import a.a.a.e;
import a.a.a.f;
import a.a.a.g;
import a.a.a.j;
import com.evill4mer.NewItems.f.F;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.f.m;
import com.evill4mer.NewItems.g.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.ItemMeta.Spigot;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class H
{
  private final Main a;
  Map j;
  public LinkedHashMap a;
  public LinkedHashMap b = new LinkedHashMap();
  public LinkedHashMap c = new LinkedHashMap();
  public LinkedHashMap d = new LinkedHashMap();
  public LinkedHashMap e = new LinkedHashMap();
  public LinkedHashMap f = new LinkedHashMap();
  public LinkedHashMap g = new LinkedHashMap();
  public LinkedHashMap h = new LinkedHashMap();
  public LinkedHashMap i = new LinkedHashMap();
  public LinkedHashMap j;
  public LinkedHashMap k = new LinkedHashMap();
  public LinkedHashMap l = new LinkedHashMap();
  public LinkedHashMap m = new LinkedHashMap();
  public LinkedHashMap n = new LinkedHashMap();
  
  public H(Main paramMain)
  {
    jdField_j_of_type_JavaUtilMap = new HashMap();
    jdField_a_of_type_JavaUtilLinkedHashMap = new LinkedHashMap();
    jdField_j_of_type_JavaUtilLinkedHashMap = new LinkedHashMap();
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  public void o()
  {
    jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(new ItemStack(Material.DIAMOND_HOE), 64);
  }
  
  public void p()
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().getBoolean("shield" + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(Material.SHIELD, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.g.l("shield" + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().contains("shield" + i1 + ".lore"))
          {
            localObject1 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().getStringList("shield" + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++) {
              ((ArrayList)localObject1).set(i2, ((String)((ArrayList)localObject1).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject1);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject1 = new e(localItemStack);
          ((e)localObject1).setString("NItype", "shield");
          ((e)localObject1).a("NIid", Integer.valueOf(i1));
          if (jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().contains("shield" + i1 + ".durability")) {
            ((e)localObject1).a("NIdurability", Integer.valueOf(Integer.parseInt(jdField_a_of_type_ComEvill4merNewItemsMain.g.l("shield" + i1 + ".durability"))));
          }
          if ((jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().contains("shield" + i1 + ".unbreakable")) && (jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().getBoolean("shield" + i1 + ".unbreakable"))) {
            ((e)localObject1).a("NIunbreakable", Boolean.valueOf(true));
          }
          localItemStack = ((e)localObject1).getItem();
          Object localObject2;
          Iterator localIterator;
          try
          {
            HashMap localHashMap = new HashMap();
            if (jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().contains("shield" + i1 + ".enchants"))
            {
              localObject2 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.g.getConfig().getStringList("shield" + i1 + ".enchants");
              for (int i3 = 0; i3 < ((ArrayList)localObject2).size(); i3++)
              {
                String[] arrayOfString = ((String)((ArrayList)localObject2).get(i3)).split(":");
                localHashMap.put(Enchantment.getByName(arrayOfString[0]), Integer.valueOf(Integer.parseInt(arrayOfString[1])));
              }
            }
            localItemStack.addUnsafeEnchantments(localHashMap);
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for shield" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: DIG_SPEED:1)");
            localIterator = Bukkit.getOnlinePlayers().iterator();
          }
          while (localIterator.hasNext())
          {
            localObject2 = (Player)localIterator.next();
            if (((Player)localObject2).isOp()) {
              ((Player)localObject2).sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for shield" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: DIG_SPEED:1)");
            }
          }
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          jdField_j_of_type_JavaUtilLinkedHashMap.put("shield" + i1, localItemStack);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void q()
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getBoolean("pickaxe" + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(Material.DIAMOND_PICKAXE, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.f.l("pickaxe" + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().contains("pickaxe" + i1 + ".lore"))
          {
            localObject1 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getStringList("pickaxe" + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++) {
              ((ArrayList)localObject1).set(i2, ((String)((ArrayList)localObject1).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject1);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject1 = new e(localItemStack);
          ((e)localObject1).setString("NItype", "pickaxe");
          ((e)localObject1).a("NIid", Integer.valueOf(i1));
          if (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().contains("pickaxe" + i1 + ".durability")) {
            ((e)localObject1).a("NIdurability", Integer.valueOf(Integer.parseInt(jdField_a_of_type_ComEvill4merNewItemsMain.f.l("pickaxe" + i1 + ".durability"))));
          }
          if ((jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().contains("pickaxe" + i1 + ".unbreakable")) && (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getBoolean("pickaxe" + i1 + ".unbreakable"))) {
            ((e)localObject1).a("NIunbreakable", Boolean.valueOf(true));
          }
          localItemStack = ((e)localObject1).getItem();
          Object localObject2;
          Iterator localIterator;
          try
          {
            HashMap localHashMap = new HashMap();
            if (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().contains("pickaxe" + i1 + ".enchants"))
            {
              localObject2 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getStringList("pickaxe" + i1 + ".enchants");
              for (int i3 = 0; i3 < ((ArrayList)localObject2).size(); i3++)
              {
                String[] arrayOfString = ((String)((ArrayList)localObject2).get(i3)).split(":");
                localHashMap.put(Enchantment.getByName(arrayOfString[0]), Integer.valueOf(Integer.parseInt(arrayOfString[1])));
              }
            }
            localItemStack.addUnsafeEnchantments(localHashMap);
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for pickaxe" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: DIG_SPEED:1)");
            localIterator = Bukkit.getOnlinePlayers().iterator();
          }
          while (localIterator.hasNext())
          {
            localObject2 = (Player)localIterator.next();
            if (((Player)localObject2).isOp()) {
              ((Player)localObject2).sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for pickaxe" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: DIG_SPEED:1)");
            }
          }
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          i.put("pickaxe" + i1, localItemStack);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void r()
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().getBoolean("bow" + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(Material.BOW, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.e.l("bow" + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().contains("bow" + i1 + ".lore"))
          {
            localObject1 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().getStringList("bow" + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++) {
              ((ArrayList)localObject1).set(i2, ((String)((ArrayList)localObject1).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject1);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject1 = new e(localItemStack);
          ((e)localObject1).setString("NItype", "bow");
          ((e)localObject1).a("NIid", Integer.valueOf(i1));
          if (jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().contains("bow" + i1 + ".durability")) {
            ((e)localObject1).a("NIdurability", Integer.valueOf(Integer.parseInt(jdField_a_of_type_ComEvill4merNewItemsMain.e.l("bow" + i1 + ".durability"))));
          }
          if ((jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().contains("bow" + i1 + ".unbreakable")) && (jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().getBoolean("bow" + i1 + ".unbreakable"))) {
            ((e)localObject1).a("NIunbreakable", Boolean.valueOf(true));
          }
          localItemStack = ((e)localObject1).getItem();
          Object localObject2;
          Iterator localIterator;
          try
          {
            HashMap localHashMap = new HashMap();
            if (jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().contains("bow" + i1 + ".enchants"))
            {
              localObject2 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.e.getConfig().getStringList("bow" + i1 + ".enchants");
              for (int i3 = 0; i3 < ((ArrayList)localObject2).size(); i3++)
              {
                String[] arrayOfString = ((String)((ArrayList)localObject2).get(i3)).split(":");
                localHashMap.put(Enchantment.getByName(arrayOfString[0]), Integer.valueOf(Integer.parseInt(arrayOfString[1])));
              }
            }
            localItemStack.addUnsafeEnchantments(localHashMap);
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for bow" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: ARROW_FIRE:1)");
            localIterator = Bukkit.getOnlinePlayers().iterator();
          }
          while (localIterator.hasNext())
          {
            localObject2 = (Player)localIterator.next();
            if (((Player)localObject2).isOp()) {
              ((Player)localObject2).sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for bow" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: ARROW_FIRE:1)");
            }
          }
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          h.put("bow" + i1, localItemStack);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void s()
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().getBoolean("weapon" + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(Material.DIAMOND_SWORD, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.d.l("weapon" + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().contains("weapon" + i1 + ".lore"))
          {
            localObject1 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().getStringList("weapon" + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++) {
              ((ArrayList)localObject1).set(i2, ((String)((ArrayList)localObject1).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject1);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject1 = new e(localItemStack);
          ((e)localObject1).setString("NItype", "weapon");
          ((e)localObject1).a("NIid", Integer.valueOf(i1));
          if (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().contains("weapon" + i1 + ".durability")) {
            ((e)localObject1).a("NIdurability", Integer.valueOf(Integer.parseInt(jdField_a_of_type_ComEvill4merNewItemsMain.d.l("weapon" + i1 + ".durability"))));
          }
          if ((jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().contains("weapon" + i1 + ".unbreakable")) && (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().getBoolean("weapon" + i1 + ".unbreakable"))) {
            ((e)localObject1).a("NIunbreakable", Boolean.valueOf(true));
          }
          Object localObject2;
          Object localObject3;
          if (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().contains("weapon" + i1 + ".damage"))
          {
            localObject2 = ((e)localObject1).a("AttributeModifiers", j.m);
            localObject3 = ((f)localObject2).a();
            ((g)localObject3).setDouble("Amount", jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().getDouble("weapon" + i1 + ".damage"));
            ((g)localObject3).setString("AttributeName", "generic.attackDamage");
            ((g)localObject3).setString("Name", "generic.attackDamage");
            ((g)localObject3).a("Operation", 0);
            ((g)localObject3).a("UUIDLeast", 59664);
            ((g)localObject3).a("UUIDMost", 31453);
            ((g)localObject3).setString("Slot", "mainhand");
          }
          localItemStack = ((e)localObject1).getItem();
          Iterator localIterator;
          try
          {
            localObject2 = new HashMap();
            if (jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().contains("weapon" + i1 + ".enchants"))
            {
              localObject3 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.d.getConfig().getStringList("weapon" + i1 + ".enchants");
              for (int i3 = 0; i3 < ((ArrayList)localObject3).size(); i3++)
              {
                String[] arrayOfString = ((String)((ArrayList)localObject3).get(i3)).split(":");
                ((HashMap)localObject2).put(Enchantment.getByName(arrayOfString[0]), Integer.valueOf(Integer.parseInt(arrayOfString[1])));
              }
            }
            localItemStack.addUnsafeEnchantments((Map)localObject2);
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for weapon" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: FIRE_ASPECT:1)");
            localIterator = Bukkit.getOnlinePlayers().iterator();
          }
          while (localIterator.hasNext())
          {
            localObject3 = (Player)localIterator.next();
            if (((Player)localObject3).isOp()) {
              ((Player)localObject3).sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for weapon" + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: FIRE_ASPECT:1)");
            }
          }
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          g.put("weapon" + i1, localItemStack);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void t()
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().getBoolean("item" + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(Material.DIAMOND_HOE, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().contains("item" + i1 + ".lore"))
          {
            localObject = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().getStringList("item" + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject).size(); i2++) {
              ((ArrayList)localObject).set(i2, ((String)((ArrayList)localObject).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject = new e(localItemStack);
          ((e)localObject).setString("NItype", "item");
          ((e)localObject).a("NIid", Integer.valueOf(i1));
          if (jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().contains("item" + i1 + ".durability")) {
            ((e)localObject).a("NIdurability", Integer.valueOf(Integer.parseInt(jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + i1 + ".durability"))));
          }
          if ((jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().contains("item" + i1 + ".unbreakable")) && (jdField_a_of_type_ComEvill4merNewItemsMain.c.getConfig().getBoolean("item" + i1 + ".unbreakable"))) {
            ((e)localObject).a("NIunbreakable", Boolean.valueOf(true));
          }
          localItemStack = ((e)localObject).getItem();
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          jdField_a_of_type_JavaUtilLinkedHashMap.put("item" + i1, localItemStack);
          if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equalsIgnoreCase("crab")) {
            f.put("item" + i1, localItemStack);
          }
          if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equalsIgnoreCase("medal")) {
            e.put("item" + i1, localItemStack);
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void a(String paramString1, String paramString2, Material paramMaterial, HashMap paramHashMap, a paramA, int paramInt)
  {
    for (int i1 = 0; i1 < 1560; i1++) {
      try
      {
        if (paramA.getConfig().getBoolean(paramString1 + i1 + ".enabled"))
        {
          ItemStack localItemStack = new ItemStack(paramMaterial, 1, (short)((short)i1 + 1));
          ItemMeta localItemMeta = localItemStack.getItemMeta();
          localItemMeta = localItemStack.getItemMeta();
          localItemMeta.spigot().setUnbreakable(true);
          localItemMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
          localItemMeta.setDisplayName(paramA.l(paramString1 + i1 + ".name"));
          ArrayList localArrayList = new ArrayList();
          if (paramA.getConfig().contains(paramString1 + i1 + ".lore"))
          {
            localObject1 = (ArrayList)paramA.getConfig().getStringList(paramString1 + i1 + ".lore");
            for (int i2 = 0; i2 < ((ArrayList)localObject1).size(); i2++) {
              ((ArrayList)localObject1).set(i2, ((String)((ArrayList)localObject1).get(i2)).replace("&", "§"));
            }
            localArrayList.addAll((Collection)localObject1);
          }
          localItemMeta.setLore(localArrayList);
          localItemStack.setItemMeta(localItemMeta);
          Object localObject1 = new e(localItemStack);
          ((e)localObject1).setString("NItype", paramString1);
          ((e)localObject1).a("NIid", Integer.valueOf(i1));
          if (paramA.getConfig().contains(paramString1 + i1 + ".durability")) {
            ((e)localObject1).a("NIdurability", Integer.valueOf(Integer.parseInt(paramA.l(paramString1 + i1 + ".durability"))));
          }
          if ((paramA.getConfig().contains(paramString1 + i1 + ".unbreakable")) && (paramA.getConfig().getBoolean(paramString1 + i1 + ".unbreakable"))) {
            ((e)localObject1).a("NIunbreakable", Boolean.valueOf(true));
          }
          Object localObject2;
          Object localObject3;
          if (paramA.getConfig().contains(paramString1 + i1 + ".armor"))
          {
            localObject2 = ((e)localObject1).a("AttributeModifiers", j.m);
            localObject3 = ((f)localObject2).a();
            ((g)localObject3).setDouble("Amount", paramA.getConfig().getDouble(paramString1 + i1 + ".armor"));
            ((g)localObject3).setString("AttributeName", "generic.armor");
            ((g)localObject3).setString("Name", "CustomAttribute");
            ((g)localObject3).a("Operation", 0);
            ((g)localObject3).a("UUIDLeast", paramInt);
            ((g)localObject3).a("UUIDMost", paramInt);
            ((g)localObject3).setString("Slot", paramString2);
          }
          localItemStack = ((e)localObject1).getItem();
          localItemStack = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.d(localItemStack);
          if (paramA.getConfig().contains(paramString1 + i1 + ".color"))
          {
            localObject2 = (LeatherArmorMeta)localItemStack.getItemMeta();
            ((LeatherArmorMeta)localObject2).setColor(m.a(paramA.getConfig().getString(paramString1 + i1 + ".color")));
            localItemStack.setItemMeta((ItemMeta)localObject2);
          }
          else
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Missing color attribute in " + paramString1 + i1 + ". Use only HEX values for colors.");
          }
          Iterator localIterator;
          try
          {
            localObject2 = new HashMap();
            if (paramA.getConfig().contains(paramString1 + i1 + ".enchants"))
            {
              localObject3 = (ArrayList)paramA.getConfig().getStringList(paramString1 + i1 + ".enchants");
              for (int i3 = 0; i3 < ((ArrayList)localObject3).size(); i3++)
              {
                String[] arrayOfString = ((String)((ArrayList)localObject3).get(i3)).split(":");
                ((HashMap)localObject2).put(Enchantment.getByName(arrayOfString[0]), Integer.valueOf(Integer.parseInt(arrayOfString[1])));
              }
            }
            localItemStack.addUnsafeEnchantments((Map)localObject2);
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for " + paramString1 + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: FIRE_ASPECT:1)");
            localIterator = Bukkit.getOnlinePlayers().iterator();
          }
          while (localIterator.hasNext())
          {
            localObject3 = (Player)localIterator.next();
            if (((Player)localObject3).isOp()) {
              ((Player)localObject3).sendMessage("[NewItems] " + ChatColor.RED + "Wrong enchant format for " + paramString1 + i1 + ". Use the format ENCHANT_NAME:LEVEL (example: FIRE_ASPECT:1)");
            }
          }
          paramHashMap.put(paramString1 + i1, localItemStack);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  void u()
  {
    a(jdField_a_of_type_ComEvill4merNewItemsMain.c, jdField_a_of_type_JavaUtilLinkedHashMap, "item");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.e, h, "bow");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.f, i, "pickaxe");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.g, jdField_j_of_type_JavaUtilLinkedHashMap, "shield");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.d, g, "weapon");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.h, k, "helmet");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.i, l, "chestplate");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.j, m, "legging");
    a(jdField_a_of_type_ComEvill4merNewItemsMain.k, n, "boot");
  }
  
  void a(a paramA, HashMap paramHashMap, String paramString)
  {
    Iterator localIterator1 = paramHashMap.values().iterator();
    while (localIterator1.hasNext())
    {
      ItemStack localItemStack = (ItemStack)localIterator1.next();
      try
      {
        int i1 = jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack).intValue();
        if ((paramA.getConfig().getBoolean(paramString + i1 + ".enabled")) && (paramA.getConfig().getBoolean(paramString + i1 + ".recipe.enabled")))
        {
          HashMap localHashMap = new HashMap();
          String[] arrayOfString = (String[])paramA.getConfig().getStringList(paramString + i1 + ".recipe.pattern").toArray(new String[0]);
          ConfigurationSection localConfigurationSection = paramA.getConfig().getConfigurationSection(paramString + i1 + ".recipe.ingredients");
          Iterator localIterator2 = localConfigurationSection.getKeys(false).iterator();
          Object localObject;
          while (localIterator2.hasNext())
          {
            localObject = (String)localIterator2.next();
            try
            {
              if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localConfigurationSection.getString((String)localObject))) {
                localHashMap.put(Character.valueOf(((String)localObject).charAt(0)), jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localConfigurationSection.getString((String)localObject), true));
              } else {
                localHashMap.put(Character.valueOf(((String)localObject).charAt(0)), new ItemStack(Material.valueOf(localConfigurationSection.getString((String)localObject))));
              }
            }
            catch (IllegalArgumentException localIllegalArgumentException)
            {
              Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ERROR: Can't find Material named " + ChatColor.GREEN + localConfigurationSection.getString((String)localObject) + ChatColor.RED + ". Please check the recipe of the item: " + ChatColor.GREEN + localItemStack.getItemMeta().getDisplayName());
              Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "You can find the Minecraft Materials list here: " + ChatColor.AQUA + "https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html");
            }
          }
          if (localItemStack != null)
          {
            localObject = new F(jdField_a_of_type_ComEvill4merNewItemsMain, localItemStack);
            ((F)localObject).b(arrayOfString, localHashMap);
            ((F)localObject).x();
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public void v()
  {
    o();
    t();
    s();
    r();
    q();
    p();
    a("helmet", "head", Material.LEATHER_HELMET, k, jdField_a_of_type_ComEvill4merNewItemsMain.h, 1);
    a("chestplate", "chest", Material.LEATHER_CHESTPLATE, l, jdField_a_of_type_ComEvill4merNewItemsMain.i, 2);
    a("legging", "legs", Material.LEATHER_LEGGINGS, m, jdField_a_of_type_ComEvill4merNewItemsMain.j, 3);
    a("boot", "feet", Material.LEATHER_BOOTS, n, jdField_a_of_type_ComEvill4merNewItemsMain.k, 4);
    u();
  }
  
  ItemStack a(LinkedHashMap paramLinkedHashMap, int paramInt)
  {
    Set localSet = paramLinkedHashMap.entrySet();
    Map.Entry localEntry = (Map.Entry)new ArrayList(localSet).get(paramInt);
    return (ItemStack)localEntry.getValue();
  }
}
