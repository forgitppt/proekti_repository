package com.proba;

public class Main {

	public static void main(String[] args) {
				
		Bure maloBure = new Bure(50,10);
		Bure b = new Bure(500,100);


		System.out.println(b);
		System.out.println(maloBure);
		
		b.doturiOdBure(maloBure);
		
		System.out.println(b);
		System.out.println(maloBure);
	}

}
