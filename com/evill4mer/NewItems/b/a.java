package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.i;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class a
  implements Listener
{
  private final Main a;
  
  public a(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  void a(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
  {
    if (paramEntityDamageByEntityEvent.isCancelled()) {
      return;
    }
    if ((paramEntityDamageByEntityEvent.getEntity() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityDamageByEntityEvent.getEntity();
      ItemStack localItemStack = localPlayer.getInventory().getHelmet();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.h(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getChestplate();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.i(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.b(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getLeggings();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.j(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.c(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getBoots();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.k(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.d(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
    }
  }
  
  @EventHandler
  void a(EntityDamageByBlockEvent paramEntityDamageByBlockEvent)
  {
    if (paramEntityDamageByBlockEvent.isCancelled()) {
      return;
    }
    if ((paramEntityDamageByBlockEvent.getEntity() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityDamageByBlockEvent.getEntity();
      ItemStack localItemStack = localPlayer.getInventory().getHelmet();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.h(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getChestplate();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.i(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.b(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getLeggings();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.j(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.c(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
      localItemStack = localPlayer.getInventory().getBoots();
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.k(localItemStack)) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.d(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
      }
    }
  }
}
