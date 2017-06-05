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
		for (int i = 0; i < 10; i++) {
			int adresa1=r.nextInt(karti.size());
			int adresa2=r.nextInt(karti.size());
			
			//swap
			Karta pomosna = karti.get(adresa1);
			karti.set(adresa1, karti.get(adresa2));
			karti.set(adresa2, pomosna);
			
		}
	}
}
