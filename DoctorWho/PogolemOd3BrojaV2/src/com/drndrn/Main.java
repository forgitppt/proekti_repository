package com.drndrn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 22;
		int c = 1;
		int d;
		if (a > b) {
			d = a;
			System.out.println("brojot " + d + " e pogolem");

		} else {
			d = b;
			System.out.println("brojot " + d + " e pogolem");
		}
		if (a > c) {
			d = a;
			System.out.println("brojot " + d + " e pogolem");
		} else {
			d = c;
			System.out.println("brojot " + d + " e pogolem");

		}
		if (b > c) {
			d = b;
			System.out.println("brojot " + d + " e pogolem");

		} else {
			d = c;
			System.out.println("brojot " + d + " e pogolem");
		}
		System.out.println("brojot " + d + " e najgolem");
	}

}
