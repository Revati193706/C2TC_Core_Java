package p1;

 public class Default {

 void display() {
	 
		System.out.println("TNS sessions");
		
	}
	
	class B 
	
	{
	
		void CallMe()
		{
			
		Default obj2=new Default();
		obj2.display(); //Default Method Accessible within the class
		
		}
		
	}
	
 }
 
 class L {
	 
	 public static void main(String args[])
	 
	 {
		 
		 Default obj2=new Default();
			obj2.display(); // Default Method Accessible within the non-child class
		 
	 }
 }
 
 class O extends Default
 
 {
	 
	 void data() 
	 
	 {
	
		 Default obj2=new Default();
			obj2.display(); //Default Method Accessible within the non-child class
			
	 }
 }