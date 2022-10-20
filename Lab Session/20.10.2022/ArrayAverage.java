/* Q--Write a Java program to calculate the average value 
   of array elements.
 @author-- Sunil Yadav
 @Date--20 oct 2022
 */
package CoreJava;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		int sum=0;
		
		 Scanner sc =new Scanner(System.in);
	        System.out.println("enter size of array");
	        int a=sc.nextInt();
	        
	        //declaring size of array by user
	        int arr[]=new int[a];
	        System.out.println("enter the element");
	        
	        //taking element from user
	        for(int i=0;i<a;i++) {
	        	arr[i]=sc.nextInt();
	        	 }
	        //using for loop for sum of all element
	        for(int i=0;i<a;i++) {
	        	sum=sum+arr[i];
	        }
	        //find Average of all element
	       float avg=sum/(float)a;
           System.out.println("the Average is :"+avg);
	}

}
