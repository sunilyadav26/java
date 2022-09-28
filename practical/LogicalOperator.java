package Corejava; 
 
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
        //creating Scanner class
		Scanner sc=new Scanner(System.in);
		
		//getting input value from user
		System.out.println("enter first value");
     int num1=sc.nextInt();
     
     System.out.println("enter second value");
     int num2=sc.nextInt();
     
     System.out.println("enter third value");
     int num3=sc.nextInt();
     
     System.out.println("performing AND Operator");
     
     //using logical AND to verify two constraints
     if((num1>num2) && (num2==num3))
     {
    	 int sum=num1+num2+num3;
    	 System.out.println("the sum is :"+sum);
    	 
     }
     else {
    	 System.out.println("false condition");
     }
       System.out.println("---------------");
     
     System.out.println("performing OR Operator");
     
     //using logical OR  to verify two constraints
     if((num1>num2) || (num1==num3))
     {
    	 int sum=num1+num2+num3;
    	 System.out.println("the sum is :" +sum);
    	 
	}
     else {
    	 System.out.println("false condition");
    	 
     }
     System.out.println("---------------");
     System.out.println("performing NOT Operator");
     
     //performing NOT Operator
     System.out.println("!(num1<num2)=" + !(num1<num2) ) ;
     System.out.println("!(num2<num3)=" + !(num2<num3) ) ;
     
}
}
