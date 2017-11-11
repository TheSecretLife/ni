package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.l;
import com.evill4mer.b.b;
import com.evill4mer.b.c;
import java.util.LinkedHashMap;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class d
  implements Listener
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  com.evill4mer.b.a jdField_a_of_type_ComEvill4merBA;
  b jdField_a_of_type_ComEvill4merBB;
  c jdField_a_of_type_ComEvill4merBC;
  
  public d(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
    jdField_a_of_type_ComEvill4merBA = new com.evill4mer.b.a(paramMain);
    jdField_a_of_type_ComEvill4merBB = new b(paramMain);
    jdField_a_of_type_ComEvill4merBC = new c(paramMain);
  }
  
  @EventHandler
  public void c(PlayerInteractEvent paramPlayerInteractEvent)
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
      if (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK))
      {
        ItemStack localItemStack1 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) {
          try
          {
            if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equals("egg"))
            {
              paramPlayerInteractEvent.setCancelled(true);
              ItemStack localItemStack2 = (ItemStack)jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsH.a.get(jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".mobToBeSpawned"));
              if (jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack2) + ".type").equals("bee"))
              {
                if (paramPlayerInteractEvent.getPlayer().getGameMode() != GameMode.CREATIVE) {
                  jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFL.g(paramPlayerInteractEvent.getPlayer());
                }
                jdField_a_of_type_ComEvill4merBA.a(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock(), localItemStack2);
                return;
              }
              if (jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack2) + ".type").equals("crab"))
              {
                if (paramPlayerInteractEvent.getPlayer().getGameMode() != GameMode.CREATIVE) {
                  jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFL.g(paramPlayerInteractEvent.getPlayer());
                }
                jdField_a_of_type_ComEvill4merBB.a(paramPlayerInteractEvent.getClickedBlock(), localItemStack2);
                return;
              }
              if (jdField_a_of_type_ComEvill4merNewItemsMain.c.l("item" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack2) + ".type").equals("turtle"))
              {
                if (paramPlayerInteractEvent.getPlayer().getGameMode() != GameMode.CREATIVE) {
                  jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFL.g(paramPlayerInteractEvent.getPlayer());
                }
                jdField_a_of_type_ComEvill4merBC.a(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock(), localItemStack2);
                return;
              }
            }
          }
          catch (NullPointerException localNullPointerException2) {}
        }
      }
    }
  }
}
