package com.syntax.class01;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your city name");
		String cityName=scanner.nextLine();
		System.out.println("Enter temperature");
		float temp=scanner.nextFloat();
		float celsius= (temp-32)*5/9;
		System.out.println("The temperature in the "+cityName+" is "+celsius);
		

	}

}
