package com.syntax.class01;

import java.util.Scanner;

public class andOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=scanner.next();
		String season=null;
		if (month.equals("December")|| month.equals("January") || month.equals("February")) {
			season="Winter";
			
		}else if(month.equals("March")|| month.equals("April") || month.equals("May")) {
			season="Spring";
			
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("September")|| month.equals("October") || month.equals("November")) {
			season="Fall";
		}
		System.out.println("You were born in "+season);
		

	}

}
