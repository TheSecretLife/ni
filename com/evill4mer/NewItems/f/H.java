package com.evill4mer.NewItems.f;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class H
  implements Listener
{
  public H() {}
  
  @EventHandler
  public void b(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    if (b(localPlayer)) {
      localPlayer.setGliding(true);
    }
    if ((c(localPlayer)) && (a(localPlayer))) {
      localPlayer.setGliding(false);
    }
  }
  
  public static boolean a(Player paramPlayer)
  {
    if (paramPlayer.getEquipment().getChestplate() == null) {
      return false;
    }
    return paramPlayer.getEquipment().getChestplate().getType().equals(Material.ELYTRA);
  }
  
  public static boolean b(Player paramPlayer)
  {
    if ((paramPlayer.getLocation().getBlock().getType() == Material.STATIONARY_WATER) && (paramPlayer.getLocation().subtract(0.0D, 4.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) && (paramPlayer.getVehicle() == null) && (!d(paramPlayer)) && (!paramPlayer.isFlying()) && (paramPlayer.getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR))
    {
      if (paramPlayer.getEquipment().getChestplate() == null) {
        return true;
      }
      return !paramPlayer.getEquipment().getChestplate().getType().equals(Material.ELYTRA);
    }
    return false;
  }
  
  public static boolean c(Player paramPlayer)
  {
    return (paramPlayer.getLocation().getBlock().getType() == Material.STATIONARY_WATER) && (paramPlayer.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) && (paramPlayer.getVehicle() == null) && (!d(paramPlayer)) && (!paramPlayer.isFlying()) && (paramPlayer.getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR);
  }
  
  public static boolean d(Player paramPlayer)
  {
    return paramPlayer.getGameMode() == GameMode.CREATIVE;
  }
  
  @EventHandler
  public void a(EntityToggleGlideEvent paramEntityToggleGlideEvent)
  {
    if ((paramEntityToggleGlideEvent.getEntity() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityToggleGlideEvent.getEntity();
      if (b(localPlayer)) {
        paramEntityToggleGlideEvent.setCancelled(true);
      }
    }
  }
}
