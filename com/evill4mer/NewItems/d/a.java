package com.evill4mer.NewItems.d;

import com.evill4mer.NewItems.Main;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class a
{
  Plugin plugin = Bukkit.getPluginManager().getPlugin("NewItems");
  public static List b;
  public static HashMap b;
  public static HashMap c;
  private String name;
  private Location jdField_b_of_type_OrgBukkitLocation;
  private String value;
  private String signature;
  private String o;
  private Class jdField_a_of_type_JavaLangClass;
  private Class jdField_b_of_type_JavaLangClass;
  private Class jdField_c_of_type_JavaLangClass;
  private Constructor jdField_a_of_type_JavaLangReflectConstructor;
  private Object jdField_a_of_type_JavaLangObject;
  private Object jdField_b_of_type_JavaLangObject;
  private int id;
  private Object jdField_c_of_type_JavaLangObject;
  private Object d;
  private Object e;
  private Object f;
  private Object g;
  private Method jdField_a_of_type_JavaLangReflectMethod;
  private Object h;
  private Object i;
  private Object j;
  private UUID jdField_a_of_type_JavaUtilUUID;
  private String p;
  private Object k;
  private Object l;
  private Method jdField_b_of_type_JavaLangReflectMethod;
  private Method jdField_c_of_type_JavaLangReflectMethod;
  private Player player;
  private GameProfile jdField_a_of_type_ComMojangAuthlibGameProfile;
  
  static
  {
    jdField_b_of_type_JavaUtilList = Lists.newArrayList();
    jdField_b_of_type_JavaUtilHashMap = new HashMap();
    jdField_c_of_type_JavaUtilHashMap = new HashMap();
  }
  
  public static Integer a(Integer paramInteger)
  {
    return (Integer)jdField_c_of_type_JavaUtilHashMap.get(paramInteger);
  }
  
  public String c()
  {
    return p;
  }
  
  public UUID getUUID()
  {
    return jdField_a_of_type_JavaUtilUUID;
  }
  
  public Location getLocation()
  {
    return jdField_b_of_type_OrgBukkitLocation;
  }
  
  public static GameProfile a(Object paramObject, String paramString)
  {
    GameProfile localGameProfile = new GameProfile(UUID.randomUUID(), paramString);
    try
    {
      localGameProfile.getProperties().putAll((Multimap)Main.ꠣꤣ꤅(paramObject.getClass().getMethod("getProperties", new Class[0]), paramObject, new Object[0]));
    }
    catch (IllegalAccessException|IllegalArgumentException|InvocationTargetException|NoSuchMethodException|SecurityException localIllegalAccessException) {}
    return localGameProfile;
  }
  
  public void l()
  {
    try
    {
      destroy();
      Class localClass = Class.forName("org.bukkit.craftbukkit." + getServerVersion() + ".entity.CraftPlayer");
      jdField_a_of_type_ComMojangAuthlibGameProfile = a(Main.ꠣꤣ꤅(localClass.cast(player).getClass().getMethod("getProfile", new Class[0]), localClass.cast(player), new Object[0]), player.getName());
      jdField_a_of_type_JavaLangObject = jdField_a_of_type_JavaLangReflectConstructor.newInstance(new Object[] { jdField_b_of_type_JavaLangObject, jdField_c_of_type_JavaLangObject, jdField_a_of_type_ComMojangAuthlibGameProfile, e });
      m();
      jdField_b_of_type_JavaLangReflectMethod = jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass().getMethod("setFlag", new Class[] { Integer.TYPE, Boolean.TYPE });
      Main.ꠣꤣ꤅(jdField_b_of_type_JavaLangReflectMethod, jdField_a_of_type_JavaLangObject, new Object[] { Integer.valueOf(7), Boolean.valueOf(true) });
      jdField_c_of_type_JavaLangReflectMethod = jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass().getMethod("setNoGravity", new Class[] { Boolean.TYPE });
      Main.ꠣꤣ꤅(jdField_c_of_type_JavaLangReflectMethod, jdField_a_of_type_JavaLangObject, new Object[] { Boolean.valueOf(true) });
    }
    catch (Exception localException) {}
  }
  
  public static a a(Location paramLocation)
  {
    Iterator localIterator = jdField_b_of_type_JavaUtilHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Double localDouble1 = Double.valueOf(((Location)localEntry.getKey()).getX());
      Double localDouble2 = Double.valueOf(((Location)localEntry.getKey()).getY());
      Double localDouble3 = Double.valueOf(((Location)localEntry.getKey()).getZ());
      Location localLocation = new Location(((Location)localEntry.getKey()).getWorld(), localDouble1.doubleValue(), localDouble2.doubleValue(), localDouble3.doubleValue());
      localDouble1 = Double.valueOf(paramLocation.getX());
      localDouble2 = Double.valueOf(paramLocation.getY());
      localDouble3 = Double.valueOf(paramLocation.getZ());
      if (localLocation.equals(new Location(paramLocation.getWorld(), localDouble1.doubleValue(), localDouble2.doubleValue(), localDouble3.doubleValue()))) {
        return (a)localEntry.getValue();
      }
    }
    return null;
  }
  
  public void c(Player paramPlayer)
  {
    try
    {
      if (k == null)
      {
        Object localObject1 = jdField_c_of_type_JavaLangClass.getField("REMOVE_PLAYER").get(null);
        Object localObject2 = a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject });
        Constructor localConstructor = jdField_b_of_type_JavaLangClass.getConstructor(new Class[] { localObject1.getClass(), localObject2.getClass() });
        l = localConstructor.newInstance(new Object[] { localObject1, a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject }) });
        k = a("PacketPlayOutEntityDestroy").getConstructor(new Class[] { [I.class }).newInstance(new Object[] { a(Integer.TYPE, new Object[] { Integer.valueOf(id) }) });
      }
      a(paramPlayer, new Object[] { k, l });
    }
    catch (Exception localException) {}
  }
  
  public void destroy()
  {
    try
    {
      a(jdField_b_of_type_OrgBukkitLocation.getWorld());
      Object localObject1 = jdField_c_of_type_JavaLangClass.getField("REMOVE_PLAYER").get(null);
      Object localObject2 = a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject });
      Constructor localConstructor = jdField_b_of_type_JavaLangClass.getConstructor(new Class[] { localObject1.getClass(), localObject2.getClass() });
      g = localConstructor.newInstance(new Object[] { localObject1, a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject }) });
      f = a("PacketPlayOutEntityDestroy").getConstructor(new Class[] { [I.class }).newInstance(new Object[] { a(Integer.TYPE, new Object[] { Integer.valueOf(id) }) });
      Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
      while (localIterator.hasNext())
      {
        Player localPlayer = (Player)localIterator.next();
        a(localPlayer, new Object[] { f, g });
      }
    }
    catch (Exception localException) {}
  }
  
  private byte a(float paramFloat)
  {
    return (byte)(int)(paramFloat * 256.0F / 360.0F);
  }
  
  public Object a(Class paramClass, Object... paramVarArgs)
  {
    Object localObject1 = Array.newInstance(paramClass, paramVarArgs.length);
    try
    {
      Integer localInteger = Integer.valueOf(0);
      for (Object localObject2 : paramVarArgs)
      {
        Array.set(localObject1, localInteger.intValue(), localObject2);
        localInteger = Integer.valueOf(localInteger.intValue() + 1);
      }
    }
    catch (Exception localException) {}
    return localObject1;
  }
  
  public void setCustomName(String paramString)
  {
    try
    {
      destroy();
      jdField_a_of_type_ComMojangAuthlibGameProfile = new GameProfile(jdField_a_of_type_JavaUtilUUID, paramString);
      jdField_a_of_type_JavaLangObject = jdField_a_of_type_JavaLangReflectConstructor.newInstance(new Object[] { jdField_b_of_type_JavaLangObject, jdField_c_of_type_JavaLangObject, jdField_a_of_type_ComMojangAuthlibGameProfile, e });
      m();
      Integer localInteger1 = a();
      id = ((Integer)Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangObject.getClass().getMethod("getId", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0])).intValue();
      Integer localInteger2 = a(localInteger1);
      jdField_c_of_type_JavaUtilHashMap.put(Integer.valueOf(id), localInteger2);
    }
    catch (Exception localException) {}
  }
  
  public void a(String paramString)
  {
    try
    {
      destroy();
      jdField_a_of_type_ComMojangAuthlibGameProfile = new b(this, jdField_a_of_type_JavaUtilUUID.toString(), name, paramString, this).a();
      jdField_a_of_type_JavaLangObject = jdField_a_of_type_JavaLangReflectConstructor.newInstance(new Object[] { jdField_b_of_type_JavaLangObject, jdField_c_of_type_JavaLangObject, jdField_a_of_type_ComMojangAuthlibGameProfile, e });
      m();
      Integer localInteger1 = a();
      id = ((Integer)Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangObject.getClass().getMethod("getId", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0])).intValue();
      Integer localInteger2 = a(localInteger1);
      jdField_c_of_type_JavaUtilHashMap.put(Integer.valueOf(id), localInteger2);
      p = paramString;
    }
    catch (Exception localException) {}
  }
  
  public String getName()
  {
    return name;
  }
  
  public void m()
  {
    try
    {
      Object localObject = a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject });
      Constructor localConstructor = jdField_b_of_type_JavaLangClass.getConstructor(new Class[] { h.getClass(), localObject.getClass() });
      g = localConstructor.newInstance(new Object[] { h, a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject }) });
      f = a("PacketPlayOutNamedEntitySpawn").getConstructor(new Class[] { jdField_a_of_type_JavaLangObject.getClass().getSuperclass() }).newInstance(new Object[] { jdField_a_of_type_JavaLangObject });
      Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangReflectMethod, jdField_a_of_type_JavaLangObject, new Object[] { Double.valueOf(jdField_b_of_type_OrgBukkitLocation.getX()), Double.valueOf(jdField_b_of_type_OrgBukkitLocation.getY()), Double.valueOf(jdField_b_of_type_OrgBukkitLocation.getZ()), Float.valueOf(jdField_b_of_type_OrgBukkitLocation.getYaw()), Float.valueOf(jdField_b_of_type_OrgBukkitLocation.getPitch()) });
      i = a("PacketPlayOutEntity").getClasses()[0].getDeclaredConstructors()[1].newInstance(new Object[] { Integer.valueOf(id), Byte.valueOf(a(jdField_b_of_type_OrgBukkitLocation.getYaw())), Byte.valueOf(a(jdField_b_of_type_OrgBukkitLocation.getPitch())), Boolean.valueOf(true) });
      localConstructor = a("PacketPlayOutEntityHeadRotation").getConstructor(new Class[] { jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass(), Byte.TYPE });
      j = localConstructor.newInstance(new Object[] { jdField_a_of_type_JavaLangObject, Byte.valueOf(a(jdField_b_of_type_OrgBukkitLocation.getYaw())) });
      Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
      Player localPlayer;
      while (localIterator.hasNext())
      {
        localPlayer = (Player)localIterator.next();
        a(localPlayer, new Object[] { f, g });
      }
      n();
      b(jdField_b_of_type_OrgBukkitLocation.getWorld());
      localIterator = Bukkit.getOnlinePlayers().iterator();
      while (localIterator.hasNext())
      {
        localPlayer = (Player)localIterator.next();
        a(localPlayer, new Object[] { i, j });
      }
    }
    catch (Exception localException) {}
  }
  
  public Object a()
  {
    try
    {
      Object localObject1 = Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangClass.getMethod("getBukkitEntity", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0]);
      Method localMethod = localObject1.getClass().getMethod("getGameMode", new Class[0]);
      Object localObject2 = Main.ꠣꤣ꤅(localMethod, localObject1, new Object[0]);
      return localObject2;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public void a(Entity paramEntity)
  {
    try
    {
      Object localObject = Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangClass.getMethod("getBukkitEntity", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0]);
      Method localMethod = localObject.getClass().getMethod("setPassenger", new Class[] { Entity.class });
      Main.ꠣꤣ꤅(localMethod, localObject, new Object[] { paramEntity });
    }
    catch (Exception localException) {}
  }
  
  public void a(World paramWorld)
  {
    try
    {
      Method localMethod = jdField_c_of_type_JavaLangObject.getClass().getMethod("removeEntity", new Class[] { jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass() });
      Main.ꠣꤣ꤅(localMethod, jdField_c_of_type_JavaLangObject, new Object[] { jdField_a_of_type_JavaLangObject });
    }
    catch (Exception localException) {}
  }
  
  public void b(World paramWorld)
  {
    try
    {
      Object localObject1 = jdField_c_of_type_JavaLangObject;
      Method localMethod = localObject1.getClass().getSuperclass().getMethod("addEntity", new Class[] { jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass(), CreatureSpawnEvent.SpawnReason.class });
      Main.ꠣꤣ꤅(localMethod, localObject1, new Object[] { jdField_a_of_type_JavaLangObject, CreatureSpawnEvent.SpawnReason.CUSTOM });
      Object localObject2 = a(jdField_b_of_type_OrgBukkitLocation.getWorld());
      Field localField = localObject2.getClass().getField("players");
      localField.setAccessible(true);
      List localList = (List)localField.get(localObject2);
      localList.remove(jdField_a_of_type_JavaLangObject);
      localField.set(localObject2, localList);
    }
    catch (Exception localException) {}
  }
  
  public void setGameMode(GameMode paramGameMode)
  {
    try
    {
      Object localObject = Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangClass.getMethod("getBukkitEntity", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0]);
      Method localMethod = localObject.getClass().getMethod("setGameMode", new Class[] { paramGameMode.getClass() });
      Main.ꠣꤣ꤅(localMethod, localObject, new Object[] { paramGameMode });
    }
    catch (Exception localException) {}
  }
  
  private void n()
  {
    try
    {
      Constructor localConstructor = a("PlayerConnection").getConstructors()[0];
      Object localObject1 = a("EnumProtocolDirection").getField("SERVERBOUND").get(null);
      Object localObject2 = a("NetworkManager").getConstructors()[0].newInstance(new Object[] { localObject1 });
      localConstructor.newInstance(new Object[] { jdField_b_of_type_JavaLangObject, localObject2, jdField_a_of_type_JavaLangObject });
    }
    catch (Exception localException) {}
  }
  
  public String getValue()
  {
    return value;
  }
  
  public String getSignature()
  {
    return signature;
  }
  
  public String d()
  {
    return o;
  }
  
  String getServerVersion()
  {
    String str;
    try
    {
      str = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      return "unknown";
    }
    return str;
  }
  
  public a(String paramString, Location paramLocation)
  {
    this(paramString, paramLocation, paramString, null, null, null);
  }
  
  public a(String paramString1, Location paramLocation, String paramString2, Player paramPlayer, String paramString3, String paramString4)
  {
    this(paramString1, paramLocation, paramString2, paramPlayer, paramString3, paramString4, null);
  }
  
  public a(String paramString1, Location paramLocation, String paramString2, Player paramPlayer)
  {
    this(paramString1, paramLocation, paramString2, paramPlayer, null, null, null);
  }
  
  public a(String paramString1, Location paramLocation, String paramString2)
  {
    this(paramString1, paramLocation, paramString2, null, null, null);
  }
  
  public a(String paramString1, Location paramLocation, String paramString2, Player paramPlayer, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      p = paramString2;
      name = paramString1;
      jdField_b_of_type_OrgBukkitLocation = paramLocation;
      value = paramString4;
      signature = paramString5;
      o = paramString3;
      player = paramPlayer;
      jdField_a_of_type_JavaLangClass = a("EntityPlayer");
      d = a(paramLocation.getWorld());
      jdField_b_of_type_JavaLangObject = c();
      jdField_c_of_type_JavaLangObject = b();
      jdField_a_of_type_JavaUtilUUID = UUID.randomUUID();
      Class localClass = Class.forName("org.bukkit.craftbukkit." + getServerVersion() + ".entity.CraftPlayer");
      jdField_a_of_type_ComMojangAuthlibGameProfile = a(Main.ꠣꤣ꤅(localClass.cast(paramPlayer).getClass().getMethod("getProfile", new Class[0]), localClass.cast(paramPlayer), new Object[0]), paramPlayer.getName());
      e = a("PlayerInteractManager").getConstructor(new Class[] { d.getClass().getSuperclass() }).newInstance(new Object[] { d });
      jdField_a_of_type_JavaLangReflectConstructor = jdField_a_of_type_JavaLangClass.getConstructor(new Class[] { jdField_b_of_type_JavaLangObject.getClass().getSuperclass(), jdField_c_of_type_JavaLangObject.getClass(), jdField_a_of_type_ComMojangAuthlibGameProfile.getClass(), e.getClass() });
      jdField_a_of_type_JavaLangObject = jdField_a_of_type_JavaLangReflectConstructor.newInstance(new Object[] { jdField_b_of_type_JavaLangObject, jdField_c_of_type_JavaLangObject, jdField_a_of_type_ComMojangAuthlibGameProfile, e });
      id = ((Integer)Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangObject.getClass().getMethod("getId", new Class[0]), jdField_a_of_type_JavaLangObject, new Object[0])).intValue();
      jdField_a_of_type_JavaLangReflectMethod = jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass().getMethod("setLocation", new Class[] { Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE });
      Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangReflectMethod, jdField_a_of_type_JavaLangObject, new Object[] { Double.valueOf(paramLocation.getX()), Double.valueOf(paramLocation.getY()), Double.valueOf(paramLocation.getZ()), Float.valueOf(paramLocation.getYaw()), Float.valueOf(paramLocation.getPitch()) });
      jdField_b_of_type_JavaLangClass = a("PacketPlayOutPlayerInfo");
      jdField_c_of_type_JavaLangClass = jdField_b_of_type_JavaLangClass.getClasses()[1];
      h = jdField_c_of_type_JavaLangClass.getField("ADD_PLAYER").get(null);
      Object localObject = a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject });
      Constructor localConstructor1 = jdField_b_of_type_JavaLangClass.getConstructor(new Class[] { h.getClass(), localObject.getClass() });
      g = localConstructor1.newInstance(new Object[] { h, a(jdField_a_of_type_JavaLangClass, new Object[] { jdField_a_of_type_JavaLangObject }) });
      f = a("PacketPlayOutNamedEntitySpawn").getConstructor(new Class[] { jdField_a_of_type_JavaLangObject.getClass().getSuperclass() }).newInstance(new Object[] { jdField_a_of_type_JavaLangObject });
      Constructor localConstructor2 = a("PacketPlayOutEntity").getClasses()[0].getConstructor(new Class[] { Integer.TYPE, Byte.TYPE, Byte.TYPE, Boolean.TYPE });
      i = localConstructor2.newInstance(new Object[] { Integer.valueOf(id), Byte.valueOf(a(paramLocation.getYaw())), Byte.valueOf(a(paramLocation.getPitch())), Boolean.valueOf(true) });
      localConstructor1 = a("PacketPlayOutEntityHeadRotation").getConstructor(new Class[] { jdField_a_of_type_JavaLangClass.getSuperclass().getSuperclass().getSuperclass(), Byte.TYPE });
      j = localConstructor1.newInstance(new Object[] { jdField_a_of_type_JavaLangObject, Byte.valueOf(a(paramLocation.getYaw())) });
      Iterator localIterator = Bukkit.getOnlinePlayers().iterator();
      Player localPlayer;
      while (localIterator.hasNext())
      {
        localPlayer = (Player)localIterator.next();
        a(localPlayer, new Object[] { g, f });
      }
      n();
      b(paramLocation.getWorld());
      localIterator = Bukkit.getOnlinePlayers().iterator();
      while (localIterator.hasNext())
      {
        localPlayer = (Player)localIterator.next();
        a(localPlayer, new Object[] { i, j });
      }
    }
    catch (Exception localException) {}
  }
  
  public void d(Player paramPlayer)
  {
    a(paramPlayer, new Object[] { g, f });
    a(paramPlayer, new Object[] { i, j });
  }
  
  public Integer a()
  {
    return Integer.valueOf(id);
  }
  
  public void a(Player paramPlayer, Object... paramVarArgs)
  {
    try
    {
      Object localObject1 = Main.ꠣꤣ꤅(paramPlayer.getClass().getMethod("getHandle", new Class[0]), paramPlayer, new Object[0]);
      Object localObject2 = localObject1.getClass().getField("playerConnection").get(localObject1);
      Method localMethod = localObject2.getClass().getMethod("sendPacket", new Class[] { a("Packet") });
      for (Object localObject3 : paramVarArgs) {
        Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { localObject3 });
      }
    }
    catch (Exception localException) {}
  }
  
  public void a(Location paramLocation)
  {
    try
    {
      Main.ꠣꤣ꤅(jdField_a_of_type_JavaLangReflectMethod, jdField_a_of_type_JavaLangObject, new Object[] { Double.valueOf(paramLocation.getX()), Double.valueOf(paramLocation.getY()), Double.valueOf(paramLocation.getZ()), Float.valueOf(paramLocation.getYaw()), Float.valueOf(paramLocation.getPitch()) });
      Field localField1 = jdField_a_of_type_JavaLangObject.getClass().getSuperclass().getSuperclass().getField("aA");
      localField1.setFloat(jdField_a_of_type_JavaLangObject, paramLocation.getYaw());
      Field localField2 = jdField_a_of_type_JavaLangObject.getClass().getSuperclass().getSuperclass().getField("aB");
      localField2.setFloat(jdField_a_of_type_JavaLangObject, paramLocation.getPitch());
      Field localField3 = jdField_a_of_type_JavaLangObject.getClass().getSuperclass().getSuperclass().getField("aK");
      localField3.setFloat(jdField_a_of_type_JavaLangObject, paramLocation.getYaw());
    }
    catch (Exception localException) {}
  }
  
  private Object a(World paramWorld)
  {
    try
    {
      Method localMethod = paramWorld.getClass().getMethod("getHandle", new Class[0]);
      Object localObject1 = Main.ꠣꤣ꤅(localMethod, paramWorld, new Object[0]);
      Object localObject2 = a("World").cast(localObject1);
      return localObject2;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Object a(Entity paramEntity)
  {
    try
    {
      Method localMethod = paramEntity.getClass().getMethod("getHandle", new Class[0]);
      Object localObject = Main.ꠣꤣ꤅(localMethod, paramEntity, new Object[0]);
      return localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Object b()
  {
    try
    {
      Method localMethod = jdField_b_of_type_OrgBukkitLocation.getWorld().getClass().getMethod("getHandle", new Class[0]);
      return Main.ꠣꤣ꤅(localMethod, jdField_b_of_type_OrgBukkitLocation.getWorld(), new Object[0]);
    }
    catch (Exception localException) {}
    return null;
  }
  
  private Object c()
  {
    try
    {
      Method localMethod = Bukkit.getServer().getClass().getMethod("getServer", new Class[0]);
      return Main.ꠣꤣ꤅(localMethod, Bukkit.getServer(), new Object[0]);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public void b(String paramString)
  {
    signature = paramString;
  }
  
  public void setValue(String paramString)
  {
    value = paramString;
  }
  
  public void c(String paramString)
  {
    o = paramString;
  }
  
  public static Class a(String paramString)
  {
    String str1 = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + ".";
    String str2 = "net.minecraft.server." + str1 + paramString;
    try
    {
      Class localClass = Class.forName(str2);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public static void a(Player paramPlayer, Object paramObject)
  {
    try
    {
      Object localObject1 = Main.ꠣꤣ꤅(paramPlayer.getClass().getMethod("getHandle", new Class[0]), paramPlayer, new Object[0]);
      Object localObject2 = localObject1.getClass().getField("playerConnection").get(localObject1);
      Main.ꠣꤣ꤅(localObject2.getClass().getMethod("sendPacket", new Class[] { a("Packet") }), localObject2, new Object[] { paramObject });
    }
    catch (Exception localException) {}
  }
}
