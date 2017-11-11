package com.evill4mer.NewItems;

import com.earth2me.essentials.signs.SignRepair;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.g.a;
import net.ess3.api.IUser;
import net.ess3.api.events.SignInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class c
  implements Listener
{
  private final Main a;
  
  public c(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void a(SignInteractEvent paramSignInteractEvent)
  {
    if ((a.l) && (paramSignInteractEvent.getEssentialsSign().getClass().equals(SignRepair.class)))
    {
      Player localPlayer = paramSignInteractEvent.getUser().getBase();
      try
      {
        ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack))
        {
          a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, a.jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-repair"));
          paramSignInteractEvent.setCancelled(true);
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void u(PlayerInteractEvent paramPlayerInteractEvent)
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
      if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(paramPlayerInteractEvent.getPlayer().getInventory().getItemInMainHand())) && ((paramPlayerInteractEvent.getClickedBlock().getType() == Material.GRASS) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.DIRT))) {
        paramPlayerInteractEvent.setCancelled(true);
      }
    }
  }
  
  @EventHandler
  public void v(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.HAND) {
      return;
    }
    if ((paramPlayerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK) && (a.jdField_a_of_type_ComEvill4merNewItemsI.a(paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand())) && (a.jdField_a_of_type_ComEvill4merNewItemsI.c(paramPlayerInteractEvent.getPlayer().getInventory().getItemInOffHand())))
    {
      paramPlayerInteractEvent.setCancelled(true);
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void c(InventoryClickEvent paramInventoryClickEvent)
  {
    if (!paramInventoryClickEvent.isCancelled())
    {
      HumanEntity localHumanEntity = paramInventoryClickEvent.getWhoClicked();
      if ((localHumanEntity instanceof Player))
      {
        ItemStack localItemStack1 = paramInventoryClickEvent.getCursor();
        ItemStack localItemStack2 = paramInventoryClickEvent.getCurrentItem();
        Inventory localInventory = paramInventoryClickEvent.getView().getTopInventory();
        if ((localInventory.getType() == InventoryType.ANVIL) && (paramInventoryClickEvent.getAction() == InventoryAction.MOVE_TO_OTHER_INVENTORY) && (a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack2)))
        {
          localObject = localItemStack2.getItemMeta();
          ((ItemMeta)localObject).setDisplayName(ChatColor.stripColor(localItemStack2.getItemMeta().getDisplayName()));
          localItemStack2.setItemMeta((ItemMeta)localObject);
        }
        Object localObject = paramInventoryClickEvent.getInventory();
        if ((localObject instanceof AnvilInventory))
        {
          InventoryView localInventoryView = paramInventoryClickEvent.getView();
          int i = paramInventoryClickEvent.getRawSlot();
          if ((i == localInventoryView.convertSlot(i)) && ((i == 0) || (i == 1)) && (a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1)))
          {
            ItemMeta localItemMeta = localItemStack1.getItemMeta();
            localItemMeta.setDisplayName(ChatColor.stripColor(localItemStack1.getItemMeta().getDisplayName()));
            localItemStack1.setItemMeta(localItemMeta);
          }
        }
      }
    }
  }
}
