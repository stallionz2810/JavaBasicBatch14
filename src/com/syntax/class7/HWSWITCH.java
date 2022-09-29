package com.syntax.class7;

import java.util.Scanner;

public class HWSWITCH {

	public static void main(String[] args) {
		
		/*Ask user to enter their country and capture it
		 * once valuse are capture
		 * print which language user speaks
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell where are you from ");
		String country=in.next();
		String favoriteFood;
		
		
		switch(country.toLowerCase()) {
		case "USA":
			favoriteFood="burgers and fries";
			break;
		case "Kazakistan":
			favoriteFood="beshparmak";
			break;
		case "Turkey":
			favoriteFood="adana kebab";
			break;
		case "Venezuala":
			favoriteFood="arepa";
			break;
		case "India":
			favoriteFood="chicken curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Afghanistan":
			favoriteFood="pulao";
			break;
		
		default:
			favoriteFood="Unknown";
			break;
		
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
	

	}

}
