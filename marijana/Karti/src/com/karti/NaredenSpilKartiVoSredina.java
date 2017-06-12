package com.karti;

import java.util.ArrayList;

public class NaredenSpilKartiVoSredina {

	// ovie se onie otvorenite svrteni karte
	private ArrayList<Karta> kartiteVoSredina;

	public NaredenSpilKartiVoSredina() {
		kartiteVoSredina = new ArrayList<>();
	}

	// metoda za validacija
	public boolean daliMozeDaSeDodadeKartataVoSredina(Karta karta) {
		// proverka dali treba da se dozvoli dodavanje nakarta

		if (kartiteVoSredina.size() == 0) {
			// ako kupceto e prazno togas e dozvolen bilo koj ACE
			if (karta.getBrojka().equals(Karta.ACE)) {
				return true;
			}
		} else {
			// kartite na sredina ne se prazni ima nekakva karta tamu
			// zemija poslednata i proveri dali 'karta' od argument moze da e
			// sledna

			Karta poslednataNaSredina = kartiteVoSredina.get(kartiteVoSredina.size() - 1);

			if (poslednataNaSredina.getBrojka().equals(Karta.KING)) {
				if (karta.getBrojka().equals(Karta.ACE)) {
					return true;
				} else {
					return false;
				}
			} else {
				//sto ako e bilo sto osven KING
				if(poslednataNaSredina.getBoja().equals(karta.getBoja())){
					//mozebi smeeme da dodademe
					int redosled1 = zemiRedosled(poslednataNaSredina.getBrojka());
					int redosled2 = zemiRedosled(karta.getBrojka());
					if(redosled2-redosled1 == 1){
						return true;
					}else{
						return false;
					}
				}else{
					//sigurno nesmeeme
					return false;
				}
			}
		}
		return false;
	}

	// metoda za dodavanje na karta vo sredina, ova ke ja dodade najgore
	//t.e ovaa ke bidi kartata sto ke se gleda
	public void dodadiKartaVoSredina(Karta karta) {
		// dodavame samo ako ni dozvoli validacijata
		if (daliMozeDaSeDodadeKartataVoSredina(karta)) {
			kartiteVoSredina.add(karta);
		}

		// ako nemoze togas mozebi treba da se frli greska ?
	}

	@Override
	public String toString() {
		// vrati cela lista od karti vo spilot
		String s = "Otvorenite karti vo sredina:\n";
		for (int i = 0; i < kartiteVoSredina.size(); i++) {
			s = s + "   " + kartiteVoSredina.get(i) + "\n";
		}
		return s;
	}
	
	public static int zemiRedosled(String brojkaOdKarta){
		for (int i = 0; i < Karta.SITE_BROJKI.length-1; i++) {
			if(brojkaOdKarta.equals(Karta.SITE_BROJKI[i])){
				return i;
			}
		}
		return -1;//nesto se sjeba
	}

	public boolean daliENareden() {
		//todo podobra proverka dali spilot e nareden
		
		//zasega za nareden spil ke go smetame onoj sto sodrzi 52 karti
		return kartiteVoSredina.size() == 52;
	}
}
