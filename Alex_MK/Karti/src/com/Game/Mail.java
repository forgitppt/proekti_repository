package com.Game;

import java.util.Random;

public class Mail {

	public static void main(String[] args) {

		// Zamisluvanje na random Karta
		char kartata = ' ';
		char bojata = ' ';
		// Random rand = new Random();
		// int boja = rand.nextInt(3) + 1;
		// Random rand1 = new Random();
		// int karta = rand1.nextInt(13) + 1;
		//
		// if (boja == 1) {
		// kartata = (Karti.BAKLAVA);
		// }
		// if (boja == 2) {
		// kartata = (Karti.SRCE);
		// }
		// if (boja == 3) {
		// kartata = (Karti.DETELINA);
		// }
		// if (boja == 0) {
		// kartata = (Karti.LIST);
		// }

		// System.out.print(kartata);

		// Cel spil na kart
		String[] spil = new String[57];
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

		
			for (int j = 1; j < 15; j++) {
//				if (j == 11) {
//					kartata = Karti.ACE;
//				}
//				if (j == 12) {
//					kartata = Karti.JACK;
//				}
//				if (j == 13) {
//					kartata = Karti.QUEEN;
//				}
//				if (j == 14) {
//					kartata = Karti.KING;
//				}
//			kartata = j;
				spil[brojNaKarti] = (j+ " " + bojata);
				System.out.println(brojNaKarti + "---> " + spil[brojNaKarti]);
				brojNaKarti++;
			}
		}

//		System.out.println(spil[45]);
		// System.out.print(Karti.ACE);
		// System.out.print(Karti.SRCE);
		//
		// String Spil[][] = new String[boja][karta];
		//
		// for (int i = 0; i < 6 ; i++) {
		// Random rand = new Random();
		// int boja = rand.nextInt(3) + 1;
		// Random rand1 = new Random();
		// int karta = rand1.nextInt(13) + 1;
		//
		//
		// int ZamislenBroj = rand.nextInt(99) + 1;
		// niza[1][1] = ZamislenBroj;
		//
		// kartaBroj = karta;
		//
		//
		// System.out.print(Karti.ACE);
		// System.out.print(Karti.SRCE);
		// System.out.println(karta);
		// System.out.println(boja);

	}
}
