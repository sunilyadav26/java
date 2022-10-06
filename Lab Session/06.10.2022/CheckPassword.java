/* Question4:WAP to check the condition for checking the correct 
      password 
 @Author- Sunil yadav
 @Date- 6 Oct 2022   */

 
package CoreJava;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
	

		//Creating a Scanner object to take input
		 Scanner sc =new Scanner(System.in);
		 
		 //taking input from user
		 System.out.println("Enter your name");
		 String name=sc.nextLine();
		 
		 System.out.println("Welcome "+name+" please enter your password to proceed");
		 int password=sc.nextInt();
	
		 //Checking password is correct or not
	if(password==12345678)
	{
	   System.out.println(" login");
	}
	else
	{
	     System.out.println("password incorrect ");
	  }

	}

}
