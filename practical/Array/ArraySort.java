
package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		
		//taking  size of Array by User
        System.out.println("enter size of array");
        int a=sc.nextInt();
        
       //Declaring size of Array
        int arr[]=new int[a];
        
        //taking element from user
        System.out.println("enter the element");
        for(int i=0;i<a;i++) {
        	arr[i]=sc.nextInt();
        	 }
        Arrays.sort(arr);
        System.out.println("sort array is :");
        for(int i=0;i<a;i++) {
        	System.out.println(arr[i]);
        }
	}

}
