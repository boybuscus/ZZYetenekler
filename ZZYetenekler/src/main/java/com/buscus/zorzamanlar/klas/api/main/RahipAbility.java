package com.buscus.zorzamanlar.klas.api.main;

import org.bukkit.entity.Player;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.ElementalAbility;

public abstract class RahipAbility extends ElementalAbility{
	public RahipAbility(Player player) {
		super(player);
	}
	public Element getElement() {
		return MainKlaslar.RAHIP;
	}
}
