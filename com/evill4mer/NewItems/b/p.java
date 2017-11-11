package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.f.n;
import com.evill4mer.NewItems.g.a;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.util.Vector;

public class p
  implements Listener
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  private static final Random jdField_a_of_type_JavaUtilRandom = new Random();
  
  public p(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
  public void a(PlayerArmorStandManipulateEvent paramPlayerArmorStandManipulateEvent)
  {
    if (paramPlayerArmorStandManipulateEvent.isCancelled()) {
      return;
    }
    ItemStack localItemStack = paramPlayerArmorStandManipulateEvent.getRightClicked().getEquipment().getHelmet();
    if (!jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
      return;
    }
    if ((localItemStack.hasItemMeta()) && (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("tardis"))) {
      paramPlayerArmorStandManipulateEvent.setCancelled(true);
    }
  }
  
  @EventHandler(ignoreCancelled=true)
  public void a(PlayerInteractAtEntityEvent paramPlayerInteractAtEntityEvent)
  {
    if (paramPlayerInteractAtEntityEvent.isCancelled()) {
      return;
    }
    if ((paramPlayerInteractAtEntityEvent.getRightClicked() instanceof ArmorStand))
    {
      ItemStack localItemStack = ((LivingEntity)paramPlayerInteractAtEntityEvent.getRightClicked()).getEquipment().getHelmet();
      if (!jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
        return;
      }
      if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("tardis"))
      {
        paramPlayerInteractAtEntityEvent.setCancelled(true);
        Player localPlayer = paramPlayerInteractAtEntityEvent.getPlayer();
        if ((paramPlayerInteractAtEntityEvent.getPlayer().getInventory().getItemInMainHand() != null) && (!jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.c(paramPlayerInteractAtEntityEvent.getPlayer().getInventory().getItemInMainHand())))
        {
          jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayerInteractAtEntityEvent.getPlayer(), jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("needSonicscrewdriver"));
          return;
        }
        if (!jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractAtEntityEvent.getPlayer().getInventory().getItemInMainHand()).contains("sonicscrewdriver"))
        {
          jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayerInteractAtEntityEvent.getPlayer(), jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("needSonicscrewdriver"));
          return;
        }
        int i = 1;
        BlockPlaceEvent localBlockPlaceEvent1 = new BlockPlaceEvent(paramPlayerInteractAtEntityEvent.getRightClicked().getLocation().getBlock(), paramPlayerInteractAtEntityEvent.getRightClicked().getLocation().getBlock().getState(), paramPlayerInteractAtEntityEvent.getRightClicked().getLocation().getBlock(), new ItemStack(Material.STONE), localPlayer, true);
        Bukkit.getServer().getPluginManager().callEvent(localBlockPlaceEvent1);
        if (!localBlockPlaceEvent1.isCancelled())
        {
          i = 1;
          localBlockPlaceEvent1.setCancelled(true);
        }
        else
        {
          i = 0;
          localBlockPlaceEvent1.setCancelled(true);
        }
        if (i == 0)
        {
          if (jdField_a_of_type_ComEvill4merNewItemsMain.b.getBoolean("show-no-build-permission-error")) {
            jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim-message"));
          }
          return;
        }
        paramPlayerInteractAtEntityEvent.getRightClicked().remove();
        Location localLocation = new Location(localPlayer.getWorld(), a(-jdField_a_of_type_ComEvill4merNewItemsMain.b.getDouble("tardisRandomTPmaxX"), jdField_a_of_type_ComEvill4merNewItemsMain.b.getDouble("tardisRandomTPmaxX")), 100.0D, a(-jdField_a_of_type_ComEvill4merNewItemsMain.b.getDouble("tardisRandomTPmaxX"), jdField_a_of_type_ComEvill4merNewItemsMain.b.getDouble("tardisRandomTPmaxX")));
        try
        {
          localLocation = n.b(localLocation);
        }
        catch (Exception localException) {}
        localPlayer.teleport(localLocation);
        jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
        int j = 1;
        BlockPlaceEvent localBlockPlaceEvent2 = new BlockPlaceEvent(localLocation.getBlock(), localLocation.getBlock().getState(), localLocation.getBlock(), new ItemStack(Material.STONE), localPlayer, true);
        Bukkit.getServer().getPluginManager().callEvent(localBlockPlaceEvent2);
        if (!localBlockPlaceEvent2.isCancelled())
        {
          j = 1;
          localBlockPlaceEvent2.setCancelled(true);
        }
        else
        {
          j = 0;
          localPlayer.getWorld().dropItemNaturally(localLocation, localItemStack);
          localBlockPlaceEvent2.setCancelled(true);
        }
        if (j != 0) {
          try
          {
            for (localObject : localLocation.getChunk().getEntities()) {
              if (((localObject instanceof ArmorStand)) && (((Entity)localObject).getLocation().getBlock().getLocation().equals(localLocation))) {
                return;
              }
            }
            Object localObject = (ArmorStand)localLocation.getWorld().spawn(localLocation.add(0.5D, 1.0D, 0.5D), ArmorStand.class);
            ((ArmorStand)localObject).setHelmet(localItemStack);
            ((ArmorStand)localObject).setBasePlate(false);
            ((ArmorStand)localObject).setCanPickupItems(false);
            ((ArmorStand)localObject).setVelocity(new Vector(0.0D, -0.15D, 0.0D));
            ((ArmorStand)localObject).setInvulnerable(true);
            ((ArmorStand)localObject).setVisible(false);
            jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("teleported"));
          }
          catch (ClassCastException localClassCastException) {}
        }
      }
    }
  }
  
  public int a(double paramDouble1, double paramDouble2)
  {
    Random localRandom = new Random();
    return localRandom.nextInt((int)(paramDouble1 + paramDouble2));
  }
  
  public static double a(double paramDouble1, double paramDouble2)
  {
    return paramDouble1 + jdField_a_of_type_JavaUtilRandom.nextDouble() * (paramDouble2 - paramDouble1);
  }
}
