package com.evill4mer.NewItems.f;

import com.evill4mer.NewItems.Main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;

public class g
{
  public String b = "17384";
  i jdField_a_of_type_ComEvill4merNewItemsFI;
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  
  public g(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
    jdField_a_of_type_ComEvill4merNewItemsFI = new i(paramMain);
  }
  
  public boolean c(Material paramMaterial)
  {
    return (paramMaterial == Material.CHEST) || (paramMaterial == Material.TRAPPED_CHEST) || (paramMaterial == Material.DOUBLE_STEP) || (paramMaterial == Material.ENDER_CHEST) || (paramMaterial == Material.BEDROCK) || (paramMaterial == Material.COAL_ORE) || (paramMaterial == Material.DIAMOND_ORE) || (paramMaterial == Material.EMERALD_ORE) || (paramMaterial == Material.GLOWING_REDSTONE_ORE) || (paramMaterial == Material.GOLD_ORE) || (paramMaterial == Material.IRON_ORE) || (paramMaterial == Material.LAPIS_ORE) || (paramMaterial == Material.QUARTZ_ORE) || (paramMaterial == Material.REDSTONE_ORE);
  }
  
  public void a(Player paramPlayer, BlockBreakEvent paramBlockBreakEvent)
  {
    Block localBlock1 = paramBlockBreakEvent.getBlock();
    ItemStack localItemStack = paramPlayer.getInventory().getItemInMainHand();
    int i = 0;
    int j = 0;
    if (localItemStack.containsEnchantment(Enchantment.SILK_TOUCH)) {
      i = 1;
    } else {
      i = 0;
    }
    ArrayList localArrayList = new ArrayList();
    if ((jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.UP) || (jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.DOWN))
    {
      localArrayList.add(localBlock1.getRelative(BlockFace.NORTH_WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.NORTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.NORTH_EAST));
      localArrayList.add(localBlock1.getRelative(BlockFace.WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.EAST));
      localArrayList.add(localBlock1.getRelative(BlockFace.SOUTH_WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.SOUTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.SOUTH_EAST));
    }
    if ((jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.NORTH) || (jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.SOUTH))
    {
      localArrayList.add(localBlock1.getRelative(BlockFace.UP).getRelative(BlockFace.WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.UP));
      localArrayList.add(localBlock1.getRelative(BlockFace.UP).getRelative(BlockFace.EAST));
      localArrayList.add(localBlock1.getRelative(BlockFace.WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.EAST));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST));
    }
    if ((jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.EAST) || (jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer) == BlockFace.WEST))
    {
      localArrayList.add(localBlock1.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.UP));
      localArrayList.add(localBlock1.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.NORTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.SOUTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN));
      localArrayList.add(localBlock1.getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH));
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      Block localBlock2 = (Block)localIterator.next();
      if ((!c(localBlock2.getType())) && (a(localBlock2, paramPlayer)))
      {
        if (i == 0)
        {
          localBlock2.getLocation().getBlock().getWorld().playEffect(localBlock2.getLocation(), Effect.STEP_SOUND, localBlock2.getTypeId());
          localBlock2.getLocation().getBlock().setType(Material.AIR);
          j++;
        }
        if (i == 1)
        {
          short s = localBlock2.getData();
          Material localMaterial = localBlock2.getType();
          localBlock2.getLocation().getBlock().getWorld().playEffect(localBlock2.getLocation(), Effect.STEP_SOUND, localBlock2.getTypeId());
          localBlock2.getLocation().getBlock().setType(Material.AIR);
          if (localMaterial != Material.AIR) {
            localBlock1.getLocation().getWorld().dropItemNaturally(localBlock1.getLocation(), new ItemStack(localMaterial, 1, s));
          }
          j++;
        }
      }
    }
    jdField_a_of_type_ComEvill4merNewItemsFI.a(paramPlayer, j, Sound.ENTITY_ITEM_BREAK);
    Main.k.remove(paramPlayer);
  }
  
  public boolean a(Block paramBlock, Player paramPlayer)
  {
    BlockBreakEvent localBlockBreakEvent = new BlockBreakEvent(paramBlock, paramPlayer);
    jdField_a_of_type_ComEvill4merNewItemsMain.getServer().getPluginManager().callEvent(localBlockBreakEvent);
    boolean bool = false;
    if (!localBlockBreakEvent.isCancelled()) {
      bool = true;
    }
    localBlockBreakEvent.setCancelled(true);
    return bool;
  }
}
