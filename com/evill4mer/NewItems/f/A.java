package com.evill4mer.NewItems.f;

import java.util.Iterator;
import java.util.List;
import net.minecraft.server.v1_9_R1.PacketPlayOutPlayerInfo;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class A
  extends BukkitRunnable
{
  A(z paramZ, Location paramLocation, PacketPlayOutPlayerInfo paramPacketPlayOutPlayerInfo) {}
  
  public void run()
  {
    List localList = c.getWorld().getPlayers();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      z.a(jdField_a_of_type_NetMinecraftServerV1_9_R1PacketPlayOutPlayerInfo, localPlayer);
    }
  }
}
