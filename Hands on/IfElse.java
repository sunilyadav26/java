/*program: the person applicabe to give vote or not
 @author: Sunil  yadav
 @date: 3 oct2022
  */
package Corejava;
import java.util.Scanner;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// Creating Scanner class object
		 Scanner sc=new Scanner(System.in);
		 //taking user input
		System.out.println("enter your  age :");
		int Age=sc.nextInt();
		//using if else Statement
		if(Age>18) {
       System.out.println("you are applicable to give vote");
	}
		else {
			System.out.println("you are not applicable to give vote");
		}
}
}