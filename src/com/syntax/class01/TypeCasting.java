package com.syntax.class01;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte box1=127;//smallest box
		//short box2=3333;// slighty larger box than byte
		//int box3 = 454545;// larger box than short
		//long box3=4545454565;//larger box than int
		//float box4= 45454545;// larger box than long with decimals
		//double box5=4545454545;//largest
		//int number=15.2;// error cux i am putting double vale in int
		//type casting converts one data type to another.
		//here we put 15.2 in int and giving us error
		// if we convert larger box into smaller java will complain and we will manually do it
		
		int number1 = (int)15.2;
		System.out.println(number1);
		//char
		char a=(char)65;//ascii table it tells you about the conversion like if you store A it stores as 65	
		System.out.println(a);
		
		
		
		
				

	}

}
