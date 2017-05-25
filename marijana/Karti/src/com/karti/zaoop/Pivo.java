package com.karti.zaoop;

//public class Pivo extends Object{
public class Pivo {

	public String boja;
	public String ime;
	public double golemina;

	public Pivo(String ime) {
		super();
		this.ime = ime;
		this.boja = "svetlo";
		this.golemina = 0.5;
	}

	public Pivo(String ime, String boja, double golemina) {
		this.ime = ime;
		this.boja = boja;
		this.golemina = golemina;
	}
}
