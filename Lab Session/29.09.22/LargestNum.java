/* program: find largest number of two number
  @author: Sunil Yadav
@date: 29 september 2022
*/

package Corejava;
import java.util.Scanner;

  class LargestNum {
	
	public static void main(String args[]) {
		int num1,num2;
		// creating Scanner class 
		Scanner sc=new Scanner(System.in);
		// taking input from user
		System.out.println("enter first number");
		num1=sc.nextInt();
		 
		System.out.println("enter second number");
		num2=sc.nextInt();
	// using if else statement 	
	if(num1>num2) {
		System.out.println("first number is Largest  :" +num1);
	}
	else {
			System.out.println("second number is Largest :" +num2);
			
		}
	}
	
	}


