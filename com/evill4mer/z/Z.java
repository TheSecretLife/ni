package com.evill4mer.z;

import com.evill4mer.NewItems.Main;
import java.lang.reflect.Method;
import java.util.List;

public class Z
{
  private final Main a;
  public boolean a;
  
  static
  {
    b = "17384";
  }
  
  public Z(Main paramMain)
  {
    jdField_a_of_type_ComEvill4merNewItemsMain = paramMain;
  }
  
  public void a()
  {
    b(c());
  }
  
  void b(List paramList)
  {
    try
    {
      String str1 = new d(this).toString();
      String str2 = new o(this).toString();
      String str3 = new r(this).toString();
      Class localClass = Class.forName(str1);
      Method localMethod = localClass.getMethod(str2, new Class[0]);
      Object localObject = Main.ꠣꤣ꤅(localMethod, this, new Object[0]);
      try
      {
        if ((paramList.contains(localObject)) || (!com.evill4mer.NewItems.f.m.c(b)) || (b.equals("")) || (b.equals(" ")))
        {
          localMethod = localClass.getMethod(str3, new Class[] { Boolean.TYPE });
          Main.ꠣꤣ꤅(localMethod, this, new Object[] { Boolean.valueOf(true) });
        }
        else
        {
          localMethod = localClass.getMethod(str3, new Class[] { Boolean.TYPE });
          Main.ꠣꤣ꤅(localMethod, this, new Object[] { Boolean.valueOf(false) });
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        localMethod = localClass.getMethod(str3, new Class[] { Boolean.TYPE });
        Main.ꠣꤣ꤅(localMethod, this, new Object[] { Boolean.valueOf(true) });
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  /* Error */
  List c()
  {
    // Byte code:
    //   0: new 111	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 112	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: new 114	com/evill4mer/z/s
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 115	com/evill4mer/z/s:<init>	(Lcom/evill4mer/z/Z;)V
    //   16: invokevirtual 116	com/evill4mer/z/s:toString	()Ljava/lang/String;
    //   19: astore_2
    //   20: new 118	com/evill4mer/z/t
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 119	com/evill4mer/z/t:<init>	(Lcom/evill4mer/z/Z;)V
    //   28: invokevirtual 120	com/evill4mer/z/t:toString	()Ljava/lang/String;
    //   31: astore_3
    //   32: new 122	com/evill4mer/z/u
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 123	com/evill4mer/z/u:<init>	(Lcom/evill4mer/z/Z;)V
    //   40: invokevirtual 124	com/evill4mer/z/u:toString	()Ljava/lang/String;
    //   43: astore 4
    //   45: new 126	com/evill4mer/z/v
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 127	com/evill4mer/z/v:<init>	(Lcom/evill4mer/z/Z;)V
    //   53: invokevirtual 128	com/evill4mer/z/v:toString	()Ljava/lang/String;
    //   56: astore 5
    //   58: new 130	com/evill4mer/z/w
    //   61: dup
    //   62: aload_0
    //   63: invokespecial 131	com/evill4mer/z/w:<init>	(Lcom/evill4mer/z/Z;)V
    //   66: invokevirtual 132	com/evill4mer/z/w:toString	()Ljava/lang/String;
    //   69: astore 6
    //   71: new 134	com/evill4mer/z/x
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 135	com/evill4mer/z/x:<init>	(Lcom/evill4mer/z/Z;)V
    //   79: invokevirtual 136	com/evill4mer/z/x:toString	()Ljava/lang/String;
    //   82: astore 7
    //   84: new 138	com/evill4mer/z/e
    //   87: dup
    //   88: aload_0
    //   89: invokespecial 139	com/evill4mer/z/e:<init>	(Lcom/evill4mer/z/Z;)V
    //   92: invokevirtual 140	com/evill4mer/z/e:toString	()Ljava/lang/String;
    //   95: astore 8
    //   97: aload_3
    //   98: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   101: astore 9
    //   103: aload 4
    //   105: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   108: astore 10
    //   110: aload 5
    //   112: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   115: astore 11
    //   117: aload 9
    //   119: iconst_1
    //   120: anewarray 51	java/lang/Class
    //   123: dup
    //   124: iconst_0
    //   125: ldc 80
    //   127: aastore
    //   128: invokevirtual 144	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   131: astore 12
    //   133: aload 12
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_2
    //   142: aastore
    //   143: invokevirtual 150	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   146: astore 13
    //   148: aload 9
    //   150: aload 6
    //   152: iconst_0
    //   153: anewarray 51	java/lang/Class
    //   156: invokevirtual 153	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   159: astore 14
    //   161: aload 10
    //   163: iconst_1
    //   164: anewarray 51	java/lang/Class
    //   167: dup
    //   168: iconst_0
    //   169: aload 11
    //   171: aastore
    //   172: invokevirtual 144	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   175: astore 15
    //   177: aload 15
    //   179: iconst_1
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload 14
    //   187: aload 13
    //   189: iconst_0
    //   190: anewarray 4	java/lang/Object
    //   193: invokestatic 65	com/evill4mer/NewItems/Main:ꠣꤣ꤅	(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   196: aastore
    //   197: invokevirtual 150	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   200: astore 16
    //   202: aload 10
    //   204: aload 7
    //   206: iconst_0
    //   207: anewarray 51	java/lang/Class
    //   210: invokevirtual 153	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   213: astore 17
    //   215: aload 10
    //   217: aload 8
    //   219: iconst_0
    //   220: anewarray 51	java/lang/Class
    //   223: invokevirtual 153	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   226: astore 18
    //   228: goto +24 -> 252
    //   231: aload_1
    //   232: aload 18
    //   234: aload 16
    //   236: iconst_0
    //   237: anewarray 4	java/lang/Object
    //   240: invokestatic 65	com/evill4mer/NewItems/Main:ꠣꤣ꤅	(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   243: checkcast 80	java/lang/String
    //   246: invokeinterface 158 2 0
    //   251: pop
    //   252: aload 17
    //   254: aload 16
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 65	com/evill4mer/NewItems/Main:ꠣꤣ꤅	(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   263: checkcast 87	java/lang/Boolean
    //   266: invokevirtual 162	java/lang/Boolean:booleanValue	()Z
    //   269: ifne -38 -> 231
    //   272: goto +141 -> 413
    //   275: astore 12
    //   277: goto +136 -> 413
    //   280: astore 12
    //   282: new 164	com/evill4mer/z/f
    //   285: dup
    //   286: aload_0
    //   287: invokespecial 165	com/evill4mer/z/f:<init>	(Lcom/evill4mer/z/Z;)V
    //   290: invokevirtual 166	com/evill4mer/z/f:toString	()Ljava/lang/String;
    //   293: astore 13
    //   295: new 168	com/evill4mer/z/g
    //   298: dup
    //   299: aload_0
    //   300: invokespecial 169	com/evill4mer/z/g:<init>	(Lcom/evill4mer/z/Z;)V
    //   303: invokevirtual 170	com/evill4mer/z/g:toString	()Ljava/lang/String;
    //   306: astore 14
    //   308: aload 13
    //   310: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   313: astore 15
    //   315: aload 15
    //   317: aload 14
    //   319: iconst_0
    //   320: anewarray 51	java/lang/Class
    //   323: invokevirtual 59	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   326: astore 16
    //   328: aload 16
    //   330: aload_0
    //   331: iconst_0
    //   332: anewarray 4	java/lang/Object
    //   335: invokestatic 65	com/evill4mer/NewItems/Main:ꠣꤣ꤅	(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   338: pop
    //   339: goto +5 -> 344
    //   342: astore 15
    //   344: aload 12
    //   346: invokevirtual 173	java/lang/Exception:printStackTrace	()V
    //   349: goto +64 -> 413
    //   352: astore_2
    //   353: new 175	com/evill4mer/z/h
    //   356: dup
    //   357: aload_0
    //   358: invokespecial 176	com/evill4mer/z/h:<init>	(Lcom/evill4mer/z/Z;)V
    //   361: invokevirtual 177	com/evill4mer/z/h:toString	()Ljava/lang/String;
    //   364: astore_3
    //   365: new 179	com/evill4mer/z/i
    //   368: dup
    //   369: aload_0
    //   370: invokespecial 180	com/evill4mer/z/i:<init>	(Lcom/evill4mer/z/Z;)V
    //   373: invokevirtual 181	com/evill4mer/z/i:toString	()Ljava/lang/String;
    //   376: astore 4
    //   378: aload_3
    //   379: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   382: astore 5
    //   384: aload 5
    //   386: aload 4
    //   388: iconst_0
    //   389: anewarray 51	java/lang/Class
    //   392: invokevirtual 59	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   395: astore 6
    //   397: aload 6
    //   399: aload_0
    //   400: iconst_0
    //   401: anewarray 4	java/lang/Object
    //   404: invokestatic 65	com/evill4mer/NewItems/Main:ꠣꤣ꤅	(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   407: pop
    //   408: goto +5 -> 413
    //   411: astore 5
    //   413: aload_1
    //   414: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	415	0	this	Z
    //   7	407	1	localArrayList	java.util.ArrayList
    //   19	123	2	str1	String
    //   352	1	2	localIllegalAccessException	IllegalAccessException
    //   31	348	3	str2	String
    //   43	344	4	str3	String
    //   56	329	5	localObject1	Object
    //   411	1	5	localException1	Exception
    //   69	329	6	localObject2	Object
    //   82	123	7	str4	String
    //   95	123	8	str5	String
    //   101	48	9	localClass1	Class
    //   108	108	10	localClass2	Class
    //   115	55	11	localClass3	Class
    //   131	3	12	localConstructor	java.lang.reflect.Constructor
    //   275	1	12	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   280	65	12	localClassNotFoundException	ClassNotFoundException
    //   146	163	13	localObject3	Object
    //   159	159	14	localObject4	Object
    //   175	141	15	localObject5	Object
    //   342	1	15	localException2	Exception
    //   200	129	16	localObject6	Object
    //   213	40	17	localMethod1	Method
    //   226	7	18	localMethod2	Method
    // Exception table:
    //   from	to	target	type
    //   117	272	275	java/lang/reflect/InvocationTargetException
    //   97	277	280	java/lang/ClassNotFoundException
    //   97	277	280	java/lang/NoSuchMethodException
    //   97	277	280	java/lang/SecurityException
    //   97	277	280	java/lang/InstantiationException
    //   308	339	342	java/lang/Exception
    //   8	349	352	java/lang/IllegalAccessException
    //   8	349	352	java/lang/IllegalArgumentException
    //   378	408	411	java/lang/Exception
  }
  
  public String e()
  {
    return b;
  }
  
  public void f(boolean paramBoolean)
  {
    jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public boolean g()
  {
    return jdField_a_of_type_Boolean;
  }
  
  public void z()
  {
    String str1 = new j(this).toString();
    String str2 = new k(this).toString();
    String str3 = new l(this).toString();
    String str4 = new m(this).toString();
    String str5 = new n(this).toString();
    String str6 = new p(this).toString();
    String str7 = new q(this).toString();
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
      Main.ꠣꤣ꤅(localMethod3, localObject2, new Object[] { jdField_a_of_type_ComEvill4merNewItemsMain });
    }
    catch (Exception localException) {}
  }
}
