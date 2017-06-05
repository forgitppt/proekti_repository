package com;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] niza = new int[15];
		printaj(niza);
		System.out.println();
		promena(niza);
	}

	public static void printaj(int[] niza) {
		Random r = new Random();
		for (int counter = 0; counter < niza.length; counter++) {
			niza[counter] = (int) (r.nextInt(9)+1);

			System.out.print("|" + niza[counter] + "|");
		}
		System.out.print(" ");
	}

	public static int[] promena(int[] niza) {
		int[] nizaPodredi = niza;
		int temp;
		int promeniNiza = 0;

		for (int i = 0; i < nizaPodredi.length; i++) {
			promeniNiza = i;
				temp = nizaPodredi[i];
				nizaPodredi[i] = nizaPodredi[i]+1;
				//nizaPodredi[promeniNiza] = temp;
				
				System.out.print("|" + nizaPodredi[i] + "|");
			}
		
		return nizaPodredi;
	}

}
