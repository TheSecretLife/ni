package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.g.a;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class u
  implements Listener
{
  private final Main a;
  
  public u(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void t(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEvent.getPlayer();
    ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
    if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock()))) {
      return;
    }
    if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("pocketwatch")))
    {
      paramPlayerInteractEvent.setCancelled(true);
      a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("time") + a(localPlayer.getWorld().getTime()));
    }
  }
  
  public static String a(long paramLong)
  {
    long l1 = paramLong;
    long l2 = l1 / 1000L + 6L;
    long l3 = l1 % 1000L * 60L / 1000L;
    String str1 = "AM";
    if (l2 >= 12L)
    {
      l2 -= 12L;
      str1 = "PM";
    }
    if (l2 >= 12L)
    {
      l2 -= 12L;
      str1 = "AM";
    }
    if (l2 == 0L) {
      l2 = 12L;
    }
    String str2 = "0" + l3;
    str2 = str2.substring(str2.length() - 2, str2.length());
    return l2 + ":" + str2 + " " + str1;
  }
}
