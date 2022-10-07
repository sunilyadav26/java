/*Question-- wap to print Reverse Pyramid
 * @author- Sunil Yadav
 * @date-07 oct 2022
  
 */
package CoreJava;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		//create object of Scanner class 
		Scanner sc=new Scanner(System.in);
		//taking input from user
		 System.out.println( "enter any number :");
		 int a=sc.nextInt();
		 int s=0;
		 //using for loop
		 for(int i=a;i>0;i--) {
			 //inner loop for printing
			 for(int j=0;j<i;j++) {
				 System.out.print("$" );
				 //for next line
			 }System.out.println("");
			 s+=1;
			 //for use for Space
			 for(int m=0;m<s;m++) {
				 System.out.print(" ");
			 }
			 i--;
			 
			 }
		 }

}
