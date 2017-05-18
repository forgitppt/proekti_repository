package org.cas;

public class Casproba {

	public static void main(String[] args) {

		// sostavi niza
		int[] nesortiranaNiza = { 5, 8, 1, 12, 23, 7 };

		// isprintaj ja taa niza
		// isprintanoto treba da izgleda vo forma 5 8 1 12...
		printNiza(nesortiranaNiza);

		// sortiraj ja nizata
		int[] sortiranaNiza = sortiraj(nesortiranaNiza);

		// isprintaj ja sortiranata niza
		printNiza(sortiranaNiza);
	}

	public static void printNiza(int[] nizaArgument) {
		// iteriraj niz elementite vo nizata
		// i ispisuvaj go sekoj element na konzola
		for (int i = 0; i < nizaArgument.length; i++) {
			// ispisi na konzola
			System.out.print(nizaArgument[i] + " ");
		}
		System.out.println();
	}

	public static int[] sortiraj(int[] nesortiranaNiza) {
		for (int i = 0; i < nesortiranaNiza.length; i++) {
			for (int j = 0; j < nesortiranaNiza.length - 1; j++) {
				// ako polevo (j) imame pogolem broj od podesno (j+1) smeni
				// mesta
				if (nesortiranaNiza[j] > nesortiranaNiza[j + 1]) {
					int tmp = nesortiranaNiza[j];
					nesortiranaNiza[j] = nesortiranaNiza[j + 1];
					nesortiranaNiza[j + 1] = tmp;
					
					printNiza(nesortiranaNiza);

				}
				// else ne pravi nisto vo vistinski redosled se
			}
		}
		return nesortiranaNiza;
	}
}
