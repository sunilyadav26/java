/*Question-- wap  to print any number table 
 @author- Sunil Yadav
 * @date-07 oct 2022

  
 */
package CoreJava;
import java.util.Scanner;

public class TableCheck {

	public static void main(String[] args) {
		
       Scanner s=new Scanner(System.in);
       System.out.println("enter any number");
       int a=s.nextInt();
       //using for loop
       for(int i=1;i<=10;i++) {
    	   System.out.println(i*a);
       }
       }
     }
