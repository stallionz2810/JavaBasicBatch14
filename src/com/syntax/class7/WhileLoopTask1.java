package com.syntax.class7;

public class WhileLoopTask1 {

	public static void main(String[] args) {
		//print numbers from 1 to 100 in 1 line with space
		int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
			
		}
		System.out.println("-------------");
		//print numbers from 100 to 1
		int num1=100;
		while(num1>=1) {
			System.out.print(num1+" ");
			num1--;
			
		}
		System.out.println("-------------");
		//print even numbers from 20 to 100
		int num2=20;
		while(num2<=100) {
		num2+=2;
				System.out.print(num2+" ");
			}
		System.out.println("-------------");
		//even numbers second method
		int num3=20;
		while(num3<=100) {
			if(num3%2==0) {
				System.out.print(num3+" ");
			}
			num3++;
		}
		System.out.println("-------------");
		//print only odd numbers from 100 to 1
		int num4=99;
		while(num4>=1) {
			if(num4%3==0) {
				System.out.print(num4+" ");
			}
			num4--;
		}
		
			
		}

	}


