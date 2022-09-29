package com.syntax.class01;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve repl assignment please enter true or false");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if(solvedAnyRepls) {
			System.out.println("How many Repls you solved");
			int noOfReplsSolved=scanner.nextInt();
			if(noOfReplsSolved>17) {
				System.out.println(" You are doing great");
				
			}else if(noOfReplsSolved>10) {
				
			}
			else {
				System.out.println("You should solve some more repls");
			}
			
			
			


			
		}
		else 
		{
			System.out.println("They are very imp please solve them");
		}
		

	}

}
