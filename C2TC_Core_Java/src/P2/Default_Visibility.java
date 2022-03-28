package p2;

import p1.Default;
import p1.Private;

public class Default_Visibility {

	void get()
	{
		
	Default obj2=new Default();
		// obj2.display(); // Default members are not accessible from outside package non-child class
		
	}
	
}

class s extends Default_Visibility

{
	public static void main(String[] args) {

		Default obj2=new Default();
		// obj2.display(); // Default members are not accessible from outside package child class
		
	}

}
