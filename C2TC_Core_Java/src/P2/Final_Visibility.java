package p2;

import p1.Final;

public class Final_Visibility {

	void get()
	{
		
		Final obj4=new Final();
		obj4.display(); //Default Method Accessible within the class
		
		
	}
	
}

class si extends Final_Visibility

{
	public static void main(String[] args) {

		Final obj4=new Final();
		obj4.display(); //Default Method Accessible within the class
		
	}

}

