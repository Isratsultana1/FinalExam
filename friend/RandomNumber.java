package friend;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		
		
		 try (Scanner input = new Scanner(System.in)) {
		   Random rand = new Random();
//			 java.util.Random rand = new java.util.Random();
			 int[] array = new int[500];
			 for (int i = 0; i<500; i++) {
			 array[i] =rand.nextInt(99999);    
			
			 }

			 Arrays.sort(array);
			 String randomnumber=Arrays.toString(array);
			 //convert Array into String and store it in a variable

			 System.out.println(randomnumber);
			 System.out.println("Random number count: " + array.length );
			 System.out.print("Enter the value of n to find the nth smallest number: ");
			 int n = input.nextInt();
			 System.out.println("The " + n + "th smallest number is: " + array[n - 1]);
			 }
	
   
	

	
	
	
	}


}