package com.evill4mer.NewItems.f;

import com.evill4mer.NewItems.Main;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class I
{
  private static Class d;
  private static Class jdField_e_of_type_JavaLangClass;
  private static Class jdField_f_of_type_JavaLangClass;
  private static Class jdField_g_of_type_JavaLangClass;
  private String title = "";
  private ChatColor a = ChatColor.WHITE;
  private String u = "";
  private ChatColor b = ChatColor.WHITE;
  private int jdField_e_of_type_Int = -1;
  private int jdField_f_of_type_Int = -1;
  private int jdField_g_of_type_Int = -1;
  private boolean jdField_m_of_type_Boolean = false;
  private static final Map jdField_m_of_type_JavaUtilMap = new HashMap();
  
  public I()
  {
    y();
  }
  
  public I(String paramString)
  {
    title = paramString;
    y();
  }
  
  public I(String paramString1, String paramString2)
  {
    title = paramString1;
    u = paramString2;
    y();
  }
  
  public I(I paramI)
  {
    title = paramI.getTitle();
    u = paramI.f();
    a = paramI.a();
    b = paramI.b();
    jdField_e_of_type_Int = paramI.a();
    jdField_g_of_type_Int = paramI.b();
    jdField_f_of_type_Int = paramI.c();
    jdField_m_of_type_Boolean = paramI.b();
    y();
  }
  
  public I(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    title = paramString1;
    u = paramString2;
    jdField_e_of_type_Int = paramInt1;
    jdField_f_of_type_Int = paramInt2;
    jdField_g_of_type_Int = paramInt3;
    y();
  }
  
  private void y()
  {
    if (d == null)
    {
      d = a("PacketPlayOutTitle");
      jdField_e_of_type_JavaLangClass = a("PacketPlayOutTitle$EnumTitleAction");
      jdField_g_of_type_JavaLangClass = a("IChatBaseComponent");
      jdField_f_of_type_JavaLangClass = a("ChatComponentText");
    }
  }
  
  public void setTitle(String paramString)
  {
    title = paramString;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void d(String paramString)
  {
    u = paramString;
  }
  
  public String f()
  {
    return u;
  }
  
  public void a(ChatColor paramChatColor)
  {
    a = paramChatColor;
  }
  
  public void b(ChatColor paramChatColor)
  {
    b = paramChatColor;
  }
  
  public void b(int paramInt)
  {
    jdField_e_of_type_Int = paramInt;
  }
  
  public void c(int paramInt)
  {
    jdField_g_of_type_Int = paramInt;
  }
  
  public void d(int paramInt)
  {
    jdField_f_of_type_Int = paramInt;
  }
  
  public void A()
  {
    jdField_m_of_type_Boolean = true;
  }
  
  public void B()
  {
    jdField_m_of_type_Boolean = false;
  }
  
  public void i(Player paramPlayer)
  {
    if (d != null)
    {
      n(paramPlayer);
      try
      {
        Object localObject1 = a(paramPlayer);
        Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
        Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
        Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
        Object localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass, Integer.TYPE, Integer.TYPE, Integer.TYPE }).newInstance(new Object[] { arrayOfObject[2], null, Integer.valueOf(jdField_e_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)), Integer.valueOf(jdField_f_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)), Integer.valueOf(jdField_g_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)) });
        if ((jdField_e_of_type_Int != -1) && (jdField_g_of_type_Int != -1) && (jdField_f_of_type_Int != -1)) {
          Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
        }
        Object localObject4 = jdField_f_of_type_JavaLangClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { ChatColor.translateAlternateColorCodes('&', title) });
        localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[0], localObject4 });
        Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
        if (u != "")
        {
          localObject4 = jdField_f_of_type_JavaLangClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { ChatColor.translateAlternateColorCodes('&', u) });
          localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[1], localObject4 });
          Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void j(Player paramPlayer)
  {
    if (d != null) {
      try
      {
        Object localObject1 = a(paramPlayer);
        Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
        Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
        Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
        Object localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass, Integer.TYPE, Integer.TYPE, Integer.TYPE }).newInstance(new Object[] { arrayOfObject[2], 0, Integer.valueOf(jdField_e_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)), Integer.valueOf(jdField_f_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)), Integer.valueOf(jdField_g_of_type_Int * (jdField_m_of_type_Boolean ? 1 : 20)) });
        if ((jdField_e_of_type_Int != -1) && (jdField_g_of_type_Int != -1) && (jdField_f_of_type_Int != -1)) {
          Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void k(Player paramPlayer)
  {
    if (d != null) {
      try
      {
        Object localObject1 = a(paramPlayer);
        Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
        Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
        Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
        Object localObject3 = jdField_f_of_type_JavaLangClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { ChatColor.translateAlternateColorCodes('&', title) });
        Object localObject4 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[0], localObject3 });
        Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject4 });
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void l(Player paramPlayer)
  {
    if (d != null) {
      try
      {
        Object localObject1 = a(paramPlayer);
        Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
        Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
        Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
        Object localObject3 = jdField_f_of_type_JavaLangClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { ChatColor.translateAlternateColorCodes('&', u) });
        Object localObject4 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[1], localObject3 });
        Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject4 });
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void broadcast()
  {
    Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
    while (localIterator.hasNext())
    {
      Player localPlayer = (Player)localIterator.next();
      i(localPlayer);
    }
  }
  
  public void m(Player paramPlayer)
  {
    try
    {
      Object localObject1 = a(paramPlayer);
      Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
      Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
      Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
      Object localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[3], null });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void n(Player paramPlayer)
  {
    try
    {
      Object localObject1 = a(paramPlayer);
      Object localObject2 = getField(localObject1.getClass(), "playerConnection").get(localObject1);
      Object[] arrayOfObject = jdField_e_of_type_JavaLangClass.getEnumConstants();
      Method localMethod = getMethod(localObject2.getClass(), "sendPacket", new Class[0]);
      Object localObject3 = d.getConstructor(new Class[] { jdField_e_of_type_JavaLangClass, jdField_g_of_type_JavaLangClass }).newInstance(new Object[] { arrayOfObject[4], null });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private Class a(Class paramClass)
  {
    return jdField_m_of_type_JavaUtilMap.containsKey(paramClass) ? (Class)jdField_m_of_type_JavaUtilMap.get(paramClass) : paramClass;
  }
  
  private Class[] a(Class[] paramArrayOfClass)
  {
    int i = paramArrayOfClass != null ? paramArrayOfClass.length : 0;
    Class[] arrayOfClass = new Class[i];
    for (int j = 0; j < i; j++) {
      arrayOfClass[j] = a(paramArrayOfClass[j]);
    }
    return arrayOfClass;
  }
  
  private static boolean a(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    if (paramArrayOfClass1.length != paramArrayOfClass2.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfClass1.length; i++) {
      if ((!paramArrayOfClass1[i].equals(paramArrayOfClass2[i])) && (!paramArrayOfClass1[i].isAssignableFrom(paramArrayOfClass2[i]))) {
        return false;
      }
    }
    return true;
  }
  
  private Object a(Object paramObject)
  {
    try
    {
      return Main.ꠣꤣ꤅(a("getHandle", paramObject.getClass(), new Class[0]), paramObject, new Object[0]);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  private Method a(String paramString, Class paramClass, Class... paramVarArgs)
  {
    Class[] arrayOfClass1 = a(paramVarArgs);
    for (Method localMethod : paramClass.getMethods())
    {
      Class[] arrayOfClass2 = a(localMethod.getParameterTypes());
      if ((localMethod.getName().equals(paramString)) && (a(arrayOfClass2, arrayOfClass1))) {
        return localMethod;
      }
    }
    return null;
  }
  
  private String getVersion()
  {
    String str1 = Bukkit.getServer().getClass().getPackage().getName();
    String str2 = str1.substring(str1.lastIndexOf('.') + 1) + ".";
    return str2;
  }
  
  private Class a(String paramString)
  {
    String str = "net.minecraft.server." + getVersion() + paramString;
    Class localClass = null;
    try
    {
      localClass = Class.forName(str);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return localClass;
  }
  
  private Field getField(Class paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      localField.setAccessible(true);
      return localField;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  private Method getMethod(Class paramClass, String paramString, Class... paramVarArgs)
  {
    for (Method localMethod : paramClass.getMethods()) {
      if ((localMethod.getName().equals(paramString)) && ((paramVarArgs.length == 0) || (b(paramVarArgs, localMethod.getParameterTypes()))))
      {
        localMethod.setAccessible(true);
        return localMethod;
      }
    }
    return null;
  }
  
  private boolean b(Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    boolean bool = true;
    if (paramArrayOfClass1.length != paramArrayOfClass2.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfClass1.length; i++) {
      if (paramArrayOfClass1[i] != paramArrayOfClass2[i])
      {
        bool = false;
        break;
      }
    }
    return bool;
  }
  
  public ChatColor a()
  {
    return a;
  }
  
  public ChatColor b()
  {
    return b;
  }
  
  public int a()
  {
    return jdField_e_of_type_Int;
  }
  
  public int b()
  {
    return jdField_g_of_type_Int;
  }
  
  public int c()
  {
    return jdField_f_of_type_Int;
  }
  
  public boolean b()
  {
    return jdField_m_of_type_Boolean;
  }
}
