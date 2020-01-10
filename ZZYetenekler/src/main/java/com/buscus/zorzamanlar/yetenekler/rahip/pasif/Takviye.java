package com.buscus.zorzamanlar.yetenekler.rahip.pasif;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.buscus.zorzamanlar.klas.api.main.RahipAbility;
import com.buscus.zorzamanlar.utility.DescriptionUtility;
import com.buscus.zorzamanlar.utility.StringUtility;
import com.projectkorra.projectkorra.ability.AddonAbility;
import com.projectkorra.projectkorra.ability.PassiveAbility;

public class Takviye extends RahipAbility implements AddonAbility,PassiveAbility {

	public Takviye(Player player) {
		super(player);
		
	}

	public long getCooldown() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Takviye";
	}
	public String getDescription() {
		return DescriptionUtility.takviye();
	}

	public boolean isExplosiveAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isHarmlessAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isIgniteAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSneakAbility() {
		// TODO Auto-generated method stub
		return false;
	}

	public void progress() {
		// TODO Auto-generated method stub
		
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return StringUtility.bobucus();
	}

	public String getVersion() {
		// TODO Auto-generated method stub
		return StringUtility.versiyonIs();
	}

	public void load() {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public boolean isInstantiable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isProgressable() {
		// TODO Auto-generated method stub
		return false;
	}

}
