package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.i;
import java.util.LinkedHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;

public class n
  implements Listener
{
  private final Main a;
  
  public n(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void c(PlayerInteractEntityEvent paramPlayerInteractEntityEvent)
  {
    if (paramPlayerInteractEntityEvent.getHand() == EquipmentSlot.HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEntityEvent.getPlayer();
    if (paramPlayerInteractEntityEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
    {
      ItemStack localItemStack1 = paramPlayerInteractEntityEvent.getPlayer().getInventory().getItemInMainHand();
      if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) {
        return;
      }
      try
      {
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("smoker"))
        {
          if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
          {
            localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
          }
          else
          {
            if (paramPlayerInteractEntityEvent.getRightClicked().getPassenger().getCustomName().equals("NIBeeIcon"))
            {
              a.b(localPlayer);
              Zombie localZombie = (Zombie)paramPlayerInteractEntityEvent.getRightClicked().getPassenger();
              ItemStack localItemStack2 = localZombie.getEquipment().getHelmet();
              com.evill4mer.b.a localA = new com.evill4mer.b.a(a);
              localPlayer.getWorld().dropItem(paramPlayerInteractEntityEvent.getRightClicked().getLocation(), localA.a(localItemStack2));
              localPlayer.getWorld().playSound(localPlayer.getLocation(), Sound.ENTITY_BAT_DEATH, 10.0F, 1.0F);
              paramPlayerInteractEntityEvent.getRightClicked().getPassenger().remove();
              paramPlayerInteractEntityEvent.getRightClicked().remove();
            }
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
          }
          paramPlayerInteractEntityEvent.setCancelled(true);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler
  public void f(BlockBreakEvent paramBlockBreakEvent)
  {
    if ((paramBlockBreakEvent.getPlayer() instanceof Player))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      ItemStack localItemStack = localPlayer.getInventory().getHelmet();
      try
      {
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
          return;
        }
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("beekeepermask")) {
          return;
        }
        com.evill4mer.b.a localA = new com.evill4mer.b.a(a);
        if (localA.a(paramBlockBreakEvent.getBlock().getType()))
        {
          a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, localItemStack, Sound.ENTITY_ITEM_BREAK);
          int i = (int)(Math.random() * 5.0D + 1.0D);
          switch (i)
          {
          case 1: 
            BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(paramBlockBreakEvent.getBlock(), localPlayer);
            Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
            if (!localBlockBreakEvent.isCancelled()) {
              localA.a(paramBlockBreakEvent.getBlock(), (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".beeToBeSpawned")));
            } else if (a.b.getBoolean("show-no-build-permission-error")) {
              paramBlockBreakEvent.getPlayer().sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim"));
            }
            break;
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
}
