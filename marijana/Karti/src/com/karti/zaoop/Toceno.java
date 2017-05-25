package com.karti.zaoop;

public class Toceno extends Pivo {
	public int  bakterijaA;
	
	public Toceno(String ime) {
		super(ime);
		bakterijaA = 100;
	}

	public Toceno(String ime, int bakterijaPoMetarKuben) {
		super(ime);
		this.bakterijaA = bakterijaPoMetarKuben;
	}
	
	public Toceno(String ime, int bakterijaPoMetarKuben, double golemina) {
		super(ime);
		this.golemina = golemina;
		this.bakterijaA = bakterijaPoMetarKuben;
	}
}
