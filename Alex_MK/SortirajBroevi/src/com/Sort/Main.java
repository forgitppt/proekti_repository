package com.Sort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Voved
		System.err.println("************************************");
		System.err.println("******* Sortiranje na broevi *******");
		System.err.println("* nizata se polni so random broevi *");
		System.err.println("** potoa ke gi naredi po redosled **");
		System.err.println("****** od najgolem kon najmal *******");
		System.err.println("************************************");

		// Izbor na kolkava niza ke se upotrebuva
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesi golemina na nizata ----> ");

		String VnesenBroj = scanner.next();
		int VnesenBroj1 = Integer.parseInt(VnesenBroj);

		// Definiranje na Nizata
		int niza[] = new int[VnesenBroj1];
		int Najgolem = niza[0];
		int Brojcanik = 0;
		int BrojcanikNovaNiza = 0;
		int NovaNiza[] = new int[VnesenBroj1];

		// Polnenje na nizata
		for (int i = 0; i < VnesenBroj1; i++) {
			Random rand = new Random();
			int ZamislenBroj = rand.nextInt(99) + 1;
			niza[i] = ZamislenBroj;
		}

		// Pecatenje na nizata
		for (int i = 0; i < VnesenBroj1; i++) {
			System.out.print(niza[i] + "|");
		}

		// Podreduvanje na nizata po redosled

		// do {
		while (BrojcanikNovaNiza < VnesenBroj1) {

			for (int i = 0; i < niza.length; i++) {
				if (niza[i] > Najgolem) {
					Najgolem = niza[i];
					Brojcanik = i;
				}

			}
			// Zapis na novata niza i vnes na "0" vo starata
			NovaNiza[BrojcanikNovaNiza] = Najgolem;
			BrojcanikNovaNiza = BrojcanikNovaNiza + 1;
			niza[Brojcanik] = 0;
			Najgolem = 0;
		}

		// Pecatenje na novata nizata
		System.out.println("");
		System.out.println("");
		System.out.println("Vo prilog e novata niza ");
		for (int i = 0; i < VnesenBroj1; i++) {
			System.out.print(NovaNiza[i] + "|");
		}

	}
}
