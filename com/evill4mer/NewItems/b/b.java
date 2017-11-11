package com.evill4mer.NewItems.b;

import a.a.a.e;
import com.evill4mer.NewItems.H;
import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.g.a;
import java.util.LinkedHashMap;
import java.util.Random;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class b
  implements Listener
{
  private final Main a;
  
  public b(Main paramMain)
  {
    a = paramMain;
  }
  
  float a(ItemStack paramItemStack)
  {
    e localE = new e(paramItemStack);
    if (localE.a("NIbeeWeight").booleanValue()) {
      return localE.getFloat("NIbeeWeight").floatValue();
    }
    return 10.0F;
  }
  
  ItemStack a(ItemStack paramItemStack1, ItemStack paramItemStack2, float paramFloat)
  {
    ItemStack localItemStack = null;
    try
    {
      if (!a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(paramItemStack1) + ".honeyjarItem").equals("none")) {
        localItemStack = (ItemStack)a.jdField_a_of_type_ComEvill4merNewItemsH.a.get(a.c.l("item" + a.jdField_a_of_type_ComEvill4merNewItemsI.a(paramItemStack1) + ".honeyjarItem"));
      } else {
        return paramItemStack2;
      }
      int i = Math.abs(Math.round(paramFloat));
      e localE = new e(localItemStack);
      localE.a("NIdurability", Integer.valueOf(i / 10));
      localItemStack = localE.getItem();
    }
    catch (NullPointerException localNullPointerException)
    {
      return paramItemStack2;
    }
    return localItemStack;
  }
  
  @EventHandler
  public void a(PlayerInteractEntityEvent paramPlayerInteractEntityEvent)
  {
    Player localPlayer = paramPlayerInteractEntityEvent.getPlayer();
    Entity localEntity = paramPlayerInteractEntityEvent.getRightClicked();
    if ((localEntity instanceof ItemFrame))
    {
      ItemFrame localItemFrame = (ItemFrame)localEntity;
      localItemFrame.getItem();
      if (localItemFrame.getItem().hasItemMeta())
      {
        if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemFrame.getItem())) {
          return;
        }
        if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemFrame.getItem()).equals("beehive"))
        {
          ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
          if (!a.jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
            return;
          }
          if (a.jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack).equals("bee"))
          {
            localPlayer.getInventory().setItemInMainHand(null);
            localPlayer.getWorld().dropItem(paramPlayerInteractEntityEvent.getRightClicked().getLocation(), a(localItemFrame.getItem(), localItemStack, a(localItemStack)));
            a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayerInteractEntityEvent.getPlayer(), a.jdField_a_of_type_ComEvill4merNewItemsGA.l("droppedHoney"));
          }
          else
          {
            a.jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayerInteractEntityEvent.getPlayer(), a.jdField_a_of_type_ComEvill4merNewItemsGA.l("needHoldBee"));
          }
          paramPlayerInteractEntityEvent.setCancelled(true);
        }
      }
    }
  }
  
  int a(int paramInt1, int paramInt2)
  {
    Random localRandom = new Random();
    return paramInt1 + localRandom.nextInt(paramInt2 - paramInt1);
  }
}
