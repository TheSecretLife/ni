package com.evill4mer.NewItems;

import a.a.a.e;
import com.evill4mer.NewItems.f.h;
import com.evill4mer.NewItems.g.a;
import java.util.LinkedHashMap;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class I
{
  private final Main a;
  
  public I(Main paramMain)
  {
    a = paramMain;
  }
  
  public boolean b(Block paramBlock)
  {
    return (paramBlock.getLocation().getBlock().getType() == Material.LEVER) || (paramBlock.getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR) || (paramBlock.getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR_OFF) || (paramBlock.getLocation().getBlock().getType() == Material.REDSTONE_COMPARATOR_ON) || (paramBlock.getLocation().getBlock().getType() == Material.REDSTONE_WIRE) || (paramBlock.getLocation().getBlock().getType() == Material.DIODE) || (paramBlock.getLocation().getBlock().getType() == Material.DIODE_BLOCK_OFF) || (paramBlock.getLocation().getBlock().getType() == Material.DIODE_BLOCK_ON) || (paramBlock.getLocation().getBlock().getType() == Material.ACACIA_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.BIRCH_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.DARK_OAK_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.JUNGLE_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.SPRUCE_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.WOOD_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.WOODEN_DOOR) || (paramBlock.getLocation().getBlock().getType() == Material.ACACIA_FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.BIRCH_FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.DARK_OAK_FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.JUNGLE_FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.SPRUCE_FENCE_GATE) || (paramBlock.getLocation().getBlock().getType() == Material.DISPENSER) || (paramBlock.getLocation().getBlock().getType() == Material.DROPPER) || (paramBlock.getLocation().getBlock().getType() == Material.HOPPER) || (paramBlock.getLocation().getBlock().getType() == Material.NOTE_BLOCK) || (paramBlock.getLocation().getBlock().getType() == Material.ENCHANTMENT_TABLE) || (paramBlock.getLocation().getBlock().getType() == Material.BREWING_STAND) || (paramBlock.getLocation().getBlock().getType() == Material.SIGN) || (paramBlock.getLocation().getBlock().getType() == Material.SIGN_POST) || (paramBlock.getLocation().getBlock().getType() == Material.WALL_SIGN) || (paramBlock.getLocation().getBlock().getType() == Material.CHEST) || (paramBlock.getLocation().getBlock().getType() == Material.TRAPPED_CHEST) || (paramBlock.getLocation().getBlock().getType() == Material.ENDER_CHEST) || (paramBlock.getLocation().getBlock().getType() == Material.WORKBENCH) || (paramBlock.getLocation().getBlock().getType() == Material.ANVIL) || (paramBlock.getLocation().getBlock().getType() == Material.ITEM_FRAME) || (paramBlock.getLocation().getBlock().getType().toString().contains("SHULKER"));
  }
  
  public boolean a(ItemStack paramItemStack)
  {
    if ((c(paramItemStack)) || (d(paramItemStack)) || (e(paramItemStack)) || (f(paramItemStack)) || (g(paramItemStack))) {
      return true;
    }
    return b(paramItemStack);
  }
  
  public boolean b(ItemStack paramItemStack)
  {
    return (h(paramItemStack)) || (i(paramItemStack)) || (j(paramItemStack)) || (k(paramItemStack));
  }
  
  public boolean c(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("item");
  }
  
  public boolean d(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("weapon");
  }
  
  public boolean e(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("bow");
  }
  
  public boolean f(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("pickaxe");
  }
  
  public boolean g(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("shield");
  }
  
  public boolean h(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("helmet");
  }
  
  public boolean i(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("chestplate");
  }
  
  public boolean j(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("legging");
  }
  
  public boolean k(ItemStack paramItemStack)
  {
    return a(paramItemStack).equals("boot");
  }
  
  public Integer a(ItemStack paramItemStack)
  {
    if ((paramItemStack == null) || (paramItemStack.getType() == Material.AIR)) {
      return null;
    }
    e localE = new e(paramItemStack);
    if (localE.a("NIid").booleanValue()) {
      return localE.getInteger("NIid");
    }
    return null;
  }
  
  public String a(ItemStack paramItemStack)
  {
    if ((paramItemStack == null) || (paramItemStack.getType() == Material.AIR)) {
      return "unknown";
    }
    e localE = new e(paramItemStack);
    if (localE.a("NItype").booleanValue()) {
      return localE.getString("NItype");
    }
    return "unknown";
  }
  
  public boolean a(String paramString)
  {
    if (a.a.a.containsKey(paramString)) {
      return true;
    }
    if (a.a.g.containsKey(paramString)) {
      return true;
    }
    if (a.a.h.containsKey(paramString)) {
      return true;
    }
    if (a.a.i.containsKey(paramString)) {
      return true;
    }
    if (a.a.j.containsKey(paramString)) {
      return true;
    }
    if (a.a.k.containsKey(paramString)) {
      return true;
    }
    if (a.a.l.containsKey(paramString)) {
      return true;
    }
    if (a.a.m.containsKey(paramString)) {
      return true;
    }
    return a.a.n.containsKey(paramString);
  }
  
  public ItemStack a(String paramString, boolean paramBoolean)
  {
    ItemStack localItemStack = h.a("CustomItemNotFound", "getCustomNew");
    if (a.a.a.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.a.get(paramString);
    } else if (a.a.g.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.g.get(paramString);
    } else if (a.a.h.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.h.get(paramString);
    } else if (a.a.i.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.i.get(paramString);
    } else if (a.a.j.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.j.get(paramString);
    } else if (a.a.k.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.k.get(paramString);
    } else if (a.a.l.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.l.get(paramString);
    } else if (a.a.m.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.m.get(paramString);
    } else if (a.a.n.containsKey(paramString)) {
      localItemStack = (ItemStack)a.a.n.get(paramString);
    }
    if (paramBoolean) {
      return localItemStack.clone();
    }
    return localItemStack;
  }
  
  public String b(ItemStack paramItemStack)
  {
    return a.c.l("item" + a(paramItemStack) + ".type");
  }
  
  public String c(ItemStack paramItemStack)
  {
    return a.d.l("weapon" + a(paramItemStack) + ".type");
  }
  
  public String d(ItemStack paramItemStack)
  {
    return a.e.l("bow" + a(paramItemStack) + ".type");
  }
  
  public String e(ItemStack paramItemStack)
  {
    return a.f.l("pickaxe" + a(paramItemStack) + ".type");
  }
  
  public String f(ItemStack paramItemStack)
  {
    return a.c.l("item" + a(paramItemStack) + ".permission");
  }
  
  public String g(ItemStack paramItemStack)
  {
    return a.d.l("weapon" + a(paramItemStack) + ".permission");
  }
  
  public String h(ItemStack paramItemStack)
  {
    return a.e.l("bow" + a(paramItemStack) + ".permission");
  }
  
  public String i(ItemStack paramItemStack)
  {
    return a.f.l("pickaxe" + a(paramItemStack) + ".permission");
  }
  
  public String j(ItemStack paramItemStack)
  {
    return a.g.l("shield" + a(paramItemStack) + ".permission");
  }
}
