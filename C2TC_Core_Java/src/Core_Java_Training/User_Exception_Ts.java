package Core_Java_Training;

import java.util.Scanner;

import java.io.IOException;

/*class MyException extends Exception
{
	
    public MyException(String s)
    {
        
        super(s);
    }
    
}

public class User_Exception_Ts {

	 public static void main(String args[]) throws MyException
	 
	    {
	    	int age;
	    	
	    	System.out.println("enter your age");
	    	
	    Scanner sc=new Scanner(System.in);
	    age=sc.nextInt();
	    
	        try {
	        	
	        	if (age<18)
	            throw new MyException("No!! You Can't vote as your age is less than 18");
	        
	        	else 
	        		System.out.println("Yes!! Welcome to the online voting portal");
	        }
	        
	        catch (MyException ex) 
	        {
	            System.out.println("Found Error");

	            System.out.println(ex.getMessage());
	            ex.printStackTrace();
	            
	        }
	    }
	} */

class User_Exception_Ts
{
	void m()throws IOException
	{
	throw new IOException("Device error");
	}
	
	void n()throws IOException
	{
	m();
	}
	
	void p()//Checked Exceptions need to be handled
	{
		try // If try catch-block is not present display error as unhandled exception
		{
			n();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}	
		
		
		public static void main(String args[])
		{
			
			User_Exception_Ts t=new User_Exception_Ts();
			t.p();
			
			System.out.println("Normal Flow started");
			
		}
	}

/* throw keyword is used to throw an exception with error message
throws keyword is used to declare an exception. 

it is used inside the method with object which is  used to call the method/class to display exception
it is used with the method signature to declare exception 

generally for checked exception we use throws keyword because can't use throw.
checked exceptions need to be handled with try-catch block

 throw keyword can be used with both checked or unchecked exceptions */

