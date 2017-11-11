package a.a.a;

import com.evill4mer.NewItems.Main;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.Stack;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class h
{
  private static final Gson a = new Gson();
  private static final String version = org.bukkit.Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
  
  public h() {}
  
  private static Class a()
  {
    try
    {
      Class localClass = Class.forName("org.bukkit.craftbukkit." + version + ".inventory.CraftItemStack");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  private static Class b()
  {
    try
    {
      Class localClass = Class.forName("org.bukkit.craftbukkit." + version + ".entity.CraftEntity");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static Class c()
  {
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + version + ".NBTBase");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static Class d()
  {
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + version + ".NBTTagString");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static Class e()
  {
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + version + ".NBTTagCompound");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static Class f()
  {
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + version + ".TileEntity");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static Class g()
  {
    try
    {
      Class localClass = Class.forName("org.bukkit.craftbukkit." + version + ".CraftWorld");
      return localClass;
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  private static Object e()
  {
    String str = org.bukkit.Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + str + ".NBTTagCompound");
      return localClass.newInstance();
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  private static Object a(int paramInt1, int paramInt2, int paramInt3)
  {
    String str = org.bukkit.Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
    try
    {
      Class localClass = Class.forName("net.minecraft.server." + str + ".BlockPosition");
      return localClass.getConstructor(new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE }).newInstance(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    catch (Exception localException)
    {
      System.out.println("Error in ItemNBTAPI! (Outdated plugin?)");
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object a(Object paramObject1, Object paramObject2)
  {
    try
    {
      Method localMethod = paramObject2.getClass().getMethod("setTag", new Class[] { paramObject1.getClass() });
      Main.ꠣꤣ꤅(localMethod, paramObject2, new Object[] { paramObject1 });
      return paramObject2;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object a(ItemStack paramItemStack)
  {
    Class localClass = a();
    try
    {
      Method localMethod = localClass.getMethod("asNMSCopy", new Class[] { ItemStack.class });
      Object localObject = Main.ꠣꤣ꤅(localMethod, localClass, new Object[] { paramItemStack });
      return localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object b(Entity paramEntity)
  {
    Class localClass = b();
    try
    {
      Method localMethod = localClass.getMethod("getHandle", new Class[0]);
      return Main.ꠣꤣ꤅(localMethod, b().cast(paramEntity), new Object[0]);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static ItemStack a(Object paramObject)
  {
    Class localClass = a();
    try
    {
      Method localMethod = localClass.getMethod("asCraftMirror", new Class[] { paramObject.getClass() });
      Object localObject = Main.ꠣꤣ꤅(localMethod, localClass, new Object[] { paramObject });
      return (ItemStack)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object b(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    try
    {
      Method localMethod = localClass.getMethod("getTag", new Class[0]);
      Object localObject = Main.ꠣꤣ꤅(localMethod, paramObject, new Object[0]);
      return localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object c(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    try
    {
      Method localMethod = localClass.getMethod(a.i(), new Class[] { e() });
      Object localObject1 = e().newInstance();
      Object localObject2 = Main.ꠣꤣ꤅(localMethod, paramObject, new Object[] { localObject1 });
      if (localObject2 == null) {
        localObject2 = localObject1;
      }
      return localObject2;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object b(Object paramObject1, Object paramObject2)
  {
    try
    {
      Method localMethod = paramObject2.getClass().getMethod(a.j(), new Class[] { e() });
      Main.ꠣꤣ꤅(localMethod, paramObject2, new Object[] { paramObject1 });
      return paramObject2;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Object a(BlockState paramBlockState)
  {
    try
    {
      Object localObject1 = a(paramBlockState.getX(), paramBlockState.getY(), paramBlockState.getZ());
      Object localObject2 = g().cast(paramBlockState.getWorld());
      Object localObject3 = Main.ꠣꤣ꤅(localObject2.getClass().getMethod("getHandle", new Class[0]), localObject2, new Object[0]);
      Object localObject4 = Main.ꠣꤣ꤅(localObject3.getClass().getMethod("getTileEntity", new Class[] { localObject1.getClass() }), localObject3, new Object[] { localObject1 });
      Method localMethod = f().getMethod(a.g(), new Class[] { e() });
      Object localObject5 = e().newInstance();
      Object localObject6 = Main.ꠣꤣ꤅(localMethod, localObject4, new Object[] { localObject5 });
      if (localObject6 == null) {
        localObject6 = localObject5;
      }
      return localObject6;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(BlockState paramBlockState, Object paramObject)
  {
    try
    {
      Object localObject1 = a(paramBlockState.getX(), paramBlockState.getY(), paramBlockState.getZ());
      Object localObject2 = g().cast(paramBlockState.getWorld());
      Object localObject3 = Main.ꠣꤣ꤅(localObject2.getClass().getMethod("getHandle", new Class[0]), localObject2, new Object[0]);
      Object localObject4 = Main.ꠣꤣ꤅(localObject3.getClass().getMethod("getTileEntity", new Class[] { localObject1.getClass() }), localObject3, new Object[] { localObject1 });
      Method localMethod = f().getMethod("a", new Class[] { e() });
      Main.ꠣꤣ꤅(localMethod, localObject4, new Object[] { paramObject });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Object a(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    try
    {
      Method localMethod = localClass.getMethod("getCompound", new Class[] { String.class });
      Object localObject = Main.ꠣꤣ꤅(localMethod, paramObject, new Object[] { paramString });
      return localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString)
  {
    if (paramString == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("set", new Class[] { String.class, c() });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, e().newInstance() });
      paramC.a(localObject1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Boolean a(c paramC)
  {
    Object localObject = paramC.d();
    if (localObject == null) {
      localObject = e();
    }
    if (a(localObject, paramC) != null) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  private static Object a(Object paramObject, c paramC)
  {
    Stack localStack = new Stack();
    while (paramC.a() != null)
    {
      localStack.add(paramC.getName());
      paramC = paramC.a();
    }
    while (!localStack.isEmpty())
    {
      paramObject = a(paramObject, (String)localStack.pop());
      if (paramObject == null) {
        return null;
      }
    }
    return paramObject;
  }
  
  public static void a(c paramC, String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      b(paramC, paramString1);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setString", new Class[] { String.class, String.class });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString1, paramString2 });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static String a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getString", new Class[] { String.class });
      return (String)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static String b(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("get", new Class[] { String.class });
      return Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString }).toString();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Integer paramInteger)
  {
    if (paramInteger == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setInt", new Class[] { String.class, Integer.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramInteger });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Integer a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getInt", new Class[] { String.class });
      return (Integer)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setByteArray", new Class[] { String.class, [B.class });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramArrayOfByte });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static byte[] a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getByteArray", new Class[] { String.class });
      return (byte[])Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setIntArray", new Class[] { String.class, [I.class });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramArrayOfInt });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static int[] a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getIntArray", new Class[] { String.class });
      return (int[])Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Float paramFloat)
  {
    if (paramFloat == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setFloat", new Class[] { String.class, Float.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, Float.valueOf(paramFloat.floatValue()) });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Float a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getFloat", new Class[] { String.class });
      return (Float)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Long paramLong)
  {
    if (paramLong == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setLong", new Class[] { String.class, Long.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, Long.valueOf(paramLong.longValue()) });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Long a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getLong", new Class[] { String.class });
      return (Long)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Short paramShort)
  {
    if (paramShort == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setShort", new Class[] { String.class, Short.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, Short.valueOf(paramShort.shortValue()) });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Short a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getShort", new Class[] { String.class });
      return (Short)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Byte paramByte)
  {
    if (paramByte == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setByte", new Class[] { String.class, Byte.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, Byte.valueOf(paramByte.byteValue()) });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Byte a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getByte", new Class[] { String.class });
      return (Byte)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Double paramDouble)
  {
    if (paramDouble == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setDouble", new Class[] { String.class, Double.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramDouble });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Double a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getDouble", new Class[] { String.class });
      return (Double)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static byte a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return 0;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod(a.h(), new Class[] { String.class });
      return ((Byte)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString })).byteValue();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public static void a(c paramC, String paramString, Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("setBoolean", new Class[] { String.class, Boolean.TYPE });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramBoolean });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Boolean a(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getBoolean", new Class[] { String.class });
      return (Boolean)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void a(c paramC, String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      b(paramC, paramString);
      return;
    }
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue())
    {
      new Throwable("InvalideCompound").printStackTrace();
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("set", new Class[] { String.class, c() });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, paramObject });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static f a(c paramC, String paramString, j paramJ)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("getList", new Class[] { String.class, Integer.TYPE });
      return new f(paramC, paramString, paramJ, Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString, Integer.valueOf(paramJ.getId()) }));
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void b(c paramC, String paramString, Object paramObject)
  {
    try
    {
      String str = a.toJson(paramObject);
      a(paramC, paramString, str);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Object a(c paramC, String paramString, Class paramClass)
  {
    String str = a(paramC, paramString);
    if (str == null) {
      return null;
    }
    try
    {
      return a(str, paramClass);
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      localJsonSyntaxException.printStackTrace();
    }
    return null;
  }
  
  private static Object a(String paramString, Class paramClass)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = a.fromJson(paramString, paramClass);
    return paramClass.cast(localObject);
  }
  
  public static void b(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("remove", new Class[] { String.class });
      Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
      paramC.a(localObject1);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static Boolean b(c paramC, String paramString)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("hasKey", new Class[] { String.class });
      return (Boolean)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static Set a(c paramC)
  {
    Object localObject1 = paramC.d();
    if (localObject1 == null) {
      localObject1 = e();
    }
    if (!a(paramC).booleanValue()) {
      return null;
    }
    Object localObject2 = a(localObject1, paramC);
    try
    {
      Method localMethod = localObject2.getClass().getMethod("c", new Class[0]);
      return (Set)Main.ꠣꤣ꤅(localMethod, localObject2, new Object[0]);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}
