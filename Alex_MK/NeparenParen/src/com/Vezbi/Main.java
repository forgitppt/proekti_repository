package com.Vezbi;
import java.util.Scanner;
public class Main {

	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Maska za start na Programo
		System.out.println("***************************************");
		System.out.println("********* DALI E PAREN ILI NE *********");
		System.out.println("***** Vokolku e paren ke ti vratam ****");
		System.out.println("** jas ke ti vrdatam -DA- ako e paren *");
		System.out.println("***************************************");

		// Postavuvanje na promenlivi
		boolean Izbor = true;
		int VnesenBroj = 0;
		
		// Vnes na brojot
		System.out.print("Koj e tvojot broj -->  ");
		in = new Scanner(System.in);
		VnesenBroj = in.nextInt();
	
		// Broverka dali vneseniot broj e paren 
		if (VnesenBroj%2 == 0){
			Izbor = true;
		}
		else 
			Izbor = false;

		// Ispis na rezultatot
		System.err.print(Izbor);
			
	}
}