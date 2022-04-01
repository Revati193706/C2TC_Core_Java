package Core_Java_Training;

import org.junit.jupiter.api.*;

public class TDD_Demo {

	@Disabled //Annotation..Metadata...Data about project..Project is data
	public void sum() 
	{
		int a=10;
		int b=20;
		
		int result=a+b;
		System.out.println(result);
	}
	
	@Test
	void display()
	{
		System.out.println("Inside Test Driven Developement");
	}
	
	public static void main(String[] args) {

	
	}

}
