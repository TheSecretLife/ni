package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.a.b;
import java.util.HashSet;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;

public class c
  implements Listener
{
  private final Main a;
  
  public c(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void b(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) && (!a.g.contains(paramPlayerInteractEvent.getPlayer().getName()))) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK))
      {
        ItemStack localItemStack1 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) {
          return;
        }
        if (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.LONG_GRASS) {
          paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().setType(Material.AIR);
        }
        if (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.LONG_GRASS) {
          paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().setType(Material.AIR);
        }
        if (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.LONG_GRASS) {
          paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().setType(Material.AIR);
        }
        paramPlayerInteractEvent.setCancelled(true);
        int i = 1;
        BlockPlaceEvent localBlockPlaceEvent = new BlockPlaceEvent(paramPlayerInteractEvent.getClickedBlock(), paramPlayerInteractEvent.getClickedBlock().getState(), paramPlayerInteractEvent.getClickedBlock(), new ItemStack(Material.STONE), localPlayer, true);
        Bukkit.getServer().getPluginManager().callEvent(localBlockPlaceEvent);
        if (!localBlockPlaceEvent.isCancelled())
        {
          i = 1;
          localBlockPlaceEvent.setCancelled(true);
        }
        else
        {
          i = 0;
          if (a.b.getBoolean("show-no-build-permission-error")) {
            paramPlayerInteractEvent.getPlayer().sendMessage("NewItems " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim-place"));
          }
          localBlockPlaceEvent.setCancelled(true);
        }
        try
        {
          if (i != 0)
          {
            ItemStack localItemStack2;
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equalsIgnoreCase("block"))
            {
              localItemStack2 = localItemStack1.clone();
              localItemStack2.setAmount(1);
              a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack2, Material.DOUBLE_STEP, 3, false, null, false, false);
            }
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equalsIgnoreCase("lightblock"))
            {
              localItemStack2 = localItemStack1.clone();
              localItemStack2.setAmount(1);
              a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack2, Material.GLOWSTONE, 3, false, null, false, false);
            }
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).equalsIgnoreCase("safe")) {
              a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.CHEST, 7, false, null, true, false);
            }
            Entity localEntity;
            ItemFrame localItemFrame;
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("chair")) {
              try
              {
                int j = 0;
                for (localEntity : paramPlayerInteractEvent.getClickedBlock().getChunk().getEntities()) {
                  if (localEntity.getLocation().getBlock().getLocation().equals(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D)))
                  {
                    localItemFrame = (ItemFrame)localEntity;
                    if (!localItemFrame.getItem().hasItemMeta())
                    {
                      j = 1;
                      a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, false, null, false, true);
                      return;
                    }
                    j = 0;
                    return;
                  }
                }
                if (j == 0) {
                  a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, false, null, false, true);
                }
              }
              catch (ClassCastException localClassCastException1) {}
            }
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("beehive")) {
              try
              {
                int k = 0;
                for (localEntity : paramPlayerInteractEvent.getClickedBlock().getChunk().getEntities()) {
                  if (localEntity.getLocation().getBlock().getLocation().equals(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D)))
                  {
                    localItemFrame = (ItemFrame)localEntity;
                    if (!localItemFrame.getItem().hasItemMeta())
                    {
                      k = 1;
                      a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, false, null, false, true);
                      return;
                    }
                    k = 0;
                    return;
                  }
                }
                if (k == 0) {
                  a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, false, null, false, true);
                }
              }
              catch (ClassCastException localClassCastException2) {}
            }
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("tardis")) {
              try
              {
                int m = 0;
                for (localEntity : paramPlayerInteractEvent.getClickedBlock().getChunk().getEntities()) {
                  if (localEntity.getLocation().getBlock().getLocation().equals(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D)))
                  {
                    localItemFrame = (ItemFrame)localEntity;
                    if (!localItemFrame.getItem().hasItemMeta())
                    {
                      m = 1;
                      a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, true, null, false, true);
                      return;
                    }
                    m = 0;
                    return;
                  }
                }
                if (m == 0) {
                  a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, true, null, false, true);
                }
              }
              catch (ClassCastException localClassCastException3) {}
            }
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("furniture")) {
              try
              {
                int n = 0;
                for (localEntity : paramPlayerInteractEvent.getClickedBlock().getChunk().getEntities()) {
                  if (localEntity.getLocation().getBlock().getLocation().equals(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D)))
                  {
                    localItemFrame = (ItemFrame)localEntity;
                    if (!localItemFrame.getItem().hasItemMeta())
                    {
                      n = 1;
                      a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, true, null, false, true);
                      return;
                    }
                    n = 0;
                    return;
                  }
                }
                if (n == 0) {
                  a.jdField_a_of_type_ComEvill4merAB.a(paramPlayerInteractEvent, localPlayer, localItemStack1, Material.STONE_SLAB2, 0, true, null, false, true);
                }
              }
              catch (ClassCastException localClassCastException4) {}
            }
          }
          return;
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
  
  @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
  public void b(BlockBreakEvent paramBlockBreakEvent)
  {
    if (paramBlockBreakEvent.isCancelled()) {
      return;
    }
    if ((paramBlockBreakEvent.getBlock().getType() == Material.DOUBLE_STEP) || (paramBlockBreakEvent.getBlock().getType() == Material.CHEST) || (paramBlockBreakEvent.getBlock().getType() == Material.TRAPPED_CHEST) || (paramBlockBreakEvent.getBlock().getType() == Material.GLOWSTONE))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      Location localLocation = paramBlockBreakEvent.getBlock().getLocation();
      ItemFrame localItemFrame;
      Object localObject;
      try
      {
        for (Entity localEntity1 : localLocation.getChunk().getEntities()) {
          if (localEntity1.getLocation().getBlock().getLocation().equals(localLocation))
          {
            localItemFrame = (ItemFrame)localEntity1;
            localObject = localItemFrame.getItem();
            if (a.jdField_a_of_type_ComEvill4merNewItemsI.c((ItemStack)localObject))
            {
              if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b((ItemStack)localObject).equalsIgnoreCase("block")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b((ItemStack)localObject).equalsIgnoreCase("lightblock")))
              {
                ItemStack localItemStack = ((ItemStack)localObject).clone();
                localItemStack.setAmount(1);
                localPlayer.getWorld().getBlockAt(localItemFrame.getLocation()).setType(Material.AIR);
                localItemFrame.setItem(new ItemStack(Material.AIR));
                localItemFrame.remove();
                if (localPlayer.getGameMode() == GameMode.SURVIVAL) {
                  localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), localItemStack);
                }
                return;
              }
              if (a.jdField_a_of_type_ComEvill4merNewItemsI.b((ItemStack)localObject).equalsIgnoreCase("safe"))
              {
                if ((com.evill4mer.a.a.a.contains("chests." + paramBlockBreakEvent.getBlock().getX() + paramBlockBreakEvent.getBlock().getY() + paramBlockBreakEvent.getBlock().getZ())) && (com.evill4mer.a.a.a.getString("chests." + paramBlockBreakEvent.getBlock().getX() + paramBlockBreakEvent.getBlock().getY() + paramBlockBreakEvent.getBlock().getZ()).contains(localPlayer.getName())))
                {
                  a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-unlocked"));
                  com.evill4mer.a.a.a.set("chests." + paramBlockBreakEvent.getBlock().getX() + paramBlockBreakEvent.getBlock().getY() + paramBlockBreakEvent.getBlock().getZ(), null);
                  com.evill4mer.a.a.b();
                }
                localPlayer.getWorld().getBlockAt(localItemFrame.getLocation()).setType(Material.AIR);
                localItemFrame.setItem(new ItemStack(Material.AIR));
                localItemFrame.remove();
                if (localPlayer.getGameMode() == GameMode.SURVIVAL) {
                  localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), (ItemStack)localObject);
                }
                return;
              }
            }
          }
        }
      }
      catch (ClassCastException localClassCastException1) {}
      if (paramBlockBreakEvent.getBlock().getType() == Material.CHEST)
      {
        localPlayer = paramBlockBreakEvent.getPlayer();
        localLocation = paramBlockBreakEvent.getBlock().getLocation();
        try
        {
          for (Entity localEntity2 : localLocation.getChunk().getEntities()) {
            if (localEntity2.getLocation().getBlock().getLocation().equals(localLocation))
            {
              localItemFrame = (ItemFrame)localEntity2;
              if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("safe")))
              {
                localItemFrame.setItem(new ItemStack(Material.AIR));
                localItemFrame.remove();
                if (localPlayer.getGameMode() == GameMode.SURVIVAL) {
                  localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), localItemFrame.getItem());
                }
                localObject = new BlockBreakEvent(paramBlockBreakEvent.getBlock(), localPlayer);
                Bukkit.getServer().getPluginManager().callEvent((Event)localObject);
                return;
              }
            }
          }
        }
        catch (ClassCastException localClassCastException2) {}
      }
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void a(HangingBreakByEntityEvent paramHangingBreakByEntityEvent)
  {
    if ((paramHangingBreakByEntityEvent.getEntity() instanceof ItemFrame))
    {
      ItemFrame localItemFrame = (ItemFrame)paramHangingBreakByEntityEvent.getEntity();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("block")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("lightblock")))) {
        paramHangingBreakByEntityEvent.setCancelled(true);
      }
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void a(EntityDamageEvent paramEntityDamageEvent)
  {
    if ((paramEntityDamageEvent.getEntity() instanceof ItemFrame))
    {
      ItemFrame localItemFrame = (ItemFrame)paramEntityDamageEvent.getEntity();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("block")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("safe")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("lightblock")))) {
        paramEntityDamageEvent.setCancelled(true);
      }
    }
  }
  
  @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
  public void b(EntityDamageEvent paramEntityDamageEvent)
  {
    if (paramEntityDamageEvent.isCancelled()) {
      return;
    }
    if ((paramEntityDamageEvent.getEntity() instanceof ItemFrame))
    {
      ItemFrame localItemFrame = (ItemFrame)paramEntityDamageEvent.getEntity();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).contains("chair")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("beehive"))))
      {
        if ((((EntityDamageByEntityEvent)paramEntityDamageEvent).getDamager() instanceof Arrow))
        {
          paramEntityDamageEvent.setCancelled(true);
          return;
        }
        if ((((EntityDamageByEntityEvent)paramEntityDamageEvent).getDamager() instanceof Player))
        {
          localItemFrame.remove();
          if (((Player)((EntityDamageByEntityEvent)paramEntityDamageEvent).getDamager()).getGameMode() == GameMode.SURVIVAL) {
            paramEntityDamageEvent.getEntity().getWorld().dropItem(paramEntityDamageEvent.getEntity().getLocation(), localItemFrame.getItem());
          }
        }
      }
    }
  }
  
  @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
  public void c(EntityDamageEvent paramEntityDamageEvent)
  {
    if (paramEntityDamageEvent.isCancelled()) {
      return;
    }
    try
    {
      if ((paramEntityDamageEvent.getEntity() instanceof ArmorStand))
      {
        Player localPlayer = (Player)((EntityDamageByEntityEvent)paramEntityDamageEvent).getDamager();
        ItemStack localItemStack = ((LivingEntity)paramEntityDamageEvent.getEntity()).getEquipment().getHelmet();
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("tardis")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("furniture"))))
        {
          paramEntityDamageEvent.getEntity().remove();
          if (localPlayer.getGameMode() == GameMode.SURVIVAL)
          {
            localItemStack.setAmount(1);
            paramEntityDamageEvent.getEntity().getWorld().dropItem(paramEntityDamageEvent.getEntity().getLocation(), localItemStack);
          }
        }
      }
    }
    catch (ClassCastException localClassCastException) {}
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void a(HangingBreakEvent paramHangingBreakEvent)
  {
    if (!(paramHangingBreakEvent instanceof HangingBreakByEntityEvent))
    {
      paramHangingBreakEvent.setCancelled(true);
      return;
    }
    HangingBreakByEntityEvent localHangingBreakByEntityEvent = (HangingBreakByEntityEvent)paramHangingBreakEvent;
    Entity localEntity = localHangingBreakByEntityEvent.getRemover();
    if (!(localEntity instanceof Player))
    {
      paramHangingBreakEvent.setCancelled(true);
      return;
    }
  }
  
  @EventHandler
  public void b(BlockPlaceEvent paramBlockPlaceEvent)
  {
    if (paramBlockPlaceEvent.getBlock().getType() == Material.HOPPER)
    {
      Location localLocation = paramBlockPlaceEvent.getBlock().getLocation();
      localLocation = localLocation.add(0.0D, 1.0D, 0.0D);
      try
      {
        for (Entity localEntity : localLocation.getChunk().getEntities()) {
          if (localEntity.getLocation().getBlock().getLocation().equals(localLocation))
          {
            ItemFrame localItemFrame = (ItemFrame)localEntity;
            if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("safe"))) {
              paramBlockPlaceEvent.setCancelled(true);
            }
          }
        }
      }
      catch (ClassCastException localClassCastException)
      {
        paramBlockPlaceEvent.setCancelled(true);
      }
    }
  }
  
  @EventHandler
  public void a(InventoryMoveItemEvent paramInventoryMoveItemEvent)
  {
    if (paramInventoryMoveItemEvent.getDestination().getType() == InventoryType.HOPPER)
    {
      Location localLocation = paramInventoryMoveItemEvent.getSource().getLocation();
      try
      {
        paramInventoryMoveItemEvent.setCancelled(true);
        for (Entity localEntity1 : localLocation.getChunk().getEntities()) {
          if ((localEntity1.getLocation().getBlock().getLocation().equals(localLocation)) && ((localEntity1 instanceof ItemFrame)))
          {
            ItemFrame localItemFrame = (ItemFrame)localEntity1;
            if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("safe")))
            {
              paramInventoryMoveItemEvent.setCancelled(true);
              localLocation = localLocation.add(0.0D, -1.0D, 0.0D);
              for (Entity localEntity2 : localLocation.getChunk().getEntities()) {
                if ((localEntity2.getLocation().getBlock().getLocation().equals(localLocation)) && ((localEntity2 instanceof Minecart))) {
                  localEntity2.remove();
                }
              }
              return;
            }
          }
        }
        paramInventoryMoveItemEvent.setCancelled(false);
      }
      catch (ClassCastException localClassCastException)
      {
        paramInventoryMoveItemEvent.setCancelled(true);
      }
    }
  }
  
  @EventHandler
  public void b(PlayerInteractEntityEvent paramPlayerInteractEntityEvent)
  {
    Entity localEntity = paramPlayerInteractEntityEvent.getRightClicked();
    if ((localEntity instanceof ItemFrame))
    {
      ItemFrame localItemFrame = (ItemFrame)localEntity;
      localItemFrame.getItem();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) && ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("block")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("beehive")) || (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equalsIgnoreCase("lightblock")))) {
        paramPlayerInteractEntityEvent.setCancelled(true);
      }
    }
  }
}
