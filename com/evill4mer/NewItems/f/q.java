package com.evill4mer.NewItems.f;

import com.evill4mer.NewItems.Main;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.v1_10_R1.EntityPlayer;
import net.minecraft.server.v1_10_R1.MinecraftServer;
import net.minecraft.server.v1_10_R1.Packet;
import net.minecraft.server.v1_10_R1.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_10_R1.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_10_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_10_R1.PacketPlayOutPlayerInfo.EnumPlayerInfoAction;
import net.minecraft.server.v1_10_R1.PlayerConnection;
import net.minecraft.server.v1_10_R1.PlayerInteractManager;
import net.minecraft.server.v1_10_R1.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_10_R1.CraftServer;
import org.bukkit.craftbukkit.v1_10_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.scheduler.BukkitScheduler;

public class q
  implements p
{
  private final Main a;
  static Map k = new HashMap();
  static int c = 0;
  static int d = -1;
  
  public q(Main paramMain)
  {
    a = paramMain;
  }
  
  public static void sendPacket(Packet paramPacket)
  {
    Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      a(paramPacket, localPlayer);
    }
  }
  
  public static void a(Packet paramPacket, Player paramPlayer)
  {
    getHandleplayerConnection.sendPacket(paramPacket);
  }
  
  public static GameProfile a(GameProfile paramGameProfile, String paramString)
  {
    GameProfile localGameProfile = new GameProfile(UUID.randomUUID(), paramString);
    localGameProfile.getProperties().putAll(paramGameProfile.getProperties());
    return localGameProfile;
  }
  
  public void a(int paramInt)
  {
    PacketPlayOutEntityDestroy localPacketPlayOutEntityDestroy = new PacketPlayOutEntityDestroy(new int[] { paramInt });
    sendPacket(localPacketPlayOutEntityDestroy);
  }
  
  public void a(Player paramPlayer, Location paramLocation, boolean paramBoolean)
  {
    MinecraftServer localMinecraftServer = ((CraftServer)Bukkit.getServer()).getServer();
    GameProfile localGameProfile = a(((CraftPlayer)paramPlayer).getProfile(), paramPlayer.getName());
    WorldServer localWorldServer = ((CraftWorld)Bukkit.getWorlds().get(0)).getHandle();
    EntityPlayer localEntityPlayer = new EntityPlayer(localMinecraftServer, localWorldServer, localGameProfile, new PlayerInteractManager(localWorldServer));
    localEntityPlayer.setLocation(paramPlayer.getLocation().getX(), paramPlayer.getLocation().getY(), paramPlayer.getLocation().getZ(), 0.0F, 0.0F);
    localEntityPlayer.setFlag(7, true);
    localEntityPlayer.setNoGravity(false);
    Location localLocation = paramLocation.add(0.0D, 0.20000000298023224D, 0.0D);
    localEntityPlayer.teleportTo(new Location(localLocation.getWorld(), localLocation.getX(), localLocation.getY(), localLocation.getZ(), localLocation.getYaw(), 0.0F), false);
    List localList = localLocation.getWorld().getPlayers();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Player)localIterator.next();
      PlayerConnection localPlayerConnection;
      if (localObject != paramPlayer)
      {
        localPlayerConnection = getHandleplayerConnection;
        localPlayerConnection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, new EntityPlayer[] { localEntityPlayer }));
        localPlayerConnection.sendPacket(new PacketPlayOutNamedEntitySpawn(localEntityPlayer));
      }
      else if (paramBoolean)
      {
        localPlayerConnection = getHandleplayerConnection;
        localPlayerConnection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, new EntityPlayer[] { localEntityPlayer }));
        localPlayerConnection.sendPacket(new PacketPlayOutNamedEntitySpawn(localEntityPlayer));
      }
    }
    Object localObject = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, new EntityPlayer[] { localEntityPlayer });
    new r(this, localLocation, (PacketPlayOutPlayerInfo)localObject).runTaskLater(a, 50L);
    k.put(Integer.valueOf(localEntityPlayer.getBukkitEntity().getEntityId()), Integer.valueOf(0));
  }
  
  public static void c(Player paramPlayer, Location paramLocation)
  {
    Zombie localZombie = (Zombie)paramPlayer.getWorld().spawnEntity(paramPlayer.getLocation(), EntityType.ZOMBIE);
    localZombie.setGliding(true);
  }
  
  public void w()
  {
    d = Bukkit.getScheduler().scheduleSyncRepeatingTask(a, new s(this), 0L, 20L);
  }
}
