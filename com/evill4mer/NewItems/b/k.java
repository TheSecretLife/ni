package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.I;
import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import com.evill4mer.NewItems.f.i;
import com.evill4mer.NewItems.g.a;
import java.util.Random;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class k
  implements Listener
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  private static final Random jdField_a_of_type_JavaUtilRandom = new Random();
  
  public k(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  @EventHandler
  public void e(BlockBreakEvent paramBlockBreakEvent)
  {
    if ((paramBlockBreakEvent.getPlayer() instanceof Player))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if (jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.f(localItemStack))
      {
        if ((jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack).contains("pickaxe")) && (jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getBoolean("pickaxe" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".expDrop.enabled")))
        {
          int i = (int)jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getDouble("pickaxe" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".expDrop.chance") / 10;
          if (a(0, 10) == i)
          {
            if (jdField_a_of_type_ComEvill4merNewItemsMain.b.getBoolean("exp-drop-indicator")) {
              jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, ChatColor.GREEN + "+1 EXP");
            }
            paramBlockBreakEvent.setExpToDrop(jdField_a_of_type_ComEvill4merNewItemsMain.f.getConfig().getInt("pickaxe" + jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsI.a(localItemStack) + ".expDrop.quantity"));
          }
        }
        jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFI.a(localPlayer, Sound.ENTITY_ITEM_BREAK);
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
  
  int a(int paramInt1, int paramInt2)
  {
    Random localRandom = new Random();
    return paramInt1 + localRandom.nextInt(paramInt2 - paramInt1);
  }
}
