package CoreJava;

public class Array {

	public static void main(String[] args) {
		//declaring and instantiating the array
		int a[]=new int[3];
  //initialization
		a[0]=2;
		a[1]=5;
		a[2]=6;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
