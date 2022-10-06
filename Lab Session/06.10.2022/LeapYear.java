package CoreJava;
import java.util.Scanner;
  class LeapYear {

	public static void main(String[] args) {
		
       Scanner sc =new Scanner(System.in);
       //taking input from user
       System.out.println("enter the year to check leap year or not");
       int year=sc.nextInt();
       
       //using if else Statement
       if((year%400==0)||(year%4==0 && year%100!=0)){
    	   System.out.println("Leap year");
	}
       else {
    	   System.out.println("this not leap year");
       }

}
}