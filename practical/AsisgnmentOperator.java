package Corejava;
 
import java.util.Scanner;

  class AsisgnmentOperator {

	public static void main(String[] args) {
		//creating Scanner class
		Scanner sc=new Scanner(System.in);
		
		//getting input value from user
		System.out.println("enter first value");
		int num1=sc.nextInt();
		
		System.out.println("enter second value");
		int num2=sc.nextInt();
		System.out.println("------addition------");
       
		num1 += num2;
		System.out.println("num1="+num1);
		
		System.out.println("-----substraction------");
		//Substracting and assigning value
		num2-=num1;
		System.out.println("num2="+num2);
		
		System.out.println("-------multiply-----");
		//Multiplying and assigning
		num2*=num1;
		System.out.println("num2="+num2);
		
		System.out.println("-------dividing-----");
		//dividing and assigning value
		num2/=num1;
		System.out.println("num2="+num2);
		
		
		System.out.println("-------module-----");
		//module and assigning value
		
		num2/=num1;
		System.out.println("num2="+num2);
       
	}

}
