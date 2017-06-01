package com.niza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niza = { 1, 33, 23, 43, 11, 74, 123, 3453, 0 };

		// povikuvanje na getMax metodata
		int max = getMax(niza);
		System.out.println("Najgolemiot broj vo nizata e " + max);

		// povikuvanje na getMin metodata
		int min = getMin(niza);
		System.out.println("Najmaliot broj vo nizata e " + min);
	}

	// metoda za naogjanje na najgolemiot broj od nizata
	public static int getMax(int[] Niza) {

		int maxValue = Niza[0];

		for (int i = 1; i < Niza.length; i++) {

			if (Niza[i] > maxValue) {
				maxValue = Niza[i];

			}

		}

		return maxValue;

	}

	// metoda za naogjanje na najmaliot broj od nizata
	public static int getMin(int[] Niza) {

		int minValue = Niza[0];

		for (int i = 1; i < Niza.length; i++) {

			if (Niza[i] < minValue) {
				minValue = Niza[i];

			}
		}
		return minValue;
	}
}