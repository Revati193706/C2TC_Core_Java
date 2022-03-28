package p1;

 public class Public {

	public void display() {
		
		System.out.println("TNS sessions");
		
	}
	
	class B 
	
	{
	
		void CallMe()
		{
			
		Public obj1=new Public();
		obj1.display(); //Public Method Accessible within the class
		
		}
		
	}
	
 }
 
 class M {
	 
	 public static void main(String args[])
	 
	 {
		 
			Public obj1=new Public();
	 obj1.display(); //Accessible from the Non-child class of same package
		 
	 }
 }
 
 class N extends Public
 
 {
	 
	 void data() 
	 
	 {
			Public obj1=new Public();
		 obj1.display(); // Accessible from the child class of same package
		 
	 }
 }