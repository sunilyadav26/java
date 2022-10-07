/*Question-- wap  to print reverse number
 @author- Sunil Yadav
 * @date-07 oct 2022
 
  
 */
package CoreJava;

import java.util.Scanner;

public class DoWhilePac {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println( "enter any number to reverse order");
		 int a=sc.nextInt();
		 System.out.println("|");
		 //using do while loop
		 do { 
			 System.out.println(a);
			 a--;
		 }while(a>0);
	}

}
