package com.evill4mer.b;

import a.a.a.e;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.m;
import java.util.List;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Bat;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.spigotmc.event.entity.EntityDismountEvent;

public class a
  implements Listener
{
  private final Main a;
  
  public a(Main paramMain)
  {
    a = paramMain;
  }
  
  public boolean a(Material paramMaterial)
  {
    return (paramMaterial == Material.RED_ROSE) || (paramMaterial == Material.YELLOW_FLOWER);
  }
  
  public ItemStack a(ItemStack paramItemStack)
  {
    float f = m.a(0.1F, 120.0F);
    ItemStack localItemStack = paramItemStack.clone();
    ItemMeta localItemMeta = localItemStack.getItemMeta();
    List localList = localItemStack.getItemMeta().getLore();
    localList.add(ChatColor.GREEN + "Weight: " + f + " mg");
    localItemMeta.setLore(localList);
    localItemStack.setItemMeta(localItemMeta);
    e localE = new e(localItemStack);
    localE.a("NIbeeWeight", Float.valueOf(f));
    localItemStack = localE.getItem();
    return localItemStack;
  }
  
  public void a(Block paramBlock, ItemStack paramItemStack)
  {
    Zombie localZombie = (Zombie)paramBlock.getWorld().spawn(paramBlock.getLocation(), Zombie.class);
    localZombie.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
    localZombie.setCustomName("NIBeeIcon");
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
        break label390;
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
        break label390;
        net.minecraft.server.v1_10_R1.NBTTagCompound localNBTTagCompound1 = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound1);
        localNBTTagCompound1.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_10_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound1);
        break label390;
        net.minecraft.server.v1_11_R1.NBTTagCompound localNBTTagCompound2 = new net.minecraft.server.v1_11_R1.NBTTagCompound();
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().e(localNBTTagCompound2);
        localNBTTagCompound2.setInt("Silent", 1);
        ((org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity)localZombie).getHandle().f(localNBTTagCompound2);
        break label390;
        localZombie.setSilent(true);
      }
      break;
    }
    label390:
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
    Object localObject = (Bat)paramBlock.getWorld().spawn(paramBlock.getLocation(), Bat.class);
    ((Bat)localObject).setPassenger(localZombie);
    ((Bat)localObject).setCustomName("NIBee");
    ((Bat)localObject).setCustomNameVisible(false);
    ((Bat)localObject).setRemoveWhenFarAway(true);
    ((Bat)localObject).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
  }
  
  @EventHandler
  public void a(EntityDeathEvent paramEntityDeathEvent)
  {
    if ((paramEntityDeathEvent.getEntity().getCustomName() != null) && (paramEntityDeathEvent.getEntity().getCustomName().equals("NIBee")) && (paramEntityDeathEvent.getEntity().getPassenger() != null)) {
      paramEntityDeathEvent.getEntity().getPassenger().remove();
    }
  }
  
  @EventHandler
  public void b(EntityDeathEvent paramEntityDeathEvent)
  {
    if ((paramEntityDeathEvent.getEntity().getCustomName() != null) && (paramEntityDeathEvent.getEntity().getCustomName().equals("NIBeeIcon"))) {
      paramEntityDeathEvent.getDrops().clear();
    }
  }
  
  @EventHandler
  public void a(EntityDismountEvent paramEntityDismountEvent)
  {
    if ((paramEntityDismountEvent.getEntity().getCustomName() != null) && (paramEntityDismountEvent.getEntity().getCustomName().equals("NIBeeIcon")))
    {
      paramEntityDismountEvent.getDismounted().remove();
      paramEntityDismountEvent.getEntity().remove();
    }
  }
}
