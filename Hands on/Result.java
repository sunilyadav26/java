/*program: using if else Statement of % subject the person who get above 60% will be passed other  
 failed
 @author: Sunil  yadav
 @date: 3 oct2022
  
  
  
  
 
 */


package Corejava;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		
		int Hindi,English,Mathematics,Physics,Chemistry;
	
		//creating  Scanner class 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        
      // taking input from user  
		System.out.println("enter hindi mark :");
        Hindi=sc.nextInt();
      
      
        System.out.println("enter English mark :");
        English=sc.nextInt();
        
        
        System.out.println("enter Mathematics mark :");
        Mathematics =sc.nextInt();
        
        
        System.out.println("enter Physics mark :");
       Physics=sc.nextInt();
        
        System.out.println("enter Chemistry mark :");
        Chemistry=sc.nextInt();
        
        //total of all subject marks
        int Sum= Hindi+English+Mathematics+Physics+Chemistry;
        
        // calculating percentage 
        float per= Sum/5;
        System.out.println("percentage :" +per);
        
        // using if else statement
        
        if(per>60) {
        	System.out.println("you are passed");
        	
        }
        else {
        	System.out.println("sorry, you are failed");
        }
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
