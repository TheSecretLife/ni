package com.evill4mer.NewItems.d;

import com.evill4mer.NewItems.Main;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

public class c
{
  private final Main a;
  
  public c(Main paramMain)
  {
    a = paramMain;
  }
  
  public void a(Map paramMap)
  {
    Bukkit.getScheduler().scheduleSyncRepeatingTask(a, new d(this, paramMap), 0L, 20L);
  }
}
