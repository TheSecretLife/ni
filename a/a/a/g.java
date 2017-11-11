package a.a.a;

import com.evill4mer.NewItems.Main;
import java.util.HashSet;
import java.util.Set;

public class g
{
  private f a;
  private Object n;
  
  protected g(f paramF, Object paramObject)
  {
    a = paramF;
    n = paramObject;
  }
  
  public void setString(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      remove(paramString1);
      return;
    }
    try
    {
      Main.ꠣꤣ꤅(n.getClass().getMethod("setString", new Class[] { String.class, String.class }), n, new Object[] { paramString1, paramString2 });
      a.save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    try
    {
      Main.ꠣꤣ꤅(n.getClass().getMethod("setInt", new Class[] { String.class, Integer.TYPE }), n, new Object[] { paramString, Integer.valueOf(paramInt) });
      a.save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public int getInteger(String paramString)
  {
    try
    {
      return ((Integer)Main.ꠣꤣ꤅(n.getClass().getMethod("getInt", new Class[] { String.class }), n, new Object[] { paramString })).intValue();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public void setDouble(String paramString, double paramDouble)
  {
    try
    {
      Main.ꠣꤣ꤅(n.getClass().getMethod("setDouble", new Class[] { String.class, Double.TYPE }), n, new Object[] { paramString, Double.valueOf(paramDouble) });
      a.save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public double getDouble(String paramString)
  {
    try
    {
      return ((Double)Main.ꠣꤣ꤅(n.getClass().getMethod("getDouble", new Class[] { String.class }), n, new Object[] { paramString })).doubleValue();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0.0D;
  }
  
  public String getString(String paramString)
  {
    try
    {
      return (String)Main.ꠣꤣ꤅(n.getClass().getMethod("getString", new Class[] { String.class }), n, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "";
  }
  
  public boolean hasKey(String paramString)
  {
    try
    {
      return ((Boolean)Main.ꠣꤣ꤅(n.getClass().getMethod("hasKey", new Class[] { String.class }), n, new Object[] { paramString })).booleanValue();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public Set getKeys()
  {
    try
    {
      return (Set)Main.ꠣꤣ꤅(n.getClass().getMethod("c", new Class[0]), n, new Object[0]);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return new HashSet();
  }
  
  public void remove(String paramString)
  {
    try
    {
      Main.ꠣꤣ꤅(n.getClass().getMethod("remove", new Class[] { String.class }), n, new Object[] { paramString });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}
