package com.evill4mer.NewItems.f;

import com.evill4mer.NewItems.Main;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.bukkit.configuration.file.FileConfiguration;

class y
  implements Runnable
{
  int count = 0;
  HashSet l = new HashSet();
  
  y(w paramW) {}
  
  public void run()
  {
    count += 1;
    Iterator localIterator = w.k.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      Integer localInteger1 = (Integer)((Map.Entry)localObject).getKey();
      Integer localInteger2 = (Integer)((Map.Entry)localObject).getValue();
      w.k.put(localInteger1, Integer.valueOf(localInteger2.intValue() + 1));
      if (((Integer)w.k.get(localInteger1)).intValue() > aa).b.getInt("deadbody-show-time"))
      {
        a.a(localInteger1.intValue());
        l.add(localInteger1);
      }
    }
    Object localObject = l.iterator();
    while (((Iterator)localObject).hasNext()) {
      w.k.remove(((Iterator)localObject).next());
    }
    l.clear();
    if (count > aa).b.getInt("deadbody-show-time") + 1) {
      count = 0;
    }
  }
}
