package CoreJava;

 class TemporaryEmp extends Employee {
	 Double hike=0.35;
	 public static void main(String args[]) {
		 PermanentEmp obj1= new PermanentEmp();
		 System.out.println(obj1.str);
		 TemporaryEmp obj2=new TemporaryEmp();
		 System.out.println(obj2.salary);
		 System.out.println(obj2.hike);
	 }
	

}
