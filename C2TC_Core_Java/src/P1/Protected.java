package p1;

 public class Protected {

	protected void display() {
		
		System.out.println("TNS sessions");
		
	}
	
	class B 
	
	{
	
		void CallMe()
		{
			
		Protected obj3=new Protected();
		obj3.display(); //Protected Method Accessible within the class
		
		}
		
	}
	
 }
 
 class j {
	 
	 public static void main(String args[])
	 
	 {
		 
			Protected obj3=new Protected();
	 obj3.display(); //Accessible from the Non-child class of same package
		 
	 }
 }
 
 class k extends Protected
 
 {
	 
 void data() 
	 
	 {
			Protected obj3=new Protected();
		 obj3.display(); // Accessible from the child class of same package
	 }
 }