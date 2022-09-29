package com.syntax.class01;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your mortgage rate");
		double rate =scanner.nextDouble();
		if(rate>4.5) {
			System.out.println("Will not buy a house");
		}
		else {
			System.out.println("What is the house price");
			int price=scanner.nextInt();
			if(price>200000) {
				System.out.println("Will take a loan");
			}
			else {
				System.out.println("Will pay cash");
			}
		}
		

	}

}
