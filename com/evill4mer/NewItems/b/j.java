package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.g.a;
import java.util.LinkedHashMap;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class j
  implements Listener
{
  private final Main a;
  
  public j(Main paramMain)
  {
    a = paramMain;
  }
  
  @EventHandler
  public void d(BlockBreakEvent paramBlockBreakEvent)
  {
    if ((paramBlockBreakEvent.getPlayer() instanceof Player))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      try
      {
        for (int i = 0; i <= 1560; i++) {
          if ((a.c.getConfig().contains("item" + i + ".type")) && (a.c.l("item" + i + ".type").equalsIgnoreCase("mineral")) && (paramBlockBreakEvent.getBlock().getType() == Material.valueOf(a.c.l("item" + i + ".dropFromBlock"))) && ((localItemStack.getType() == Material.DIAMOND_PICKAXE) || (localItemStack.getType() == Material.GOLD_PICKAXE) || (localItemStack.getType() == Material.IRON_PICKAXE)) && (!localItemStack.containsEnchantment(Enchantment.SILK_TOUCH)))
          {
            int j = (int)a.c.getConfig().getDouble("item" + i + ".chanceOfDrop");
            if ((int)(Math.random() * 100.0D) < j) {
              localPlayer.getWorld().dropItem(paramBlockBreakEvent.getBlock().getLocation(), ((ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get("item" + i)).clone());
            }
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  @EventHandler
  public void b(InventoryClickEvent paramInventoryClickEvent)
  {
    if (paramInventoryClickEvent.getInventory().getType() == InventoryType.FURNACE)
    {
      FurnaceInventory localFurnaceInventory = (FurnaceInventory)paramInventoryClickEvent.getInventory();
      ItemStack localItemStack1 = paramInventoryClickEvent.getCursor();
      if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack1)) {
        return;
      }
      if ((a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack1).contains("mineral")) && (paramInventoryClickEvent.getRawSlot() == 0) && (!a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".smeltResult").equals("none")) && (localFurnaceInventory.getFuel() != null) && (localFurnaceInventory.getResult() == null))
      {
        paramInventoryClickEvent.setCancelled(true);
        paramInventoryClickEvent.setCursor(null);
        ItemStack localItemStack2 = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack1) + ".smeltResult"));
        localItemStack2.setAmount(localItemStack1.getAmount());
        localFurnaceInventory.setResult(localItemStack2);
        ItemStack localItemStack3 = localFurnaceInventory.getFuel();
        localItemStack3.setAmount(localItemStack3.getAmount() - 1);
        localFurnaceInventory.setFuel(localItemStack3);
      }
    }
  }
  
  int a(int paramInt1, int paramInt2)
  {
    Random localRandom = new Random();
    return paramInt1 + localRandom.nextInt(paramInt2 - paramInt1);
  }
}
