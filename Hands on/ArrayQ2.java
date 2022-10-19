/* Q-- print only even number
 @author- Sunil Yadav
 date --19 oct 2022
 
 */
package CoreJava;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
	        System.out.println("enter size of array");
	        
	        //declaring size of array by user
	        int a=sc.nextInt();
	        int arr[]=new int[a];
	        
	      //taking element from user
	        System.out.println("enter the element");
	         for(int i=0;i<a;i++) {
	        	arr[i]=sc.nextInt();}
	         
	           System.out.println("the even number is : ");
	           for(int i=0;i<a;i++) {
	        	
	        	//using condition if to even number
	        	if(arr[i]%2==0)
	        
	        	System.out.println(+arr[i]);
	        }
	        	

	}

}
