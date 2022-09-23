package CoreJava;

class Student extends Teacher{
	  public void listen(){
	  System.out.println("listing teacher");
	}
	
	  public static void main(String [] arg){
	   Student obj1= new Student();
	   obj1.teach();
	   obj1.listen();
	}
	}