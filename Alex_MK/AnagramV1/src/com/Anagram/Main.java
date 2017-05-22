package com.Anagram;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Voved
		System.err.println("*************************************");
		System.err.println("************** ANAGRAM **************");
		System.err.println("* zbor koj moze da se cita obratno **");
		System.err.println("*************************************");

		// Izbor na kolkava niza ke se upotrebuva
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesi Tvoj Zbor ----> ");
		String VnesenZbor = scanner.next();

		// Zadavanje na promenlivi
		char[] Bukva = VnesenZbor.toCharArray();
		int max = VnesenZbor.length();
		int polovina = max / 2;
		String Dalie = "NE E ANAGRAM";

		// Proverka dali se identecni prviot i posledniot i.t.n.
		for (int i = 0; i < polovina; i++) {
			if (Bukva[i] != Bukva[(max - 1) - i])
				Dalie = "NE E ANAGRAM";
			else
				Dalie = "ANAGRAM";
		}
		// Pecatenje na porakata
		System.out.println(" ");
		System.out.println(Dalie);
	}
}
