package com.karti;

import java.util.ArrayList;
import java.util.Random;

public class Igrac {

	String ime;
	int poeni;
	ArrayList<Karta> zatvoreniKartiNaIgracot;
	ArrayList<Karta> otvoreniKartiNaIgracot;

	public boolean daliESeusteVoIgra = true;

	public Igrac() {
		String[] imeNaIgraci = new String[] { "John", "Goko", "Ace", "Mitko", "Jagoda" };
		Random r = new Random();
		ime = imeNaIgraci[r.nextInt(imeNaIgraci.length)];
		zatvoreniKartiNaIgracot = new ArrayList<>();
		otvoreniKartiNaIgracot = new ArrayList<>();
	}

	public Igrac(String ime) {
		this.ime = ime;
		zatvoreniKartiNaIgracot = new ArrayList<>();
		otvoreniKartiNaIgracot = new ArrayList<>();
	}

	// dodeli karta na igracot vo zatvorenite karti
	// se misli koga od glavniot spil se dodeluva karta na igracot
	public void dodeliKartaNaIgracotVoZatvorenite(Karta k) {
		zatvoreniKartiNaIgracot.add(k);
	}

	public void dodeliKartaNaIgracotVoOtverenite(Karta k) {
		otvoreniKartiNaIgracot.add(k);
	}

	// ova samo ke ja procita nema da ja izbrisi od spilot
	public Karta iscitajJaNajgornataOtvorenaKarta() {
		if (otvoreniKartiNaIgracot.size() < 1) {
			return null;// todo
		}
		return otvoreniKartiNaIgracot.get(otvoreniKartiNaIgracot.size() - 1);
	}

	// ova ke ja izbrisi od spilot
	public Karta izbrisiJaNajgornataOtvorenaKarta() {
		if (otvoreniKartiNaIgracot.size() < 1) {
			return null;// todo
		}
		Karta k = otvoreniKartiNaIgracot.get(otvoreniKartiNaIgracot.size() - 1);
		otvoreniKartiNaIgracot.remove(otvoreniKartiNaIgracot.size() - 1);
		return k;
	}

	public Karta iscitajJaNajgornataZatvorenaKarta() {
		if (zatvoreniKartiNaIgracot.size() < 1) {
			return null;// todo
		}
		return zatvoreniKartiNaIgracot.get(zatvoreniKartiNaIgracot.size() - 1);
	}

	public Karta izbrisiJaNajgornataZatvorenaKarta() {
		if (zatvoreniKartiNaIgracot.size() == 0) {
			return null;// ili ke frlime greska
		}
		Karta najgornata = zatvoreniKartiNaIgracot.get(zatvoreniKartiNaIgracot.size() - 1);
		zatvoreniKartiNaIgracot.remove(zatvoreniKartiNaIgracot.size() - 1);
		return najgornata;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public String toString() {
		String s = ime + " ( 	zatvoreni:";
		for (int i = 0; i < zatvoreniKartiNaIgracot.size(); i++) {
			s = s + " " + zatvoreniKartiNaIgracot.get(i) + ", ";
		}
		s = s + "\n		otvoreni:";
		for (int i = 0; i < otvoreniKartiNaIgracot.size(); i++) {
			s = s + " " + otvoreniKartiNaIgracot.get(i) + ", ";
		}
		s = s + " )";
		return s;
	}

	public boolean daliMozeDaSeDodadeKartataNaIgracot(Karta karta) {
		// proverka dali treba da se dozvoli dodavanje nakarta na ovoj igrac
		// ovoj bi bil igracot sto bi ja dobil kartata
		// kartata bi se dodelila najgore vo otvorenite karti

		if (otvoreniKartiNaIgracot.size() == 0) {
			// ako igracot nema otvoreni karti togas nisto nemoze da mu se
			// dodeli
			return false;
		} else {
			// ima nekakva karta tamu
			// zemija poslednata i proveri dali 'karta' od argument moze da e
			// sledna

			Karta najgornataOtvorenaKarta = otvoreniKartiNaIgracot.get(otvoreniKartiNaIgracot.size() - 1);

			if (najgornataOtvorenaKarta.getBrojka().equals(Karta.KING)) {
				if (karta.getBrojka().equals(Karta.ACE)) {
					if (najgornataOtvorenaKarta.getBoja().equals(karta.getBoja())) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				// sto ako e bilo sto osven KING
				if (najgornataOtvorenaKarta.getBoja().equals(karta.getBoja())) {
					// mozebi smeeme da dodademe
					int redosled1 = NaredenSpilKartiVoSredina.zemiRedosled(najgornataOtvorenaKarta.getBrojka());
					int redosled2 = NaredenSpilKartiVoSredina.zemiRedosled(karta.getBrojka());
					if (redosled2 - redosled1 == 1) {
						return true;
					} else {
						return false;
					}
				} else {
					// sigurno nesmeeme
					return false;
				}
			}
		}
	}

	// metoda za dodavanje na karta, ova ke ja dodade najgore
	// t.e ovaa ke bidi kartata sto ke se gleda
	public void dodadiVoOtvoreniKartiNaIgracot(Karta karta) {
		otvoreniKartiNaIgracot.add(karta);
	}

	public void prevrtigiOtvoreniteKartiVoZatvoreni() {
		zatvoreniKartiNaIgracot = new ArrayList<>();
		for (int i = 0; i < otvoreniKartiNaIgracot.size(); i++) {
			zatvoreniKartiNaIgracot.add(otvoreniKartiNaIgracot.get(i));
		}
		otvoreniKartiNaIgracot = new ArrayList<>();
	}

	public boolean daliImaUsteKarti() {
		if (otvoreniKartiNaIgracot.size() > 0 || zatvoreniKartiNaIgracot.size() > 0) {
			return true;
		}
		return false;
	}
}
