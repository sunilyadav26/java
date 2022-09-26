package CoreJava;

 class Tesla extends Car_   {
	 //create method
	 void drive() {
		 System.out.println("drive safely");
	 }
	 public static void main(String[]args) {
		 //create object
		 Tesla t=new Tesla();
		 t.drive();         //calling method
		 t.gearchange();
		 
	 }

}
