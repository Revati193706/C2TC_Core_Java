package Core_Java_Training;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		System.out.println("M11 Batch is very good");
		
		 int [] arr=new int[4]; 
		
		 /*	try {
			 int i=arr[4]; 
				
				System.out.println("Inside Try Block");
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			
			System.out.println("abcd");	// Same will be printed
			
			System.out.println(e);	// Exception name will be printed
			
			System.out.println();	// Wont print anything even exception name wont be printed
		
		}
		
		finally {
			
			System.out.println("Out Of Try-Catch");	
			
		} //whethher exception is there or not it will be executed so we can put here code that must get executed
*/		
		
	/*	try {
		
			 int i=arr[4]; 
				System.out.println("Inside Try Block");
		}
		
	
		
		finally {
			
			System.out.println("Out Of Try-Catch");	
			
		} //whethher exception is there or not it will be executed and in this case it wil get executed first and then exception details will be printed
	*/	
		
			try {
	
			System.out.println("Inside Try Block"); // This will be printed
	}
	
	catch(ArrayIndexOutOfBoundsException e) //This will not be executed since no risky code is there
	{
		
		System.out.println(e);	
	}
	
	finally {
		
		System.out.println("Out Of Try-Catch");	//This will be printed first and then exception
		
	} 
		
			
			try {
	
			System.out.println(2/0);
			System.out.println("Inside Try Block"); 
	}
	
	catch(ArrayIndexOutOfBoundsException e) // Arithmatic Exception Message will be printed
			{
		
		System.out.println(e);	
	}
	
	finally {
		
		System.out.println("Out Of Try-Catch");	//This will be printed first and then exception
		
	} 
			
/*			try {}
			catch{} // Not Allowed
			finally {} */
			
	}
}
