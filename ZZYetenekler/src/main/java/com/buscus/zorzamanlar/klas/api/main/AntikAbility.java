package com.buscus.zorzamanlar.klas.api.main;

import org.bukkit.entity.Player;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.ElementalAbility;

public abstract class AntikAbility extends ElementalAbility{
	public AntikAbility(Player player) {
		super(player);
	}
	public Element getElement() {
		return MainKlaslar.ANTIK;
	}
}
