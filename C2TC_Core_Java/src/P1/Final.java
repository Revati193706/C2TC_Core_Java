package p1;

 public class Final {

 final void display() {
	 
		System.out.println("TNS sessions");
		
	}
	
	class B 
	
	{
	
		void CallMe()
		{
			
		Final obj4=new Final();
		obj4.display(); //Default Method Accessible within the class
		
		}
		
	}
	
 }
 
 class Li {
	 
	 public static void main(String args[])
	 
	 {
		 
			Final obj4=new Final();
			obj4.display(); //Default Method Accessible within the class
			
	 }
 }
 
 class Oi extends Final
 
 {
	 
	 void data() 
	 
	 {
	
			Final obj4=new Final();
			obj4.display(); //Default Method Accessible within the class
			
	 }
 }