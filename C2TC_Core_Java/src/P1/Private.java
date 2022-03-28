package p1;

 public class Private {

	private void display() {
		System.out.println("TNS sessions");
		
	}
	
	class B 
	
	{
	
		void CallMe()
		{
			
		Private obj=new Private();
		obj.display(); //Private Method Accessible within the class
		
		}
		
	}
	
 }
 
 class c {
	 
	 public static void main(String args[])
	 
	 {
		 
		 Private a= new Private();
	//	 a.display(); //Not Accessible from the Non-child class of same package
		 
	 }
 }
 
 class D extends Private
 
 {
	 
	 void data() 
	 
	 {
		 Private a= new Private();
//		 a.display(); //Not Accessible from the child class of same package
	 }
 }