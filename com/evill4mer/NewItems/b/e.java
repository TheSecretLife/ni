package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.g.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.Sound;
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

public class e
  implements Listener
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  Map jdField_a_of_type_JavaUtilMap = new HashMap();
  HashSet jdField_a_of_type_JavaUtilHashSet = new HashSet();
  
  public e(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  @EventHandler
  public void d(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if (!jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
        return;
      }
      if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
        try
        {
          if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("guitar"))
          {
            if (!jdField_a_of_type_JavaUtilHashSet.contains(localPlayer.getName().toString()))
            {
              jdField_a_of_type_JavaUtilHashSet.add(localPlayer.getName().toString());
              jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("playing") + localItemStack.getItemMeta().getDisplayName());
              jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
              String str1 = "";
              int i = (int)(Math.random() * 3.0D + 1.0D);
              switch (i)
              {
              case 1: 
                localPlayer.playSound(localPlayer.getLocation(), "guitar1", 10.0F, 1.0F);
                str1 = "guitar1";
                break;
              case 2: 
                localPlayer.playSound(localPlayer.getLocation(), "guitar2", 10.0F, 1.0F);
                str1 = "guitar2";
                break;
              case 3: 
                localPlayer.playSound(localPlayer.getLocation(), "guitar3", 10.0F, 1.0F);
                str1 = "guitar3";
              }
              String str2 = str1;
              int j = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(jdField_a_of_type_ComEvill4merNewItemsMain, new f(this, localPlayer, paramPlayerInteractEvent, str2), 0L, 20L);
              jdField_a_of_type_JavaUtilMap.put(localPlayer.getName(), Integer.valueOf(j));
            }
            else
            {
              jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("wait"));
            }
            paramPlayerInteractEvent.setCancelled(true);
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
}
