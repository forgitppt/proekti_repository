package com.proba;

public class Main {

	public static void main(String[] args) {

		int[] niza = { 3, 2, 6, 12, 8, 9 };
		isprintaj(niza);
		System.out.println();
		
		sort(niza);
	}

	public static void isprintaj(int[] nizaA) {
		for (int i = 0; i < nizaA.length; i++) {
			System.out.print(" " + nizaA[i]);
		}
	}

	public static int[] sort(int[] sortNiza) {

		int temp;
		int min;
		for (int i = 0; i < sortNiza.length; i++) {
			min = i;
			for (int j = i; j < sortNiza.length; j++) {
				if (sortNiza[j] < sortNiza[min])
					min = j;
			}
			temp = sortNiza[i];
			sortNiza[i] = sortNiza[min];
			sortNiza[min] = temp;
			System.out.print(" " + sortNiza[i]);
		}
		return (sortNiza);
	}

}
