package com.Konj;

public class Konj {

	// zemija slednata pozicija na konjot
	public Point slednaPozicija(Point momentalnaPozicija, Matrica matrica) {
		Point slednaPozicija = new Point(2,2);

		if(matrica.getValue(slednaPozicija.x, slednaPozicija.y) == matrica.PRAZNO_POLE){
			return slednaPozicija;
		}else{
			//vrati nekoja nova pozicija
			slednaPozicija = new Point(8,8);
			return slednaPozicija;
		}
	}

}
