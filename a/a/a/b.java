package a.a.a;

import java.io.PrintStream;

public enum b
{
  private static b h;
  private final int id;
  
  static
  {
    jdField_a_of_type_AAAB = new b("Unknown", 0, 0);
    b = new b("MC1_8_R3", 1, 183);
    c = new b("MC1_9_R1", 2, 191);
    d = new b("MC1_9_R2", 3, 192);
    e = new b("MC1_10_R1", 4, 1101);
    f = new b("MC1_11_R1", 5, 1111);
    g = new b("MC1_12_R1", 6, 1121);
    jdField_a_of_type_ArrayOfAAAB = new b[] { jdField_a_of_type_AAAB, b, c, d, e, f, g };
  }
  
  private b(int paramInt)
  {
    id = paramInt;
  }
  
  public int getId()
  {
    return id;
  }
  
  public static b a()
  {
    if (h != null) {
      return h;
    }
    String str = org.bukkit.Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
    System.out.println("[NBTAPI] Found Spigot: " + str + "! Trying to find NMS support");
    try
    {
      h = a(str.replace("v", "MC"));
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      h = jdField_a_of_type_AAAB;
    }
    if (h != jdField_a_of_type_AAAB) {
      System.out.println("[NBTAPI] NMS support '" + h.name() + "' loaded!");
    } else {
      System.out.println("[NBTAPI] Wasn't able to find NMS Support! Some functions will not work!");
    }
    return h;
  }
  
  public static b[] a()
  {
    b[] arrayOfB1;
    int i;
    b[] arrayOfB2;
    System.arraycopy(arrayOfB1 = jdField_a_of_type_ArrayOfAAAB, 0, arrayOfB2 = new b[i = arrayOfB1.length], 0, i);
    return arrayOfB2;
  }
  
  public static b a(String paramString)
  {
    return (b)Enum.valueOf(b.class, paramString);
  }
}
