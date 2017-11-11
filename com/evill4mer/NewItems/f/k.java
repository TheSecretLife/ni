package com.evill4mer.NewItems.f;

import java.nio.charset.Charset;
import org.bukkit.ChatColor;

public class k
{
  private static final String s = ChatColor.RESET + ChatColor.UNDERLINE + ChatColor.RESET;
  private static final String t = ChatColor.RESET + ChatColor.ITALIC + ChatColor.RESET;
  
  public k() {}
  
  public static String encodeString(String paramString)
  {
    return quote(g(paramString));
  }
  
  public static boolean b(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return (paramString.indexOf(s) > -1) && (paramString.indexOf(t) > -1);
  }
  
  public static String e(String paramString)
  {
    return h(f(paramString));
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    int i = paramString1.indexOf(s);
    int j = paramString1.indexOf(t);
    if ((i < 0) || (j < 0)) {
      return null;
    }
    return paramString1.substring(0, i + s.length()) + g(paramString2) + paramString1.substring(j, paramString1.length());
  }
  
  private static String quote(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return s + paramString + t;
  }
  
  private static String f(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf(s);
    int j = paramString.indexOf(t);
    if ((i < 0) || (j < 0)) {
      return null;
    }
    return paramString.substring(i + s.length(), j);
  }
  
  private static String g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    byte[] arrayOfByte = paramString.getBytes(Charset.forName("UTF-8"));
    char[] arrayOfChar1 = new char[arrayOfByte.length * 4];
    for (int i = 0; i < arrayOfByte.length; i++)
    {
      char[] arrayOfChar2 = a(arrayOfByte[i]);
      arrayOfChar1[(i * 4)] = '§';
      arrayOfChar1[(i * 4 + 1)] = arrayOfChar2[0];
      arrayOfChar1[(i * 4 + 2)] = '§';
      arrayOfChar1[(i * 4 + 3)] = arrayOfChar2[1];
    }
    return new String(arrayOfChar1);
  }
  
  private static String h(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.toLowerCase().replace("§", "");
    if (paramString.length() % 2 != 0) {
      paramString = paramString.substring(0, paramString.length() / 2 * 2);
    }
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte = new byte[arrayOfChar.length / 2];
    for (int i = 0; i < arrayOfChar.length; i += 2) {
      arrayOfByte[(i / 2)] = a(arrayOfChar[i], arrayOfChar[(i + 1)]);
    }
    return new String(arrayOfByte, Charset.forName("UTF-8"));
  }
  
  private static int a(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    if ((paramChar >= 'a') && (paramChar <= 'f')) {
      return paramChar - 'W';
    }
    throw new IllegalArgumentException("Invalid hex char: out of range");
  }
  
  private static char a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 9)) {
      return (char)(paramInt + 48);
    }
    if ((paramInt >= 10) && (paramInt <= 15)) {
      return (char)(paramInt + 87);
    }
    throw new IllegalArgumentException("Invalid hex int: out of range");
  }
  
  private static byte a(char paramChar1, char paramChar2)
  {
    return (byte)((a(paramChar1) << 4 | a(paramChar2)) + -128);
  }
  
  private static char[] a(byte paramByte)
  {
    int i = paramByte - Byte.MIN_VALUE;
    return new char[] { a(i >> 4 & 0xF), a(i & 0xF) };
  }
}
