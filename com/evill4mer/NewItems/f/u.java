package com.evill4mer.NewItems.f;

import java.util.Iterator;
import java.util.List;
import net.minecraft.server.v1_11_R1.PacketPlayOutPlayerInfo;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class u
  extends BukkitRunnable
{
  u(t paramT, Location paramLocation, PacketPlayOutPlayerInfo paramPacketPlayOutPlayerInfo) {}
  
  public void run()
  {
    List localList = c.getWorld().getPlayers();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      t.a(jdField_a_of_type_NetMinecraftServerV1_11_R1PacketPlayOutPlayerInfo, localPlayer);
    }
  }
}
