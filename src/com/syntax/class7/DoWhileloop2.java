package com.syntax.class7;

import java.util.Scanner;

public class DoWhileloop2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String answer;
		
		System.out.println("Did you get a job");
		answer=scanner.nextLine();
		
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job");
		}

	}

}
