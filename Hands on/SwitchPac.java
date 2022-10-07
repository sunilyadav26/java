/*Question-- wap  using switch case
 * @author- Sunil Yadav
 * @date-07 oct 2022
  
 */
package CoreJava;

import java.util.Scanner;

public class SwitchPac {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 //taking input from user
		 System.out.println( "enter any number : 123");
		 int a=sc.nextInt();
		 
		 //using switch case
		 switch(a) {
		 case 1:
			 System.out.println("Jai Shree Krisna");
		      break;
		 case 2:
			 System.out.println("jai shree Ram");
		      break;
		 case 3:
			 System.out.println("Har Har Mahadev");
	          break;
		 default:
			 System.out.println("plese enter valid number for see Switch case work ");
		 }

	}

}
