package com.syntax.class7;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1=scanner.nextInt();
		
		System.out.println("Enter 2nd Number");
		double num2=scanner.nextInt();
		
		System.out.println("Enter the operator");
		char op=scanner.next().charAt(0);
		
		double result=0;
		
		switch(op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			
		
		}
		System.out.println(result);
	}

}
