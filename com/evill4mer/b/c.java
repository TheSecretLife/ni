package com.evill4mer.b;

import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.m;
import java.util.List;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class c
  implements Listener
{
  private final Main a;
  
  public c(Main paramMain)
  {
    a = paramMain;
  }
  
  boolean b(Material paramMaterial)
  {
    return paramMaterial == Material.WATER_LILY;
  }
  
  public ItemStack b(ItemStack paramItemStack)
  {
    ItemStack localItemStack = paramItemStack.clone();
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    List localList = localItemStack.getItemMeta().getLore();
    localList.add(ChatColor.GREEN + "Weight: " + m.a(0.1F, 120.0F) + " mg");
    localItemMeta.setLore(localList);
    localItemStack.setItemMeta(localItemMeta);
    return localItemStack;
  }
  
  public void a(Block paramBlock, ItemStack paramItemStack)
  {
    Zombie localZombie = (Zombie)paramBlock.getWorld().spawn(paramBlock.getLocation(), Zombie.class);
    localZombie.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
    localZombie.setCustomName("NITurtle");
    localZombie.setCustomNameVisible(false);
    localZombie.setBaby(true);
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
        break label382;
        net.minecraft.server.v1_9_R1.NBTTagCompound localNBTTagCompound = new net.minecraft.server.v1_9_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound);
        localNBTTagCompound.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound);
      }
      else
      {
        net.minecraft.server.v1_9_R2.NBTTagCompound localNBTTagCompound1 = new net.minecraft.server.v1_9_R2.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound1);
        localNBTTagCompound1.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound1);
        break label382;
        net.minecraft.server.v1_10_R1.NBTTagCompound localNBTTagCompound2 = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound2);
        localNBTTagCompound2.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound2);
        break label382;
        net.minecraft.server.v1_11_R1.NBTTagCompound localNBTTagCompound3 = new net.minecraft.server.v1_11_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound3);
        localNBTTagCompound3.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound3);
        break label382;
        localZombie.setSilent(true);
      }
      break;
    }
    label382:
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
  }
  
  @EventHandler
  public void a(EntityTargetLivingEntityEvent paramEntityTargetLivingEntityEvent)
  {
    if ((paramEntityTargetLivingEntityEvent.getEntity().getCustomName() != null) && (paramEntityTargetLivingEntityEvent.getEntity().getCustomName().equals("NITurtle")) && (paramEntityTargetLivingEntityEvent.getTarget() != null) && ((paramEntityTargetLivingEntityEvent.getTarget().getType() == EntityType.PLAYER) || (paramEntityTargetLivingEntityEvent.getTarget().getType() == EntityType.VILLAGER)))
    {
      paramEntityTargetLivingEntityEvent.setTarget(null);
      paramEntityTargetLivingEntityEvent.setCancelled(true);
    }
  }
  
  @EventHandler
  public void d(EntityDeathEvent paramEntityDeathEvent)
  {
    if ((paramEntityDeathEvent.getEntity().getCustomName() != null) && (paramEntityDeathEvent.getEntity().getCustomName().equals("NITurtle"))) {
      paramEntityDeathEvent.getDrops().clear();
    }
  }
}
