package com.BusavaAzbuka;

public class Main {

	public static void main(String[] args) {

		char a = 's';
		char b = 'd';
		char c = 'd';
		char d;
		
		if (a > b && a > c || a >= b && a > c) {

			a += 1;

			System.out.println("novata bukva e " + a);
		} else if (b > a && b > c || b >= a && b > c) {
			b += 2;

			System.out.println("novata bukva e " + b );
		} else if (c > a && c > b || c > a && c >= b) {
			c += 4;

			System.out.println("novata bukva e " + c);
		} else if (a == b && a == c) {
			d = 'Z';
			System.out.println("za bukvata " + a + " zamena e bukvata " + d);
		
			}
		}

	}

