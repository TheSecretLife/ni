package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.DataStore;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.Vector;

public class s
  implements Listener
{
  private final Main a;
  Map d = new HashMap();
  HashSet e = new HashSet();
  
  public s(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void c(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
  {
    if ((paramEntityDamageByEntityEvent.getDamager() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityDamageByEntityEvent.getDamager();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if ((localItemStack.hasItemMeta()) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack)))
      {
        if (a.b.getBoolean("damage-indicator")) {
          a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, ChatColor.RED + "-" + String.format("%.2f", new Object[] { Double.valueOf(paramEntityDamageByEntityEvent.getDamage() - 1.0D) }));
        }
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
      }
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void r(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEvent.getPlayer();
    ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
    if ((paramPlayerInteractEvent.getAction().equals(Action.LEFT_CLICK_BLOCK)) && (paramPlayerInteractEvent.getClickedBlock().getType() != Material.CHEST) && (paramPlayerInteractEvent.getClickedBlock().getType() != Material.TRAPPED_CHEST) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack).equalsIgnoreCase("fireSword")))
    {
      int i = 1;
      try
      {
        if (a.g)
        {
          Claim localClaim = instancedataStore.getClaimAt(paramPlayerInteractEvent.getClickedBlock().getLocation(), false, null);
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          ArrayList localArrayList3 = new ArrayList();
          ArrayList localArrayList4 = new ArrayList();
          localClaim.getPermissions(localArrayList1, localArrayList2, localArrayList3, localArrayList4);
          if ((localArrayList1.contains(paramPlayerInteractEvent.getPlayer().getUniqueId().toString())) || (localArrayList2.contains(paramPlayerInteractEvent.getPlayer().getUniqueId().toString())) || (localArrayList3.contains(paramPlayerInteractEvent.getPlayer().getUniqueId().toString())) || (localArrayList4.contains(paramPlayerInteractEvent.getPlayer().getUniqueId().toString())) || (localClaim.getOwnerName().equals(localPlayer.getName())))
          {
            i = 1;
          }
          else
          {
            i = 0;
            if (a.b.getBoolean("show-no-build-permission-error")) {
              paramPlayerInteractEvent.getPlayer().sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim-place"));
            }
          }
        }
        else
        {
          i = 1;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        i = 1;
      }
      BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(paramPlayerInteractEvent.getClickedBlock(), localPlayer);
      Bukkit.getServer().getPluginManager().callEvent(localBlockBreakEvent);
      if (!localBlockBreakEvent.isCancelled())
      {
        i = 1;
        localBlockBreakEvent.setCancelled(true);
      }
      else
      {
        i = 0;
        if (a.b.getBoolean("show-no-build-permission-error")) {
          paramPlayerInteractEvent.getPlayer().sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("not-your-claim-place"));
        }
        localBlockBreakEvent.setCancelled(true);
      }
      if ((i != 0) && (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.AIR))
      {
        paramPlayerInteractEvent.setCancelled(true);
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
        paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().setType(Material.FIRE);
      }
    }
  }
  
  @EventHandler
  public void d(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
  {
    Entity localEntity = paramEntityDamageByEntityEvent.getDamager();
    Player localPlayer = null;
    if ((localEntity instanceof Player))
    {
      localPlayer = (Player)localEntity;
      if (localPlayer.getInventory().getItemInMainHand().hasItemMeta())
      {
        ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack).equalsIgnoreCase("lightsaber")))
        {
          int i = (int)(Math.random() * 3.0D + 1.0D);
          switch (i)
          {
          case 1: 
            localPlayer.playSound(localPlayer.getLocation(), "saber_hit", 10.0F, 1.0F);
            break;
          case 2: 
            localPlayer.playSound(localPlayer.getLocation(), "saber_hit2", 10.0F, 1.0F);
            break;
          case 3: 
            localPlayer.playSound(localPlayer.getLocation(), "saber_hit3", 10.0F, 1.0F);
          }
        }
      }
    }
  }
  
  @EventHandler
  public void d(PlayerInteractEntityEvent paramPlayerInteractEntityEvent)
  {
    if (paramPlayerInteractEntityEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEntityEvent.getPlayer();
    ItemStack localItemStack1 = paramPlayerInteractEntityEvent.getPlayer().getInventory().getItemInMainHand();
    ItemStack localItemStack2 = paramPlayerInteractEntityEvent.getPlayer().getInventory().getItemInOffHand();
    if ((a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack1)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack2))) {
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1).equalsIgnoreCase("doublesword")) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack2).equalsIgnoreCase("doublesword")) && (!e.contains(localPlayer.getName())))
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put(EntityDamageEvent.DamageModifier.BASE, Double.valueOf(1.0D));
          if (!paramPlayerInteractEntityEvent.isCancelled())
          {
            double d1 = 0.0D;
            d1 = a.d.getConfig().getDouble("weapon" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack2) + ".damage");
            if (a.b.getBoolean("damage-indicator")) {
              a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, ChatColor.RED + "-" + String.format("%.2f", new Object[] { Double.valueOf(d1) }));
            }
            if (localItemStack2.containsEnchantment(Enchantment.DAMAGE_ALL)) {
              d1 += d1 + paramPlayerInteractEntityEvent.getPlayer().getInventory().getItemInOffHand().getEnchantmentLevel(Enchantment.DAMAGE_ALL) / 2.0F;
            }
            a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
            localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 10.0F, 1.0F);
            try
            {
              ((LivingEntity)paramPlayerInteractEntityEvent.getRightClicked()).damage(d1, localPlayer);
            }
            catch (ClassCastException localClassCastException) {}
            Vector localVector = localPlayer.getLocation().getDirection().multiply(0.5F);
            localVector.setY(localVector.getY() + 0.5D);
            paramPlayerInteractEntityEvent.getRightClicked().setVelocity(localVector);
            a.jdField_a_of_type_ComEvill4merNewItemsFA.a(localPlayer.getEntityId(), 3);
            e.add(localPlayer.getName());
            int i = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(a, new t(this, localPlayer), 0L, 1L);
            d.put(localPlayer.getName(), Integer.valueOf(i));
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler
  public void s(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    Player localPlayer = paramPlayerInteractEvent.getPlayer();
    ItemStack localItemStack1 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
    ItemStack localItemStack2 = paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand();
    if (((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack1)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack2))) {
      try
      {
        if ((a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1).equalsIgnoreCase("doublesword")) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack2).equalsIgnoreCase("doublesword")) && (!e.contains(localPlayer.getName())))
        {
          a.jdField_a_of_type_ComEvill4merNewItemsFA.a(localPlayer.getEntityId(), 3);
          localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_PLAYER_ATTACK_WEAK, 10.0F, 1.0F);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void b(EntityShootBowEvent paramEntityShootBowEvent)
  {
    LivingEntity localLivingEntity = paramEntityShootBowEvent.getEntity();
    Player localPlayer = null;
    if ((localLivingEntity instanceof Player))
    {
      localPlayer = (Player)localLivingEntity;
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack).equalsIgnoreCase("astralbow")))
      {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
        int i = (int)(Math.random() * 3.0D + 1.0D);
        paramEntityShootBowEvent.getProjectile().setGlowing(true);
        switch (i)
        {
        case 1: 
          localPlayer.playSound(localPlayer.getLocation(), "laser1", 10.0F, 1.0F);
          break;
        case 2: 
          localPlayer.playSound(localPlayer.getLocation(), "laser2", 10.0F, 1.0F);
          break;
        case 3: 
          localPlayer.playSound(localPlayer.getLocation(), "laser3", 10.0F, 1.0F);
        }
      }
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void c(EntityShootBowEvent paramEntityShootBowEvent)
  {
    LivingEntity localLivingEntity = paramEntityShootBowEvent.getEntity();
    Player localPlayer = null;
    if ((localLivingEntity instanceof Player))
    {
      localPlayer = (Player)localLivingEntity;
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack).equalsIgnoreCase("bow"))) {
        a.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
      }
    }
  }
  
  public static void a(Player paramPlayer, Map paramMap)
  {
    if (paramMap.containsKey(paramPlayer.getName()))
    {
      int i = ((Integer)paramMap.get(paramPlayer.getName())).intValue();
      Bukkit.getServer().getScheduler().cancelTask(i);
      paramMap.remove(paramPlayer.getName());
    }
  }
}
