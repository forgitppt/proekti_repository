package com;

import java.io.IOException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String word;
		int counter = 0;
		System.out.println("����� ���� �� �������� �� ������� ��� ���� �� ���������� �� ����������: ");
		word = in.next();
		while (!word.equals("stop")) {
			System.out.println("������ � ������: " + word); // prints the word
															// the user entered
			System.out.println("����� ���� �� �������� �� ������� ��� ���� �� ���������� �� ����������: ");

			if (isAnagram(word)) {
				//System.out.println("Anagram");
				counter++;
			} else {
				//System.out.println("Not Anagram");
			}

			word = in.next(); // waits for user to input more information
		}
		System.out.println(" �������� ������ " + counter+ " ������� ��� ������������� �������");
	}

	public static boolean isAnagram(String word) {

		boolean isAnagram = true;
		char[] slogovi = word.toCharArray();
		int maxIndex = slogovi.length / 2;
		for (int i = 0; i < slogovi.length / 2; i++) {
			int j = (slogovi.length - 1) - i;
			// System.out.println(slogovi);
			if (slogovi[i] != slogovi[j]) {
				isAnagram = false;
				continue;
			}
		}
		return isAnagram;
	}

}