package com.syntax.class7;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
			Please complete this assignment in 2 ways: 
			using if statement and switch case.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1=scanner.nextInt();
		
		System.out.println("Enter 2nd Number");
		double num2=scanner.nextInt();
		
		System.out.println("Enter the operator");
		char op=scanner.next().charAt(0);
		
		double result=0;
		
		if(op=='+') {
			result=num1+num2;
		}else if(op== '-') {
			result=num1-num2;
		}else if(op== '*') {
			result=num1*num2;
		}else if(op=='/') {
			result=num1/num2;
		}else {
			System.out.println("Enter valid operator");
		}
		System.out.println(result);
		
		
		
		

	}

}
