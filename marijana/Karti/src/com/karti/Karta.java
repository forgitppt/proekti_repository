package com.karti;

//public class Karta extends Object {
public class Karta {

	// vo ovaa klasa this pokazuva na Karta
	// super pokazuva na Object

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

	public static String[] SITE_BOI = new String[] { KARO, SRCE, TREF, PIK };
	public static String[] SITE_BROJKI = new String[] { ACE, "2", "3", "4", "5", "6", "7", "8", "9", "10", JACK, QUEEN,
			KING };

	private String brojka;
	private String boja;

	public Karta() {

	}

	public Karta(String brojka, String boja) {
		setBoja(boja);
		setBrojka(brojka);
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		if (boja.equals(KARO) || boja.equals(SRCE) || boja.equals(PIK) || boja.equals(TREF)) {
			this.boja = boja;
			return;
		}
		throw new RuntimeException("Nevalidna vrednost za boja: " + boja);
	}

	public String getBrojka(){
		return brojka;
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
		// proverka za bukvite
		if (brojka.equals(ACE) || brojka.equals(KING) || brojka.equals(QUEEN) || brojka.equals(JACK)) {
			this.brojka = brojka;
			return;
		}

		throw new RuntimeException("Nevalidna vrednost za brojka: " + brojka);
	}

	@Override
	public String toString() {
		return brojka + " : " + boja;
	}
}
