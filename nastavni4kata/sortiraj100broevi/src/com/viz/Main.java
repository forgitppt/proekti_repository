package com.viz;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] nizaOdBroevi = new int[100];

		Random r = new Random();
		for (int i = 0; i < nizaOdBroevi.length; i++) {
			nizaOdBroevi[i] = r.nextInt(15)+1;
		}

		isprintajNiza(nizaOdBroevi);
	}
	/*	for (int i = 0; i < nizaOdBroevi.length; i++) {
			for (int j = 1; j < nizaOdBroevi.length-i; j++) {
				if (nizaOdBroevi[j] < nizaOdBroevi[j-1]) {
					int tmp = nizaOdBroevi[j-1];
					nizaOdBroevi[j-1] = nizaOdBroevi[j];
					nizaOdBroevi[j] = tmp;
				}
			}
		}
		
		isprintajNiza(nizaOdBroevi);
	}
*/
	public static void isprintajNiza(int[] niza) {
		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i] + " ");
		}
		System.out.println();
	}

}
