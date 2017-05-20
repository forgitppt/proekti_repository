package org.gitvezba;

import java.util.Arrays;
import java.util.Random;

public class Broevi_random {

	public static void main(String[] args) {
		
			
			int temp;
			int[] numbers = new int[8];

			for (int i = 0; i < numbers.length; i++) {
				Random rand = new Random();
				numbers[i] = rand.nextInt(100) + 1;
				System.out.println("Numbers Generated: " + numbers[i]);
			}
			Arrays.sort(numbers); 

		    for (int i = 0; i < numbers.length; i++) {
		       System.out.print(numbers[i] + " ");
		}
	}
	}


