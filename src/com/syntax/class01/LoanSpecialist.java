package com.syntax.class01;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("How much loan do you need");
		int amount=scanner.nextInt();
		if(amount>=200000) {
			System.out.println("Your loan is approved");
		}
		else {
			System.out.println("Your loan is not approved");
			
		}
		

	}

}
