package com.syntax.class08;

public class NestedLoopsExamples {

	public static void main(String[] args) {
		//car odometer
		for(int a=0; a<9; a++) {
			for(int b=0; b<9; b++) {
				for(int c=0; c<9; c++) {
					System.out.println(a+" "+b+" "+c);
				}
			}
			
		}
		//multiplication table
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				
			}
			System.out.println("-----------------");
		}
			
		

	}

}