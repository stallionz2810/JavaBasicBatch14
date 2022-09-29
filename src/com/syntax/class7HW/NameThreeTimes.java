package com.syntax.class7HW;

import java.util.Scanner;

public class NameThreeTimes {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name");
		String name=scanner.next();
		
		for(int a=1; a<=3; a++) {
			System.out.println("Good morning "+name);
			
		}
		

	}

}
