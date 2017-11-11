package com.evill4mer.NewItems.d;

import com.evill4mer.NewItems.Main;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.bukkit.configuration.file.FileConfiguration;

class d
  implements Runnable
{
  int count = 0;
  HashSet l = new HashSet();
  
  d(c paramC, Map paramMap) {}
  
  public void run()
  {
    count += 1;
    Iterator localIterator = i.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      a localA = (a)((Map.Entry)localObject).getKey();
      Integer localInteger = (Integer)((Map.Entry)localObject).getValue();
      i.put(localA, Integer.valueOf(localInteger.intValue() + 1));
      if (((Integer)i.get(localA)).intValue() > ab).b.getInt("deadbody-show-time"))
      {
        localA.destroy();
        l.add(localA);
      }
    }
    Object localObject = l.iterator();
    while (((Iterator)localObject).hasNext()) {
      i.remove(((Iterator)localObject).next());
    }
    l.clear();
    if (count > ab).b.getInt("deadbody-show-time") + 1) {
      count = 0;
    }
  }
}
