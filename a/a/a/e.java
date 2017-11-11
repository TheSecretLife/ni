package a.a.a;

import org.bukkit.inventory.ItemStack;

public class e
  extends c
{
  private ItemStack b;
  
  public e(ItemStack paramItemStack)
  {
    super(null, null);
    b = paramItemStack.clone();
  }
  
  protected Object d()
  {
    return h.b(h.a(b));
  }
  
  protected void a(Object paramObject)
  {
    b = h.a(h.a(paramObject, h.a(b)));
  }
  
  public ItemStack getItem()
  {
    return b;
  }
  
  protected void setItem(ItemStack paramItemStack)
  {
    b = paramItemStack;
  }
}
