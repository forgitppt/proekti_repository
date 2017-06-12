package com.karti;

import java.util.Date;
import java.util.ArrayList;

public class Igra {

	Spil spil;
	NaredenSpilKartiVoSredina redenSpil;
	ArrayList<Igrac> igraciVoIgrata;
	
	public Igra(Spil spil, NaredenSpilKartiVoSredina redenSpil, ArrayList<Igrac> igraciVoIgrata) {
		super();
		this.spil = spil;
		this.redenSpil = redenSpil;
		this.igraciVoIgrata = igraciVoIgrata;
	}


	public void zapocnijaIgrata(){
		Date d = new Date();
		System.out.println("Igrata zapocnuva vo "+d.toString());
		
		//najprvin treba da se odluci koj igrac ke bide prv
		
		
		//igrata trae se dodeka ne zavrsi :)
		//odlukata dali igrata e zavrsena ja pravime vo posebna metoda
		while(daliEKrajNaIgrata()){
			
		}
	}
 
	public boolean daliEKrajNaIgrata(){
		
		return true;
	}
}
