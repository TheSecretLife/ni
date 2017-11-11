package a.a.a;

import com.evill4mer.NewItems.Main;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class f
{
  private String w;
  private c jdField_a_of_type_AAAC;
  private j jdField_a_of_type_AAAJ;
  private Object m;
  
  protected f(c paramC, String paramString, j paramJ, Object paramObject)
  {
    jdField_a_of_type_AAAC = paramC;
    w = paramString;
    jdField_a_of_type_AAAJ = paramJ;
    m = paramObject;
    if ((paramJ != j.k) && (paramJ != j.m)) {
      System.err.println("List types != String/Compound are currently not implemented!");
    }
  }
  
  protected void save()
  {
    jdField_a_of_type_AAAC.set(w, m);
  }
  
  public g a()
  {
    if (jdField_a_of_type_AAAJ != j.m)
    {
      new Throwable("Using Compound method on a non Compound list!").printStackTrace();
      return null;
    }
    try
    {
      Method localMethod = m.getClass().getMethod("add", new Class[] { h.c() });
      Object localObject = h.e().newInstance();
      Main.ꠣꤣ꤅(localMethod, m, new Object[] { localObject });
      return new g(this, localObject);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public g a(int paramInt)
  {
    if (jdField_a_of_type_AAAJ != j.m)
    {
      new Throwable("Using Compound method on a non Compound list!").printStackTrace();
      return null;
    }
    try
    {
      Method localMethod = m.getClass().getMethod("get", new Class[] { Integer.TYPE });
      Object localObject = Main.ꠣꤣ꤅(localMethod, m, new Object[] { Integer.valueOf(paramInt) });
      return new g(this, localObject);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public String getString(int paramInt)
  {
    if (jdField_a_of_type_AAAJ != j.k)
    {
      new Throwable("Using String method on a non String list!").printStackTrace();
      return null;
    }
    try
    {
      Method localMethod = m.getClass().getMethod("getString", new Class[] { Integer.TYPE });
      return (String)Main.ꠣꤣ꤅(localMethod, m, new Object[] { Integer.valueOf(paramInt) });
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public void f(String paramString)
  {
    if (jdField_a_of_type_AAAJ != j.k)
    {
      new Throwable("Using String method on a non String list!").printStackTrace();
      return;
    }
    try
    {
      Method localMethod = m.getClass().getMethod("add", new Class[] { h.c() });
      Main.ꠣꤣ꤅(localMethod, m, new Object[] { h.d().getConstructor(new Class[] { String.class }).newInstance(new Object[] { paramString }) });
      save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void setString(int paramInt, String paramString)
  {
    if (jdField_a_of_type_AAAJ != j.k)
    {
      new Throwable("Using String method on a non String list!").printStackTrace();
      return;
    }
    try
    {
      Method localMethod = m.getClass().getMethod("a", new Class[] { Integer.TYPE, h.c() });
      Main.ꠣꤣ꤅(localMethod, m, new Object[] { Integer.valueOf(paramInt), h.d().getConstructor(new Class[] { String.class }).newInstance(new Object[] { paramString }) });
      save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void remove(int paramInt)
  {
    try
    {
      Method localMethod = m.getClass().getMethod(a.k(), new Class[] { Integer.TYPE });
      Main.ꠣꤣ꤅(localMethod, m, new Object[] { Integer.valueOf(paramInt) });
      save();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public int size()
  {
    try
    {
      Method localMethod = m.getClass().getMethod("size", new Class[0]);
      return ((Integer)Main.ꠣꤣ꤅(localMethod, m, new Object[0])).intValue();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return -1;
  }
  
  public j a()
  {
    return jdField_a_of_type_AAAJ;
  }
}
