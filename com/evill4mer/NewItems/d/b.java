package com.evill4mer.NewItems.d;

import com.evill4mer.NewItems.Main;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class b
{
  private final String q;
  private final String name;
  private final String r;
  private final a a;
  
  public b(a paramA1, String paramString1, String paramString2, a paramA2)
  {
    this(paramA1, paramString1, paramString2, paramString2, paramA2);
  }
  
  public b(a paramA1, String paramString1, String paramString2, String paramString3, a paramA2)
  {
    q = (paramString1 == null ? null : paramString1.replaceAll("-", ""));
    String str = ChatColor.translateAlternateColorCodes('&', paramString2);
    name = ChatColor.stripColor(str);
    r = paramString3;
    a = paramA2;
  }
  
  public GameProfile a()
  {
    UUID localUUID = q == null ? a(c(name)) : a(q);
    GameProfile localGameProfile = new GameProfile(localUUID, name);
    if (a.a(b) != null)
    {
      if (a.b(b) != null) {
        localGameProfile.getProperties().put(a.c(b), new Property(a.c(b), a.a(b), a.b(b)));
      } else {
        localGameProfile.getProperties().put(a.c(b), new Property(a.a(b), a.c(b)));
      }
      return localGameProfile;
    }
    a(localGameProfile);
    return localGameProfile;
  }
  
  public UUID a()
  {
    try
    {
      URL localURL = new URL("https://api.mojang.com/users/profiles/minecraft/" + r);
      URLConnection localURLConnection = localURL.openConnection();
      localURLConnection.setUseCaches(false);
      localURLConnection.setDefaultUseCaches(false);
      localURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0");
      localURLConnection.addRequestProperty("Cache-Control", "no-cache, no-store, must-revalidate");
      localURLConnection.addRequestProperty("Pragma", "no-cache");
      Scanner localScanner = new Scanner(Main.ꠣꤣ꤀(localURLConnection), "UTF-8").useDelimiter("\\A");
      if (localScanner.hasNextLine())
      {
        String str1 = localScanner.next();
        JSONParser localJSONParser = new JSONParser();
        JSONObject localJSONObject = (JSONObject)localJSONParser.parse(str1);
        String str2 = (String)localJSONObject.get("id");
        return a(str2);
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  private void a(GameProfile paramGameProfile)
  {
    String str1 = a().toString().replaceAll("-", "");
    if (str1 == null) {
      return;
    }
    try
    {
      URL localURL = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + str1 + "?unsigned=false");
      URLConnection localURLConnection = localURL.openConnection();
      localURLConnection.setUseCaches(false);
      localURLConnection.setDefaultUseCaches(false);
      localURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0");
      localURLConnection.addRequestProperty("Cache-Control", "no-cache, no-store, must-revalidate");
      localURLConnection.addRequestProperty("Pragma", "no-cache");
      String str2 = new Scanner(Main.ꠣꤣ꤀(localURLConnection), "UTF-8").useDelimiter("\\A").next();
      JSONParser localJSONParser = new JSONParser();
      Object localObject = localJSONParser.parse(str2);
      JSONArray localJSONArray = (JSONArray)((JSONObject)localObject).get("properties");
      for (int i = 0; i < localJSONArray.size(); i++) {
        try
        {
          JSONObject localJSONObject = (JSONObject)localJSONArray.get(i);
          String str3 = (String)localJSONObject.get("name");
          String str4 = (String)localJSONObject.get("value");
          String str5 = localJSONObject.containsKey("signature") ? (String)localJSONObject.get("signature") : null;
          a.b(str5);
          a.setValue(str4);
          a.c(str3);
          if (str5 != null) {
            paramGameProfile.getProperties().put(str3, new Property(str3, str4, str5));
          } else {
            paramGameProfile.getProperties().put(str3, new Property(str4, str3));
          }
        }
        catch (Exception localException2)
        {
          Bukkit.getLogger().log(Level.WARNING, "Failed to apply auth property", localException2);
        }
      }
    }
    catch (Exception localException1) {}
  }
  
  private String c(String paramString)
  {
    if (Bukkit.getOnlineMode())
    {
      OfflinePlayer localOfflinePlayer = Bukkit.getOfflinePlayer(paramString);
      if (localOfflinePlayer != null) {
        return localOfflinePlayer.getUniqueId().toString().replace("-", "");
      }
    }
    return a().toString().replaceAll("-", "-");
  }
  
  private UUID a(String paramString)
  {
    String[] arrayOfString1 = { paramString.substring(0, 8), paramString.substring(8, 12), paramString.substring(12, 16), paramString.substring(16, 20), paramString.substring(20, paramString.length()) };
    StringBuilder localStringBuilder = new StringBuilder();
    for (String str : arrayOfString1) {
      localStringBuilder.append(str).append('-');
    }
    localStringBuilder.setLength(localStringBuilder.length() - 1);
    return UUID.fromString(localStringBuilder.toString());
  }
}
