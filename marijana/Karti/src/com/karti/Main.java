package com.karti;

import com.karti.zaoop.Pivo;
import com.karti.zaoop.Toceno;

public class Main {

	public static void main(String[] args) {

		// Karta karta = new Karta("5", "karo");
		// Karta karta2 = new Karta("10", "detelina");

		// karta.boja = "rozeva";
		// karta.setBoja(Karta.SRCE);

		// karta.setBrojka(Karta.JACK);

		// System.out.println(karta);

		// print("aaaaa");

		//Joker j = new Joker();
		Karta k = new Karta("5",Karta.SRCE);
		Joker j = new Joker("5",Karta.SRCE);
		j.setBoja(Karta.TREF);
		j.setBrojka(Karta.KING);
		// System.out.println(j.toString());
		System.out.println(k);
		System.out.println(j);

		
		
		
		
		
//		Pivo p = new Pivo("Skopsko", "temno", 0.5);
//		
//		Toceno toceno = new Toceno("Dab");
//		
//		System.out.println(toceno.ime);
//		System.out.println(toceno.golemina);
//		System.out.println(toceno.boja);
//		System.out.println(toceno.bakterijaA);

		//double = int
		//tip Pivo = tip Toceno
		//Pivo moeOmileno = toceno;
		//moeOmileno.b
		//toceno.bakterijaA
	}

	public static void print(String s) {
		System.out.println(s);
	}
}