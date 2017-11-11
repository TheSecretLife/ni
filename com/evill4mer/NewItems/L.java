package com.evill4mer.NewItems;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.PacketType.Play.Client;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;

public class L
{
  private Main c;
  
  public L(Main paramMain)
  {
    c = paramMain;
  }
  
  public void onLoad()
  {
    ProtocolLibrary.getProtocolManager().removePacketListeners(c);
    ProtocolLibrary.getProtocolManager().addPacketListener(new M(this, c, ListenerPriority.NORMAL, new PacketType[] { PacketType.Play.Client.RESOURCE_PACK_STATUS }));
  }
}
