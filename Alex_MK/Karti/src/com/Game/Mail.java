package com.Game;

import java.util.Random;
import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		
		String kartata = " ";
		char bojata = ' ';

		// Cel spil na kart (nov po red se polni)

		String[] spil = new String[53];
		int brojNaKarti = 1;
		for (int i = 1; i < 5; i++) {
			if (i == 1) {
				bojata = Karti.BAKLAVA;
			}
			if (i == 2) {
				bojata = Karti.SRCE;
			}
			if (i == 3) {
				bojata = Karti.DETELINA;
			}
			if (i == 0) {
				bojata = Karti.LIST;
			}

		
			for (int j = 2; j < 15; j++) {
				
				String kartata1 = Integer.toString(j);
				kartata = kartata1;
				
				if (j == 11) {
					kartata = Karti.ACE;
				}
				if (j == 12) {
					kartata = Karti.JACK;
				}
				if (j == 13) {
					kartata = Karti.QUEEN;
				}
				if (j == 14) {
					kartata = Karti.KING;
				}

				spil[brojNaKarti] = (j + " " + bojata + "|" + kartata);
//				System.out.println(brojNaKarti + " ---> " + spil[brojNaKarti]);
				brojNaKarti++;
			}
		}


		// nivo za mesanje
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Kolku Igraci ke igraat ----> ");
	//Nastavni4kata: imeto na promenlivata sekogas treba da zapocne so mala bukva (iako funkcionira i so golema)
	String b = scanner.next();
	int brojNaIgraci = Integer.parseInt(b);
	System.out.println(brojNaIgraci);
	
	System.out.print("Po kolku karti ke imaat ----> ");
	//Nastavni4kata: imeto na promenlivata sekogas treba da zapocne so mala bukva (iako funkcionira i so golema)
	String k = scanner.next();
	int kolkuKartiIgraat = Integer.parseInt(k);
	System.out.println(kolkuKartiIgraat);

	
	
// TEST NA KARTA

	for (int igrac = 0; igrac < brojNaIgraci; igrac++) {
		String[] igraci = new String[igrac];
		
		for (int raka = 0; raka < kolkuKartiIgraat; raka++){

			Random rand = new Random();
			int promeni = rand.nextInt(52) + 1;


			System.out.println(spil[promeni]);

////////////////////////////////////////////////////////////
///			dali e potrebna matrica kade ke ima 2 nici od 
///			igrac i od broj od kartata
		
		
		
		
		}
		}
	
	
	}
}
