package com.syntax.class7HW;

import java.util.Scanner;

public class HWCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=3.45;
		double user;
		Scanner scanner=new Scanner(System.in);
		
		
		do {
			System.out.println("Please pay for the coffee");
			user=scanner.nextDouble();
			if(user>price) {
				System.out.println("Please give lesser price");
					
			}
			else if(user<price) {
				System.out.println("Please give more price");
				
			}
			
			
			
			
		}
		while(user!=price);
		System.out.println("Enjoy your coffee");

	}

}
