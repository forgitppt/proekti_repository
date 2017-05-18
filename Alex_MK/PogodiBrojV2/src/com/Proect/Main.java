package com.Proect;

//import java.awt.Color;
//import java.awt.Font;
import java.util.Scanner;
import java.util.Random;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("*************************");
		System.err.println("**** POGODI GO BROJOT ***");
		System.err.println("*** jas zamisliv broj ***");
		System.err.println("od 1-100 ti pogodi go koj");
		System.err.println("**************************");

		boolean Povtori = true;
		int BrojNaObidi = 0;
		Random rand = new Random();
		int ZamislenBroj = rand.nextInt(99) + 1;
		
		do {
			scanner = new Scanner(System.in);
			System.out.print("Vnesi go tvojot broj ");
			String broj = scanner.next();
			int VnesenBroj = Integer.parseInt(broj);

			BrojNaObidi = BrojNaObidi + 1;

			if (VnesenBroj == ZamislenBroj) {
				System.err.println("----- BRAVO -----");
				Povtori = false;
			}

			if (VnesenBroj > ZamislenBroj) {
				System.out.println("Jas zamisliv pomal broj ");
				Povtori = true;
			}

			if (VnesenBroj < ZamislenBroj) {
				System.out.println("Jas zamisliv pogolem broj ");
				Povtori = true;
			}
		} while (Povtori);
	System.err.println(" Odlicno. Uspea da go pogodis brojot od " + BrojNaObidi + " obidi");
	}
}
