/* Q-- Wap to print Happy Diwali using loop
  @author-- Sunil Yadav
 Date-- 27 Oct 2022 
 */
package CoreJava;

import java.util.Scanner;

public class UsingloopHdwli {

	public static void main(String[] args) {
		
		// Creating Scanner class object
		Scanner sc =new Scanner(System.in);
		System.out.println("enter how manny times prt happy diwali");
		int a=sc.nextInt();
		
		//using for loop
		for(int i=0;i<a;i++) {
			System.out.println("happy Diwali");
		}
	}

}
