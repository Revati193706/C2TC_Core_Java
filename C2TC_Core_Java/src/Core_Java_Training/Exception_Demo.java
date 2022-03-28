package Core_Java_Training;

public class Exception_Demo {

 static void m1()
	{
		m2();
	}
	
static void m2()
	{
		System.out.println(2/0);
	}
	
	public static void main(String[] args) {
	
	 m1(); // This is inbuilt Arithmatic exception which handled by default exception handler

		
	 int[] i=new int[4]; 
	
		System.out.println(i[4]);  // This is inbuilt Array out of bounds exception which handled by default exception handler

	}
	
}
