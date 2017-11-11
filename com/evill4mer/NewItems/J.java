package com.evill4mer.NewItems;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class J
  implements Listener
{
  private final Main a;
  
  public J(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void a(PlayerJoinEvent paramPlayerJoinEvent)
  {
    Bukkit.getServer().getScheduler().runTaskLaterAsynchronously(a, new K(this, paramPlayerJoinEvent), 1L);
  }
}
