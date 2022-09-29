package com.syntax.class01;

import java.util.Scanner;

public class InPutFromKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter you age");
		int age=scanner.nextInt();
		
		
		if(age<18) {
			System.out.println("You should study");
		}
		else {
			System.out.println("You should start working");
		}
		
			
		

	}

}
