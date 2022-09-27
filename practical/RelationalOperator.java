package Corejava;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
		//creating scanner class to take input from the user
		Scanner sc=new Scanner(System.in);
		
        //getting input value from the user 
         System.out.println("enter the first number: ");
         int num1=sc.nextInt();
		
	     System.out.println("enter the second number: ");
		int num2=sc.nextInt();
    
		//performing equal to operation
	    System.out.println("num1==num2 :" +(num1==num2));
	    
         //performing not equal to operation
	    System.out.println("num1!=num2 :" +(num1!=num2));
	    
        //performing greater than  operation
	    System.out.println("num1>num2 :" +(num1>num2));
	    
        //performing less than operation
	    System.out.println("num1<num2 :" +(num1<num2));
	    
         //performing greater than or not to operation
	    System.out.println("num1>=num2 :" +(num1>=num2));
	    
	    //performing less than or not to operation
	    System.out.println("num1<=num2 :" +(num1<=num2));


	}

}
