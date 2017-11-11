package com.evill4mer.NewItems;

import com.evill4mer.NewItems.g.a;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

class N
  implements Runnable
{
  N(M paramM, Player paramPlayer) {}
  
  public void run()
  {
    if (L.a(M.a(a)).getConfig().getBoolean("kickPlayersThatAreNotAcceptingResourcePack")) {
      d.kickPlayer(aaa)).a.l("kickNoResPackMessage"));
    }
  }
}
