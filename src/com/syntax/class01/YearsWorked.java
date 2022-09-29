package com.syntax.class01;

import java.util.Scanner;

public class YearsWorked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many years did you work");
		int yearsWorked=scanner.nextInt();
		if(yearsWorked>=5) {
			System.out.println("You are eligible for bonus");
			System.out.println("How much is your salary");
			int Salary=scanner.nextInt();
			
	
		if(Salary>50000){
			System.out.println("You are eligible for 5000 bonus");
		}
		else {
			System.out.println("You are eligible for 3000 bonus ");
		}
			
			
		}
		else {
			System.out.println("Not eligible for bonus");
		}
		

	}

}
