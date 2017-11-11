package a.a.a;

import java.util.Iterator;
import java.util.Set;
import org.bukkit.inventory.ItemStack;

public class c
{
  private String v;
  private c a;
  
  protected c(c paramC, String paramString)
  {
    v = paramString;
    a = paramC;
  }
  
  public String getName()
  {
    return v;
  }
  
  protected Object d()
  {
    return a.d();
  }
  
  protected void a(Object paramObject)
  {
    a.a(paramObject);
  }
  
  public c a()
  {
    return a;
  }
  
  protected void setItem(ItemStack paramItemStack)
  {
    a.setItem(paramItemStack);
  }
  
  public void setString(String paramString1, String paramString2)
  {
    h.a(this, paramString1, paramString2);
  }
  
  public String getString(String paramString)
  {
    return h.a(this, paramString);
  }
  
  protected String m(String paramString)
  {
    return h.b(this, paramString);
  }
  
  public void a(String paramString, Integer paramInteger)
  {
    h.a(this, paramString, paramInteger);
  }
  
  public Integer getInteger(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Double paramDouble)
  {
    h.a(this, paramString, paramDouble);
  }
  
  public Double getDouble(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Byte paramByte)
  {
    h.a(this, paramString, paramByte);
  }
  
  public Byte a(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Short paramShort)
  {
    h.a(this, paramString, paramShort);
  }
  
  public Short a(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Long paramLong)
  {
    h.a(this, paramString, paramLong);
  }
  
  public Long getLong(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Float paramFloat)
  {
    h.a(this, paramString, paramFloat);
  }
  
  public Float getFloat(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void setByteArray(String paramString, byte[] paramArrayOfByte)
  {
    h.a(this, paramString, paramArrayOfByte);
  }
  
  public byte[] getByteArray(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void setIntArray(String paramString, int[] paramArrayOfInt)
  {
    h.a(this, paramString, paramArrayOfInt);
  }
  
  public int[] getIntArray(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void a(String paramString, Boolean paramBoolean)
  {
    h.a(this, paramString, paramBoolean);
  }
  
  protected void set(String paramString, Object paramObject)
  {
    h.a(this, paramString, paramObject);
  }
  
  public Boolean getBoolean(String paramString)
  {
    return h.a(this, paramString);
  }
  
  public void setObject(String paramString, Object paramObject)
  {
    h.b(this, paramString, paramObject);
  }
  
  public Object getObject(String paramString, Class paramClass)
  {
    return h.a(this, paramString, paramClass);
  }
  
  public Boolean a(String paramString)
  {
    return h.b(this, paramString);
  }
  
  public void e(String paramString)
  {
    h.b(this, paramString);
  }
  
  public Set getKeys()
  {
    return h.a(this);
  }
  
  public c a(String paramString)
  {
    h.a(this, paramString);
    return b(paramString);
  }
  
  public c b(String paramString)
  {
    c localC = new c(this, paramString);
    if (h.a(localC).booleanValue()) {
      return localC;
    }
    return null;
  }
  
  public f a(String paramString, j paramJ)
  {
    return h.a(this, paramString, paramJ);
  }
  
  public j a(String paramString)
  {
    return j.a(h.a(this, paramString));
  }
  
  public String toString()
  {
    String str1 = "";
    Iterator localIterator = getKeys().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      str1 = str1 + toString(str2);
    }
    return str1;
  }
  
  public String toString(String paramString)
  {
    String str = "";
    for (c localC = this; localC.a() != null; localC = localC.a()) {
      str = str + "   ";
    }
    if (a(paramString) == j.m) {
      return b(paramString).toString();
    }
    return str + "-" + paramString + ": " + m(paramString) + System.lineSeparator();
  }
}
