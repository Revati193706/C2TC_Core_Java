package Core_Java_Training;

interface a

{
	
	void Display_a(); //Abstract Method no having body // body deceleration in child class using implements keyword
	
}

interface b // create a interface ..... (Service Requirement Specification/API)

{
	
	void Display_b();
	
}

class Interface_impl implements a,b //This is how we support multiple inheritance.//This is class is used to implement abstract method
{
	public void Display_a() 
	
	{
		
		System.out.println(" i am in interface A .......");
		
	}
	
	public void Display_b() 
	
	{
		
		System.out.println(" i am in interface B .......");
		
	}
	
}

public class Interface_demo {

	public static void main(String[] args) {

		Interface_impl i=new Interface_impl();
		
		i.Display_a(); 
		
		i.Display_b(); 
	}
	
}
