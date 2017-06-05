package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("it's faktoriel is: " + faktoriel());

	}

	public static int faktoriel() {
		
		Scanner n = new Scanner(System.in);
		System.out.print("Input number to get it's faktoriel: ");
		int number = n.nextInt();
		int fakt = 1;
		if (number <= 1) {
			fakt = 1;
		} else {
			for (int i = 1; i <= number; i++) {
				fakt = fakt * i;
			}
		}
		return fakt;
	}

}
