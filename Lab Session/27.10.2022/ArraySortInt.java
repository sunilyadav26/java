/* Q-- Wap to sort int array in Ascending order 
  @author-- Sunil Yadav
 Date-- 27 Oct 2022 
 */
package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortInt {

	   public static void main(String[] args) {
		
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
