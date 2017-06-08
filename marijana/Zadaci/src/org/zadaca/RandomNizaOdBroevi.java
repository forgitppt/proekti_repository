package org.zadaca;

import java.util.Random;

public class RandomNizaOdBroevi {

	public static void main(String[] args) {

		// Ova e zadacata sto treba da ima random niza od 15 brojki od 1-9 iii
		// treba na sekoe vrtenje da kacuva plus 1 a koga ke stigne 9 da pocnuva
		// od 0
		// e sega jas stignav do ova i dalje jok neznam aj pomos on nekoj :)))))

		int[] numbers = new int[15];
		int i = 0;

		Random numbers1 = new Random();
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = numbers1.nextInt(10);
			System.out.print(numbers[i] + " ");
		}

	}
}