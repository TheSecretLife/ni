package com.evill4mer.NewItems.b;

import a.a.a.e;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.f.n;
import com.evill4mer.NewItems.g.a;
import java.util.HashSet;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;

class r
  implements Runnable
{
  int n;
  
  r(q paramQ, Player paramPlayer, PlayerInteractEvent paramPlayerInteractEvent, e paramE) {}
  
  public void run()
  {
    jdField_a_of_type_ComEvill4merNewItemsBQ.d.add(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
    ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("teleport-in") + (5 - n));
    if (n >= 5)
    {
      try
      {
        if ((jdField_a_of_type_OrgBukkitEntityPlayer.getInventory().getItemInMainHand() == null) || (jdField_a_of_type_OrgBukkitEntityPlayer.getInventory().getItemInMainHand().getType() == Material.AIR))
        {
          ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-teleport"));
          jdField_a_of_type_ComEvill4merNewItemsBQ.d.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
          q.a(jdField_a_of_type_OrgBukkitEntityPlayer, jdField_a_of_type_ComEvill4merNewItemsBQ.c);
          return;
        }
        if (!ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsI.b(jdField_a_of_type_OrgBukkitEntityPlayer.getInventory().getItemInMainHand()).contains("teleportcrystal"))
        {
          ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-teleport"));
          jdField_a_of_type_ComEvill4merNewItemsBQ.d.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
          q.a(jdField_a_of_type_OrgBukkitEntityPlayer, jdField_a_of_type_ComEvill4merNewItemsBQ.c);
          return;
        }
        if (ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFI.b(jdField_a_of_type_OrgBukkitEventPlayerPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand()) <= 0) {
          jdField_a_of_type_ComEvill4merNewItemsBQ.d.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
        }
        Location localLocation = new Location(Bukkit.getWorld(jdField_a_of_type_AAAE.getString("NIworld")), jdField_a_of_type_AAAE.getInteger("NIx").intValue(), jdField_a_of_type_AAAE.getInteger("NIy").intValue(), jdField_a_of_type_AAAE.getInteger("NIz").intValue());
        localLocation = localLocation.subtract(0.0D, 1.0D, 0.0D);
        int i = 1;
        if (ajdField_a_of_type_ComEvill4merNewItemsBQ).b.getBoolean("teleport-crystal-only-if-player-has-build-perms--DISABLE-IF-ANY-PROBLEM"))
        {
          BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(localLocation.getBlock(), jdField_a_of_type_OrgBukkitEntityPlayer);
          Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
          if (localBlockBreakEvent.isCancelled()) {
            i = 0;
          }
          if (localLocation.getBlock().getType() == Material.AIR) {
            i = 1;
          }
          localBlockBreakEvent.setCancelled(true);
        }
        else
        {
          i = 1;
        }
        if (i != 0)
        {
          localLocation.setYaw(jdField_a_of_type_AAAE.getFloat("NIyav").floatValue());
          try
          {
            jdField_a_of_type_OrgBukkitEntityPlayer.teleport(n.a(localLocation));
          }
          catch (Exception localException) {}
          ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("teleported"));
          jdField_a_of_type_ComEvill4merNewItemsBQ.d.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
        }
        else if (ajdField_a_of_type_ComEvill4merNewItemsBQ).b.getBoolean("show-no-build-permission-error"))
        {
          ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim-message"));
        }
      }
      catch (NullPointerException|IndexOutOfBoundsException localNullPointerException)
      {
        ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsFJ.a(jdField_a_of_type_OrgBukkitEntityPlayer, ajdField_a_of_type_ComEvill4merNewItemsBQ).jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-teleport"));
      }
      jdField_a_of_type_ComEvill4merNewItemsBQ.d.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName().toString());
      q.a(jdField_a_of_type_OrgBukkitEntityPlayer, jdField_a_of_type_ComEvill4merNewItemsBQ.c);
    }
    n += 1;
  }
}
