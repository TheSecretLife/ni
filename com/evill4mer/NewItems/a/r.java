package com.evill4mer.NewItems.a;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class r
{
  public r() {}
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(paramString2.getBytes("UTF-8"));
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString1.getBytes("UTF-8"), "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
      localCipher.init(1, localSecretKeySpec, localIvParameterSpec);
      byte[] arrayOfByte = localCipher.doFinal(paramString3.getBytes());
      return Base64.encodeBase64String(arrayOfByte);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(paramString2.getBytes("UTF-8"));
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString1.getBytes("UTF-8"), "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
      localCipher.init(2, localSecretKeySpec, localIvParameterSpec);
      byte[] arrayOfByte = localCipher.doFinal(Base64.decodeBase64(paramString3));
      return new String(arrayOfByte);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}
