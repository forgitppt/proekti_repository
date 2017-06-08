package com.karti;

import java.util.ArrayList;

import com.karti.zaoop.Pivo;
import com.karti.zaoop.Toceno;

public class Main {

	public static void main(String[] args) {

		// Karta karta = new Karta("5", "karo");
		// Karta karta2 = new Karta("10", "detelina");

		// karta.boja = "rozeva";
		// karta.setBoja(Karta.SRCE);

		// karta.setBrojka(Karta.JACK);

		// System.out.println(karta);

		// print("aaaaa");

		// //Joker j = new Joker();
		// Karta k = new Karta("5",Karta.SRCE);
		// Joker j = new Joker("5",Karta.SRCE);
		// j.setBoja(Karta.TREF);
		// j.setBrojka(Karta.KING);
		// // System.out.println(j.toString());
		// System.out.println(k);
		// System.out.println(j);

		// Pivo p = new Pivo("Skopsko", "temno", 0.5);
		//
		// Toceno toceno = new Toceno("Dab");
		//
		// System.out.println(toceno.ime);
		// System.out.println(toceno.golemina);
		// System.out.println(toceno.boja);
		// System.out.println(toceno.bakterijaA);

		// double = int
		// tip Pivo = tip Toceno
		// Pivo moeOmileno = toceno;
		// moeOmileno.b
		// toceno.bakterijaA
		//
		//
		// Karta k = new Karta("5", Karta.KARO);
		// Karta k2 = new Karta("6", Karta.PIK);
		// Karta k3 = new Karta("7", Karta.PIK);
		//
		// Spil spil = new Spil();
		// spil.dodadiKarta(k);
		// spil.dodadiKarta(k2);
		// spil.dodadiKarta(k3);
		//
		// //pred mesanje
		// System.out.println(spil);
		//
		// spil.izmesaj();
		//
		// //poslem mesanje
		// System.out.println(spil);

		// Spil spil = Spil.napraviSpilOd54Karti();
		// System.out.println(spil);
		// System.out.println("43 pred " +spil.karti.get(43));

		// spil.izmesaj();
		// System.out.println("izmesan" +spil);
		// System.out.println("43 po " +spil.karti.get(43));

		// Igrac i = new Igrac("Petko");
		// Igrac i2 = new Igrac();
		// System.out.println(i2);

		// ---------------day 7

//		Spil spil = Spil.napraviPrivremenMalSpilZaTestiranje();
//		spil.izmesaj();
//		System.out.println(spil);
//
//		Igrac igrac1 = new Igrac("Mandarina");
//		Igrac igrac2 = new Igrac("Dinja");
//		Igrac igrac3 = new Igrac("Banana");
//		Igrac igrac4 = new Igrac("Kivi");
//
//		ArrayList<Igrac> listaNaIgraci = new ArrayList<>();
//		listaNaIgraci.add(igrac1);
//		listaNaIgraci.add(igrac2);
//		listaNaIgraci.add(igrac3);
//		listaNaIgraci.add(igrac4);
//
//		boolean daliIgrataEZavrsena = false;
//		// narednata linija e "vrti se dodeka igrata ne e zavrsena"
//		while (!daliIgrataEZavrsena) {
//
//			for (int i = 0; i < listaNaIgraci.size(); i++) {
//				Karta izvlecenaKarta = spil.izvleciKarta();
//				if (izvlecenaKarta != null) {
//					listaNaIgraci.get(i).kartiNaIgracot.add(izvlecenaKarta);
//				} else {
//					// privremeno resenie
//					daliIgrataEZavrsena = true;
//					break;
//				}
//			}
//		}
//
//		//
//		System.out.println(spil);
//		for (int i = 0; i < listaNaIgraci.size(); i++) {
//			System.out.println(listaNaIgraci.get(i));
//		}
//		
//		Igrac igrac5 = new Igrac("Ananas");
//		igrac5.kartiNaIgracot.add(new Karta("2", Karta.SRCE));
//		igrac5.kartiNaIgracot.add(new Karta("3", Karta.SRCE));
//		igrac5.kartiNaIgracot.add(new Karta("4", Karta.SRCE));
//		System.out.println(igrac5);
//		System.out.println(igrac5.firliPrvataZatvorenaKarta());
//		System.out.println(igrac5);
//		System.out.println(igrac5.firliPrvataZatvorenaKarta());
//		System.out.println(igrac5);
//		
//		//
//		System.out.println();
//		
//		NaredenSpilKartiVoSredina naredenoKupceVoSredina = new NaredenSpilKartiVoSredina();
//		naredenoKupceVoSredina.dodadiKartaVoSredina(new Karta(Karta.ACE, Karta.SRCE));
//		boolean dali = naredenoKupceVoSredina.daliMozeDaSeDodadeKartataVoSredina(new Karta("2", Karta.TREF));
//		System.out.println("dali moze da se dodade: "+dali);
//		System.out.println(naredenoKupceVoSredina);
		
		
		Karta k = new Karta("7",Karta.PIK);
		System.out.println(k);
	}

	public static void print(String s) {
		System.out.println(s);
	}
}
