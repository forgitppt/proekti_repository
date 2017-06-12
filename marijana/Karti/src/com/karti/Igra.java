package com.karti;

import java.util.Date;
import java.util.ArrayList;

public class Igra {

	Spil spil;
	NaredenSpilKartiVoSredina redenSpil;
	ArrayList<Igrac> igraciVoIgrata;

	public Igra(Spil spil, NaredenSpilKartiVoSredina redenSpil, ArrayList<Igrac> igraciVoIgrata) {
		super();
		this.spil = spil;
		this.redenSpil = redenSpil;
		this.igraciVoIgrata = igraciVoIgrata;
	}

	public void zapocnijaIgrata() {
		Date d = new Date();
		System.out.println("Igrata zapocnuva vo " + d.toString());

		// najprvin treba da se odluci koj igrac ke bide prv
		// dodeka trae igrata igracite treba da se vrtat vo krug
		int indeksNaIgracotKojENaRed = -1;// todo napravi prv da e nekoj random
											// igrac

		// igrata trae se dodeka ne zavrsi :)
		// odlukata dali igrata e zavrsena ja pravime vo posebna metoda
		while (daliEKrajNaIgrata()) {
			indeksNaIgracotKojENaRed++;
			if (indeksNaIgracotKojENaRed >= igraciVoIgrata.size()) {
				indeksNaIgracotKojENaRed = 0;
			}
			Igrac igracNaPoteg = igraciVoIgrata.get(indeksNaIgracotKojENaRed);
		
			//proveri dali ima otvorena karta
			if(igracNaPoteg.iscitajJaNajgornataOtvorenaKarta() != null){
				//ima karta
				
				//napravi proverka dali mozes negde da ja stavis
				//najprvin proveri dali moze da se stavi vo sredina
				Karta najgornataOtvorenaKarta = igracNaPoteg.iscitajJaNajgornataOtvorenaKarta();
				if(redenSpil.daliMozeDaSeDodadeKartataVoSredina(najgornataOtvorenaKarta)){
					//dokolku moze dodadija 
					redenSpil.dodadiKartaVoSredina(najgornataOtvorenaKarta);
					//izbrisija istata od kaj igracot
					igracNaPoteg.izbrisiJaNajgornataOtvorenaKarta();
					
					//ovoj igrac napravi nekakov poteg pa sega veke ne e na red
					//na red e sledniot igrac
					continue;
				}else{
					//igracot ima otvorena karta vo sredina no nemoze da ja stavi na sredina
					//primer ima 4 PIK a na sredina e otvorena 10 SRCE
					
					//odkako svativme deka nemozime da dodademe vo sredina
					//proveri dali mozeme da dodelime na drugite igraci
					
					for (int i = 0; i < igraciVoIgrata.size(); i++) {
						
					}
				}
			}else{
				//igracot nema otvoreni karti
			}
		}

		System.out.println("Igrata zavrsi vo " + (new Date()).toString());
	}

	public boolean daliEKrajNaIgrata() {
		// proveri dali site karti se naredeni
		if (redenSpil.daliENareden()) {
			return true;
		}
		return true;
	}
}
