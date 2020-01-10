package com.buscus.zorzamanlar.klas.subklas;

import org.bukkit.ChatColor;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.Element.SubElement;

public class SubKlaslar {
	public static final SubElement RAHIP_SAMAN = new SubElement("Þaman", MainKlaslar.RAHIP, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.LIGHT_PURPLE;
		}
		@Override
		public String getPrefix() {
			return ChatColor.LIGHT_PURPLE + "[Þaman]";
		}
	};
	public static final SubElement RAHIP_SIFACI = new SubElement("Þifacý", MainKlaslar.RAHIP, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.GREEN;
		}
		@Override
		public String getPrefix() {
			return ChatColor.GREEN + "[Þifacý]";
		}
	};
	
	public static final SubElement SAVASCI_GLADYATOR = new SubElement("Gladyatör", MainKlaslar.SAVASCI, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_RED;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_RED + "[Gladyatör]";
		}
	};
	public static final SubElement SAVASCI_MUHAFIZ = new SubElement("Muhafýz", MainKlaslar.SAVASCI, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_GREEN;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_GREEN + "[Muhafýz]";
		}
	};
	
	public static final SubElement ANTIK_KARASOVALYE = new SubElement("KaraÞövalye", MainKlaslar.ANTIK, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_PURPLE;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_PURPLE + "[KaraÞövalye]";
		}
	};
	public static final SubElement ANTIK_GRAVITUM = new SubElement("Gravitum", MainKlaslar.ANTIK, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_AQUA;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_AQUA + "[Gravitum]";
		}
	};
}
