package com.syntax.class01;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		/*we need to ask a user where is he from 
		 * based on the country -->define favorite food
		 * 
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell where are you from ");
		String country=in.next();
		String favoriteFood;
		
		
		switch(country) {
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
