package com.evill4mer.NewItems.f;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.server.v1_9_R1.EntityPlayer;
import net.minecraft.server.v1_9_R1.Packet;
import net.minecraft.server.v1_9_R1.PacketPlayOutAnimation;
import net.minecraft.server.v1_9_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class e
  implements a
{
  public e() {}
  
  public static void a(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      Field localField = paramObject1.getClass().getDeclaredField(paramString);
      localField.setAccessible(true);
      localField.set(paramObject1, paramObject2);
    }
    catch (Exception localException) {}
  }
  
  public static Object getValue(Object paramObject, String paramString)
  {
    try
    {
      Field localField = paramObject.getClass().getDeclaredField(paramString);
      localField.setAccessible(true);
      return localField.get(paramObject);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void a(Packet paramPacket, Player paramPlayer)
  {
    getHandleplayerConnection.sendPacket(paramPacket);
  }
  
  public static void a(Packet paramPacket)
  {
    Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      a(paramPacket, localPlayer);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    PacketPlayOutAnimation localPacketPlayOutAnimation = new PacketPlayOutAnimation();
    a(localPacketPlayOutAnimation, "a", Integer.valueOf(paramInt1));
    a(localPacketPlayOutAnimation, "b", Byte.valueOf((byte)paramInt2));
    a(localPacketPlayOutAnimation);
  }
}
