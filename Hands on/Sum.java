package CoreJava;

 class Sum{
	 //method
	public int sum(int x ,int y) {
	return (x+y);
	}
	  //method
		public int sum(int x , int y ,int z) {
			return (x+y+z);
		}
		//method
			
			public Double sum(Double x , Double y) {
			   
			   return (x+y);
			   
			}
			public static void main(String [] args) {
				// creating object 
				Sum obj1=new Sum();
				//calling method overloading
			   System.out.println(obj1.sum(5,6));
			   System.out.println(obj1.sum(2,3,4));
			   System.out.println(obj1.sum(55.5,6.6));
			   
			}
			
		
	}


