package com.karti;

public class Joker extends Karta {

	//vo ovaa klasa this pokazuva na Joker
	//super pokazuva na Karta
	
	boolean zamenaNaKarta;
	
//	public Joker(boolean daliEZaZamena) {
//		//super(); -> ova ke povika "public Karta() {"
//		zamenaNaKarta = daliEZaZamena;
//	}
	
	public Joker(String brojka, String boja) {
		super(brojka,boja);
		zamenaNaKarta = true;
	}
	
	public Joker() {
		super("2",Karta.SRCE);// -> "public Karta(String brojka, String boja) {"
		zamenaNaKarta = false;
	}
	
	@Override
	public String toString() {
		if(zamenaNaKarta){
			return super.toString() + "(J)";
		}else{
			return "JOKER";
		}
	}
}
