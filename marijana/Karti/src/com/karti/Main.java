package com.karti;

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

//		//Joker j = new Joker();
//		Karta k = new Karta("5",Karta.SRCE);
//		Joker j = new Joker("5",Karta.SRCE);
//		j.setBoja(Karta.TREF);
//		j.setBrojka(Karta.KING);
//		// System.out.println(j.toString());
//		System.out.println(k);
//		System.out.println(j);

		
		
		
		
		
//		Pivo p = new Pivo("Skopsko", "temno", 0.5);
//		
//		Toceno toceno = new Toceno("Dab");
//		
//		System.out.println(toceno.ime);
//		System.out.println(toceno.golemina);
//		System.out.println(toceno.boja);
//		System.out.println(toceno.bakterijaA);

		//double = int
		//tip Pivo = tip Toceno
		//Pivo moeOmileno = toceno;
		//moeOmileno.b
		//toceno.bakterijaA
//		
//		
//		Karta k = new Karta("5", Karta.KARO);
//		Karta k2 = new Karta("6", Karta.PIK);
//		Karta k3 = new Karta("7", Karta.PIK);
//		
//		Spil spil = new Spil();
//		spil.dodadiKarta(k);
//		spil.dodadiKarta(k2);
//		spil.dodadiKarta(k3);
//		
//		//pred mesanje
//		System.out.println(spil);
//		
//		spil.izmesaj();
//		
//		//poslem mesanje
//		System.out.println(spil);


		Spil spil = new Spil();
		
		//sozdadi spil od 54 karti
		for (int i = 0; i < Karta.SITE_BOI.length; i++) {
			String momentalnaBoja = Karta.SITE_BOI[i];
			for (int j = 0; j < Karta.SITE_BROJKI.length; j++) {
				String momentalnaBrojka = Karta.SITE_BROJKI[j];
				
				Karta k = new Karta(momentalnaBrojka, momentalnaBoja);
				spil.dodadiKarta(k);
			}
		}
		
		Joker j1 = new Joker();
		Joker j2 = new Joker();
		
		spil.dodadiKarta(j1);
		spil.dodadiKarta(j2);
		
		System.out.println(spil);
		//System.out.println("43 pred " +spil.karti.get(43));
		
		spil.izmesaj();
		System.out.println("izmesan" +spil);
		//System.out.println("43 po " +spil.karti.get(43));
		
//		Igrac i = new Igrac("Petko");
//		Igrac i2 = new Igrac();
//		System.out.println(i2);
	}

	public static void print(String s) {
		System.out.println(s);
	}
}
