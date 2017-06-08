package com.karti;

import java.util.ArrayList;

public class KartiVoSredina {

	//ovie se onie otvorenite svrteni karte
	private ArrayList<Karta> kartiteVoSredina;
	
	public void dodadiKartaVoSredina(Karta karta){
	
		//proverka dali treba da se dozvoli dodavanje nakarta
		
		kartiteVoSredina.add(karta);
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
}
