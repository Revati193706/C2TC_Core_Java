package p2;

import p1.Public;

public class Public_Visibility {

	void get()
	
	{
		
		Public obj1=new Public();
		obj1.display(); // Public members are accessible from outside package non-child class
		
	}
	
}

class q extends Public_Visibility

{
	
	 public static void main(String args[])
	 
	 {
		 
			Public obj1=new Public();
			obj1.display(); // Public members are accessible from outside package child class
			
	 }
	
}
