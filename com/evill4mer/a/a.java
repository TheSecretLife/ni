package com.evill4mer.a;

import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class a
  implements Listener
{
  private static final Plugin jdField_a_of_type_OrgBukkitPluginPlugin = Bukkit.getServer().getPluginManager().getPlugin("NewItems");
  private final Main jdField_a_of_type_ComEvill4merNewItemsMain;
  public static File a;
  public static FileConfiguration a;
  
  public a(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  public void a(Player paramPlayer, Block paramBlock)
  {
    jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.set("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ(), paramPlayer.getName());
    jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-locked"));
    b();
  }
  
  public void a(String paramString, Block paramBlock)
  {
    jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.set("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ(), paramString);
    b();
  }
  
  @EventHandler
  public void a(PlayerInteractEvent paramPlayerInteractEvent)
  {
    try
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      if ((paramPlayerInteractEvent.getAction() == Action.LEFT_CLICK_BLOCK) || (paramPlayerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK))
      {
        Block localBlock = paramPlayerInteractEvent.getClickedBlock();
        if ((localBlock.getType() != null) && ((localBlock.getType() == Material.CHEST) || (localBlock.getType() == Material.TRAPPED_CHEST))) {
          if (!jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.contains("chests." + localBlock.getX() + localBlock.getY() + localBlock.getZ()))
          {
            if (!paramPlayerInteractEvent.isCancelled()) {
              paramPlayerInteractEvent.setCancelled(false);
            }
          }
          else if (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + localBlock.getX() + localBlock.getY() + localBlock.getZ()) == "")
          {
            if (!paramPlayerInteractEvent.isCancelled()) {
              paramPlayerInteractEvent.setCancelled(false);
            }
          }
          else if (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + localBlock.getX() + localBlock.getY() + localBlock.getZ()) != "") {
            if (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + localBlock.getX() + localBlock.getY() + localBlock.getZ()).matches(localPlayer.getName()))
            {
              if ((paramPlayerInteractEvent.getAction() != Action.LEFT_CLICK_BLOCK) && (paramPlayerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK) && (!paramPlayerInteractEvent.isCancelled())) {
                paramPlayerInteractEvent.setCancelled(false);
              }
            }
            else
            {
              paramPlayerInteractEvent.setCancelled(true);
              jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsMain.jdField_a_of_type_ComEvill4merNewItemsGA.l("locked-safe-by") + ChatColor.AQUA + jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString(new StringBuilder("chests.").append(localBlock.getX()).append(localBlock.getY()).append(localBlock.getZ()).toString()));
            }
          }
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localNullPointerException.printStackTrace();
    }
  }
  
  public boolean a(Player paramPlayer, Block paramBlock)
  {
    try
    {
      if ((paramBlock.getType() != null) && ((paramBlock.getType() == Material.CHEST) || (paramBlock.getType() == Material.TRAPPED_CHEST)))
      {
        if (!jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.contains("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ())) {
          return false;
        }
        if (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ()) == "") {
          return false;
        }
        if (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ()) != "") {
          return !jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.getString("chests." + paramBlock.getX() + paramBlock.getY() + paramBlock.getZ()).matches(paramPlayer.getName());
        }
      }
    }
    catch (NullPointerException localNullPointerException) {}
    return false;
  }
  
  @EventHandler
  public void a(BlockPlaceEvent paramBlockPlaceEvent)
  {
    if ((paramBlockPlaceEvent.getBlock().getType() != Material.CHEST) && (paramBlockPlaceEvent.getBlock().getType() != Material.TRAPPED_CHEST)) {
      return;
    }
    try
    {
      Player localPlayer = paramBlockPlaceEvent.getPlayer();
      Block localBlock = paramBlockPlaceEvent.getBlock().getLocation().add(0.0D, 0.0D, 1.0D).getBlock();
      if (a(localPlayer, localBlock))
      {
        paramBlockPlaceEvent.setCancelled(true);
        return;
      }
      localBlock = paramBlockPlaceEvent.getBlock().getLocation().add(0.0D, 0.0D, -1.0D).getBlock();
      if (a(localPlayer, localBlock))
      {
        paramBlockPlaceEvent.setCancelled(true);
        return;
      }
      localBlock = paramBlockPlaceEvent.getBlock().getLocation().add(1.0D, 0.0D, 0.0D).getBlock();
      if (a(localPlayer, localBlock))
      {
        paramBlockPlaceEvent.setCancelled(true);
        return;
      }
      localBlock = paramBlockPlaceEvent.getBlock().getLocation().add(-1.0D, 0.0D, 0.0D).getBlock();
      if (a(localPlayer, localBlock))
      {
        paramBlockPlaceEvent.setCancelled(true);
        return;
      }
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  @EventHandler(priority=EventPriority.LOW)
  public void a(EntityExplodeEvent paramEntityExplodeEvent)
  {
    List localList = paramEntityExplodeEvent.blockList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Block localBlock = (Block)localIterator.next();
      if (((localBlock.getType() == Material.CHEST) || (localBlock.getType() == Material.TRAPPED_CHEST)) && (jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.contains("chests." + localBlock.getX() + localBlock.getY() + localBlock.getZ()))) {
        localIterator.remove();
      }
    }
  }
  
  public static void b()
  {
    try
    {
      jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.save(jdField_a_of_type_JavaIoFile);
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public static void c()
  {
    try
    {
      jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.load(jdField_a_of_type_JavaIoFile);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static void d()
  {
    if (!jdField_a_of_type_JavaIoFile.exists())
    {
      jdField_a_of_type_JavaIoFile.getParentFile().mkdirs();
      a(jdField_a_of_type_OrgBukkitPluginPlugin.getResource("chests.yml"), jdField_a_of_type_JavaIoFile);
    }
  }
  
  private static void a(InputStream paramInputStream, File paramFile)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      while ((i = paramInputStream.read(arrayOfByte)) > 0) {
        localFileOutputStream.write(arrayOfByte, 0, i);
      }
      localFileOutputStream.close();
      paramInputStream.close();
    }
    catch (Exception localException) {}
  }
}
