package p2;

import p1.Protected;

public class Protected_Visibility {

	void get()
	{
		
		Protected obj3=new Protected();
	//	obj3.display(); // There is another way to access this elements // accessible outside the package and in non child class
		
	}
	
}

 class P extends Protected_Visibility

{
	
	 public static void main(String args[])
	 
	 {
		 
			Protected obj3=new Protected();
		//	obj3.display(); //Protected members are not accessible from  outside  package child class
			
	 }
	 
}
