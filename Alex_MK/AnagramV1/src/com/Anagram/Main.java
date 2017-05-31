package com.Anagram;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {

	//todo napravi ja aplikacijata da moze kontinuirano da se vnesuvaat novi zborovi
	//koga ke ispecati dali zborot e anagram ili ne, da dozvoli citanje na nov zbor
	//koga zborot e STOP aplikacijata da zapri i da se ispecati statistika kolkav procent od vnesenite zborovi bile anagrami

	public static void main(String[] args) {
		// Voved
		System.err.println("*************************************");
		System.err.println("************** ANAGRAM **************");
		System.err.println("** zbor koj moze da se cita obratno **");
		System.err.println("*************************************");

		// Izbor na kolkava niza ke se upotrebuva
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesi Tvoj Zbor ----> ");
		//Nastavni4kata: imeto na promenlivata sekogas treba da zapocne so mala bukva (iako funkcionira i so golema)
		String VnesenZbor = scanner.next();

		// Zadavanje na promenlivi
		//Nastavni4kata: imeto na promenlivata sekogas treba da zapocne so mala bukva (iako funkcionira i so golema)
		char[] Bukva = VnesenZbor.toCharArray();
		int max = VnesenZbor.length();
		int polovina = max / 2;
		//Nastavni4kata: imeto na promenlivata sekogas treba da zapocne so mala bukva (iako funkcionira i so golema)
		String Dalie = "NE E ANAGRAM";

		// Proverka dali se identecni prviot i posledniot i.t.n.
		for (int i = 0; i < polovina; i++) {
			//Nastavni4kata: sekogas koristi { koga imas if (iako funkcionira bez niv)
			if (Bukva[i] != Bukva[(max - 1) - i]){
				Dalie = "NE E ANAGRAM";
			}else{
				Dalie = "ANAGRAM";
			}
		}
		// Pecatenje na porakata
		System.out.println(" ");
		System.out.println(Dalie);
	}
}
