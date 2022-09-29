package com.syntax.class7HW;

public class TaskDoWhile {

	public static void main(String[] args) {
		//from the range of 1 to 50 please find the sum of all even and all odd numbs 
		int sumOdd=0;
		int sumeven=0;
		
		for(int i=1; i<=50; i++){
			if(i%2==0) {
				sumeven+=i;
			}else {
				sumOdd+=i;
				
			}
			
		}
		System.out.println("SUM OF ODD NUMBERS "+sumOdd);
		System.out.println("SUM OF EVEN NUMBERS "+sumeven);

	}

}
