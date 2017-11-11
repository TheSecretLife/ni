package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.n;
import com.evill4mer.NewItems.g.a;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class l
  implements Listener
{
  private final Main a;
  
  public l(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void o(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    try
    {
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(paramPlayerInteractEvent.getClickedBlock())) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.ANVIL)) {
        return;
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR))) {
        try
        {
          ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
          if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
            return;
          }
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("diamondfinderpotion"))
          {
            if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
            {
              localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
            }
            else
            {
              localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_DRINK, 10.0F, 1.0F);
              n.a(localPlayer.getLocation(), 50, Material.DIAMOND_ORE);
              localPlayer.getInventory().removeItem(new ItemStack[] { localPlayer.getInventory().getItemInMainHand() });
            }
            paramPlayerInteractEvent.setCancelled(true);
          }
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("emeraldfinderpotion"))
          {
            if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
            {
              localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
            }
            else
            {
              localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_DRINK, 10.0F, 1.0F);
              n.a(localPlayer.getLocation(), 50, Material.EMERALD_ORE);
              localPlayer.getInventory().removeItem(new ItemStack[] { localPlayer.getInventory().getItemInMainHand() });
            }
            paramPlayerInteractEvent.setCancelled(true);
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
  
  @EventHandler
  public void p(PlayerInteractEvent paramPlayerInteractEvent)
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
    catch (NullPointerException localNullPointerException1)
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if ((paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) && ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_AIR)))) {
        try
        {
          ItemStack localItemStack = paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand();
          if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
            return;
          }
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).contains("outlinepotion"))
          {
            if (localPlayer.getInventory().getItemInMainHand().getAmount() > 1)
            {
              localPlayer.sendMessage("[NewItems] " + a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use"));
            }
            else
            {
              localPlayer.playSound(localPlayer.getLocation(), Sound.ENTITY_GENERIC_DRINK, 10.0F, 1.0F);
              localPlayer.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 6000, 1));
              localPlayer.getInventory().removeItem(new ItemStack[] { localPlayer.getInventory().getItemInMainHand() });
            }
            paramPlayerInteractEvent.setCancelled(true);
          }
        }
        catch (NullPointerException localNullPointerException2) {}
      }
    }
  }
}
