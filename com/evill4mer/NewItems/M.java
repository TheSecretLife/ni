package com.evill4mer.NewItems;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.PacketType.Play.Client;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.EnumWrappers.ResourcePackStatus;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

class M
  extends PacketAdapter
{
  M(L paramL, Plugin paramPlugin, ListenerPriority paramListenerPriority, PacketType... paramVarArgs)
  {
    super(paramPlugin, paramListenerPriority, paramVarArgs);
  }
  
  public void a(PacketEvent paramPacketEvent)
  {
    Player localPlayer = paramPacketEvent.getPlayer();
    if (paramPacketEvent.getPacketType() == PacketType.Play.Client.RESOURCE_PACK_STATUS)
    {
      EnumWrappers.ResourcePackStatus localResourcePackStatus = (EnumWrappers.ResourcePackStatus)paramPacketEvent.getPacket().getResourcePackStatus().read(0);
      if (localResourcePackStatus.equals(EnumWrappers.ResourcePackStatus.ACCEPTED)) {
        return;
      }
      if (localResourcePackStatus.equals(EnumWrappers.ResourcePackStatus.DECLINED))
      {
        Bukkit.getScheduler().runTaskLater(L.a(a), new N(this, localPlayer), 30L);
        return;
      }
      if (localResourcePackStatus.equals(EnumWrappers.ResourcePackStatus.SUCCESSFULLY_LOADED)) {
        return;
      }
      if (localResourcePackStatus.equals(EnumWrappers.ResourcePackStatus.FAILED_DOWNLOAD))
      {
        Bukkit.getScheduler().runTaskLater(L.a(a), new O(this, localPlayer), 5L);
        return;
      }
      return;
    }
  }
}
