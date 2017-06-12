package com.karti;

import java.util.ArrayList;
import java.util.Random;

public class Igrac {

	String ime;
	int poeni;
	ArrayList<Karta> zatvoreniKartiNaIgracot;
	ArrayList<Karta> otvoreniKartiNaIgracot;

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

	public void dedeliKartaNaIgracot(Karta k) {
		zatvoreniKartiNaIgracot.add(k);
	}

	//ova samo ke ja procita nema da ja izbrisi od spilot
	public Karta iscitajJaNajgornataOtvorenaKarta() {
		if (otvoreniKartiNaIgracot.size() < 1) {
			return null;// todo
		}
		return otvoreniKartiNaIgracot.get(otvoreniKartiNaIgracot.size() - 1);
	}

	//ova ke ja izbrisi od spilot
	public Karta izbrisiJaNajgornataOtvorenaKarta() {
		if (otvoreniKartiNaIgracot.size() < 1) {
			return null;// todo
		}
		Karta k = otvoreniKartiNaIgracot.get(otvoreniKartiNaIgracot.size() - 1);
		otvoreniKartiNaIgracot.remove(otvoreniKartiNaIgracot.size() - 1);
		return k;
	}
	
	// ova e koga sakame da ja frlime najgornata otvorena karta na igracot
	public Karta firliPrvataOtvorenaKarta() {
		if (zatvoreniKartiNaIgracot.size() == 0) {
			return null;// ili ke frlime greska
		}
		Karta najgornata = zatvoreniKartiNaIgracot.get(zatvoreniKartiNaIgracot.size() - 1);
		zatvoreniKartiNaIgracot.remove(zatvoreniKartiNaIgracot.size() - 1);
		return najgornata;
	}

	public Karta firliPrvataZatvorenaKarta() {
		if (zatvoreniKartiNaIgracot.size() == 0) {
			return null;// ili ke frlime greska
		}
		Karta najgornata = zatvoreniKartiNaIgracot.get(0);
		zatvoreniKartiNaIgracot.remove(0);
		return najgornata;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public String toString() {
		String s = ime + " ( ";
		for (int i = 0; i < zatvoreniKartiNaIgracot.size(); i++) {
			s = s + " " + zatvoreniKartiNaIgracot.get(i) + ", ";
		}
		s = s + " )";
		return s;
	}

}
