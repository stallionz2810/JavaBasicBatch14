package com.syntax.class01;

import java.util.Scanner;

public class InPutFromKeyboard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		System.out.println("Hi "+name+ " your "+age+" years old");
		

	}

}
