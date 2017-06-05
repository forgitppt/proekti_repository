//package com.proba;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niza = new int[100];
		for (int i = 0; i < niza.length; i++) {
			niza[i] = (int) (Math.random() * 200 + 1);
		}
		for (int j = 0; j < niza.length; j++) {
			System.out.print(" " + niza[j]);

		}
		System.out.println();

		int[] nizaPodredi = niza;

		int temp;
		int min = 0;

		for (int i = 0; i < nizaPodredi.length; i++) {
			min = i;
			 
			for (int j = i; j < nizaPodredi.length; j++) {
				if (nizaPodredi[j] < nizaPodredi[min])
					min = j;
			}
			temp = nizaPodredi[i];
			nizaPodredi[i] = nizaPodredi[min];
			nizaPodredi[min] = temp;
			System.out.print(" " + nizaPodredi[i]);

		}
	}
}
