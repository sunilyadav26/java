/*Question-- wap  to demonstrate while loop coninues Until entered 
 * number is positive
 *  @author- Sunil Yadav
 * @date-07 oct 2022

  */
package CoreJava;

import java.util.Scanner;

public class WhilePac {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 //taking input from user
		 System.out.println( "enter a number  ");
		 int a=sc.nextInt();
		 
		 //Using While loop
		 while(a>=0) {
			 System.out.println("Jai Shree Krisna ");
		 a--;
		 }
	}

}
