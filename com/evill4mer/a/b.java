package com.evill4mer.a;

import com.evill4mer.NewItems.Main;
import java.util.HashSet;
import org.bukkit.Chunk;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Hanging;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.material.Chest;
import org.bukkit.util.Vector;

public class b
{
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  boolean b = false;
  
  public b(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  public void a(Player paramPlayer, Entity paramEntity, Block paramBlock, ItemStack paramItemStack, Material paramMaterial, int paramInt1, int paramInt2, int paramInt3, int paramInt4, PlayerInteractEvent paramPlayerInteractEvent, boolean paramBoolean1, Sound paramSound, BlockFace paramBlockFace, boolean paramBoolean2, boolean paramBoolean3)
  {
    Chest localChest;
    if (!paramBoolean1)
    {
      paramEntity = paramPlayer.getWorld().spawnEntity(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(paramInt1, paramInt2, paramInt3)), EntityType.ITEM_FRAME);
      if (paramBoolean2) {
        ((Hanging)paramEntity).setFacingDirection(paramBlockFace, false);
      } else {
        ((Hanging)paramEntity).setFacingDirection(paramPlayerInteractEvent.getClickedBlock().getFace(paramPlayerInteractEvent.getClickedBlock()), false);
      }
      if ((paramPlayer.getWorld().getBlockAt(paramEntity.getLocation()).getType() != Material.CHEST) || (paramPlayer.getWorld().getBlockAt(paramEntity.getLocation()).getType() != Material.TRAPPED_CHEST) || (paramPlayer.getWorld().getBlockAt(paramEntity.getLocation()).getType() != Material.ENDER_CHEST))
      {
        paramBlock = paramPlayer.getWorld().getBlockAt(paramEntity.getLocation());
        if (paramBoolean2)
        {
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(1, 0, 0))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(-1, 0, 0))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 1, 0))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, -1, 0))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 0, 1))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 0, -1))).getType() == Material.CHEST) {
            paramMaterial = Material.TRAPPED_CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(1, 0, 0))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(-1, 0, 0))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 1, 0))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, -1, 0))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 0, 1))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
          if (paramPlayer.getWorld().getBlockAt(paramBlock.getLocation().add(new Vector(0, 0, -1))).getType() == Material.TRAPPED_CHEST) {
            paramMaterial = Material.CHEST;
          }
        }
        paramBlock.setType(paramMaterial);
        paramBlock.setData((byte)paramInt4);
        Object localObject;
        if (paramBlockFace != null)
        {
          localObject = paramBlock.getState();
          localChest = new Chest(paramBlockFace);
          ((BlockState)localObject).setData(localChest);
          ((BlockState)localObject).update();
        }
        if (paramBoolean2)
        {
          localObject = new a(jdField_a_of_type_ComEvill4merNewItemsMain);
          ((a)localObject).a(paramPlayer, paramBlock);
        }
      }
      try
      {
        ((ItemFrame)paramEntity).setItem(paramItemStack);
      }
      catch (NullPointerException localNullPointerException) {}
      if (paramSound != null) {
        paramPlayer.playSound(paramPlayer.getLocation(), paramSound, 10.0F, 1.0F);
      }
      if (paramBoolean3) {
        paramBlock.setType(Material.AIR);
      }
    }
    else
    {
      Location localLocation = paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(paramInt1, paramInt2, paramInt3));
      localLocation.setYaw(paramPlayer.getLocation().getYaw());
      try
      {
        for (localChest : localLocation.getChunk().getEntities()) {
          if (localChest.getLocation().getBlock().getLocation().equals(localLocation))
          {
            ArmorStand localArmorStand2 = (ArmorStand)localChest;
            if (!localArmorStand2.getName().equals("astralanvil"))
            {
              ArmorStand localArmorStand3 = (ArmorStand)localLocation.getWorld().spawn(localLocation.add(0.5D, -0.0D, 0.5D), ArmorStand.class);
              localArmorStand3.setHelmet(paramItemStack);
              localArmorStand3.setCustomName("astralanvil");
              localArmorStand3.setBasePlate(false);
              localArmorStand3.setCanPickupItems(false);
              localArmorStand3.setVelocity(new Vector(0.0D, -0.15D, 0.0D));
              localArmorStand3.setInvulnerable(true);
              localArmorStand3.setVisible(false);
              if (paramSound != null) {
                paramPlayer.playSound(paramPlayer.getLocation(), paramSound, 10.0F, 1.0F);
              }
              return;
            }
            if (paramPlayer.getGameMode() == GameMode.SURVIVAL) {
              paramPlayer.getInventory().getItemInMainHand().setAmount(paramPlayer.getInventory().getItemInMainHand().getAmount() + 1);
            }
            return;
          }
        }
      }
      catch (ClassCastException localClassCastException) {}
      ArmorStand localArmorStand1 = (ArmorStand)localLocation.getWorld().spawn(localLocation.add(0.5D, -0.0D, 0.5D), ArmorStand.class);
      localArmorStand1.setHelmet(paramItemStack);
      localArmorStand1.setCustomName("astralanvil");
      localArmorStand1.setBasePlate(false);
      localArmorStand1.setCanPickupItems(false);
      localArmorStand1.setVelocity(new Vector(0.0D, -0.15D, 0.0D));
      localArmorStand1.setInvulnerable(true);
      localArmorStand1.setVisible(false);
      if (paramSound != null) {
        paramPlayer.playSound(paramPlayer.getLocation(), paramSound, 10.0F, 1.0F);
      }
    }
    if (paramPlayer.getGameMode() == GameMode.SURVIVAL) {
      b = true;
    } else {
      b = false;
    }
  }
  
  public void a(PlayerInteractEvent paramPlayerInteractEvent, Player paramPlayer, ItemStack paramItemStack, Material paramMaterial, int paramInt, boolean paramBoolean1, Sound paramSound, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 0)).getBlockY() == paramPlayer.getLocation().getBlockY()) && (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlockX() == paramPlayer.getLocation().getBlockX()) && (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlockZ() == paramPlayer.getLocation().getBlockZ())) {
      return;
    }
    if (paramPlayer.getGameMode() == GameMode.ADVENTURE) {
      return;
    }
    Entity localEntity = null;
    Block localBlock = null;
    if ((paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.LEVER) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR_OFF) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR_ON) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.REDSTONE_WIRE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DIODE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DIODE_BLOCK_OFF) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DIODE_BLOCK_ON) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.ACACIA_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.BIRCH_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DARK_OAK_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.JUNGLE_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.SPRUCE_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.WOOD_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.WOODEN_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.ACACIA_FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.BIRCH_FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DARK_OAK_FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.JUNGLE_FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.SPRUCE_FENCE_GATE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DISPENSER) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.DROPPER) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.HOPPER) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.NOTE_BLOCK) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.ENCHANTMENT_TABLE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.BREWING_STAND) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.SIGN) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.SIGN_POST) || (paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.WALL_SIGN))
    {
      paramPlayerInteractEvent.setCancelled(false);
      return;
    }
    if ((paramPlayerInteractEvent.getClickedBlock().getLocation().getBlock().getType() == Material.TRAP_DOOR) && (!jdField_a_of_type_ComEvill4merNewItemsMain.g.contains(paramPlayerInteractEvent.getPlayer().getName())))
    {
      paramPlayerInteractEvent.setCancelled(false);
      return;
    }
    if (paramPlayerInteractEvent.getBlockFace() == BlockFace.UP)
    {
      if ((paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.LEVER) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.REDSTONE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.REDSTONE_WIRE) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.TORCH) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.REDSTONE_TORCH_OFF) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.REDSTONE_TORCH_ON) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.ACACIA_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.BIRCH_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.DARK_OAK_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.JUNGLE_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.SPRUCE_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.WOOD_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.WOODEN_DOOR) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.SIGN) || (paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.SIGN_POST))
      {
        paramPlayerInteractEvent.setCancelled(true);
        return;
      }
      if ((paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.TRAP_DOOR) && (!jdField_a_of_type_ComEvill4merNewItemsMain.g.contains(paramPlayerInteractEvent.getPlayer().getName())))
      {
        paramPlayerInteractEvent.setCancelled(true);
        return;
      }
      try
      {
        switch (jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer))
        {
        case DOWN: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST_NORTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST_SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_SOUTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, 1, 0)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_NORTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, 1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case UP: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SELF: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, 1, -1)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case WEST_NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, 1, 0)));
            if ((paramBoolean2) && (localBlock.getType() == Material.CHEST)) {
              paramMaterial = Material.TRAPPED_CHEST;
            }
            if (localBlock.getType() == Material.TRAPPED_CHEST) {
              paramMaterial = Material.CHEST;
            }
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        }
      }
      catch (NullPointerException|IllegalArgumentException localNullPointerException1)
      {
        try
        {
          if ((paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.CHEST) && (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.TRAPPED_CHEST) && (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.ENDER_CHEST)) {
            break label8465;
          }
          paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).setType(Material.AIR);
        }
        catch (NullPointerException|IllegalArgumentException localNullPointerException4) {}
      }
    }
    else if ((paramPlayerInteractEvent.getBlockFace() == BlockFace.DOWN) && (!paramBoolean3))
    {
      try
      {
        switch (jdField_a_of_type_ComEvill4merNewItemsMain.a.a(paramPlayer))
        {
        case DOWN: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST_NORTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case EAST_SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_SOUTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(-1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_NORTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH_EAST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, 1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case UP: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SELF: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(0, -1, -1)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case SOUTH: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        case WEST_NORTH_WEST: 
          if (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0))).getType() == Material.AIR)
          {
            localBlock = paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(new Vector(1, -1, 0)));
            localBlock.setType(paramMaterial);
            localBlock.setData((byte)paramInt);
          }
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, -1, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
          localBlock.setType(Material.AIR);
          break;
        }
      }
      catch (NullPointerException|IllegalArgumentException localNullPointerException2)
      {
        try
        {
          if ((paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.CHEST) && (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.TRAPPED_CHEST) && (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() == Material.ENDER_CHEST)) {
            break label8465;
          }
          paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).setType(Material.AIR);
        }
        catch (NullPointerException|IllegalArgumentException localNullPointerException5) {}
      }
    }
    else
    {
      try
      {
        if ((paramPlayerInteractEvent.getBlockFace() == BlockFace.NORTH) && (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 0.0D, -1.0D)).getType() == Material.AIR)) {
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 0, -1, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.NORTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 0, -1, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
        }
        if ((paramPlayerInteractEvent.getBlockFace() == BlockFace.EAST) && (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(1.0D, 0.0D, 0.0D)).getType() == Material.AIR)) {
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 1, 0, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.EAST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 1, 0, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
        }
        if ((paramPlayerInteractEvent.getBlockFace() == BlockFace.SOUTH) && (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(0.0D, 0.0D, 1.0D)).getType() == Material.AIR)) {
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 0, 1, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.SOUTH, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, 0, 0, 1, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
        }
        if ((paramPlayerInteractEvent.getBlockFace() == BlockFace.WEST) && (paramPlayer.getWorld().getBlockAt(paramPlayerInteractEvent.getClickedBlock().getLocation().add(-1.0D, 0.0D, 0.0D)).getType() == Material.AIR)) {
          if (paramBoolean2) {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, -1, 0, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, BlockFace.WEST, paramBoolean2, paramBoolean3);
          } else {
            a(paramPlayer, localEntity, localBlock, paramItemStack, paramMaterial, -1, 0, 0, paramInt, paramPlayerInteractEvent, paramBoolean1, paramSound, null, paramBoolean2, paramBoolean3);
          }
        }
      }
      catch (NullPointerException|IllegalArgumentException localNullPointerException3)
      {
        try
        {
          if ((paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() != Material.CHEST) || (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() != Material.TRAPPED_CHEST) || (paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).getType() != Material.ENDER_CHEST)) {
            paramPlayer.getWorld().getBlockAt(localEntity.getLocation()).setType(Material.AIR);
          }
        }
        catch (NullPointerException|IllegalArgumentException localNullPointerException6) {}
      }
    }
    label8465:
    if (b)
    {
      int i = paramPlayer.getInventory().getItemInMainHand().getAmount();
      if (i - 1 > 0) {
        paramPlayer.getInventory().getItemInMainHand().setAmount(i - 1);
      } else {
        paramPlayer.getInventory().setItemInMainHand(null);
      }
    }
  }
}
