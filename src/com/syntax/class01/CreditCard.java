package com.syntax.class01;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card True or False");
		boolean haveCreditCard=scanner.nextBoolean();
		if(haveCreditCard) 
		{
			System.out.println("What is the balance on the card");
			int balanceOnCard=scanner.nextInt();
			if(balanceOnCard>1000) 
			{
				System.out.println("Pay it off ASAP");
			}
			else {
				System.out.println("You can spend more");
			}
			
			
			
		}
		else {
			System.out.println("Get a credit card");		
		}

	}
}


