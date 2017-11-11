package com.evill4mer.NewItems.b;

import java.util.HashSet;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.Spigot;
import org.bukkit.event.player.PlayerInteractEvent;

class i
  implements Runnable
{
  int jdField_a_of_type_Int = 0;
  
  i(h paramH, Player paramPlayer, PlayerInteractEvent paramPlayerInteractEvent) {}
  
  public void run()
  {
    jdField_a_of_type_Int += 1;
    if (b.getHealth() + 2.0D <= b.getMaxHealth()) {
      b.setHealth(b.getHealth() + 2.0D);
    }
    jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().spigot().playEffect(jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().getLocation(), Effect.NOTE, 0, 0, 1.0F, 1.0F, 1.0F, 0.4F, 20, 2);
    if (jdField_a_of_type_Int > 7)
    {
      h.a(b, jdField_a_of_type_ComEvill4merNewItemsBH.b);
      jdField_a_of_type_ComEvill4merNewItemsBH.c.remove(jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().getName().toString());
    }
  }
}
