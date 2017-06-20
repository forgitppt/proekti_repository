package com.proba;

public class Main {

	public static void main(String[] args) {

		int[] niza = { 2, 4, 6, 7, 6, 4, 2 };
		//7/2 = 3
		//i se dvizi od 0 do 2
		
		//za i = 0 j = (7 - 1) - 0 = 6
		//za i = 1 j = (7 - 1) - 1 = 5
		//za i = 2 j = (7 - 1) - 2 = 4
		boolean isAnagram = true;
		int maxIndex = niza.length / 2;
		for (int i = 0; i < maxIndex; i++) {
			int j = (niza.length-1)-i;
			if(niza[i] != niza[j]){
				isAnagram = false;
				break;
			}
		}

		System.out.println(isAnagram);
		// int[] niza = { 3, 2, 6, 12, 8, 9, 0 };
		// isprintaj(niza);
		// System.out.println();
		//
		// sort(niza);
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
