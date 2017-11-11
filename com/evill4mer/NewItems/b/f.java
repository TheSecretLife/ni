package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.Main;
import java.util.HashSet;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.Spigot;
import org.bukkit.event.player.PlayerInteractEvent;

class f
  implements Runnable
{
  int jdField_a_of_type_Int = 0;
  
  f(e paramE, Player paramPlayer, PlayerInteractEvent paramPlayerInteractEvent, String paramString) {}
  
  public void run()
  {
    jdField_a_of_type_Int += 1;
    if (jdField_a_of_type_Int <= 8)
    {
      jdField_a_of_type_OrgBukkitEntityPlayer.spigot().playEffect(jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().getLocation(), Effect.NOTE, 0, 0, 1.0F, 1.0F, 1.0F, 0.4F, 20, 2);
      if (h.equals("guitar3")) {
        jdField_a_of_type_OrgBukkitEntityPlayer.spigot().playEffect(jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().getLocation(), Effect.FLAME, 0, 0, 1.0F, 1.0F, 1.0F, 0.4F, 20, 2);
      }
    }
    if (jdField_a_of_type_Int > 12)
    {
      jdField_a_of_type_ComEvill4merNewItemsBE.jdField_a_of_type_JavaUtilHashSet.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
      Main.a(jdField_a_of_type_OrgBukkitEntityPlayer, jdField_a_of_type_ComEvill4merNewItemsBE.jdField_a_of_type_JavaUtilMap);
    }
  }
}
