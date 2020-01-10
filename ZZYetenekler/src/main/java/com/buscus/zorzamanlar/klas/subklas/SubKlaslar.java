package com.buscus.zorzamanlar.klas.subklas;

import org.bukkit.ChatColor;

import com.buscus.zorzamanlar.klas.MainKlaslar;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.Element.SubElement;

public class SubKlaslar {
	public static final SubElement RAHIP_SAMAN = new SubElement("�aman", MainKlaslar.RAHIP, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.LIGHT_PURPLE;
		}
		@Override
		public String getPrefix() {
			return ChatColor.LIGHT_PURPLE + "[�aman]";
		}
	};
	public static final SubElement RAHIP_SIFACI = new SubElement("�ifac�", MainKlaslar.RAHIP, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.GREEN;
		}
		@Override
		public String getPrefix() {
			return ChatColor.GREEN + "[�ifac�]";
		}
	};
	
	public static final SubElement SAVASCI_GLADYATOR = new SubElement("Gladyat�r", MainKlaslar.SAVASCI, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_RED;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_RED + "[Gladyat�r]";
		}
	};
	public static final SubElement SAVASCI_MUHAFIZ = new SubElement("Muhaf�z", MainKlaslar.SAVASCI, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_GREEN;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_GREEN + "[Muhaf�z]";
		}
	};
	
	public static final SubElement ANTIK_KARASOVALYE = new SubElement("Kara��valye", MainKlaslar.ANTIK, null, ProjectKorra.plugin) {
		@Override
		public ChatColor getColor() {
			return ChatColor.DARK_PURPLE;
		}
		@Override
		public String getPrefix() {
			return ChatColor.DARK_PURPLE + "[Kara��valye]";
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
