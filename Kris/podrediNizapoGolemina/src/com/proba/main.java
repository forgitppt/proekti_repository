package com.proba;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niza = { 5, 3, 7, 11, 2, 10 };
		int min;
		int temp;

		for (int i = 0; i < niza.length; i++) {
			min = i;
			for (int j = i; j < niza.length; j++) {
				if (niza[j] < niza[min])
					min = j;
			}
			temp = niza[i];
			niza[i] = niza[min];
			niza[min] = temp;
			System.out.print(" " + niza[i]);
		}
	}
}
