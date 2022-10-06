package CoreJava;

import java.util.Scanner;

     class FindRevNum {

	public static void main(String[] args) {
		int rev=0;
		 Scanner sc =new Scanner(System.in);
		 
		 // taking input from user
		 System.out.println("Enter the number :");
         int num=sc.nextInt();
       //using if else Statement And while loop
         if(num>0) {
        	 while(num!=0) {
        		 int remi=num%10;
        		 rev=rev*10+ remi;
        		 num/=10;
        	 }
         }
         else {
        	 System.out.println("enter valid number");
         }
         System.out.println("the reverse is :" +rev);
	}

}
