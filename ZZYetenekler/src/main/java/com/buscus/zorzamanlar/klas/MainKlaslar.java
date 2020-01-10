package com.buscus.zorzamanlar.klas;

import org.bukkit.ChatColor;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.Element.SubElement;

public class MainKlaslar {
	public static final Element RAHIP= new Element("Rahip", null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_GREEN;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_GREEN + "[Rahip]";
		}
	};
	
	public static final Element SAVASCI= new Element("Savaþçý", null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.RED;
		}
		@Override
		public String getPrefix() {
			return ChatColor.RED + "[Savaþçý]";
		}
	};
	public static final Element ANTIK = new Element("Antik", null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.LIGHT_PURPLE;
		}
		@Override
		public String getPrefix() {
			return ChatColor.LIGHT_PURPLE + "[Antik]";
		}
	};
}
