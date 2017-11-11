package com.evill4mer.NewItems.g;

import com.evill4mer.NewItems.Main;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import net.md_5.bungee.api.ChatColor;
import org.apache.commons.io.FileUtils;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class a
{
  private FileConfiguration jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration;
  private String fileName;
  private File jdField_b_of_type_JavaIoFile;
  private boolean n = false;
  private final Main a;
  
  public a(Main paramMain, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramMain;
    fileName = paramString;
    n = paramBoolean1;
    jdField_b_of_type_JavaIoFile = new File("plugins/NewItems/" + fileName + ".yml");
    jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration = YamlConfiguration.loadConfiguration(jdField_b_of_type_JavaIoFile);
    try
    {
      update();
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    catch (InvalidConfigurationException localInvalidConfigurationException)
    {
      localInvalidConfigurationException.printStackTrace();
    }
    if (paramBoolean2) {
      C();
    }
  }
  
  public void update()
  {
    if (!jdField_b_of_type_JavaIoFile.exists())
    {
      FileUtils.copyInputStreamToFile(a.getResource(fileName + ".yml"), jdField_b_of_type_JavaIoFile);
    }
    else if (n)
    {
      YamlConfiguration localYamlConfiguration = YamlConfiguration.loadConfiguration(new InputStreamReader(a.getResource(fileName + ".yml")));
      Iterator localIterator = localYamlConfiguration.getKeys(true).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.contains(str)) {
          jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.set(str, localYamlConfiguration.get(str));
        }
      }
      jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.save(jdField_b_of_type_JavaIoFile);
    }
  }
  
  public String l(String paramString)
  {
    try
    {
      return com.evill4mer.NewItems.f.m.k(jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getString(paramString));
    }
    catch (NullPointerException localNullPointerException)
    {
      localNullPointerException.printStackTrace();
      Bukkit.getServer().getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Error in file " + fileName + ".yml" + ", please check its integrity or delete it and reload the plugin." + " " + "'" + paramString + "'" + " not found.");
      Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
      while (localIterator.hasNext())
      {
        Player localPlayer = (Player)localIterator.next();
        if (localPlayer.isOp()) {
          localPlayer.sendMessage("[NewItems] " + ChatColor.RED + "Error in file " + fileName + ".yml" + ", please check its integrity or delete it and reload the plugin." + " " + "'" + paramString + "'" + " not found.");
        }
      }
    }
    return ChatColor.RED + "ErrorInLangFile " + fileName + ".yml";
  }
  
  public FileConfiguration getConfig()
  {
    return jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration;
  }
  
  private void C()
  {
    String str1 = new b(this).toString();
    String str2 = new k(this).toString();
    String str3 = new l(this).toString();
    try
    {
      Class localClass1 = Class.forName(str1);
      Constructor localConstructor = localClass1.getConstructor(new Class[] { Main.class });
      localObject1 = localConstructor.newInstance(new Object[] { a });
      localObject2 = localClass1.getDeclaredMethod(str2, new Class[0]);
      Main.ꠣꤣ꤅((Method)localObject2, localObject1, new Object[0]);
      localObject2 = localClass1.getDeclaredMethod(str3, new Class[0]);
      if (((Boolean)Main.ꠣꤣ꤅((Method)localObject2, localObject1, new Object[0])).booleanValue()) {
        k();
      }
    }
    catch (Exception|IllegalAccessError localException1)
    {
      Object localObject1 = new m(this).toString();
      Object localObject2 = new n(this).toString();
      String str4 = new o(this).toString();
      String str5 = new p(this).toString();
      String str6 = new q(this).toString();
      String str7 = new r(this).toString();
      String str8 = new c(this).toString();
      try
      {
        Class localClass2 = Class.forName((String)localObject1);
        Class localClass3 = Class.forName((String)localObject2);
        Class localClass4 = Class.forName(str4);
        Class localClass5 = Class.forName(str5);
        Method localMethod1 = localClass2.getDeclaredMethod(str6, new Class[0]);
        Method localMethod2 = localClass3.getDeclaredMethod(str7, new Class[0]);
        Method localMethod3 = localClass4.getDeclaredMethod(str8, new Class[] { localClass5 });
        Object localObject3 = Main.ꠣꤣ꤅(localMethod1, localObject1, new Object[0]);
        Object localObject4 = Main.ꠣꤣ꤅(localMethod2, localObject3, new Object[0]);
        Main.ꠣꤣ꤅(localMethod3, localObject4, new Object[] { a });
      }
      catch (Exception localException2) {}
    }
  }
  
  private void k()
  {
    String str1 = new d(this).toString();
    String str2 = new e(this).toString();
    String str3 = new f(this).toString();
    String str4 = new g(this).toString();
    String str5 = new h(this).toString();
    String str6 = new i(this).toString();
    String str7 = new j(this).toString();
    try
    {
      Class localClass1 = Class.forName(str1);
      Class localClass2 = Class.forName(str2);
      Class localClass3 = Class.forName(str3);
      Class localClass4 = Class.forName(str4);
      Method localMethod1 = localClass1.getDeclaredMethod(str5, new Class[0]);
      Method localMethod2 = localClass2.getDeclaredMethod(str6, new Class[0]);
      Method localMethod3 = localClass3.getDeclaredMethod(str7, new Class[] { localClass4 });
      Object localObject1 = Main.ꠣꤣ꤅(localMethod1, str1, new Object[0]);
      Object localObject2 = Main.ꠣꤣ꤅(localMethod2, localObject1, new Object[0]);
      Main.ꠣꤣ꤅(localMethod3, localObject2, new Object[] { a });
    }
    catch (Exception localException) {}
  }
}
