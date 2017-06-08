package com;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("main 2");
		int goleminaNaNiza = 5;
		
	boolean[] nizaNagoreNadolu = new boolean[goleminaNaNiza];
	System.out.println(nizaNagoreNadolu);
	
	
	
	
	
	
	
	
	
//		for (int i = 0; i < nizaNagoreNadolu.length; i++) {
//			nizaNagoreNadolu[i] = true;
//		}
//		
//		int[] niza = inicijalizirajNizaSoGolemina(goleminaNaNiza);// 15
//
//		isprintajNiza(niza);
//		
//		//
//		for (int i = 0; i < 100; i++) {
//			
//			for (int j = 0; j < niza.length; j++) {
//				if(niza[j] == 9){
//					nizaNagoreNadolu[j] = false;
//				}
//				if(niza[j] == 0){
//					nizaNagoreNadolu[j] = true;
//				}
//			}
//			//izmenime
//			for (int j = 0; j < niza.length; j++) {
//				if(nizaNagoreNadolu[j] == true){
//					niza[j] +=1;
//				}else{
//					niza[j] -=1;
//				}
//			}
//			
//			isprintajNiza(niza);
//		}
//		
	}

	public static int[] inicijalizirajNizaSoGolemina(int dolzinaNaNizata) {
		int[] lokalnaNiza = new int[dolzinaNaNizata];
		Random random = new Random();
		for (int i = 0; i < lokalnaNiza.length; i++) {
			lokalnaNiza[i] = random.nextInt(10);
		}
		return lokalnaNiza;
	}
	
	public static void isprintajNiza(int[] niza){
		for (int i = 0; i < niza.length; i++) {
			System.out.print(niza[i]+" ");
		}
		System.out.println();
	}
}
