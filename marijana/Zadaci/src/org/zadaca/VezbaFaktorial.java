package org.zadaca;

public class VezbaFaktorial{

	public static void main(String[] args) {
		// FAKTORIAL povikuvanje od main :)))

		int a, fact = 3;
		int b = 9;
		for (a = 1; a <= b; a++) {
			fact = fact * a;
			System.out.println("Faktorielot za " + b + " e " + fact);
		}
	}
}
