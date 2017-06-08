package com.proba;

public class Bure {

	private int kapacitet;
	private int momentalnaLitraza;

	int getMomentalna(){
		return momentalnaLitraza;
	}
	
	public Bure(int kapacitet) {
		this.kapacitet = kapacitet;
		this.momentalnaLitraza = 0;
	}

	public Bure(int kapacitet, int momentalnaLitraza) {
		this.kapacitet = kapacitet;
		this.momentalnaLitraza = momentalnaLitraza;
	}

	public int dopolni(int dodajLitraza) {

		if ((momentalnaLitraza + dodajLitraza) < kapacitet) {
			momentalnaLitraza += dodajLitraza;
		} else {
			System.out.println(" ja preminavte vkupnata litraza");
		}
		//System.out.println(" kapacitetot na bureto e: " + kapacitet);
		return momentalnaLitraza;
	}

	public int odzemi(int odzemiLitraza) {

		if (momentalnaLitraza >= odzemiLitraza) {
			momentalnaLitraza -= odzemiLitraza;
		} else {
			System.out.println(" Nema dovolno litraa vo bureto");
		}

		return momentalnaLitraza;
	}

	public void doturiOdBure(Bure drugotoBure){
		dopolni(drugotoBure.getMomentalna());
		drugotoBure.odzemi(drugotoBure.getMomentalna());
	}
	
	@Override
	public String toString() {
		return "K " + kapacitet + " M " + getMomentalna();
	}
}
