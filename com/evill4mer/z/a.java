package com.evill4mer.z;

import com.evill4mer.NewItems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.scheduler.BukkitScheduler;

public class a
{
  private final Main a;
  
  public a(Main paramMain)
  {
    a = paramMain;
  }
  
  public void send()
  {
    Bukkit.getServer().getScheduler().runTaskLaterAsynchronously(a, new b(this), 20L);
  }
}
