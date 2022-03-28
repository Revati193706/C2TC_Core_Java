package p2;

import p1.Private;

public class Private_Visibility {

void get()

{
	
	Private obj=new Private();
//	obj.display(); // Private members are not accessible from outside package non-child class
	
}

}

class r extends Private_Visibility

{
	public static void main(String[] args) {
	
		Private obj=new Private();
//	obj.display(); // Private members are not accessible from outside package child class

	}

}
