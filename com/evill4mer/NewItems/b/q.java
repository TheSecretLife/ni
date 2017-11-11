package com.evill4mer.NewItems.b;

import a.a.a.e;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;

public class q
  implements Listener
{
  private final Main a;
  Map c = new HashMap();
  HashSet d = new HashSet();
  
  public q(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void q(PlayerInteractEvent paramPlayerInteractEvent)
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
      ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
      e localE = new e(localItemStack);
      if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
        return;
      }
      if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
        try
        {
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("teleportcrystal"))
          {
            if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
            {
              localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
              return;
            }
            if (localE.a("NIworld").booleanValue())
            {
              if (d.contains(localPlayer.getName().toString())) {
                return;
              }
              a.jdField_a_of_type_ComEvill4merNewItemsFI.f(localPlayer);
              if (a.jdField_a_of_type_ComEvill4merNewItemsFI.b(localItemStack) <= 0) {
                return;
              }
              int i = Bukkit.getScheduler().scheduleSyncRepeatingTask(a, new r(this, localPlayer, paramPlayerInteractEvent, localE), 0L, 20L);
              c.put(localPlayer.getName(), Integer.valueOf(i));
            }
            else
            {
              localE.setString("NIworld", localPlayer.getWorld().getName());
              localE.a("NIx", Integer.valueOf(localPlayer.getLocation().getBlockX()));
              localE.a("NIy", Integer.valueOf(localPlayer.getLocation().getBlockY()));
              localE.a("NIz", Integer.valueOf(localPlayer.getLocation().getBlockZ()));
              localE.a("NIyav", Float.valueOf(localPlayer.getLocation().getYaw()));
              localItemStack = localE.getItem();
              ItemMeta localItemMeta = localItemStack.getItemMeta();
              Object localObject = localItemMeta.getLore();
              if (localObject == null) {
                localObject = new ArrayList();
              }
              ((List)localObject).add(a.jdField_a_of_type_ComEvill4merNewItemsGA.l("coords"));
              ((List)localObject).add(ChatColor.WHITE + "World: " + localPlayer.getWorld().getName());
              ((List)localObject).add(ChatColor.WHITE + "X: " + localPlayer.getLocation().getBlockX());
              ((List)localObject).add(ChatColor.WHITE + "Y: " + localPlayer.getLocation().getBlockY());
              ((List)localObject).add(ChatColor.WHITE + "Z: " + localPlayer.getLocation().getBlockZ());
              ((List)localObject).add(ChatColor.WHITE + "Yaw: " + localPlayer.getLocation().getYaw());
              localItemMeta.setLore((List)localObject);
              localItemStack.setItemMeta(localItemMeta);
              localPlayer.getInventory().setItemInMainHand(localItemStack);
              localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("teleport-set"));
            }
            paramPlayerInteractEvent.setCancelled(true);
          }
        }
        catch (NullPointerException localNullPointerException2)
        {
          localNullPointerException2.printStackTrace();
        }
      }
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
}
