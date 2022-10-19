package CoreJava;
import java.util.Scanner;

public class ArraySc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array");
        int a=sc.nextInt();
        //
        int arr[]=new int[a];
        System.out.println("enter the element");
        
        //traversing the array
        for(int i=0;i<a;i++) {
        	arr[i]=sc.nextInt();
        	 }
        int sum=0;
        //traversing the array to find sum
        for(int i=0;i<a;i++) {
        	sum=sum+arr[i];
        	}
        System.out.println("the sum is : " +sum);
	}
}
