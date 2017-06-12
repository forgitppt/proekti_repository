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

		dodeliKartiNaIgracite();
		
		// najprvin treba da se odluci koj igrac ke bide prv
		// dodeka trae igrata igracite treba da se vrtat vo krug
		int indeksNaIgracotKojENaRed = -1;// todo napravi prv da e nekoj random
											// igrac

		// igrata trae se dodeka ne zavrsi :)
		// odlukata dali igrata e zavrsena ja pravime vo posebna metoda
		while (!daliEKrajNaIgrata()) {
			
			System.out.println(spil.kartiteVoSpilot.size());
			System.out.println(igraciVoIgrata.get(0) +"\n");
			System.out.println(igraciVoIgrata.get(1));
			System.out.println(redenSpil);
			
			
			indeksNaIgracotKojENaRed++;
			if (indeksNaIgracotKojENaRed >= igraciVoIgrata.size()) {
				indeksNaIgracotKojENaRed = 0;
			}
			Igrac igracNaPoteg = igraciVoIgrata.get(indeksNaIgracotKojENaRed);
			boolean daliUspeaDaDodeliKartaNekomu = false; // seuste ne sme
															// dodelile nikomu
															// karta

			// proveri dali ima otvorena karta
			if (igracNaPoteg.iscitajJaNajgornataOtvorenaKarta() != null) {
				// ima karta

				// napravi proverka dali mozes negde da ja stavis
				// najprvin proveri dali moze da se stavi vo sredina
				Karta najgornataOtvorenaKarta = igracNaPoteg.iscitajJaNajgornataOtvorenaKarta();
				if (redenSpil.daliMozeDaSeDodadeKartataVoSredina(najgornataOtvorenaKarta)) {
					// dokolku moze dodadija
					redenSpil.dodadiKartaVoSredina(najgornataOtvorenaKarta);
					// izbrisija istata od kaj igracot
					igracNaPoteg.izbrisiJaNajgornataOtvorenaKarta();

					// ovoj igrac napravi nekakov poteg pa sega veke ne e na red
					// na red e sledniot igrac
					daliUspeaDaDodeliKartaNekomu = true;
					continue;
				} else {
					// igracot ima otvorena karta vo sredina no nemoze da ja
					// stavi na sredina
					// primer ima 4 PIK a na sredina e otvorena 10 SRCE

					// odkako svativme deka nemozime da dodademe vo sredina
					// proveri dali mozeme da dodelime na drugite igraci

					for (int i = 0; i < igraciVoIgrata.size(); i++) {
						if (i == indeksNaIgracotKojENaRed) {
							// sam na sebe nemoze da si dodeli karta
							continue;
						}

						if (igraciVoIgrata.get(i).daliMozeDaSeDodadeKartataNaIgracot(najgornataOtvorenaKarta)) {
							// smee da ja dade svojata najgorna karta vo
							// otvorenite na drug igrac
							igraciVoIgrata.get(i).dodadiVoOtvoreniKartiNaIgracot(najgornataOtvorenaKarta);
							igracNaPoteg.izbrisiJaNajgornataOtvorenaKarta();
							daliUspeaDaDodeliKartaNekomu = true;
							break;
						}
					}
					if (daliUspeaDaDodeliKartaNekomu) {
						// uspeal da napravi poteg, t.e dodelil karta, sega e
						// nekoj sleden igrac na red
						continue;
					}
				}
			} else {
				// igracot nema otvoreni karti
			}

			if (daliUspeaDaDodeliKartaNekomu) {
				continue;
			} else {
				// igracot ne napravil nisto so svoite otvoreni karti
				// da proverime sto moze da napravi so zatvorenite

				if (igracNaPoteg.iscitajJaNajgornataZatvorenaKarta() != null) {
					// ima seuste zatvoreni karti
					Karta najgornataZatvorena = igracNaPoteg.iscitajJaNajgornataZatvorenaKarta();

					if (redenSpil.daliMozeDaSeDodadeKartataVoSredina(najgornataZatvorena)) {
						// dokolku moze dodadija
						redenSpil.dodadiKartaVoSredina(najgornataZatvorena);
						// izbrisija istata od kaj igracot
						igracNaPoteg.izbrisiJaNajgornataZatvorenaKarta();
						daliUspeaDaDodeliKartaNekomu = true;
						continue;
					} else {
						// nemoze da se dodade vo sredina

						for (int i = 0; i < igraciVoIgrata.size(); i++) {
							if (i == indeksNaIgracotKojENaRed) {
								// sam na sebe nemoze da si dodeli karta
								continue;
							}

							if (igraciVoIgrata.get(i).daliMozeDaSeDodadeKartataNaIgracot(najgornataZatvorena)) {
								// smee da ja dade svojata najgorna karta vo
								// otvorenite na drug igrac
								igraciVoIgrata.get(i).dodadiVoOtvoreniKartiNaIgracot(najgornataZatvorena);
								igracNaPoteg.izbrisiJaNajgornataZatvorenaKarta();
								daliUspeaDaDodeliKartaNekomu = true;
								break;
							}
						}
						if (daliUspeaDaDodeliKartaNekomu) {
							// uspeal da napravi poteg, t.e dodelil karta, sega
							// e
							// nekoj sleden igrac na red
							continue;
						} else {
							// ako ne uspeal da ja dodeli kartata vo sredina
							// i neuspeal da ja dodeli kartata na nikoj od
							// igracite
							/// togas dodelija kaj sebe
							igracNaPoteg.dodadiVoOtvoreniKartiNaIgracot(najgornataZatvorena);
							igracNaPoteg.izbrisiJaNajgornataZatvorenaKarta();
							daliUspeaDaDodeliKartaNekomu = true;
						}

					}
				} else {
					// igracot nema zatvoreni karti

					// proveri dali voopsto ima otvoreni
					if (igracNaPoteg.otvoreniKartiNaIgracot.size() > 0) {
						// ima otvoreni, zavrti gi
						igracNaPoteg.prevrtigiOtvoreniteKartiVoZatvoreni();

						// gi svrtevme kartite, sledno sakam pak ovaj igrac da e
						// na red
						// za da mu se dade sansa da napravi nekakov poteg
						indeksNaIgracotKojENaRed--;
						continue;
					} else {
						// igracot nema ni otvoreni ni zatvoreni karti
						// todo
						// dali e pobednik ?
						// dali igrata ke zavrsi ili ke prodolzat drugite igraci
						// ?
					}
				}
			}
		}

		System.out.println("Igrata zavrsi vo " + (new Date()).toString());
	}

	public boolean daliEKrajNaIgrata() {
		// proveri dali site karti se naredeni
		if (redenSpil.daliENareden()) {
			return true;
		}
		return false;
	}

	public void dodeliKartiNaIgracite() {
		int momentalenIgracNaKojMuSeDodeluvaKarta = -1;
		for (int i = 0; i < spil.kartiteVoSpilot.size(); i++) {
			momentalenIgracNaKojMuSeDodeluvaKarta++;
			if (momentalenIgracNaKojMuSeDodeluvaKarta >= igraciVoIgrata.size()) {
				momentalenIgracNaKojMuSeDodeluvaKarta = 0;
			}
			
			igraciVoIgrata.get(momentalenIgracNaKojMuSeDodeluvaKarta).
				dodeliKartaNaIgracotVoZatvorenite(spil.kartiteVoSpilot.get(i));
		}
		
		spil.isprazniSpil();

	}
}
