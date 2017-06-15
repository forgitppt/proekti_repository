package com.karti;

import java.util.ArrayList;

import com.karti.zaoop.Pivo;
import com.karti.zaoop.Toceno;

public class Main {

	public static void main(String[] args) {

		//nekoi od rabotite nadolu se 'dadeni' t.e takvi se pravilata na igrata
		//na primer mora da ima 1 spil, i barem 2 igraci
		
		//za da e validna igrata mora da imame 1 spil
		Spil spil = Spil.napraviSpilOd52Karti();
		spil.izmesaj();
		
		//2 igraci
		Igrac igrac1 = new Igrac("Banana");
		Igrac igrac2 = new Igrac("Ananas");
		Igrac igrac3 = new Igrac("Mandarina");
		Igrac igrac4 = new Igrac("Jabolko");
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		igraci.add(igrac1);
		igraci.add(igrac2);
		igraci.add(igrac3);
		igraci.add(igrac4);
		
		//na pocetok naredeniot spil karti vo sredina e prazen
		NaredenSpilKartiVoSredina redenSpil = new NaredenSpilKartiVoSredina();
		
		//napravi objekt igra i zapocnija igrata
		Igra igra = new Igra(spil, redenSpil, igraci);
		igra.zapocnijaIgrata();
		
		
	}


}
