package com.evill4mer.b;

import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.g.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.spigotmc.event.entity.EntityDismountEvent;

public class b
  implements Listener
{
  private final Main a;
  
  public b(Main paramMain)
  {
    a = paramMain;
  }
  
  boolean a(Block paramBlock)
  {
    return (paramBlock.getLocation().add(0.0D, 0.0D, 1.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, 1.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(1.0D, 0.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(1.0D, 0.0D, 1.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, -1.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, -1.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(-1.0D, 0.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(-1.0D, 0.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, 2.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, 2.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(2.0D, 0.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(2.0D, 0.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, 2.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 2.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, -2.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, 0.0D, -2.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(-2.0D, 0.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(-2.0D, 0.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER) || (paramBlock.getLocation().add(0.0D, -2.0D, 0.0D).getBlock().getType() == Material.WATER) || (paramBlock.getLocation().add(0.0D, -2.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER);
  }
  
  public void a(Block paramBlock, ItemStack paramItemStack)
  {
    Zombie localZombie = (Zombie)paramBlock.getWorld().spawn(paramBlock.getLocation().add(0.0D, 1.0D, 0.0D), Zombie.class);
    localZombie.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
    localZombie.setCustomName("NICrabIcon");
    localZombie.setCustomNameVisible(false);
    localZombie.setBaby(true);
    localZombie.setAI(false);
    String str;
    switch ((str = a.getServerVersion()).hashCode())
    {
    case -1497224837: 
      if (str.equals("v1_10_R1")) {}
      break;
    case -1497195046: 
      if (str.equals("v1_11_R1")) {}
      break;
    case -1497165255: 
      if (str.equals("v1_12_R1")) {}
      break;
    case -1156393175: 
      if (str.equals("v1_9_R1")) {
        break;
      }
      break;
    case -1156393174: 
      if (!str.equals("v1_9_R2"))
      {
        break label394;
        localObject = new net.minecraft.server.v1_9_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity)localZombie).getHandle().e((net.minecraft.server.v1_9_R1.NBTTagCompound)localObject);
        ((net.minecraft.server.v1_9_R1.NBTTagCompound)localObject).setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity)localZombie).getHandle().f((net.minecraft.server.v1_9_R1.NBTTagCompound)localObject);
      }
      else
      {
        net.minecraft.server.v1_9_R2.NBTTagCompound localNBTTagCompound = new net.minecraft.server.v1_9_R2.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound);
        localNBTTagCompound.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound);
        break label394;
        net.minecraft.server.v1_10_R1.NBTTagCompound localNBTTagCompound1 = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound1);
        localNBTTagCompound1.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound1);
        break label394;
        net.minecraft.server.v1_11_R1.NBTTagCompound localNBTTagCompound2 = new net.minecraft.server.v1_11_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound2);
        localNBTTagCompound2.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound2);
        break label394;
        localZombie.setSilent(true);
      }
      break;
    }
    label394:
    localZombie.getEquipment().setHelmet(paramItemStack);
    localZombie.getEquipment().setBoots(null);
    localZombie.getEquipment().setChestplate(null);
    localZombie.getEquipment().setItemInMainHand(null);
    localZombie.getEquipment().setItemInOffHand(null);
    localZombie.getEquipment().setHelmetDropChance(0.0F);
    localZombie.getEquipment().setBootsDropChance(0.0F);
    localZombie.getEquipment().setChestplateDropChance(0.0F);
    localZombie.getEquipment().setItemInMainHandDropChance(0.0F);
    localZombie.getEquipment().setItemInOffHandDropChance(0.0F);
    localZombie.getEquipment().setLeggingsDropChance(0.0F);
    localZombie.setRemoveWhenFarAway(true);
    localZombie.setCollidable(true);
    localZombie.setCanPickupItems(false);
    localZombie.setInvulnerable(true);
    Object localObject = (Silverfish)paramBlock.getWorld().spawn(paramBlock.getLocation().add(0.0D, 1.0D, 0.0D), Silverfish.class);
    ((Silverfish)localObject).setPassenger(localZombie);
    ((Silverfish)localObject).setCustomName("NICrab");
    ((Silverfish)localObject).setCustomNameVisible(false);
    ((Silverfish)localObject).setRemoveWhenFarAway(true);
    ((Silverfish)localObject).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
  }
  
  @EventHandler
  public void a(BlockBreakEvent paramBlockBreakEvent)
  {
    if ((paramBlockBreakEvent.getPlayer() instanceof Player))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      try
      {
        if ((localPlayer.getInventory().getItemInMainHand() != null) && (localPlayer.getInventory().getItemInMainHand().getType() != Material.AIR)) {
          return;
        }
        if ((paramBlockBreakEvent.getBlock().getType() == Material.SAND) && (a(paramBlockBreakEvent.getBlock())))
        {
          int i = (int)(Math.random() * 5.0D + 1.0D);
          switch (i)
          {
          case 1: 
            BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(paramBlockBreakEvent.getBlock(), localPlayer);
            Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
            if (!localBlockBreakEvent.isCancelled())
            {
              ArrayList localArrayList = new ArrayList(a.jdField_a_of_type_ComEvill4merNewItemsH.f.values());
              ItemStack localItemStack = null;
              Collections.shuffle(localArrayList);
              Iterator localIterator = localArrayList.iterator();
              while (localIterator.hasNext())
              {
                Object localObject = localIterator.next();
                localItemStack = (ItemStack)localObject;
              }
              a(paramBlockBreakEvent.getBlock(), localItemStack);
            }
            else if (a.b.getBoolean("show-no-build-permission-error"))
            {
              paramBlockBreakEvent.getPlayer().sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim"));
            }
            break;
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler
  public void c(EntityDeathEvent paramEntityDeathEvent)
  {
    if ((paramEntityDeathEvent.getEntity().getCustomName() != null) && (paramEntityDeathEvent.getEntity().getCustomName().equals("NICrab")) && (paramEntityDeathEvent.getEntity().getPassenger() != null)) {
      paramEntityDeathEvent.getEntity().getPassenger().remove();
    }
  }
  
  @EventHandler
  public void b(EntityDeathEvent paramEntityDeathEvent)
  {
    if ((paramEntityDeathEvent.getEntity().getCustomName() != null) && (paramEntityDeathEvent.getEntity().getCustomName().equals("NICrabIcon"))) {
      paramEntityDeathEvent.getDrops().clear();
    }
  }
  
  @EventHandler
  public void a(EntityDismountEvent paramEntityDismountEvent)
  {
    if ((paramEntityDismountEvent.getEntity().getCustomName() != null) && (paramEntityDismountEvent.getEntity().getCustomName().equals("NICrabIcon")))
    {
      paramEntityDismountEvent.getDismounted().remove();
      paramEntityDismountEvent.getEntity().remove();
    }
  }
}
