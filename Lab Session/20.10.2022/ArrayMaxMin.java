/* Q--wap to  find Maximum And Minimum Number
 @Author-- Sunil Yadav
 @Date-- 20 Oct 2022
 */


package CoreJava;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
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
        
        // logic to find Maximum And Minimum Number
        int max=arr[0];
        for(int i=0;i<a;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
        		
        	}
        }	int min=arr[0];
        	for(int i=0;i<a;i++) {
        		if(min>arr[i]) {
        			min=arr[i];
        		}
        	}
        System.out.println("the maximum num:" +max);
        System.out.println("the maximum num:" +min);
	}

}
