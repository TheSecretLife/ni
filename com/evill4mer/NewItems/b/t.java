package com.evill4mer.NewItems.b;

import com.evill4mer.NewItems.Main;
import com.evill4mer.NewItems.f.J;
import java.util.HashSet;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

class t
  implements Runnable
{
  int jdField_a_of_type_Int = 0;
  String i = "";
  String j = "";
  
  t(s paramS, Player paramPlayer) {}
  
  public void run()
  {
    jdField_a_of_type_Int += 1;
    if (jdField_a_of_type_Int <= 8)
    {
      i = "";
      for (int k = 0; k < 8 - jdField_a_of_type_Int; k++) {
        i = (i + ChatColor.GRAY + "█");
      }
      j = "";
      for (k = 0; k < jdField_a_of_type_Int; k++) {
        j = (j + ChatColor.GREEN + "█");
      }
      ajdField_a_of_type_ComEvill4merNewItemsBS).a.a(jdField_a_of_type_OrgBukkitEntityPlayer, j + i);
    }
    if (jdField_a_of_type_Int > 12)
    {
      ajdField_a_of_type_ComEvill4merNewItemsBS).a.a(jdField_a_of_type_OrgBukkitEntityPlayer, "");
      jdField_a_of_type_ComEvill4merNewItemsBS.e.remove(jdField_a_of_type_OrgBukkitEntityPlayer.getName());
      s.a(jdField_a_of_type_OrgBukkitEntityPlayer, jdField_a_of_type_ComEvill4merNewItemsBS.d);
    }
  }
}
