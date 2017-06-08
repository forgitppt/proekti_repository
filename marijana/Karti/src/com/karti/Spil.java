package com.karti;

import java.util.ArrayList;
import java.util.Random;

public class Spil {

	int[] nizaOdBrojki;
	ArrayList<Karta> karti;

	public Spil() {
		karti = new ArrayList<>();
	}

	// dodadi karta vo spilot
	public void dodadiKarta(Karta k) {
		karti.add(k);
	}

	// izbrisi karta od spilot

	@Override
	public String toString() {
		// vrati cela lista od karti vo spilot
		String s = "Spilot e sleden:\n";
		for (int i = 0; i < karti.size(); i++) {
			s = s + "   " + karti.get(i) + "\n";
		}
		return s;
	}

	public void izmesaj() {
		Random r = new Random();
		for (int i = 0; i < karti.size()*10; i++) {
			int adresa1=r.nextInt(karti.size());
			int adresa2=r.nextInt(karti.size());
			
			//swap
			Karta pomosna = karti.get(adresa1);
			karti.set(adresa1, karti.get(adresa2));
			karti.set(adresa2, pomosna);
			
		}
	}
	
	public static Spil napraviSpilOd54Karti(){
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
		
		return spil;
	}
	
	public static Spil napraviPrivremenMalSpilZaTestiranje(){
		Spil spil = new Spil();

			String momentalnaBoja = Karta.SRCE;
			for (int j = 0; j < 7; j++) {
				String momentalnaBrojka = Karta.SITE_BROJKI[j];
				Karta k = new Karta(momentalnaBrojka, momentalnaBoja);
				spil.dodadiKarta(k);
			}
		
		return spil;
	}
}
