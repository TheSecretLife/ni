package com.evill4mer.NewItems.e;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class a
{
  public a() {}
  
  public String d(String paramString)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://www.spigotmc.org/api/general.php").openConnection();
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.getOutputStream().write(("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=" + paramString).getBytes("UTF-8"));
      String str = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream())).readLine();
      if (str.length() <= 7) {
        return str;
      }
    }
    catch (Exception localException)
    {
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Failed to check for a update on spigot.");
    }
    return "unknown";
  }
  
  public int compareVersion(String paramString1, String paramString2)
  {
    String[] arrayOfString1 = paramString1.split("\\.");
    String[] arrayOfString2 = paramString2.split("\\.");
    for (int i = 0; (i < arrayOfString1.length) || (i < arrayOfString2.length); i++) {
      if ((i < arrayOfString1.length) && (i < arrayOfString2.length))
      {
        if (Integer.parseInt(arrayOfString1[i]) < Integer.parseInt(arrayOfString2[i])) {
          return -1;
        }
        if (Integer.parseInt(arrayOfString1[i]) > Integer.parseInt(arrayOfString2[i])) {
          return 1;
        }
      }
      else if (i < arrayOfString1.length)
      {
        if (Integer.parseInt(arrayOfString1[i]) != 0) {
          return 1;
        }
      }
      else if ((i < arrayOfString2.length) && (Integer.parseInt(arrayOfString2[i]) != 0))
      {
        return -1;
      }
    }
    return 0;
  }
}
