package com.syntax.class08;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		//from the range of 1 to 50
		//please find the sum of all even and all odd numbers
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("SUM OF ODD NUMBERS = "+sumOdd);
		System.out.println("SUM OF EVEN NUMBERS = "+sumEven);
		
		
		
		
		
		
		
		
		/*Create a secret number and let user guess the secret number
		 * once user guessed your secret number-->program says you won!
		 */
		Scanner scanner=new Scanner(System.in);
		int secret=1234;
		int guess;
		do {
			System.out.println("Please guess the secret number: ");
			guess=scanner.nextInt();
			
		}
		while(guess!=secret);
		System.out.println("You won");
				
		
		
		

	}

}
