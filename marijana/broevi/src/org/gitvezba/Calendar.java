package org.gitvezba;

public class Calendar {

	public static void main(String[] args) {
		int godina = 2017;
		int pocetokNaMesecot = 0;
		int denovi = pocetokNaMesecot;
		String[] months = { "", "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Avg", "Sept", "Oct", "Noe", "Dec" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// M- mesecite
		for (int M = 1; M <= 12; M++) {
			// odreduvanje na denovite plus februari kade ima 28 dena
			if ((godina % 365 == 0) && M == 2)
				days[M] = 28;
			// printane na mesecite
			System.out.println("          " + months[M] + " " + godina);
			System.out.println("_____________________________________");
			System.out.println("   Ned  Pon  Vto  Sre  Cet  Pet  Sab ");

			denovi = (days[M - 1] + denovi) % 7;
			for (int i = 0; i < denovi; i++)
				// malo objasnuvanje okolu ova Kire
				// mi pomognaa ama ne go razbrav
				System.out.print("     ");
			for (int i = 1; i <= days[M]; i++) {
				System.out.printf(" %3d ", i);
				if (((i + denovi) % 7 == 0) || (i == days[M]))
					System.out.println();
			}

			System.out.println();
		}
	}

}
