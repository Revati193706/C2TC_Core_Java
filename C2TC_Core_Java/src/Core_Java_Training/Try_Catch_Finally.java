package Core_Java_Training;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		System.out.println("M11 Batch is very good");
		
		 int [] arr=new int[4]; 
		 
/* try 
{
	int i= arr[4]; // Index 4 out of bounds for length 4 exception message will be printed due to inbuilt exception classes

}

catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println(a);// Exception object will be printed

}

finally { 
System.out.println("Safe"); //Whether exception handled or not it will print finally block 
System.out.println("Out OF Exception");
}*/

		/* try 
		 {
		 	int i= arr[4]; // Index 4 out of bounds for length 4 exception message will be printed due to inbuilt exception classes

		 }

		 catch(ArrayIndexOutOfBoundsException a)
		 {
		 	System.out.println(a);//Exception object will be printed
		 }
		 
		 System.out.println("Out OF Exception");//this will be printed
	*/
	
		 /* try {
			 System.out.println(2/0);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("abcd");//abcd will be printed as compiler will take it as handling code*/
			/*System.out.println(e); 
		 }
		 System.out.println("Out OF Exception");*/  //java.lang.ArithmeticException: / by zero
		
	/* try 
	{
		System.out.println(2/0);
	}
	
finally
	{
	System.out.println("Safe"); //First finally will be printed if catch not there and then default handler will display exception object	
	}
	System.out.println("Out OF Exception"); */
	
	// try-finally ...finally and then exception
	//try-catch... Normal execution
	//try-catch-finally...Normal execution finally execute irrespective of exception status
	//try-catch-Normal code statement ..Sequentially gets executed
	// try-catch-finally used within method
	
	}
	
}
