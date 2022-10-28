package CoreJava;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) 
	{  Scanner sc= new Scanner (System.in);
	      System.out.println("enter the rows and columns");
	      //n indicates row
	      int n=sc.nextInt();
	      //m indicates column
	      int m=sc.nextInt();
	      //initialising array
	      int arr[][]= new int [n][m];
	      System.out.println("enter the array elements ");
	      // loop using for row
	      for(int i=0;i<n;i++) 
	      {  //loop using for column
	    	  for(int j=0;j<m;j++)
	    	  {
	    		  arr[i][j]=sc.nextInt();
	    	  }
	      }
	        // now displaying the array elements
	        System.out.println("array elements are:");
	         for(int i=0;i<n;i++)
	         {
	        	 for(int j=0;j<m;j++)
	        	 {
	        		 System.out.print( arr[i][j] + " ");
	        	 }
	        		 System.out.println();
	         }
	}
}