package com.buscus.zorzamanlar;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.buscus.zorzamanlar.yetenekler.rahip.pasif.Takviye;
import com.projectkorra.projectkorra.BendingPlayer;

public class ZZAbilityListener implements Listener {
	
	@EventHandler
	public void hasarAlmaVerme(EntityDamageByEntityEvent e) {
		Entity hasarAlan = e.getEntity();
		Entity hasarVeren = e.getDamager();
		if (hasarVeren instanceof Player) {
			if (BendingPlayer.getBendingPlayer((Player)hasarVeren).hasElement(MainKlaslar.RAHIP)) {
				if (!((LivingEntity)hasarVeren).hasPotionEffect(PotionEffectType.SPEED)) {
					((LivingEntity) hasarVeren).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24*4, 0));
				} else {
					
				}
				for (PotionEffect effect: ((LivingEntity) hasarVeren).getActivePotionEffects()) {
					if (effect.getType() != PotionEffectType.SPEED || effect == null) {
						((LivingEntity) hasarVeren).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24*4, 0));
					}
					if (effect.getType() == PotionEffectType.SPEED) {
						 if (effect.getAmplifier() == 2) {
							 ((LivingEntity) hasarVeren).removePotionEffect(PotionEffectType.SPEED);
								((LivingEntity) hasarVeren).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24*4, 2));
							}
						 if (effect.getAmplifier() == 1) {
							 ((LivingEntity) hasarVeren).removePotionEffect(PotionEffectType.SPEED);
								((LivingEntity) hasarVeren).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24*4, 2));
							}
						if (effect.getAmplifier() == 0) {
							 ((LivingEntity) hasarVeren).removePotionEffect(PotionEffectType.SPEED);
						((LivingEntity) hasarVeren).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 24*4, 1));
						} 
					}
				}
			}
		}
	}

}
