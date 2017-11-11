package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.f.p;
import com.evill4mer.NewItems.g.a;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.PluginManager;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.Vector;

public class g
  implements Listener
{
  private final Main a;
  
  public g(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void a(ProjectileHitEvent paramProjectileHitEvent)
  {
    if (!paramProjectileHitEvent.getEntity().hasMetadata("niProjectile")) {
      return;
    }
    BlockIterator localBlockIterator = new BlockIterator(paramProjectileHitEvent.getEntity().getWorld(), paramProjectileHitEvent.getEntity().getLocation().toVector(), paramProjectileHitEvent.getEntity().getVelocity().normalize(), 0.0D, 4);
    Block localBlock = null;
    while (localBlockIterator.hasNext())
    {
      localBlock = localBlockIterator.next();
      if (localBlock.getTypeId() != 0) {
        break;
      }
    }
    localBlock.getWorld().playEffect(localBlock.getLocation(), Effect.STEP_SOUND, localBlock.getTypeId());
    if ((localBlock.getType() == Material.GLASS) || (localBlock.getType() == Material.STAINED_GLASS) || (localBlock.getType() == Material.STAINED_GLASS_PANE))
    {
      BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(localBlock, Bukkit.getServer().getPlayer(((MetadataValue)paramProjectileHitEvent.getEntity().getMetadata("playerName").get(0)).asString()));
      Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
      if (!localBlockBreakEvent.isCancelled()) {
        localBlock.setType(Material.AIR);
      }
    }
    paramProjectileHitEvent.getEntity().remove();
  }
  
  @EventHandler
  public void a(PlayerPickupItemEvent paramPlayerPickupItemEvent)
  {
    if (paramPlayerPickupItemEvent.getItem().hasMetadata("no_pickup")) {
      paramPlayerPickupItemEvent.setCancelled(true);
    }
  }
  
  @EventHandler
  public void e(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if ((paramPlayerInteractEvent.getAction().equals(Action.LEFT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.LEFT_CLICK_AIR)))
      {
        ItemStack localItemStack1 = localPlayer.getInventory().getItemInMainHand();
        ItemStack localItemStack2 = localPlayer.getInventory().getItemInOffHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack1)) {
          return;
        }
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1).contains("gun")) {
          if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack2)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack2).contains("projectile")))
          {
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
            Projectile localProjectile = localPlayer.launchProjectile(Arrow.class);
            a.jdField_a_of_type_ComEvill4merNewItemsFP.a(localProjectile.getEntityId());
            localProjectile.setMetadata("no_pickup", new FixedMetadataValue(a, Boolean.valueOf(true)));
            localProjectile.setMetadata("niProjectile", new FixedMetadataValue(a, Boolean.valueOf(true)));
            localProjectile.setMetadata("playerName", new FixedMetadataValue(a, localPlayer.getName()));
            localPlayer.getWorld().playEffect(localPlayer.getEyeLocation(), Effect.SMOKE, 2);
            int i = (int)(Math.random() * 3.0D + 1.0D);
            switch (i)
            {
            case 1: 
              localPlayer.playSound(localPlayer.getLocation(), "revolver1", 10.0F, 1.0F);
              break;
            case 2: 
              localPlayer.playSound(localPlayer.getLocation(), "revolver2", 10.0F, 1.0F);
              break;
            case 3: 
              localPlayer.playSound(localPlayer.getLocation(), "revolver3", 10.0F, 1.0F);
            }
            if (localPlayer.getInventory().getItemInOffHand().getAmount() > 1) {
              localPlayer.getInventory().getItemInOffHand().setAmount(localPlayer.getInventory().getItemInOffHand().getAmount() - 1);
            } else {
              localPlayer.getInventory().setItemInOffHand(new ItemStack(Material.SULPHUR, 1));
            }
          }
          else
          {
            a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("no-ammo"));
            localPlayer.playSound(localPlayer.getLocation(), "click", 10.0F, 1.0F);
          }
        }
      }
    }
  }
  
  @EventHandler
  public void a(EntityShootBowEvent paramEntityShootBowEvent)
  {
    if ((paramEntityShootBowEvent.getEntity() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityShootBowEvent.getEntity();
      if (localPlayer.getInventory().getItemInMainHand().hasItemMeta())
      {
        ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
          return;
        }
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("bow")) {
          a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
        }
      }
    }
  }
}
