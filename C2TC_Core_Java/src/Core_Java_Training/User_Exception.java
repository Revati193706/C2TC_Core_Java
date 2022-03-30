package Core_Java_Training;

import java.io.IOException;
import java.util.Scanner;

/*class MyException extends Exception
{
	
    public MyException(String s)
    {
        
        super(s);
    }
    
}
 

public class User_Exception {

    public static void main(String args[])
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
        }
    }
}*/

class User_Exception
{
	
	void m()
	{
	throw new RuntimeException("Device error");
	}
	
	void n()
	{
	m();
	}
	
	void p()
	{
		try //Doesn't affect with no try-catch displays Exception in thread "main" java.lang.RuntimeException: Device error
		{
			n();
		}
		catch(RuntimeException r)
		{
			System.out.println(r.getMessage());
			r.printStackTrace();
			
		}
	}	
		
		
		public static void main(String args[])
		{
			
			User_Exception t=new User_Exception();
			t.p();
			
			System.out.println("Normal Flow started");
			
		}
	}