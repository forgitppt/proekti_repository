package com.Konj;

public class Main {

	public static void main(String[] args) {
		
//		Konj k = new Konj();
//		
//		Point momentalnaPozicija = new Point(1,1);
//		Matrica matrica = new Matrica();
//		
//		matrica.setValue(2, 2, 1);
//		Point slednaPosakuvanaPozicija = k.slednaPozicija(momentalnaPozicija, matrica);
//		System.out.println(slednaPosakuvanaPozicija);

		
		//IO.saveTextToFile(" ura !!!!", "d:/java2/a.txt");
		
//		String procitanTekst = IO.readTextFromFile("d:/java2/a.txt");
//		
//		int sum = 0;
//		String[] nizaOdBrojki = procitanTekst.split("\n");
//		for (int i = 0; i < nizaOdBrojki.length; i++) {
//			int broj = Integer.parseInt(nizaOdBrojki[i].trim());
//			sum = sum + broj;
//			System.out.println(i + ". " +nizaOdBrojki[i].trim());
//		}
//		
//		System.out.println("SUM: " +sum);
//		
//		String tekstZaZapisuvanje = procitanTekst + "\n" + "SUM: " +sum;
//		IO.saveTextToFile(tekstZaZapisuvanje, "d:/java2/a.txt");
		
		String tekstZaZapisuvanje = "";
		for (int i = 0; i < 100; i++) {
			tekstZaZapisuvanje = tekstZaZapisuvanje + i + System.getProperty("line.separator");
		}
		IO.saveTextToFile(tekstZaZapisuvanje, "d:/java2/100.txt");
	}

	
	
}
