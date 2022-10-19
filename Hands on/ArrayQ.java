/* Q-- print only sum of odd number
 @author- Sunil Yadav
 date --19 oct 2022
 
 */
package CoreJava;

import java.util.Scanner;

public class ArrayQ {

	public static void main(String[] args) {
		// 
		int sum=0;
		 Scanner sc =new Scanner(System.in);
	        System.out.println("enter size of array");
	        //declaring size of array by user
	        int a=sc.nextInt();
	        int arr[]=new int[a];
	        System.out.println("enter the element");
	        for(int i=0;i<a;i++)
	        	
	        	 //taking element from user
	        	arr[i]=sc.nextInt();
	        for(int i=0;i<a;i++) {
	        	
	        	//using condition if to odd number
	        	if(arr[i]%2!=0)
	        sum=sum+arr[i];
	      
	        }System.out.println("the sum of odd number is :"+sum);
	        	 
	        
	}

}
