package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print(" Input day of Week: ");
		String dayOfWeek = input.next();

		System.out.print(" Input Month: ");
		String month = input.next();

		int dayCounter = getDayNumber(dayOfWeek);

		System.out.println("         " + month + " 2017");
		System.out.println("___________________________");
		System.out.printf("%s %s %s %s %s %s %s \n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

		for (int i = 1; i <= dayCounter; i++)
			System.out.printf("%-4s", " ");

		for (int i = 1; i <= 31; i++) {
			dayCounter++;

			if (dayCounter % 7 == 0)
				System.out.printf("%-4d \n", i);
			else
				System.out.printf("%-4d", i);
		}

		input.close();
	}

	public static int getDayNumber(String dayOfWeek) {

		int dayNumber = 0;

		if (dayOfWeek == null) {
			return dayNumber;
		}
		switch (dayOfWeek.toLowerCase()) {
		case "mon":
			dayNumber = 0;
			break;
		case "tue":
			dayNumber = 1;
			break;
		case "wed":
			dayNumber = 2;
			break;
		case "thu":
			dayNumber = 3;
			break;
		case "fri":
			dayNumber = 4;
			break;
		case "sat":
			dayNumber = 5;
			break;
		case "sun":
			dayNumber = 6;
			break;
		default:
			dayNumber = 0;
			break;
		}
		return dayNumber;
	}

}
