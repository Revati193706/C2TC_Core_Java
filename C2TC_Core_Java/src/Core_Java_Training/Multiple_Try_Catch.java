package Core_Java_Training;

public class Multiple_Try_Catch {

	public static void main(String[] args) {
	
		try
		{
			int a[]=new int[5];
			
			a[5]=30/0; //if this is condition then catch block 1 will be executed
			
			int i=a[6];//if this is condition then catch block 2 will be executed
//At a time only one error can be handled
			
			// if it is not having handling code it will show immediate catch block
		}
		
catch(ArithmeticException e)
		{
	System.out.println("task 1 completed");
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
	System.out.println("task 2 completed");
		}
		
		catch(Exception e)
		{
	System.out.println("comman task completed");
		}
		
	System.out.println("Rest of Code");
	
	}

}
