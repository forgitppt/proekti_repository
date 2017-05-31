package com;

public class Main {

	public static void main(String[] args) {

		//ASCII vidi wiki
		
//		int bukvaKakoTipBroj = 'A';
//		System.out.println(bukvaKakoTipBroj);
//		bukvaKakoTipBroj++;
//		System.out.println(bukvaKakoTipBroj);
//		
//		char brojKakoTipBukva = 65;//bukvaKakoTipBroj
//		System.out.println(brojKakoTipBukva);
		
		System.out.println(zemiBukva('A'));//B
		System.out.println(zemiBukva('B'));//C
		System.out.println(zemiBukva('Y'));//Z
		System.out.println(zemiBukva('Z'));//A
	}

	//alternative 
	public static char zemiBukva(char vleznaBukva){
		if(vleznaBukva < 'A' || vleznaBukva > 'Z'){
			return '?';
		}
		if(vleznaBukva == 'Z'){
			vleznaBukva = 'A';
		}else{
			vleznaBukva++;
		}
		return vleznaBukva;
	}
	//good one
//	public static char zemiBukva(char vleznaBukva){
//		if(vleznaBukva == 'Z'){
//			return 'A';
//		}
//		vleznaBukva++;
//		return vleznaBukva;
//	}
}
