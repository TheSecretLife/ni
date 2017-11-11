package com.evill4mer.NewItems;

import com.evill4mer.NewItems.f.K;
import com.evill4mer.NewItems.f.M;
import com.evill4mer.NewItems.f.N;
import com.evill4mer.NewItems.f.O;
import com.evill4mer.z.Z;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.ItemMeta.Spigot;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.EulerAngle;

public class Main
  extends JavaPlugin
  implements Listener
{
  boolean jdField_f_of_type_Boolean = false;
  Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("NewItems");
  String version = getDescription().getVersion();
  private String m = "https://www.dropbox.com/s/7hfrcz2owu0qjqo/ni57_1.11-12.zip?dl=1";
  private String n = "https://www.dropbox.com/s/rsuvcq1vrla0iiy/ni57_1.9-10.zip?dl=1";
  private int jdField_b_of_type_Int = 57;
  boolean w;
  public boolean g;
  boolean jdField_h_of_type_Boolean = false;
  boolean jdField_i_of_type_Boolean = false;
  static boolean j;
  boolean k;
  boolean l = false;
  public com.evill4mer.NewItems.f.p a;
  public com.evill4mer.NewItems.f.a a;
  public com.evill4mer.NewItems.f.J a;
  com.evill4mer.NewItems.f.j jdField_a_of_type_ComEvill4merNewItemsFJ = new com.evill4mer.NewItems.f.j();
  public I a;
  public com.evill4mer.NewItems.f.i a;
  public com.evill4mer.a.b a;
  com.evill4mer.NewItems.a.a jdField_b_of_type_ComEvill4merNewItemsAA = new com.evill4mer.NewItems.a.a(this);
  com.evill4mer.NewItems.a.a c;
  Z jdField_a_of_type_ComEvill4merZZ = new Z(this);
  com.evill4mer.z.a jdField_a_of_type_ComEvill4merZA = new com.evill4mer.z.a(this);
  com.evill4mer.NewItems.e.a jdField_a_of_type_ComEvill4merNewItemsEA = new com.evill4mer.NewItems.e.a();
  com.evill4mer.NewItems.f.g jdField_a_of_type_ComEvill4merNewItemsFG = new com.evill4mer.NewItems.f.g(this);
  public com.evill4mer.NewItems.f.l a;
  com.evill4mer.NewItems.d.c jdField_a_of_type_ComEvill4merNewItemsDC = new com.evill4mer.NewItems.d.c(this);
  com.evill4mer.NewItems.c.a jdField_a_of_type_ComEvill4merNewItemsCA = new com.evill4mer.NewItems.c.a(this);
  public H a;
  public String b;
  public com.evill4mer.NewItems.g.a a;
  public com.evill4mer.NewItems.g.a b;
  public com.evill4mer.NewItems.g.a c;
  public com.evill4mer.NewItems.g.a d = new com.evill4mer.NewItems.g.a(this, "customWeapons", false, false);
  public com.evill4mer.NewItems.g.a e;
  public com.evill4mer.NewItems.g.a f;
  public com.evill4mer.NewItems.g.a g;
  public com.evill4mer.NewItems.g.a h;
  public com.evill4mer.NewItems.g.a i;
  public com.evill4mer.NewItems.g.a j;
  public com.evill4mer.NewItems.g.a k;
  public com.evill4mer.NewItems.f.G a;
  public FileConfiguration b;
  HashSet jdField_f_of_type_JavaUtilHashSet;
  public HashSet g;
  HashSet jdField_h_of_type_JavaUtilHashSet;
  HashSet jdField_i_of_type_JavaUtilHashSet;
  public HashMap a;
  public HashSet j;
  public Map e;
  public Map f;
  public Map g;
  public Map h;
  public static HashSet k;
  
  static
  {
    jdField_j_of_type_Boolean = false;
    jdField_k_of_type_JavaUtilHashSet = new HashSet();
  }
  
  public Main()
  {
    jdField_g_of_type_Boolean = false;
    jdField_k_of_type_Boolean = false;
    jdField_a_of_type_ComEvill4merNewItemsI = new I(this);
    jdField_a_of_type_ComEvill4merNewItemsFI = new com.evill4mer.NewItems.f.i(this);
    jdField_a_of_type_ComEvill4merAB = new com.evill4mer.a.b(this);
    jdField_c_of_type_ComEvill4merNewItemsAA = new com.evill4mer.NewItems.a.a(this);
    jdField_a_of_type_ComEvill4merNewItemsFL = new com.evill4mer.NewItems.f.l();
    jdField_a_of_type_ComEvill4merNewItemsH = new H(this);
    jdField_b_of_type_JavaLangString = "17384";
    jdField_a_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "lang", true, true);
    jdField_b_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customMenu", false, false);
    jdField_c_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customItems", false, false);
    jdField_e_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customBows", false, false);
    jdField_f_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customPickaxes", false, false);
    jdField_g_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customShields", false, false);
    jdField_h_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customHelmets", false, false);
    jdField_i_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customChestplates", false, false);
    jdField_j_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customLeggings", false, false);
    jdField_k_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customBoots", false, false);
    jdField_a_of_type_ComEvill4merNewItemsFG = new com.evill4mer.NewItems.f.G(this);
    h();
    i();
    jdField_f_of_type_JavaUtilHashSet = new HashSet();
    jdField_g_of_type_JavaUtilHashSet = new HashSet();
    jdField_h_of_type_JavaUtilHashSet = new HashSet();
    jdField_i_of_type_JavaUtilHashSet = new HashSet();
    jdField_a_of_type_JavaUtilHashMap = new HashMap();
    jdField_j_of_type_JavaUtilHashSet = new HashSet();
    jdField_e_of_type_JavaUtilMap = new HashMap();
    jdField_f_of_type_JavaUtilMap = new HashMap();
    jdField_g_of_type_JavaUtilMap = new HashMap();
    jdField_h_of_type_JavaUtilMap = new HashMap();
  }
  
  public String getServerVersion()
  {
    String str;
    try
    {
      str = ((String[])Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(","))[3];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      return "unknown";
    }
    return str;
  }
  
  public String b()
  {
    String str;
    try
    {
      str = ((String[])Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(","))[3];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      return "unknown";
    }
    return str;
  }
  
  private boolean a()
  {
    String str;
    try
    {
      str = ((String[])Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(","))[3];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      return false;
    }
    if (str.equals("v1_9_R2"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFP = new com.evill4mer.NewItems.f.C(this);
      jdField_a_of_type_ComEvill4merNewItemsFA = new com.evill4mer.NewItems.f.f();
      jdField_a_of_type_ComEvill4merNewItemsFJ = new O();
    }
    else if (str.equals("v1_9_R1"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFP = new com.evill4mer.NewItems.f.z(this);
      jdField_a_of_type_ComEvill4merNewItemsFA = new com.evill4mer.NewItems.f.e();
      jdField_a_of_type_ComEvill4merNewItemsFJ = new N();
    }
    else if (str.equals("v1_10_R1"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFP = new com.evill4mer.NewItems.f.q(this);
      jdField_a_of_type_ComEvill4merNewItemsFA = new com.evill4mer.NewItems.f.b();
      jdField_a_of_type_ComEvill4merNewItemsFJ = new K();
    }
    else if (str.equals("v1_11_R1"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFP = new com.evill4mer.NewItems.f.t(this);
      jdField_a_of_type_ComEvill4merNewItemsFA = new com.evill4mer.NewItems.f.c();
      jdField_a_of_type_ComEvill4merNewItemsFJ = new com.evill4mer.NewItems.f.L();
    }
    else if (str.equals("v1_12_R1"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFP = new com.evill4mer.NewItems.f.w(this);
      jdField_a_of_type_ComEvill4merNewItemsFA = new com.evill4mer.NewItems.f.d();
      jdField_a_of_type_ComEvill4merNewItemsFJ = new M();
    }
    return jdField_a_of_type_ComEvill4merNewItemsFP != null;
  }
  
  public void onEnable()
  {
    Bukkit.getConsoleSender().sendMessage("§c[NewItems] Bypassed by T0R&CM");
    Object localObject1;
    if (a())
    {
      jdField_a_of_type_ComEvill4merZA.send();
      jdField_a_of_type_ComEvill4merNewItemsH.v();
      j();
      getServer().getPluginManager().registerEvents(this, this);
      Bukkit.getPluginManager().registerEvents(jdField_a_of_type_ComEvill4merNewItemsFG, this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.a.a(this), this);
      Bukkit.getPluginManager().registerEvents(new a(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.c.a(this), this);
      Bukkit.getPluginManager().registerEvents(new c(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.b.a(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.b.b(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.b.c(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.d(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.u(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.h(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.s(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.g(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.q(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.j(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.n(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.b(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.c(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.p(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.k(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.l(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.m(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.m(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.e(this), this);
      Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.b.a(this), this);
      com.evill4mer.a.a.jdField_a_of_type_JavaIoFile = new File(getDataFolder(), "chests.yml");
      com.evill4mer.a.a.jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration = new YamlConfiguration();
      try
      {
        com.evill4mer.a.a.d();
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
      }
      com.evill4mer.a.a.c();
      if (jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getBoolean("deadbody-show")) {
        jdField_a_of_type_ComEvill4merNewItemsDC.a(jdField_h_of_type_JavaUtilMap);
      }
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "------ NewItems ------");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "    _   _             _____ _                     ");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "   | \\ | |           |_   _| |                    ");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "   |  \\| | _____      _| | | |_ ___ _ __ ___  ___ ");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "   | . ` |/ _ \\ \\ /\\ / | | | __/ _ | '_ ` _ \\/ __|");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "   | |\\  |  __/\\ V  V _| |_| ||  __| | | | | \\__ \\");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "   |_| \\_|\\___| \\_/\\_|_____|\\__\\___|_| |_| |_|___/");
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + " ");
      str1 = ChatColor.GOLD + "Version: " + ChatColor.AQUA + version;
      if (jdField_f_of_type_Boolean) {
        str1 = str1 + " Beta";
      } else {
        str1 = str1 + " Stable";
      }
      Bukkit.getConsoleSender().sendMessage(str1);
      Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "Server version: " + ChatColor.AQUA + getServerVersion());
      Bukkit.getConsoleSender().sendMessage("");
      if (getServer().getPluginManager().getPlugin("ProtocolLib") != null)
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.GREEN + "Detected ProtocolLib!");
        jdField_j_of_type_Boolean = true;
        localObject1 = new L(this);
        ((L)localObject1).onLoad();
        Bukkit.getPluginManager().registerEvents(new J(this), this);
      }
      else
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "ProtocolLib not detected! NewItems will work but can't kick players if they don't accept resource pack and can't send error if" + "there is any problem downloading the resourcepack.");
        jdField_j_of_type_Boolean = false;
        Bukkit.getPluginManager().registerEvents(new J(this), this);
      }
      if (getServer().getPluginManager().getPlugin("GriefPrevention") != null)
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.GREEN + "Detected GriefPrevention!");
        jdField_g_of_type_Boolean = true;
      }
      else
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "GriefPrevention not detected!" + ChatColor.AQUA + "(optional dependency)");
        jdField_g_of_type_Boolean = false;
      }
      if (getServer().getPluginManager().getPlugin("Vault") != null)
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.GREEN + "Detected Vault!");
        jdField_i_of_type_Boolean = true;
      }
      else
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Vault not detected! INSTALL IT or repair signs wont work!");
        jdField_i_of_type_Boolean = false;
      }
      if (getServer().getPluginManager().getPlugin("Towny") != null)
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.GREEN + "Detected Towny!");
        jdField_h_of_type_Boolean = true;
      }
      else
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Towny not detected!" + ChatColor.AQUA + "(optional dependency)");
        jdField_h_of_type_Boolean = false;
      }
      if ((getServer().getPluginManager().getPlugin("SuperElytra") != null) || (getServer().getPluginManager().getPlugin("ElytraWings") != null))
      {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.RED + "Detected SuperElytra/ElytraWings! Swim animation disabled.");
        jdField_k_of_type_Boolean = true;
      }
      else if (jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getBoolean("swim-animation"))
      {
        Bukkit.getPluginManager().registerEvents(new com.evill4mer.NewItems.f.H(), this);
      }
      if (getServer().getPluginManager().getPlugin("Essentials") != null) {
        l = true;
      }
      if ((jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getInt("default-resourcepack-version") < jdField_b_of_type_Int) && (!jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getBoolean("areYouUsingCustomResourcePackLink")))
      {
        jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.set("default-resourcepack-version", Integer.valueOf(jdField_b_of_type_Int));
        jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.set("default-resourcepack-1_10-DO_NOT_CHANGE", n);
        jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.set("default-resourcepack-1_11-DO_NOT_CHANGE", m);
        saveConfig();
      }
      String str2 = new d(this).toString();
      String str3 = new o(this).toString();
      String str4 = new z(this).toString();
      String str5 = new B(this).toString();
      String str6 = new C(this).toString();
      String str7 = new D(this).toString();
      String str8 = new E(this).toString();
      String str9 = new F(this).toString();
      String str10 = new G(this).toString();
      String str11 = new e(this).toString();
      try
      {
        localObject1 = Class.forName(str2);
        Constructor localConstructor = ((Class)localObject1).getConstructor(new Class[] { Main.class });
        localObject2 = localConstructor.newInstance(new Object[] { this });
        localObject3 = ((Class)localObject1).getDeclaredMethod(str3, new Class[0]);
        ꠣꤣ꤅((Method)localObject3, localObject2, new Object[0]);
        localObject3 = ((Class)localObject1).getDeclaredMethod(str4, new Class[0]);
        if (((Boolean)ꠣꤣ꤅((Method)localObject3, localObject2, new Object[0])).booleanValue()) {
          k();
        }
      }
      catch (Exception|IllegalAccessError localException2)
      {
        try
        {
          Object localObject2 = Class.forName(str5);
          Object localObject3 = Class.forName(str6);
          Class localClass1 = Class.forName(str7);
          Class localClass2 = Class.forName(str8);
          Method localMethod1 = ((Class)localObject2).getDeclaredMethod(str9, new Class[0]);
          Method localMethod2 = ((Class)localObject3).getDeclaredMethod(str10, new Class[0]);
          Method localMethod3 = localClass1.getDeclaredMethod(str11, new Class[] { localClass2 });
          Object localObject4 = ꠣꤣ꤅(localMethod1, str5, new Object[0]);
          Object localObject5 = ꠣꤣ꤅(localMethod2, localObject4, new Object[0]);
          ꠣꤣ꤅(localMethod3, localObject5, new Object[] { this });
        }
        catch (Exception localException3) {}
      }
      try
      {
        if ((!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.a.a)) || (!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.i.a))) {
          jdField_b_of_type_ComEvill4merNewItemsAA.f();
        }
      }
      catch (NullPointerException localNullPointerException3)
      {
        jdField_b_of_type_ComEvill4merNewItemsAA.f();
      }
      try
      {
        if (com.evill4mer.NewItems.f.m.c(Z.jdField_b_of_type_JavaLangString)) {
          break label2484;
        }
        jdField_a_of_type_ComEvill4merZZ.z();
      }
      catch (NullPointerException localNullPointerException4)
      {
        jdField_a_of_type_ComEvill4merZZ.z();
      }
    }
    else
    {
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "------ NewItems ------");
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Version: " + ChatColor.AQUA + version);
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Your server version is incompatible! It is: " + getServerVersion());
      Bukkit.getConsoleSender().sendMessage("");
      Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Please use" + ChatColor.GREEN + " v1_9_R2 " + ChatColor.RED + ", " + ChatColor.GREEN + "v1_9_R1 " + ChatColor.RED + ", " + ChatColor.GREEN + "v1_10_R1 " + ChatColor.RED + ", " + ChatColor.GREEN + "v1_11_R1" + ChatColor.RED + "or " + ChatColor.GREEN + "v1_12_R1");
      Bukkit.getPluginManager().disablePlugin(this);
      return;
    }
    label2484:
    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "----------------------");
    String str1 = jdField_a_of_type_ComEvill4merNewItemsEA.d("22783");
    if (!str1.equals("unknown"))
    {
      localObject1 = version;
      if (jdField_a_of_type_ComEvill4merNewItemsEA.compareVersion(str1, (String)localObject1) == 1) {
        Bukkit.getConsoleSender().sendMessage("[NewItems] " + ChatColor.GREEN + "An update is available! Download it here: " + ChatColor.AQUA + "https://www.spigotmc.org/resources/newitems.22783/");
      }
    }
    jdField_b_of_type_ComEvill4merNewItemsAA.e();
    jdField_c_of_type_ComEvill4merNewItemsAA.e();
    try
    {
      if ((!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.a.a)) || (!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.i.a))) {
        jdField_b_of_type_ComEvill4merNewItemsAA.f();
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      jdField_b_of_type_ComEvill4merNewItemsAA.f();
    }
    try
    {
      if (!com.evill4mer.NewItems.f.m.c(Z.jdField_b_of_type_JavaLangString)) {
        jdField_a_of_type_ComEvill4merZZ.z();
      }
    }
    catch (NullPointerException localNullPointerException2)
    {
      jdField_a_of_type_ComEvill4merZZ.z();
    }
  }
  
  public void onDisable() {}
  
  private void h()
  {
    getConfig().options().copyDefaults(true);
    saveConfig();
    getConfig().options().copyDefaults(false);
  }
  
  private void i()
  {
    jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration = getConfig();
    jdField_a_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "lang", true, true);
    jdField_c_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customItems", false, false);
    d = new com.evill4mer.NewItems.g.a(this, "customWeapons", false, false);
    jdField_e_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customBows", false, false);
    jdField_f_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customPickaxes", false, false);
    jdField_b_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customMenu", false, false);
    jdField_g_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customShields", false, false);
    jdField_h_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customHelmets", false, false);
    jdField_i_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customChestplates", false, false);
    jdField_j_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customLeggings", false, false);
    jdField_k_of_type_ComEvill4merNewItemsGA = new com.evill4mer.NewItems.g.a(this, "customBoots", false, false);
    try
    {
      if (!com.evill4mer.NewItems.f.m.c(Z.jdField_b_of_type_JavaLangString)) {
        jdField_a_of_type_ComEvill4merZZ.z();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      jdField_a_of_type_ComEvill4merZZ.z();
    }
  }
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString)
  {
    if ((paramCommand.getName().equalsIgnoreCase("nireload")) || (paramCommand.getName().equalsIgnoreCase("newitemsreload"))) {
      if (paramCommandSender.hasPermission("ni.admin.reload"))
      {
        reloadConfig();
        i();
        if ((paramCommandSender instanceof Player)) {
          jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("reloaded"));
        } else {
          paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("reloaded"));
        }
      }
      else
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.reload to use this command.");
        return true;
      }
    }
    Object localObject1;
    Object localObject3;
    if (paramCommand.getName().equalsIgnoreCase("nitest"))
    {
      localObject1 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short)1);
      localObject3 = ((ItemStack)localObject1).getItemMeta();
      localObject3 = ((ItemStack)localObject1).getItemMeta();
      ((ItemMeta)localObject3).spigot().setUnbreakable(true);
      ((ItemMeta)localObject3).addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE });
      ((ItemMeta)localObject3).setDisplayName("test");
      ((ItemStack)localObject1).setItemMeta((ItemMeta)localObject3);
      ((Player)paramCommandSender).getInventory().addItem(new ItemStack[] { localObject1 });
    }
    if (paramCommand.getName().equalsIgnoreCase("nidur"))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      if (paramCommandSender.hasPermission("ni.admin.nidur"))
      {
        if (jdField_a_of_type_ComEvill4merNewItemsI.a(((Player)paramCommandSender).getInventory().getItemInMainHand()))
        {
          if (paramArrayOfString.length == 1)
          {
            jdField_a_of_type_ComEvill4merNewItemsFI.e((Player)paramCommandSender);
            jdField_a_of_type_ComEvill4merNewItemsFI.a((Player)paramCommandSender, Integer.parseInt(paramArrayOfString[0]));
            jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, "Changed durability!");
          }
          else
          {
            paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "Wrong usage!");
            paramCommandSender.sendMessage("Syntax: " + ChatColor.GREEN + "/nidur <durability>");
          }
        }
        else {
          paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You must hold an item made with NewItems!");
        }
      }
      else
      {
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.nidur to use this command.");
        return true;
      }
    }
    if (paramCommand.getName().equalsIgnoreCase("niinfo"))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      if (paramCommandSender.hasPermission("ni.admin.niinfo"))
      {
        if (jdField_a_of_type_ComEvill4merNewItemsI.a(((Player)paramCommandSender).getInventory().getItemInMainHand()))
        {
          localObject1 = new a.a.a.e(((Player)paramCommandSender).getInventory().getItemInMainHand());
          paramCommandSender.sendMessage(" ");
          paramCommandSender.sendMessage(ChatColor.GOLD + "Info:");
          paramCommandSender.sendMessage(ChatColor.stripColor(((a.a.a.e)localObject1).toString()));
        }
        else
        {
          paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You must hold an item made with NewItems!");
        }
      }
      else
      {
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.niinfo to use this command.");
        return true;
      }
    }
    Object localObject4;
    if ((paramCommand.getName().equalsIgnoreCase("nihelp")) || (paramCommand.getName().equalsIgnoreCase("newitemshelp")))
    {
      paramCommandSender.sendMessage(ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "----------------------------------------------------" + ChatColor.RED + "\n ");
      paramCommandSender.sendMessage(ChatColor.GOLD + "NewItems version: " + ChatColor.AQUA + version);
      paramCommandSender.sendMessage(ChatColor.GOLD + "Server version: " + ChatColor.AQUA + getServerVersion());
      paramCommandSender.sendMessage(jdField_a_of_type_ComEvill4merNewItemsGA.l("commands"));
      localObject1 = (ArrayList)jdField_a_of_type_ComEvill4merNewItemsGA.getConfig().getStringList("help-commands");
      localObject4 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = (String)((Iterator)localObject4).next();
        paramCommandSender.sendMessage(com.evill4mer.NewItems.f.m.k((String)localObject3));
      }
      paramCommandSender.sendMessage(ChatColor.RED + "\n" + ChatColor.DARK_GRAY + ChatColor.STRIKETHROUGH + "----------------------------------------------------");
    }
    if ((paramCommand.getName().equalsIgnoreCase("nisafe")) || (paramCommand.getName().equalsIgnoreCase("newitemssafe")))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      int i1 = 1;
      if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equalsIgnoreCase("lock")))
      {
        i1 = 0;
        if (paramCommandSender.hasPermission("ni.admin.safelock"))
        {
          if ((((Player)paramCommandSender).getTargetBlock(null, 4).getType() == Material.CHEST) || (((Player)paramCommandSender).getTargetBlock(null, 4).getType() == Material.TRAPPED_CHEST))
          {
            localObject3 = new com.evill4mer.a.a(this);
            ((com.evill4mer.a.a)localObject3).a(paramArrayOfString[1], ((Player)paramCommandSender).getTargetBlock(null, 4));
            jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-locked"));
          }
          else
          {
            jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-look"));
          }
          return true;
        }
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.safelock to use this command.");
        return true;
      }
      i1 = 1;
      if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].equalsIgnoreCase("unlock")))
      {
        i1 = 0;
        if (paramCommandSender.hasPermission("ni.admin.safeunlock"))
        {
          if ((((Player)paramCommandSender).getTargetBlock(null, 4).getType() == Material.CHEST) || (((Player)paramCommandSender).getTargetBlock(null, 4).getType() == Material.TRAPPED_CHEST))
          {
            jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-unlocked"));
            com.evill4mer.a.a.jdField_a_of_type_OrgBukkitConfigurationFileFileConfiguration.set("chests." + ((Player)paramCommandSender).getTargetBlock(null, 4).getX() + ((Player)paramCommandSender).getTargetBlock(null, 4).getY() + ((Player)paramCommandSender).getTargetBlock(null, 4).getZ(), null);
            com.evill4mer.a.a.b();
          }
          else
          {
            jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("safe-look"));
          }
        }
        else
        {
          ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.safeunlock to use this command.");
          return true;
        }
      }
      else
      {
        i1 = 1;
      }
      if (i1 != 0)
      {
        ((Player)paramCommandSender).sendMessage("");
        ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
        ((Player)paramCommandSender).sendMessage(ChatColor.RED + "/nisafe lock <playerName>");
        ((Player)paramCommandSender).sendMessage(ChatColor.RED + "/nisafe unlock");
        ((Player)paramCommandSender).sendMessage("");
      }
    }
    if (paramCommand.getName().equalsIgnoreCase("nicorpse"))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      if (((Player)paramCommandSender).hasPermission("ni.admin.nicorpse"))
      {
        if (paramArrayOfString.length == 1)
        {
          if (Bukkit.getPlayer(paramArrayOfString[0]) != null)
          {
            Location localLocation = ((Player)paramCommandSender).getLocation().add(1.0D, 0.10000000149011612D, 0.0D);
            localLocation.setPitch(0.0F);
            localObject3 = new com.evill4mer.NewItems.d.a(paramArrayOfString[0], localLocation, paramArrayOfString[0], Bukkit.getPlayer(paramArrayOfString[0]));
            ((com.evill4mer.NewItems.d.a)localObject3).l();
            jdField_h_of_type_JavaUtilMap.put(localObject3, Integer.valueOf(0));
          }
          else
          {
            ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("player-offline"));
          }
        }
        else
        {
          ((Player)paramCommandSender).sendMessage("");
          ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
          ((Player)paramCommandSender).sendMessage(ChatColor.RED + "/nicorpse <playerName>");
          ((Player)paramCommandSender).sendMessage("");
          return true;
        }
      }
      else
      {
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.nicorpse to use this command.");
        return true;
      }
    }
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (paramCommand.getName().equalsIgnoreCase("ni"))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      if (!w)
      {
        try
        {
          if ((!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.a.a)) || (!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.i.a))) {
            jdField_b_of_type_ComEvill4merNewItemsAA.f();
          }
        }
        catch (NullPointerException localNullPointerException1)
        {
          jdField_b_of_type_ComEvill4merNewItemsAA.f();
        }
        try
        {
          if (!com.evill4mer.NewItems.f.m.c(Z.jdField_b_of_type_JavaLangString)) {
            jdField_a_of_type_ComEvill4merZZ.z();
          }
        }
        catch (NullPointerException localNullPointerException2)
        {
          jdField_a_of_type_ComEvill4merZZ.z();
        }
        localObject3 = new f(this).toString();
        localObject4 = new g(this).toString();
        localObject5 = new h(this).toString();
        localObject6 = new i(this).toString();
        localObject7 = new j(this).toString();
        String str1 = new k(this).toString();
        String str2 = new l(this).toString();
        String str3 = new m(this).toString();
        String str4 = new n(this).toString();
        String str5 = new p(this).toString();
        try
        {
          Class localClass1 = Class.forName((String)localObject3);
          Constructor localConstructor = localClass1.getConstructor(new Class[] { Main.class });
          localObject8 = localConstructor.newInstance(new Object[] { this });
          localObject9 = localClass1.getDeclaredMethod((String)localObject4, new Class[0]);
          ꠣꤣ꤅((Method)localObject9, localObject8, new Object[0]);
          localObject9 = localClass1.getDeclaredMethod((String)localObject5, new Class[0]);
          if (((Boolean)ꠣꤣ꤅((Method)localObject9, localObject8, new Object[0])).booleanValue()) {
            k();
          }
        }
        catch (Exception|IllegalAccessError localException1)
        {
          try
          {
            Object localObject8 = Class.forName((String)localObject6);
            Object localObject9 = Class.forName((String)localObject7);
            Class localClass2 = Class.forName(str1);
            Class localClass3 = Class.forName(str2);
            Method localMethod1 = ((Class)localObject8).getDeclaredMethod(str3, new Class[0]);
            Method localMethod2 = ((Class)localObject9).getDeclaredMethod(str4, new Class[0]);
            Method localMethod3 = localClass2.getDeclaredMethod(str5, new Class[] { localClass3 });
            Object localObject10 = ꠣꤣ꤅(localMethod1, localObject6, new Object[0]);
            Object localObject11 = ꠣꤣ꤅(localMethod2, localObject10, new Object[0]);
            ꠣꤣ꤅(localMethod3, localObject11, new Object[] { this });
          }
          catch (Exception localException2) {}
        }
        w = true;
      }
      if (((Player)paramCommandSender).hasPermission("ni.user.ni"))
      {
        jdField_a_of_type_ComEvill4merNewItemsCA.a((Player)paramCommandSender);
      }
      else
      {
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.user.ni to use this command.");
        return true;
      }
    }
    if (paramCommand.getName().equalsIgnoreCase("nisit"))
    {
      if (!(paramCommandSender instanceof Player))
      {
        paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
        return true;
      }
      if (((Player)paramCommandSender).hasPermission("ni.user.sit"))
      {
        if (paramCommand.getName().equalsIgnoreCase("nisit"))
        {
          if ((((Player)paramCommandSender).isInsideVehicle()) || (((Player)paramCommandSender).isGliding()) || (((Player)paramCommandSender).getGameMode() == GameMode.SPECTATOR) || (((Player)paramCommandSender).getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.AIR) || (((Player)paramCommandSender).getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.LAVA) || (((Player)paramCommandSender).getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.STATIONARY_LAVA) || (((Player)paramCommandSender).getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.WATER) || (((Player)paramCommandSender).getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.STATIONARY_WATER)) {
            return true;
          }
          double d1 = 1.0D;
          localObject4 = ((Player)paramCommandSender).getLocation().getWorld().getEntities();
          localObject6 = ((List)localObject4).iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject5 = (Entity)((Iterator)localObject6).next();
            if ((localObject5 instanceof ItemFrame))
            {
              localObject7 = (ItemFrame)localObject5;
              if ((((Entity)localObject5).getLocation().distance(((Player)paramCommandSender).getLocation()) <= d1) && (((ItemFrame)localObject7).getItem().hasItemMeta()) && (jdField_a_of_type_ComEvill4merNewItemsI.b(((ItemFrame)localObject7).getItem()).equals("chair")))
              {
                a((Player)paramCommandSender, ((Player)paramCommandSender).getLocation());
                return true;
              }
            }
          }
          b((Player)paramCommandSender, ((Player)paramCommandSender).getLocation());
          return true;
        }
      }
      else
      {
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.user.sit to use this command.");
        return true;
      }
    }
    if (paramCommand.getName().equalsIgnoreCase("medal"))
    {
      if ((paramCommand.getName().equalsIgnoreCase("medal")) && (paramCommandSender.hasPermission("ni.admin.medal")))
      {
        if (paramArrayOfString.length == 0)
        {
          paramCommandSender.sendMessage("");
          paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
          paramCommandSender.sendMessage(ChatColor.GREEN + "/medal list");
          paramCommandSender.sendMessage(ChatColor.RED + "/medal item<n> <playerName>");
          paramCommandSender.sendMessage("");
          return true;
        }
        Object localObject2;
        if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].equalsIgnoreCase("list")))
        {
          paramCommandSender.sendMessage("");
          paramCommandSender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.GOLD + "=" + ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + ChatColor.BOLD + " Medals List " + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + "=" + ChatColor.YELLOW + "-");
          localObject3 = jdField_a_of_type_ComEvill4merNewItemsH.e.entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject2 = (Map.Entry)((Iterator)localObject3).next();
            paramCommandSender.sendMessage(ChatColor.GREEN + "Name: " + ChatColor.WHITE + (String)((Map.Entry)localObject2).getKey() + ChatColor.GREEN + ", Desc.: " + ((ItemStack)((Map.Entry)localObject2).getValue()).getItemMeta().getDisplayName() + ChatColor.WHITE);
            paramCommandSender.sendMessage("");
          }
          return true;
        }
        if ((paramCommandSender instanceof Player))
        {
          if (paramArrayOfString.length == 2)
          {
            if (jdField_a_of_type_ComEvill4merNewItemsH.e.containsKey(paramArrayOfString[0]))
            {
              localObject2 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.e.get(paramArrayOfString[0])).clone();
              localObject3 = ((ItemStack)localObject2).getItemMeta();
              localObject4 = (ArrayList)((ItemMeta)localObject3).getLore();
              ((ArrayList)localObject4).add(jdField_a_of_type_ComEvill4merNewItemsGA.l("won-by") + paramArrayOfString[1]);
              ((ItemMeta)localObject3).setLore((List)localObject4);
              ((ItemStack)localObject2).setItemMeta((ItemMeta)localObject3);
              ((Player)paramCommandSender).getInventory().addItem(new ItemStack[] { localObject2 });
              jdField_a_of_type_ComEvill4merNewItemsFJ.a((Player)paramCommandSender, jdField_a_of_type_ComEvill4merNewItemsGA.l("obtained-medal"));
            }
            else
            {
              ((Player)paramCommandSender).sendMessage("");
              ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("medal-not-found"));
              ((Player)paramCommandSender).sendMessage(ChatColor.RED + "/medal item<n> <playerName>");
              ((Player)paramCommandSender).sendMessage("");
            }
          }
          else
          {
            ((Player)paramCommandSender).sendMessage("");
            ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
            ((Player)paramCommandSender).sendMessage(ChatColor.RED + "/medal item<n> <playerName>");
            ((Player)paramCommandSender).sendMessage("");
          }
        }
        else
        {
          paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
          return true;
        }
        return true;
      }
      paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.medal to use this command.");
      return true;
    }
    int i2;
    if (paramCommand.getName().equalsIgnoreCase("niget"))
    {
      if ((paramCommandSender instanceof Player))
      {
        if (((Player)paramCommandSender).hasPermission("ni.admin.get"))
        {
          i2 = 1;
          if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2))
          {
            if ((paramArrayOfString.length == 2) && (jdField_a_of_type_ComEvill4merNewItemsFJ.isNumeric(paramArrayOfString[1]))) {
              i2 = Integer.parseInt(paramArrayOfString[1]);
            }
            localObject3 = jdField_a_of_type_ComEvill4merNewItemsI.a(paramArrayOfString[0], true);
            if (jdField_a_of_type_ComEvill4merNewItemsI.a((ItemStack)localObject3))
            {
              ((ItemStack)localObject3).setAmount(i2);
              ((Player)paramCommandSender).getInventory().addItem(new ItemStack[] { localObject3 });
              ((Player)paramCommandSender).sendMessage("");
              ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("received") + paramArrayOfString[0]);
              ((Player)paramCommandSender).sendMessage("");
            }
            else
            {
              ((Player)paramCommandSender).sendMessage("");
              ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem-not-found"));
              ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "Use" + ChatColor.BLUE + " /ni" + ChatColor.GREEN + " to see items IDs.");
              ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "For example to get the item 1 use: " + ChatColor.BLUE + "/niget <item1> <amount(optional)>");
              ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "To get the weapon 6 use: " + ChatColor.BLUE + "/niget weapon6");
              ((Player)paramCommandSender).sendMessage("");
            }
          }
          else
          {
            ((Player)paramCommandSender).sendMessage("");
            ((Player)paramCommandSender).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
            ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "Use" + ChatColor.BLUE + " /ni" + ChatColor.GREEN + " to see items IDs.");
            ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "For example to get the item 1 use: " + ChatColor.BLUE + "/niget <item1> <amount(optional)>");
            ((Player)paramCommandSender).sendMessage(ChatColor.GREEN + "To get the weapon 6 use: " + ChatColor.BLUE + "/niget weapon6");
            ((Player)paramCommandSender).sendMessage("");
            return true;
          }
          return true;
        }
        ((Player)paramCommandSender).sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.get to use this command.");
        return true;
      }
      paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "This command is only for users.");
      return true;
    }
    if (paramCommand.getName().equalsIgnoreCase("nigive"))
    {
      if (paramCommandSender.hasPermission("ni.admin.give"))
      {
        i2 = 1;
        if ((paramArrayOfString.length == 2) || (paramArrayOfString.length == 3))
        {
          if ((paramArrayOfString.length == 3) && (jdField_a_of_type_ComEvill4merNewItemsFJ.isNumeric(paramArrayOfString[2]))) {
            i2 = Integer.parseInt(paramArrayOfString[2]);
          }
          if (Bukkit.getPlayer(paramArrayOfString[0]) == null)
          {
            paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("player-offline"));
            return true;
          }
          localObject3 = Bukkit.getPlayer(paramArrayOfString[0]);
          if (((Player)localObject3).getInventory().firstEmpty() == -1)
          {
            paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + ((Player)localObject3).getName() + "'s inventory is full!");
            return true;
          }
          int i3 = 0;
          if (jdField_a_of_type_ComEvill4merNewItemsH.jdField_j_of_type_JavaUtilMap.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.jdField_j_of_type_JavaUtilMap.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (jdField_a_of_type_ComEvill4merNewItemsH.a.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.a.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (jdField_a_of_type_ComEvill4merNewItemsH.g.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.g.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (jdField_a_of_type_ComEvill4merNewItemsH.h.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.h.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (jdField_a_of_type_ComEvill4merNewItemsH.i.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.i.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (jdField_a_of_type_ComEvill4merNewItemsH.jdField_j_of_type_JavaUtilLinkedHashMap.containsKey(paramArrayOfString[1]))
          {
            i3 = 1;
            localObject4 = ((ItemStack)jdField_a_of_type_ComEvill4merNewItemsH.jdField_j_of_type_JavaUtilLinkedHashMap.get(paramArrayOfString[1])).clone();
            ((ItemStack)localObject4).setAmount(i2);
            ((Player)localObject3).getInventory().addItem(new ItemStack[] { localObject4 });
          }
          if (i3 != 0)
          {
            ((Player)localObject3).sendMessage("");
            ((Player)localObject3).sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("received") + paramArrayOfString[1]);
            ((Player)localObject3).sendMessage("");
            paramCommandSender.sendMessage("");
            paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("given") + paramArrayOfString[1] + " | " + ((Player)localObject3).getName());
            paramCommandSender.sendMessage("");
          }
          else
          {
            paramCommandSender.sendMessage("");
            paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("newitem-not-found"));
            paramCommandSender.sendMessage(ChatColor.GREEN + "Use" + ChatColor.BLUE + " /ni" + ChatColor.GREEN + " to see items IDs.");
            paramCommandSender.sendMessage(ChatColor.GREEN + "For example to get the item 1 use: " + ChatColor.BLUE + "/nigive <player> <item1> <amount(optional)>");
            paramCommandSender.sendMessage(ChatColor.GREEN + "To get the weapon 6 use: " + ChatColor.BLUE + "/nigive player weapon6");
            paramCommandSender.sendMessage("");
          }
        }
        else
        {
          paramCommandSender.sendMessage("");
          paramCommandSender.sendMessage("[NewItems] " + jdField_a_of_type_ComEvill4merNewItemsGA.l("wrong-usage"));
          paramCommandSender.sendMessage(ChatColor.GREEN + "Use" + ChatColor.BLUE + " /ni" + ChatColor.GREEN + " to see items IDs.");
          paramCommandSender.sendMessage(ChatColor.GREEN + "For example to get the item 1 use: " + ChatColor.BLUE + "/nigive <player> <item1> <amount(optional)>");
          paramCommandSender.sendMessage(ChatColor.GREEN + "To get the weapon 6 use: " + ChatColor.BLUE + "/nigive player weapon6");
          paramCommandSender.sendMessage("");
          return true;
        }
        try
        {
          if ((!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.a.a)) || (!com.evill4mer.NewItems.f.m.c(com.evill4mer.NewItems.a.i.a))) {
            jdField_b_of_type_ComEvill4merNewItemsAA.f();
          }
        }
        catch (NullPointerException localNullPointerException3)
        {
          jdField_b_of_type_ComEvill4merNewItemsAA.f();
        }
        return true;
      }
      paramCommandSender.sendMessage("[NewItems] " + ChatColor.RED + "You need the permission ni.admin.give to use this command.");
      return true;
    }
    return true;
  }
  
  @EventHandler(priority=EventPriority.LOWEST)
  public void a(PlayerTeleportEvent paramPlayerTeleportEvent)
  {
    if (jdField_e_of_type_JavaUtilMap.containsKey(paramPlayerTeleportEvent.getPlayer()))
    {
      if (paramPlayerTeleportEvent.getPlayer().isSneaking())
      {
        Player localPlayer1 = paramPlayerTeleportEvent.getPlayer();
        Player localPlayer2 = localPlayer1;
        Location localLocation = (Location)jdField_e_of_type_JavaUtilMap.get(localPlayer1);
        Entity localEntity = (Entity)jdField_f_of_type_JavaUtilMap.get(localPlayer1);
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new q(this, localPlayer2, localLocation), 1L);
        paramPlayerTeleportEvent.setCancelled(true);
        jdField_e_of_type_JavaUtilMap.remove(localPlayer1);
        localPlayer1.teleport(localPlayer1.getLocation().add(0.0D, 5.0D, 0.0D));
        localEntity.remove();
        jdField_f_of_type_JavaUtilMap.remove(localPlayer1);
        paramPlayerTeleportEvent.setCancelled(true);
        return;
      }
      paramPlayerTeleportEvent.setCancelled(true);
    }
  }
  
  @EventHandler(priority=EventPriority.LOWEST)
  public void a(PlayerQuitEvent paramPlayerQuitEvent)
  {
    if (jdField_e_of_type_JavaUtilMap.containsKey(paramPlayerQuitEvent.getPlayer()))
    {
      Player localPlayer = paramPlayerQuitEvent.getPlayer();
      Entity localEntity = (Entity)jdField_f_of_type_JavaUtilMap.get(localPlayer);
      jdField_e_of_type_JavaUtilMap.remove(localPlayer);
      localEntity.remove();
      jdField_f_of_type_JavaUtilMap.remove(localPlayer);
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.LOWEST)
  public void a(PlayerDeathEvent paramPlayerDeathEvent)
  {
    if (((paramPlayerDeathEvent.getEntity() instanceof Player)) && (jdField_e_of_type_JavaUtilMap.containsKey(paramPlayerDeathEvent.getEntity())))
    {
      Player localPlayer = paramPlayerDeathEvent.getEntity();
      Entity localEntity = (Entity)jdField_f_of_type_JavaUtilMap.get(localPlayer);
      jdField_e_of_type_JavaUtilMap.remove(localPlayer);
      localEntity.remove();
      jdField_f_of_type_JavaUtilMap.remove(localPlayer);
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.LOWEST)
  public void a(PlayerMoveEvent paramPlayerMoveEvent)
  {
    if (jdField_e_of_type_JavaUtilMap.containsKey(paramPlayerMoveEvent.getPlayer()))
    {
      Player localPlayer = paramPlayerMoveEvent.getPlayer();
      if ((localPlayer.getLocation() != jdField_e_of_type_JavaUtilMap.get(localPlayer)) && (!localPlayer.isInsideVehicle()))
      {
        Entity localEntity = (Entity)jdField_f_of_type_JavaUtilMap.get(localPlayer);
        jdField_e_of_type_JavaUtilMap.remove(localPlayer);
        localEntity.remove();
        jdField_f_of_type_JavaUtilMap.remove(localPlayer);
        return;
      }
    }
  }
  
  @EventHandler(priority=EventPriority.LOWEST)
  public void a(PlayerCommandPreprocessEvent paramPlayerCommandPreprocessEvent)
  {
    if (((paramPlayerCommandPreprocessEvent.getMessage().contains("/home")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/tpa")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/tpaccept")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/tpahere")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/spawn")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/warp")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/team hq")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/team rally")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/t hq")) || (paramPlayerCommandPreprocessEvent.getMessage().contains("/t rally"))) && (jdField_e_of_type_JavaUtilMap.containsKey(paramPlayerCommandPreprocessEvent.getPlayer())))
    {
      jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayerCommandPreprocessEvent.getPlayer(), jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-use-while-sit"));
      paramPlayerCommandPreprocessEvent.setCancelled(true);
    }
  }
  
  public void a(Player paramPlayer, Location paramLocation)
  {
    jdField_e_of_type_JavaUtilMap.put(paramPlayer, paramPlayer.getLocation());
    ArmorStand localArmorStand = (ArmorStand)paramLocation.getWorld().spawn(paramLocation.add(0.0D, -1.3D, 0.0D), ArmorStand.class);
    localArmorStand.setBasePlate(false);
    localArmorStand.setVisible(false);
    localArmorStand.setGravity(false);
    localArmorStand.setBodyPose(new EulerAngle(0.0D, 30.0D, 0.0D));
    localArmorStand.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 99999999, 2, false, false));
    jdField_f_of_type_JavaUtilMap.put(paramPlayer, localArmorStand);
    jdField_g_of_type_JavaUtilMap.put(paramPlayer, localArmorStand.getLocation());
    localArmorStand.setPassenger(paramPlayer);
  }
  
  public void b(Player paramPlayer, Location paramLocation)
  {
    jdField_e_of_type_JavaUtilMap.put(paramPlayer, paramPlayer.getLocation());
    ArmorStand localArmorStand = (ArmorStand)paramLocation.getWorld().spawn(paramLocation.add(0.0D, -1.7D, 0.0D), ArmorStand.class);
    localArmorStand.setBasePlate(false);
    localArmorStand.setVisible(false);
    localArmorStand.setGravity(false);
    localArmorStand.setBodyPose(new EulerAngle(0.0D, 30.0D, 0.0D));
    localArmorStand.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 99999999, 2, false, false));
    jdField_f_of_type_JavaUtilMap.put(paramPlayer, localArmorStand);
    jdField_g_of_type_JavaUtilMap.put(paramPlayer, localArmorStand.getLocation());
    localArmorStand.setPassenger(paramPlayer);
  }
  
  @EventHandler
  public void a(PlayerToggleSneakEvent paramPlayerToggleSneakEvent)
  {
    Player localPlayer = paramPlayerToggleSneakEvent.getPlayer();
    if (jdField_g_of_type_JavaUtilHashSet.contains(localPlayer.getName())) {
      jdField_g_of_type_JavaUtilHashSet.remove(localPlayer.getName());
    } else {
      jdField_g_of_type_JavaUtilHashSet.add(localPlayer.getName());
    }
  }
  
  @EventHandler
  public void a(SignChangeEvent paramSignChangeEvent)
  {
    Player localPlayer = paramSignChangeEvent.getPlayer();
    if ((paramSignChangeEvent.getLine(0).equalsIgnoreCase("[NewItems]")) && (paramSignChangeEvent.getLine(1).equalsIgnoreCase("repair"))) {
      if (localPlayer.hasPermission("ni.admin.nirepairsign"))
      {
        jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("sign-placed"));
      }
      else
      {
        paramSignChangeEvent.setCancelled(true);
        jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("no-permission"));
      }
    }
  }
  
  @EventHandler
  public void w(PlayerInteractEvent paramPlayerInteractEvent)
  {
    if (paramPlayerInteractEvent.getHand() == EquipmentSlot.OFF_HAND) {
      return;
    }
    if ((paramPlayerInteractEvent.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && ((paramPlayerInteractEvent.getClickedBlock().getType() == Material.SIGN_POST) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.WALL_SIGN) || (paramPlayerInteractEvent.getClickedBlock().getType() == Material.SIGN)))
    {
      Player localPlayer = paramPlayerInteractEvent.getPlayer();
      try
      {
        ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
        BlockState localBlockState = paramPlayerInteractEvent.getClickedBlock().getState();
        if ((localBlockState instanceof Sign))
        {
          Sign localSign = (Sign)localBlockState;
          if ((ChatColor.stripColor(localSign.getLine(0)).equalsIgnoreCase("[Newitems]")) && (ChatColor.stripColor(localSign.getLine(1)).equalsIgnoreCase("repair"))) {
            if (((jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) && (a(localPlayer, "item", jdField_c_of_type_ComEvill4merNewItemsGA))) || ((a(localPlayer, "weapon", d)) && (jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack))) || ((a(localPlayer, "bow", jdField_e_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack))) || ((a(localPlayer, "pickaxe", jdField_f_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.f(localItemStack))) || ((a(localPlayer, "helmet", jdField_h_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack))) || ((a(localPlayer, "chestplate", jdField_i_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack))) || ((a(localPlayer, "legging", jdField_j_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack))) || ((a(localPlayer, "boot", jdField_k_of_type_ComEvill4merNewItemsGA)) && (jdField_a_of_type_ComEvill4merNewItemsI.b(localItemStack))))
            {
              if (jdField_i_of_type_Boolean)
              {
                RegisteredServiceProvider localRegisteredServiceProvider = Bukkit.getServicesManager().getRegistration(Economy.class);
                if (localRegisteredServiceProvider != null)
                {
                  Economy localEconomy = (Economy)localRegisteredServiceProvider.getProvider();
                  float f1 = 300.0F;
                  if (!localSign.getLine(2).equals(""))
                  {
                    String str = localSign.getLine(2);
                    if (jdField_a_of_type_ComEvill4merNewItemsFJ.isNumeric(str))
                    {
                      f1 = Integer.parseInt(localSign.getLine(2));
                    }
                    else
                    {
                      localPlayer.sendMessage("[NewItems] " + ChatColor.DARK_RED + "Missing price line. CONTACT ADMINISTRATOR Using default value:" + ChatColor.GREEN + " 300$");
                      f1 = 300.0F;
                    }
                  }
                  else
                  {
                    localPlayer.sendMessage("[NewItems] " + ChatColor.DARK_RED + "Missing price line. CONTACT ADMINISTRATOR Using default value:" + ChatColor.GREEN + " 300$");
                    f1 = 300.0F;
                  }
                  if (localEconomy.getBalance(localPlayer) >= f1)
                  {
                    if (jdField_a_of_type_ComEvill4merNewItemsI.c(localItemStack)) {
                      a(localPlayer, "item", jdField_c_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.d(localItemStack)) {
                      a(localPlayer, "weapon", d, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack)) {
                      a(localPlayer, "bow", jdField_e_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.f(localItemStack)) {
                      a(localPlayer, "pickaxe", jdField_f_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.h(localItemStack)) {
                      a(localPlayer, "helmet", jdField_h_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.i(localItemStack)) {
                      a(localPlayer, "chestplate", jdField_i_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.j(localItemStack)) {
                      a(localPlayer, "legging", jdField_j_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                    if (jdField_a_of_type_ComEvill4merNewItemsI.k(localItemStack)) {
                      a(localPlayer, "boot", jdField_k_of_type_ComEvill4merNewItemsGA, localEconomy, f1);
                    }
                  }
                  else
                  {
                    jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("insufficient-money") + f1 + "$");
                  }
                }
              }
              else
              {
                localPlayer.sendMessage("[NewItems] " + ChatColor.DARK_RED + "Error: MISSING plugin 'Vault'! Contact an administrator!");
              }
            }
            else {
              jdField_a_of_type_ComEvill4merNewItemsFJ.a(localPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-repair"));
            }
          }
        }
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  private boolean a(Player paramPlayer, String paramString, com.evill4mer.NewItems.g.a paramA)
  {
    try
    {
      if (!com.evill4mer.NewItems.f.m.c(Z.jdField_b_of_type_JavaLangString)) {
        jdField_a_of_type_ComEvill4merZZ.z();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      jdField_a_of_type_ComEvill4merZZ.z();
    }
    if (!paramA.getConfig().getBoolean(paramString + jdField_a_of_type_ComEvill4merNewItemsI.a(paramPlayer.getInventory().getItemInMainHand()) + ".canBeRepaired"))
    {
      jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("cant-repair"));
      return false;
    }
    if (jdField_a_of_type_ComEvill4merNewItemsFI.a(paramPlayer, paramPlayer.getInventory().getItemInMainHand().getItemMeta(), paramPlayer.getInventory().getItemInMainHand()) >= paramA.getConfig().getDouble(paramString + jdField_a_of_type_ComEvill4merNewItemsI.a(paramPlayer.getInventory().getItemInMainHand()) + ".durability")) {
      jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("noneed-repair"));
    } else {
      return true;
    }
    return false;
  }
  
  private void a(Player paramPlayer, String paramString, com.evill4mer.NewItems.g.a paramA, Economy paramEconomy, double paramDouble)
  {
    paramEconomy.withdrawPlayer(paramPlayer, paramDouble);
    jdField_a_of_type_ComEvill4merNewItemsFI.a(paramPlayer, paramA.getConfig().getInt(paramString + jdField_a_of_type_ComEvill4merNewItemsI.a(paramPlayer.getInventory().getItemInMainHand()) + ".durability"));
    jdField_a_of_type_ComEvill4merNewItemsFJ.a(paramPlayer, jdField_a_of_type_ComEvill4merNewItemsGA.l("repaired") + paramDouble);
  }
  
  @EventHandler
  public void c(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
  {
    if ((paramEntityDamageByEntityEvent.getDamager() instanceof Player))
    {
      Player localPlayer = (Player)paramEntityDamageByEntityEvent.getDamager();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      localItemStack.hasItemMeta();
    }
  }
  
  public static void a(Player paramPlayer, Map paramMap)
  {
    if (paramMap.containsKey(paramPlayer.getName()))
    {
      int i1 = ((Integer)paramMap.get(paramPlayer.getName())).intValue();
      Bukkit.getServer().getScheduler().cancelTask(i1);
      paramMap.remove(paramPlayer.getName());
    }
  }
  
  public void b(Player paramPlayer)
  {
    paramPlayer.getWorld().playSound(paramPlayer.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 1.0F, 1.0F);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMOKE, 3);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 3);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 1);
    paramPlayer.getWorld().playEffect(paramPlayer.getLocation(), Effect.SMALL_SMOKE, 2);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 3);
    paramPlayer.getWorld().playEffect(paramPlayer.getEyeLocation(), Effect.SMALL_SMOKE, 3);
  }
  
  @EventHandler
  void b(PlayerDeathEvent paramPlayerDeathEvent)
  {
    if (jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getBoolean("deadbody-show"))
    {
      Player localPlayer1 = paramPlayerDeathEvent.getEntity().getPlayer();
      Location localLocation = localPlayer1.getLocation().add(1.0D, 0.10000000149011612D, 0.0D);
      localLocation.setPitch(0.0F);
      com.evill4mer.NewItems.d.a localA = new com.evill4mer.NewItems.d.a(localPlayer1.getName(), localLocation, localPlayer1.getName(), Bukkit.getPlayer(localPlayer1.getName()));
      localA.l();
      jdField_h_of_type_JavaUtilMap.put(localA, Integer.valueOf(0));
      Player localPlayer2 = paramPlayerDeathEvent.getEntity();
      Bukkit.getScheduler().scheduleSyncDelayedTask(this, new r(this, localPlayer2), 1L);
    }
  }
  
  @EventHandler
  public void a(PlayerRespawnEvent paramPlayerRespawnEvent)
  {
    if (jdField_b_of_type_OrgBukkitConfigurationFileFileConfiguration.getBoolean("deadbody-show")) {
      paramPlayerRespawnEvent.getPlayer().setCanPickupItems(true);
    }
  }
  
  @EventHandler
  public void a(BlockPistonExtendEvent paramBlockPistonExtendEvent)
  {
    for (Block localBlock : (Block[])paramBlockPistonExtendEvent.getBlocks().toArray(new Block[0]))
    {
      Material localMaterial = localBlock.getType();
      if (localMaterial.equals(Material.DOUBLE_STEP))
      {
        paramBlockPistonExtendEvent.setCancelled(true);
        return;
      }
    }
  }
  
  @EventHandler(ignoreCancelled=true, priority=EventPriority.LOWEST)
  public void g(BlockBreakEvent paramBlockBreakEvent)
  {
    if (paramBlockBreakEvent.isCancelled()) {
      return;
    }
    if ((!jdField_k_of_type_JavaUtilHashSet.contains(paramBlockBreakEvent.getPlayer())) && ((paramBlockBreakEvent.getPlayer() instanceof Player)) && (!paramBlockBreakEvent.isCancelled()))
    {
      Player localPlayer = paramBlockBreakEvent.getPlayer();
      ItemStack localItemStack = localPlayer.getInventory().getItemInMainHand();
      if ((jdField_a_of_type_ComEvill4merNewItemsI.f(localItemStack)) && (jdField_a_of_type_ComEvill4merNewItemsI.e(localItemStack).contains("hammer")))
      {
        jdField_k_of_type_JavaUtilHashSet.add(paramBlockBreakEvent.getPlayer());
        jdField_a_of_type_ComEvill4merNewItemsFG.a(localPlayer, paramBlockBreakEvent);
      }
    }
  }
  
  public void j()
  {
    Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new s(this), 0L, 5L);
  }
  
  public void k()
  {
    String str1 = new t(this).toString();
    String str2 = new u(this).toString();
    String str3 = new v(this).toString();
    String str4 = new w(this).toString();
    String str5 = new x(this).toString();
    String str6 = new y(this).toString();
    String str7 = new A(this).toString();
    try
    {
      Class localClass1 = Class.forName(str1);
      Class localClass2 = Class.forName(str2);
      Class localClass3 = Class.forName(str3);
      Class localClass4 = Class.forName(str4);
      Method localMethod1 = localClass1.getDeclaredMethod(str5, new Class[0]);
      Method localMethod2 = localClass2.getDeclaredMethod(str6, new Class[0]);
      Method localMethod3 = localClass3.getDeclaredMethod(str7, new Class[] { localClass4 });
      Object localObject1 = ꠣꤣ꤅(localMethod1, str1, new Object[0]);
      Object localObject2 = ꠣꤣ꤅(localMethod2, localObject1, new Object[0]);
      ꠣꤣ꤅(localMethod3, localObject2, new Object[] { this });
    }
    catch (Exception localException) {}
  }
  
  private void a(int paramInt, String paramString)
  {
    if (paramInt > 0)
    {
      Bukkit.getConsoleSender().sendMessage(paramString);
      a(paramInt - 1, paramString);
    }
  }
}
