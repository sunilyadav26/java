package CoreJava;

   interface Shape {

	
   void getArea(int length, int breath);
	}

  class Rectengle implements Shape{
	  //Implementation of Abstract Method of interface shape
	  
	public  void getArea(int length, int breath) {
System.out.println("the area of rectemgle is :" +(length*breath));
	}
}
