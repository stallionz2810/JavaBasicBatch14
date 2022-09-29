package com.syntax.class7;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		//print all numbers from 1 to 10
		int num=1;
		
		while(num<=10) {
			System.out.print(num+" ");
			num++;
			
		}
		System.out.println("---------------");
		// print all the numbers from 10 to 25
		
		int num1=10;
		
		while(num1<=25) {
			
			System.out.print(num1+" ");
			num1++;
			
		}
		System.out.println("---------------");
		// print all numbers from 10 to 1
		
		int num2=10;
		while(num2>=1) {
			System.out.print(num2+" ");
			num2--;
			
		}
		System.out.println("---------------");
		
		//print all numbers from 50 to 20
		// print all even numbers from 1 to 20
		int num3=50;
		while(num3>20) {
			System.out.print(num3+" ");
			num3--;
		}
		System.out.println("---------------");
		int num4=2;
		while(num4<=20) {
			System.out.print(num4+" ");
			num4 +=2;
			
		
		}
		System.out.println("---------------");
		// second method of even
		int num5=1;
		while(num5<=20) {
			if(num5 %2==0) {
				System.out.print(num5+" ");
			}
			num5++;
		}
		System.out.println("I am inside the while loop");

		
			
			
		
		
		
		
		
		

	}

}

