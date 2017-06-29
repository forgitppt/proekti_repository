package com.Konj;

public class Matrica {

	// 0 prazno pole
	// 1 nekoj predhodno bil tamu
	// 2 pritivnikot e veke tamu

	public final int PRAZNO_POLE = 0;
	public final int ZAFATENO_POLE = 1;
	public final int PROTIVNIK_POLE = 2;

	int[][] matrica = new int[8][8];

	public int getValue(int x, int y) {
		return matrica[x-1][y-1];
	}

	public void setValue(int x, int y, int value) {
		if (value == PRAZNO_POLE || value == ZAFATENO_POLE || value == PROTIVNIK_POLE) {
			matrica[x-1][y-1] = value;
		}else{
			//greska
		}
	}
	
	@Override
	public String toString() {
		String celaMatrica = "";
		
		for(int y = 1; y < 9; y++){
			String red = "";
			for(int x = 1; x < 9; x++){
				red = red + getValue(x,y) + " ";
			}
			celaMatrica = celaMatrica + red + "\n";
		}
		return celaMatrica;
	}
}
