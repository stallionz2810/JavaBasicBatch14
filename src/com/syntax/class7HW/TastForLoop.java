package com.syntax.class7HW;

import java.util.Scanner;

public class TastForLoop {

	public static void main(String[] args) {
		//create a secret number and let user guess the secret number once the user
		//guessed your secret number --> Program says you won!
		
		Scanner scanner=new Scanner(System.in);
		int secret=8833;
		int guess;
		do {
			System.out.println("Please guess the secret number: ");
			guess=scanner.nextInt();
			
		}
		while(guess!=secret);
		System.out.println("You won");

	}

}
