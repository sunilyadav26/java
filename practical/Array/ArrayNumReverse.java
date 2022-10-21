package CoreJava;

import java.util.Scanner;

public class ArrayNumReverse {

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
	for(int j=a;j>0;j--) {
		System.out.println(arr[j-1]);
	}
		
	}

}
