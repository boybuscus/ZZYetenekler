package com.buscus.zorzamanlar;


import org.bukkit.plugin.java.JavaPlugin;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.buscus.zorzamanlar.klas.subklas.SubKlaslar;
import com.projectkorra.projectkorra.ability.CoreAbility;

public class Main extends JavaPlugin{
	public static Main plugin;
		
	
	public void onEnable() {
		plugin = this;
		new MainKlaslar();
		new SubKlaslar();
		
		
		CoreAbility.registerPluginAbilities(plugin, "com.buscus.zorzamanlar.yetenekler");
		
		plugin.getLogger().info("ZorZamanlar yetenekleri etkin!");
		plugin.getServer().getPluginManager().registerEvents(new ZZAbilityListener(), this);
	}
	
	
	 
	  public static Main getInstance()
	  {
	    return plugin;
	  }
	

}