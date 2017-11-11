package com.evill4mer.NewItems;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.bukkit.Server;
import org.bukkit.entity.Player;

class s
  implements Runnable
{
  s(Main paramMain) {}
  
  public void run()
  {
    Iterator localIterator = b.getServer().getOnlinePlayers().iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      if (localPlayer.isBlocking()) {
        b.j.add(localPlayer.getName());
      } else if (b.j.contains(localPlayer.getName())) {
        b.j.remove(localPlayer.getName());
      }
    }
  }
}
