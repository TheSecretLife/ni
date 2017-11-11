package com.evill4mer.NewItems.a;

import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;

public class a
{
  private final Main a;
  public boolean c;
  String k = new b(this).a();
  String c;
  String d = new d(this).toString();
  String message = new e(this).a();
  String e = new f(this).a();
  String f = new g(this).a();
  String g = new h(this).a();
  
  static
  {
    jdField_a_of_type_JavaLangString = "17384";
  }
  
  public a(Main paramMain)
  {
    jdField_c_of_type_Boolean = true;
    jdField_c_of_type_JavaLangString = new c(this).a();
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  public void e()
  {
    if ((!m.c(jdField_a_of_type_JavaLangString)) || (jdField_a_of_type_JavaLangString.equals("")) || (jdField_a_of_type_JavaLangString.equals(" ")))
    {
      f();
      return;
    }
    r localR = new r();
    try
    {
      String str1 = r.b(k, jdField_c_of_type_JavaLangString, d);
      URLConnection localURLConnection = new URL(str1).openConnection();
      localURLConnection.setRequestProperty(r.b(k, jdField_c_of_type_JavaLangString, e), r.b(k, jdField_c_of_type_JavaLangString, message));
      Main.ꠣꤣ꤂(localURLConnection);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(Main.ꠣꤣ꤀(localURLConnection), Charset.forName("UTF-8")));
      StringBuilder localStringBuilder = new StringBuilder();
      String str2;
      while ((str2 = localBufferedReader.readLine()) != null) {
        localStringBuilder.append(str2);
      }
      String str3 = localStringBuilder.toString();
      if (str3.contains(String.valueOf(jdField_a_of_type_JavaLangString)))
      {
        f();
        return;
      }
      jdField_c_of_type_Boolean = true;
    }
    catch (IOException localIOException) {}catch (IllegalAccessError localIllegalAccessError)
    {
      Bukkit.getServer().getPluginManager().disablePlugin(jdField_a_of_type_ComEvill4merNewItemsMain);
      localIllegalAccessError.printStackTrace();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void f()
  {
    for (int i = 0; i != 5000; i++)
    {
      r localR = new r();
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + r.b(k, jdField_c_of_type_JavaLangString, f));
    }
    Bukkit.getServer().getPluginManager().disablePlugin(jdField_a_of_type_ComEvill4merNewItemsMain);
    jdField_c_of_type_Boolean = false;
  }
  
  public void g()
  {
    r localR = new r();
    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + r.b(k, jdField_c_of_type_JavaLangString, g));
    Bukkit.getServer().getPluginManager().disablePlugin(jdField_a_of_type_ComEvill4merNewItemsMain);
    jdField_c_of_type_Boolean = false;
  }
}
