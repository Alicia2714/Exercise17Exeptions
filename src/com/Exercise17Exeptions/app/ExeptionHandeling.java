package com.Exercise17Exeptions.app;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExeptionHandeling {

	public static void main(String[] args) {
		int[] numbers= new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		try {
			System.out.println("Introduce the numbers from 1 to 10: ");
			numbers[i] = input.nextInt();
					
		}catch(InputMismatchException e) {
			System.out.println("Hey the number you input is wrong.");
			i--;
		}
		catch(NumberFormatException e) {
			System.out.println("Hey you have to introduce int numbers only");
			i--;
		}
		finally {
			input.next();
		}
	    }
		
		try {
			System.out.println("The element in the first position is: "+numbers[0]);
			System.out.println("The element in the second position is: "+numbers[1]);
			System.out.println("The element in the third position is: "+numbers[2]);
			System.out.println("The element in the fourth position is: "+numbers[3]);
			System.out.println("The element in the fifth position is: "+numbers[4]);
			System.out.println("The element in the sixth position is: "+numbers[5]);
			System.out.println("The element in the seventh position is: "+numbers[6]);
			System.out.println("The element in the eighth position is: "+numbers[7]);
			System.out.println("The element in the nineth position is: "+numbers[8]);
			System.out.println("The element in the tenth position is: "+numbers[9]);
			System.out.println("The element in the eventh position is: "+numbers[10]);
			System.out.println("The element in the twelveth position is: "+numbers[11]);
			System.out.println("The element in the first position is: "+numbers[1]);
			System.out.println("The element in the second position is: "+numbers[2]);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hey, be careful, you are not directing to a valid index");
		}
		finally {
			System.out.println("This finally statement will be executed");
		}		
		
	}

}
