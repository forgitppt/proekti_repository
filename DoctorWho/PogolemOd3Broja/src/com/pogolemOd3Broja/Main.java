package com.pogolemOd3Broja;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 12;
		int c = 1;
		int d;
		if (a > b && a > c || a >= b && a > c) {
			d = a;
			System.out.println("brojot " + d + " e najgolem");
		} else if (b > a && b > c || b >= a && b > c) {
			d = b;
			System.out.println("brojot " + d + " e najgolem");
		} else if (c > a && c > b || c > a && c >= b) {
			d = c;
			System.out.println("brojot " + d + " e najgolem");

		} else if (a == b && a == c) {
			d = a;
			System.out.println("site broevi se " + d);
		}

	}
}