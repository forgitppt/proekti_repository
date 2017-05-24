package com.karti;

public class Karta {

	// validni vrednosti za boja
	public static final String KARO = "karo";
	public static final String SRCE = "srce";
	public static final String TREF = "tref";
	public static final String PIK = "pik";

	// validni broevi
	// A 2 - 10 J Q K
	public static final String ACE = "A";
	public static final String JACK = "J";
	public static final String QUEEN = "Q";
	public static final String KING = "K";

	private String brojka;
	private String boja;

	public Karta(String brojka, String boja) {
		setBoja(boja);
		setBrojka(brojka);
	}

	public void setBoja(String boja) {
		if (boja.equals(KARO) || boja.equals(SRCE) || boja.equals(PIK) || boja.equals(TREF)) {
			this.boja = boja;
			return;
		}
		
		throw new RuntimeException("Nevalidna vrednost za boja: " +boja);
	}

	public void setBrojka(String brojka) {
		// proverka od 2 - 10
		int broj;
		try {
			broj = Integer.parseInt(brojka);
			if (broj <= 10 && broj >= 2) {
				// this.brojka = broj + "";
				this.brojka = brojka;
				return;
			}
		} catch (Exception e) {
		}
		//proverka za bukvite
		if (brojka.equals(ACE) || brojka.equals(KING) || brojka.equals(QUEEN) || brojka.equals(JACK)) {
			this.brojka = brojka;
			return;
		}
		
		throw new RuntimeException("Nevalidna vrednost za brojka: " +brojka);
	}

	@Override
	public String toString() {
		return brojka + " " + boja;
	}
}
