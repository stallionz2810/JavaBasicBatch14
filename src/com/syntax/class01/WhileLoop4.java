package com.syntax.class01;

public class WhileLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
			
			
		}
		System.out.println("-------");
		//print even numbers from 20 to 100
		int c=20;
		while(c<=100) {
			System.out.print(c+" ");
			c+=2;
			
		}
		System.out.println("--------");
		int b=100;
		while(b>=1) {
			if(b%3==0)
			System.out.print(b+" ");
		}
		b++;
		
		

	}

}
