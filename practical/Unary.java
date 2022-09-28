package Corejava;

import java.util.Scanner;
public class Unary {

	public static void main(String[] args) {
		//creating Scanner class
	   Scanner sc=new Scanner(System.in);
	 //getting input value from user
	 		System.out.println("enter first value");
	 		int num1=sc.nextInt();
	 		//performing unary operator
				num1=-num1;
	           System.out.println("result is : "+num1);
	//performing pre increment
	++num1;
	System.out.println("pre increment :" +num1);
	
	--num1;
	System.out.println("pre decrement :" +num1);
	
	num1++;
	System.out.println("post increment :" +num1);
	
	num1--;
	System.out.println("post decrement :" +num1);
	
	
	
	
	
	
	}

}
