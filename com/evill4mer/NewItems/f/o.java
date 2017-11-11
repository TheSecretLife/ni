package com.evill4mer.NewItems.f;

import com.palmergames.bukkit.towny.db.TownyDataSource;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.TownBlock;
import com.palmergames.bukkit.towny.object.TownyUniverse;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class o
{
  public o() {}
  
  public String a(Player paramPlayer)
  {
    String str = "";
    Resident localResident;
    try
    {
      localResident = TownyUniverse.getDataSource().getResident(paramPlayer.getName());
    }
    catch (NotRegisteredException localNotRegisteredException1)
    {
      localResident = null;
    }
    if (localResident != null) {
      try
      {
        str = localResident.getTown().getName();
      }
      catch (NotRegisteredException localNotRegisteredException2)
      {
        str = "";
      }
    }
    return str;
  }
  
  public static boolean a(Player paramPlayer, Location paramLocation)
  {
    TownBlock localTownBlock = TownyUniverse.getTownBlock(paramLocation);
    if (localTownBlock == null) {
      return true;
    }
    Resident localResident;
    try
    {
      localResident = TownyUniverse.getDataSource().getResident(paramPlayer.getName());
    }
    catch (NotRegisteredException localNotRegisteredException1)
    {
      return false;
    }
    if (localResident != null) {
      try
      {
        List localList = localTownBlock.getTown().getResidents();
        if (localList.contains(localResident)) {
          return true;
        }
      }
      catch (NotRegisteredException localNotRegisteredException2)
      {
        return true;
      }
    }
    return false;
  }
}
