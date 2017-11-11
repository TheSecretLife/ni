package a.a.a;

public enum j
{
  private final int id;
  
  private j(int paramInt)
  {
    id = paramInt;
  }
  
  public int getId()
  {
    return id;
  }
  
  public static j a(int paramInt)
  {
    for (j localJ : ) {
      if (localJ.getId() == paramInt) {
        return localJ;
      }
    }
    return b;
  }
  
  public static j[] a()
  {
    j[] arrayOfJ1;
    int n;
    j[] arrayOfJ2;
    System.arraycopy(arrayOfJ1 = a, 0, arrayOfJ2 = new j[n = arrayOfJ1.length], 0, n);
    return arrayOfJ2;
  }
  
  public static j b(String paramString)
  {
    return (j)Enum.valueOf(j.class, paramString);
  }
}
