package Corejava;

public class TestEncapsulation {

	public static void main(String[] args) {
    //creating object of class Encapsulation 
		EncapsulationDemo e=new EncapsulationDemo();
		
		e.setRoll(191013243);
		e.setName("sunilyadav");
		e.setAge(20);
		
		System.out.println("roll :"+e.getRoll());
		System.out.println("name :"+e.getName());
		System.out.println("age :"+e.getAge());
	
	}

}
