package com.syntax.class7;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String answer;
		do {
			System.out.println("Did you get a job");
			answer=scanner.next();
			
			
		}while(!answer.equals("yes"));
		System.out.println("Congrats");
		
		
		
		
			
	}

}
