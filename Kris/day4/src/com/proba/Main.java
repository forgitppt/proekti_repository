package com.proba;

public class Main {

	public static void main(String[] args) {

		int broj = 1245;
		System.out.println("Sumata na cifrite e: " + presmetajSumaOdCifri(broj));
	}

	public static int presmetajSumaOdCifri(int broj) {
		String brojKakoString = broj + "";
		int sum = 0;
		// izodi eden po eden karakter i pretvorigo vo broj
		// sekoj broj dodaj go na sumata od predhodnite broevi
		for (int i = 0; i < brojKakoString.length(); i++) {
			sum += Integer.parseInt(brojKakoString.charAt(i) + "");
			System.out.println(sum);
		}
		// vratija sumata
		return sum;
	}

	// public static void convertBroj() {
	// String convertBroj = Integer.toString(broj);
	//
	// }
}
// int broj = 12345;
// int sledenBroj;
// int sum = 0;
//
// while (broj > 0) {
// sledenBroj = broj % 10;
// sum = sum + sledenBroj;
// broj = broj / 10;
// }
// System.out.print("Zbirot na cifrite vo zadadeniot broj e: " +sum);
