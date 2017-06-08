package com.karti;

import java.util.ArrayList;
import java.util.Random;

public class Igrac {

	String ime;
	int poeni;
	ArrayList<Karta> kartiNaIgracot;

	public Igrac() {
		String[] imeNaIgraci = new String[] { "John", "Goko", "Ace", "Mitko","Jagoda" };
		Random r= new Random();
		ime = imeNaIgraci[r.nextInt(imeNaIgraci.length)];
		kartiNaIgracot = new ArrayList<>();
	}

	public Igrac(String ime) {
		this.ime = ime;
		kartiNaIgracot = new ArrayList<>();
	}
	
	public void podeliKarta(Karta k){
		kartiNaIgracot.add(k);
	}
	
	//ova e koga sakame da ja frlime najgornata otvorena karta na igracot
	public Karta firliPrvataOtvorenaKarta(){
			if(kartiNaIgracot.size() == 0){
				return null;//ili ke frlime greska
			}
			Karta najgornata = kartiNaIgracot.get(kartiNaIgracot.size()-1);
			kartiNaIgracot.remove(kartiNaIgracot.size()-1);
			return najgornata;
	}
	
	public Karta firliPrvataZatvorenaKarta(){
		if(kartiNaIgracot.size() == 0){
			return null;//ili ke frlime greska
		}
		Karta najgornata = kartiNaIgracot.get(0);
		kartiNaIgracot.remove(0);
		return najgornata;
}
	
	public void setPoeni(int poeni){
		this.poeni = poeni;
	}
	
	@Override
	public String toString() {
		String s = ime + " ( ";
		for (int i = 0; i < kartiNaIgracot.size(); i++) {
			s = s + " " + kartiNaIgracot.get(i) + ", ";
		}
		s = s + " )";
		return s;
	}
	

}
