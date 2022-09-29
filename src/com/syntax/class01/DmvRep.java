package com.syntax.class01;

import java.util.Scanner;

public class DmvRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your age");
		int age=scanner.nextInt();
		if(age>=18) {
			System.out.println("Licensed issued");
		}
		else {
			System.out.println("Get a learners permit");
		}

	}

}
