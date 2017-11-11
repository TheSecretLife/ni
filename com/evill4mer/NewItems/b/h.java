package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.l;
import com.evill4mer.NewItems.g.a;
import com.evill4mer.b.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class h
  implements Listener
{
  private final Main a;
  HashSet jdField_b_of_type_JavaUtilHashSet = new HashSet();
  HashSet c = new HashSet();
  Map jdField_b_of_type_JavaUtilMap = new HashMap();
  
  public h(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void f(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEvent.getPlayer();
    if ((paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) && ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR)))) {
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
          return;
        }
      }
      catch (NullPointerException localNullPointerException1)
      {
        ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        try
        {
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack))
          {
            if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("foodDrink")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("honeyjar")))
            {
              paramPlayerInteractEvent.setCancelled(true);
              if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
              {
                a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-eat"));
                return;
              }
              if (localPlayer.getFoodLevel() < 20)
              {
                localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_DRINK, 10.0F, 1.0F);
                localPlayer.setFoodLevel(localPlayer.getFoodLevel() + 6);
                a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_PLAYER_BURP);
              }
            }
            return;
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
  
  @EventHandler
  public void g(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEvent.getPlayer();
    if ((paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) && ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR)))) {
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
          return;
        }
      }
      catch (NullPointerException localNullPointerException1)
      {
        ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        try
        {
          if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("alcoholic")))
          {
            paramPlayerInteractEvent.setCancelled(true);
            if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
            {
              a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-eat"));
              return;
            }
            localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_DRINK, 10.0F, 1.0F);
            localPlayer.setFoodLevel(localPlayer.getFoodLevel() + 6);
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_PLAYER_BURP);
            if (a.jdField_a_of_type_JavaUtilHashMap.containsKey(localPlayer.getName())) {
              switch (((Integer)a.jdField_a_of_type_JavaUtilHashMap.get(localPlayer.getName())).intValue())
              {
              case 3: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
                break;
              case 4: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
                break;
              case 5: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
                break;
              case 6: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
                break;
              case 7: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
                break;
              case 8: 
                localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 500, 1));
                localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_HURT, 10.0F, 1.0F);
                if (localPlayer.getHealth() - 4.0D > 0.0D) {
                  localPlayer.setHealth(localPlayer.getHealth() - 4.0D);
                }
                a.jdField_a_of_type_JavaUtilHashMap.put(localPlayer.getName(), Integer.valueOf(0));
              }
            }
            if (a.jdField_a_of_type_JavaUtilHashMap.containsKey(localPlayer.getName()))
            {
              int i = ((Integer)a.jdField_a_of_type_JavaUtilHashMap.get(localPlayer.getName())).intValue();
              a.jdField_a_of_type_JavaUtilHashMap.put(localPlayer.getName(), Integer.valueOf(i + 1));
              a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("drunk") + ChatColor.GREEN + a.jdField_a_of_type_JavaUtilHashMap.get(localPlayer.getName()));
            }
            else
            {
              a.jdField_a_of_type_JavaUtilHashMap.put(localPlayer.getName(), Integer.valueOf(1));
              a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("drunk") + ChatColor.GREEN + a.jdField_a_of_type_JavaUtilHashMap.get(localPlayer.getName()));
            }
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
  
  @EventHandler
  public void h(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if (paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
      {
        ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
          try
          {
            if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("foodEat")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("vegetable"))))
            {
              if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
              {
                a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-eat"));
              }
              else if (localPlayer.getFoodLevel() < 20)
              {
                localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_EAT, 10.0F, 1.0F);
                localPlayer.setFoodLevel(localPlayer.getFoodLevel() + 6);
                a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_PLAYER_BURP);
              }
              paramPlayerInteractEvent.setCancelled(true);
            }
          }
          catch (NullPointerException localNullPointerException2) {}
        }
      }
    }
  }
  
  @EventHandler
  public void i(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("commandExecutor")) && (((a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".onLeftClick").contains("true")) && ((paramPlayerInteractEvent.getAction().equals(Action.LEFT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.LEFT_CLICK_AIR)))) || ((a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".onRightClick").contains("true")) && ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))))))
        {
          if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
          {
            a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
          }
          else
          {
            String str = a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".command");
            str = str.replace("%playerName%", localPlayer.getName());
            str = str.replace("%playername%", localPlayer.getName());
            if (a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".commandSender").contains("player")) {
              localPlayer.performCommand(str);
            } else if (a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".commandSender").contains("console")) {
              Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), str);
            }
            if (!a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".actionbarMessage").contains("null")) {
              a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".actionbarMessage"));
            }
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, null);
          }
          paramPlayerInteractEvent.setCancelled(true);
        }
      }
      catch (NullPointerException localNullPointerException2) {}
    }
  }
  
  @EventHandler
  public void j(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
    if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("headWearable")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("beekeepermask")))) {
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
          return;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        if ((paramPlayerInteractEvent.getAction() != Action.RIGHT_CLICK_AIR) && (paramPlayerInteractEvent.getAction() != Action.RIGHT_CLICK_BLOCK)) {
          return;
        }
        if (localItemStack.hasItemMeta()) {
          paramPlayerInteractEvent.setCancelled(true);
        }
        if (paramPlayerInteractEvent.getPlayer().getInventory().getHelmet() == null)
        {
          a.jdField_a_of_type_ComEvill4merNewItemsFL.g(paramPlayerInteractEvent.getPlayer());
          paramPlayerInteractEvent.getPlayer().getInventory().setHelmet(localItemStack);
        }
      }
    }
  }
  
  @EventHandler
  public void a(InventoryClickEvent paramInventoryClickEvent)
  {
    Player localPlayer = (Player)paramInventoryClickEvent.getWhoClicked();
    if (paramInventoryClickEvent.getInventory().getType() == InventoryType.CRAFTING) {
      try
      {
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.c(paramInventoryClickEvent.getCurrentItem()))
        {
          if ((paramInventoryClickEvent.getAction() == InventoryAction.MOVE_TO_OTHER_INVENTORY) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramInventoryClickEvent.getCurrentItem()).contains("headWearable")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramInventoryClickEvent.getCurrentItem()).contains("beekeepermask"))) && ((localPlayer.getInventory().getHelmet() == null) || (localPlayer.getInventory().getHelmet().getType() == Material.AIR)))
          {
            paramInventoryClickEvent.setCancelled(true);
            localPlayer.getInventory().setHelmet(paramInventoryClickEvent.getCurrentItem());
            paramInventoryClickEvent.setCurrentItem(null);
          }
        }
        else if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(paramInventoryClickEvent.getCursor())) && (paramInventoryClickEvent.getRawSlot() == 5) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramInventoryClickEvent.getCursor()).contains("headWearable")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramInventoryClickEvent.getCursor()).contains("beekeepermask"))) && ((localPlayer.getInventory().getHelmet() == null) || (localPlayer.getInventory().getHelmet().getType() == Material.AIR)))
        {
          paramInventoryClickEvent.setCancelled(true);
          localPlayer.getInventory().setHelmet(paramInventoryClickEvent.getCursor());
          paramInventoryClickEvent.setCursor(null);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler
  public void k(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      try
      {
        ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
          return;
        }
        if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR)))
        {
          if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("ocarina")) && (paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().getType() == Material.GOLD_INGOT) && (!jdField_b_of_type_JavaUtilHashSet.contains(paramPlayerInteractEvent.getPlayer().getName().toString())) && (!c.contains(paramPlayerInteractEvent.getPlayer().getName().toString())))
          {
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(paramPlayerInteractEvent.getPlayer(), Sound.ENTITY_ITEM_BREAK);
            int i = paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().getAmount();
            if (i == 1)
            {
              if (!a.jdField_a_of_type_ComEvill4merNewItemsFJ.d(paramPlayerInteractEvent.getPlayer().getWorld().getName())) {
                paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().setType(Material.SOUL_SAND);
              } else if (a.jdField_a_of_type_ComEvill4merNewItemsFJ.d(paramPlayerInteractEvent.getPlayer().getWorld().getName())) {
                paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().setType(Material.GOLD_NUGGET);
              }
              c.add(paramPlayerInteractEvent.getPlayer().getName().toString());
            }
            else
            {
              if (i > 1) {
                paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().setAmount(i - 1);
              }
              c.add(paramPlayerInteractEvent.getPlayer().getName().toString());
            }
            jdField_b_of_type_JavaUtilHashSet.add(paramPlayerInteractEvent.getPlayer().getName().toString());
            paramPlayerInteractEvent.setCancelled(true);
          }
          else if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("ocarina")) && (paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand().getType() != Material.GOLD_INGOT))
          {
            paramPlayerInteractEvent.getPlayer().sendMessage(ChatColor.AQUA + ChatColor.BOLD + "[Ocarina] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("need-gold"));
            paramPlayerInteractEvent.setCancelled(true);
          }
          if ((paramPlayerInteractEvent.getPlayer().getItemInHand().hasItemMeta()) && (paramPlayerInteractEvent.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("ocarina")) && (jdField_b_of_type_JavaUtilHashSet.contains(paramPlayerInteractEvent.getPlayer().getName().toString())))
          {
            jdField_b_of_type_JavaUtilHashSet.remove(paramPlayerInteractEvent.getPlayer().getName().toString());
            paramPlayerInteractEvent.getPlayer().playSound(paramPlayerInteractEvent.getPlayer().getLocation(), "ocarina", 10.0F, 1.0F);
            Player localPlayer = paramPlayerInteractEvent.getPlayer();
            int j = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(a, new i(this, localPlayer, paramPlayerInteractEvent), 0L, 20L);
            jdField_b_of_type_JavaUtilMap.put(localPlayer.getName(), Integer.valueOf(j));
          }
        }
      }
      catch (Exception localException) {}
    }
  }
  
  @EventHandler
  public void l(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      if (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK))
      {
        ItemStack localItemStack1 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if ((paramPlayerInteractEvent.getClickedBlock().getType() == Material.WATER_LILY) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equals("fishfood")))
        {
          Player localPlayer = paramPlayerInteractEvent.getPlayer();
          int i = (int)(Math.random() * 5.0D + 1.0D);
          switch (i)
          {
          case 1: 
            BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(paramPlayerInteractEvent.getClickedBlock(), localPlayer);
            Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
            if (!localBlockBreakEvent.isCancelled())
            {
              c localC = new c(a);
              ItemStack localItemStack2 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".turtleToBeSpawned"));
              localC.a(paramPlayerInteractEvent.getClickedBlock(), localItemStack2);
            }
            else
            {
              if (a.b.getBoolean("show-no-build-permission-error")) {
                paramPlayerInteractEvent.getPlayer().sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim"));
              }
              return;
            }
            break;
          }
          a.jdField_a_of_type_ComEvill4merNewItemsFL.g(localPlayer);
        }
      }
    }
  }
  
  @EventHandler
  public void m(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if (paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
      {
        ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
          return;
        }
        if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
          try
          {
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("cigarettespack"))
            {
              if ((a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".cigaretteItem") != null) && (!a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".cigaretteItem").equals("none")) && (localPlayer.getInventory().firstEmpty() != -1))
              {
                a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
                localPlayer.getInventory().addItem(new ItemStack[] { (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".cigaretteItem")) });
              }
              paramPlayerInteractEvent.setCancelled(true);
            }
          }
          catch (NullPointerException localNullPointerException2) {}
        }
      }
    }
  }
  
  @EventHandler
  public void n(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if (paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
      {
        ItemStack localItemStack1 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) {
          return;
        }
        if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
          try
          {
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equals("cigarette"))
            {
              if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
              {
                localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-smoke"));
              }
              else
              {
                ItemStack localItemStack2;
                if ((a.c.getConfig().contains("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState1")) && (a.c.getConfig().contains("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState2")) && (a.c.getConfig().contains("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState3")))
                {
                  localItemStack2 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState1"));
                  localItemStack3 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState2"));
                  localItemStack4 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".cigaretteState3"));
                  a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localPlayer.getInventory().getItemInMainHand(), localItemStack1.clone(), localItemStack2.clone(), localItemStack3.clone(), localItemStack4.clone());
                }
                else
                {
                  localItemStack2 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l(a.c.getConfig().getString(new StringBuilder("item").append(a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1)).append(".fullCigarette").toString()) + ".cigaretteState1"));
                  localItemStack3 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l(a.c.getConfig().getString(new StringBuilder("item").append(a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1)).append(".fullCigarette").toString()) + ".cigaretteState2"));
                  localItemStack4 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l(a.c.getConfig().getString(new StringBuilder("item").append(a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1)).append(".fullCigarette").toString()) + ".cigaretteState3"));
                  a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localPlayer.getInventory().getItemInMainHand(), localItemStack1.clone(), localItemStack2.clone(), localItemStack3.clone(), localItemStack4.clone());
                }
              }
              paramPlayerInteractEvent.setCancelled(true);
            }
          }
          catch (NullPointerException localNullPointerException2)
          {
            try
            {
              ItemStack localItemStack3;
              ItemStack localItemStack4;
              if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
              {
                localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-smoke"));
              }
              else
              {
                localItemStack3 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".fullCigarette"));
                localItemStack4 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack3) + ".cigaretteState1"));
                ItemStack localItemStack5 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack3) + ".cigaretteState2"));
                ItemStack localItemStack6 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack3) + ".cigaretteState3"));
                a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localPlayer.getInventory().getItemInMainHand(), localItemStack3.clone(), localItemStack4.clone(), localItemStack5.clone(), localItemStack6.clone());
              }
              paramPlayerInteractEvent.setCancelled(true);
            }
            catch (NullPointerException localNullPointerException3)
            {
              paramPlayerInteractEvent.getPlayer().sendMessage("[NewItems] " + ChatColor.RED + "Contact admins! MISSING some cigaretteStates in config for this item.");
            }
          }
        }
      }
    }
  }
  
  @EventHandler
  public void c(BlockBreakEvent paramBlockBreakEvent)
  {
    if (paramBlockBreakEvent.isCancelled()) {
      return;
    }
    if ((paramBlockBreakEvent.getPlayer() instanceof Player))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      try
      {
        for (int i = 0; i <= 1560; i++) {
          if ((a.c.getConfig().contains("item" + i + ".type")) && (a.c.l("item" + i + ".type").equalsIgnoreCase("vegetable")) && (paramBlockBreakEvent.getBlock().getType() == Material.valueOf(a.c.l("item" + i + ".dropFromBlock"))))
          {
            int j;
            if ((a.c.l("item" + i + ".blockData") != null) && (!a.c.l("item" + i + ".blockData").equals("none")))
            {
              if (paramBlockBreakEvent.getBlock().getData() == a.c.getConfig().getInt("item" + i + ".blockData"))
              {
                j = (int)a.c.getConfig().getDouble("item" + i + ".chanceOfDrop");
                if ((int)(Math.random() * 100.0D) < j) {
                  localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), ((ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get("item" + i)).clone());
                }
              }
            }
            else
            {
              j = (int)a.c.getConfig().getDouble("item" + i + ".chanceOfDrop");
              if ((int)(Math.random() * 100.0D) < j) {
                localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), ((ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get("item" + i)).clone());
              }
            }
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public static void a(Player paramPlayer, Map paramMap)
  {
    if (paramMap.containsKey(paramPlayer.getName()))
    {
      int i = ((Integer)paramMap.get(paramPlayer.getName())).intValue();
      Bukkit.getServer().getScheduler().cancelTask(i);
      paramMap.remove(paramPlayer.getName());
    }
  }
  
  int a(int paramInt1, int paramInt2)
  {
    Random localRandom = new Random();
    return paramInt1 + localRandom.nextInt(paramInt2 - paramInt1);
  }
}
