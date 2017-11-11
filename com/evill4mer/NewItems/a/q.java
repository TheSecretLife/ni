package com.evill4mer.NewItems.a;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class q
{
  Cipher a = Cipher.getInstance("DES");
  Cipher b = Cipher.getInstance("DES");
  
  q(SecretKey paramSecretKey)
  {
    a.init(1, paramSecretKey);
    b.init(2, paramSecretKey);
  }
  
  public String a(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes("UTF8");
    byte[] arrayOfByte2 = a.doFinal(arrayOfByte1);
    return new BASE64Encoder().encode(arrayOfByte2);
  }
  
  public String b(String paramString)
  {
    byte[] arrayOfByte1 = new BASE64Decoder().decodeBuffer(paramString);
    byte[] arrayOfByte2 = b.doFinal(arrayOfByte1);
    return new String(arrayOfByte2, "UTF8");
  }
}
