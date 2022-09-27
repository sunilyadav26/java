package CoreJava;

import java.util.Scanner;
public class Arithmetic {


	public static void main(String[] args) {
     // creating scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		//getting input value from user
		System.out.println("enter first number ");
		int num1=sc.nextInt();
		System.out.println("enter second number ");
		int num2=sc.nextInt();
		System.out.println("enter third number ");
		int num3=sc.nextInt();
		  //writing operation
		int add,sub,mul,div,mod;
		add=num1+num2+num3;
		sub=num1-num2-num3;
		mul=num1*num2*num3;
		div=num1/num2/num3;
		mod=num1%num2%num3;
		//getting result
		System.out.println("Addition is:"+add);
		System.out.println("Substrction is:"+sub);
		System.out.println("Multiplication is:"+mul);
		System.out.println("divion is:"+div);
		System.out.println("module is:"+mod);
		
	}
}


