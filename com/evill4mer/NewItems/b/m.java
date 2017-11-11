package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.i;
import java.util.HashSet;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class m
  implements Listener
{
  private final Main a;
  
  public m(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  void b(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
  {
    if ((paramEntityDamageByEntityEvent.getEntity() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityDamageByEntityEvent.getEntity();
      if ((a.j.contains(localPlayer.getName())) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.g(localPlayer.getInventory().getItemInMainHand())) || (a.jdField_a_of_type_ComEvill4merNewItemsI.g(localPlayer.getInventory().getItemInOffHand()))))
      {
        if (localPlayer.getInventory().getItemInMainHand().getType() == Material.SHIELD) {
          a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ITEM_SHIELD_BREAK);
        }
        if (localPlayer.getInventory().getItemInOffHand().getType() == Material.SHIELD) {
          a.jdField_a_of_type_ComEvill4merNewItemsFI.b(localPlayer, Sound.ITEM_SHIELD_BREAK);
        }
      }
    }
  }
}
