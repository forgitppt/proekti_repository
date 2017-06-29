package com.Konj;

public class Main {

	public static void main(String[] args) {
		
		Konj k = new Konj();
		
		Point momentalnaPozicija = new Point(1,1);
		Matrica matrica = new Matrica();
		
		matrica.setValue(2, 2, 1);
		Point slednaPosakuvanaPozicija = k.slednaPozicija(momentalnaPozicija, matrica);
		System.out.println(slednaPosakuvanaPozicija);

	}

}
