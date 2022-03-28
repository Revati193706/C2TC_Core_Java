package Assignment;

public class Practice_Programms_Decision {

	/*	Nested If Else
	
	 public static void main(String[] args) {
		 	int x = 5;

		
		 	 if (x == 5)  // If this is true enters into inner if else execute nothing since not having else part
			 
		  { 
			 
		  if (x >= 5)  //if true gets exxecuted otherwise goes into else part since the next else is nearest to this if it will execute that else 
		  {
			  
		  	System.out.println("X is greater than 5"); 
		  	
		   }
		  
		  else 
		  {
			  
		  System.out.println("X is smaller than 5"); 
		  
		  } 
		  
		 }
		 
	}
	 
	     if(x == 5) //True execute this otherwise go to immidiate else
	     
		{
		
			System.out.println("X equals to 5");
			
		}
		
		else if(x > 5) //True execute this otherwise go to immidiate else
		
		{
		
			System.out.println("X is greater to 5");		
			
		}
		
		else 
		
		{
		
			System.out.println("X is smaller than 5");
			
		}
		
	}  */
	
	/* Switch intger
	
	public static void main(String[] args) 
	
	{
		
		int x = 10;

	switch (x)  // X=10 so checks for case :10 if case :10 then print else go for default case
	
	{
	
	case 1: 
		System.out.println("The value of x is 1");
		break;
		
	case 2:
		System.out.println("The value of x is 2");
		break;
		
	case 3:
		System.out.println("The value of x is 3");
		break;
		
	default:
	System.out.println("The value of x is other than 1,2,3");
		break;

	}

} */

	/* Switch character
	
	public static void main(String[] args) 
	{
	
		char x = 'F';
		
		switch (x) // X='F' so checks for case :'F' if case:'F' yes then print else go for default case
		
		{
		
		case 'a' : 
		
		case 'A' : 
			System.out.println("The value of x is a");
			break;
			
		case 'b':
		
		case 'B' :
			System.out.println("The value of x is b");
			break;
			
		case 'c':
		
		case 'C' :	
			System.out.println("The value of x is c");
			break;
			
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
			
		}
		
	} */

/* Switch String
 
 	public static void main(String[] args)
	
	{
		
		String name = "te";

		switch (name.toLowerCase()) // Coverts given string to lower case and matches with case label if yes then print else go to default case
		
		{
		
		case "author":
			System.out.println("Vikas");
			break;
			
		case "team":
			System.out.println("Team Java Full Stack");
			break;
			
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
			
		default:
			System.out.println("Invalid entry");
			break;
	}
		
	} */
	
	/* For Loop
	 
	public static void main(String[] args) 
	
	{	
		
for(int i = 1; i<=1000 ; i++)  // Prints 1 to 10000 in ascending manner 

	for (int i = 1000; i<=1;i--) // Prints 1 to 10000 in decending manner 
	
		{	
		
			System.out.print("Value of i:");
			System.out.println(i);
			
		}
		
	} 	 */

	/* For Loop
	
public static void main(String[] args) 
	
	{	
		int number = 8;
		
		boolean isPrime = true;
		
		for(int i = 2; i < number/4; i++) // if 2<4 then 8%2=4 so isPrime-false, if 3<4 then 8%3=2 so isPrime=false, 4<4 no condition false will stop iterating
			
		{
			
			if(number % i == 0)
			{
				isPrime = false;
			}
			
		}
		
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		
		else
		{
System.out.println("The number is not a prime number");
		}
		
	} */

	/* While Loop
	 
	 public static void main(String[] args) 
	
	{
		
		int i=99;
		
		while(i<=100) // executes till condition false
			
		{
			
			System.out.println(i);
			i++;
			
		}
	}

	 */
	
	/* Do-While loop
	
	public static void main(String[] args) 
	
	{
		
		int i = 11;
		
		do
			
		{
			
			System.out.println(i);
			i++;
			
		}while(i<=1); // Executes atleast once irrespective of whether the condition is true or not // Here it is false
		
	}
	
	/*



	 /* */

	/* For,While,Do-while loop
	 
	   public static void main(String[] args) 
	   
		{

		 	  // for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  } 
		  
		    while loop 
		  
			  int i=1,j=1; //Initially i&j=1 then it will go inside the loop and will icrement values and will print incremented values
			  
			  while(i<10 || j<10)
			  
			  { 
			  
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			      
			  }	
			
	//	 Do while loop
		 
			int i = 1, j = 1;
			
			do {  //Initially i&j=1 then it will go inside the loop and will icrement values and will print incremented values
				  
				
				i++;
				j++;
				
				System.out.println("i=" + i + " and j=" + j);
				
			    } while (i < 10 || j < 10); 
			    
		} */

	/* Break and Continue
	 
	 public static void main(String[] args) 
	{	
         for(int i=1; i<=10; i++)
         {
        	 if(i == 1)
        	 {
        		 continue;   // will Skip printing number 1 and print 2-10
        		 
        		 break; //  Willl come out of the loop
        	 }
        	 System.out.println(i);
         }
	}
	 
	 */
	
	/* Nested For Loop
	 
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++) // 1 st i=1 it will print j value i.e 1-10 then for i=2,i=3..i=10 and before incrementing i it will print ****
		{
			for(int j=1; j<=10; j++)
			{
	System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("************************");
		}
	} */

	/* For loop for printing pattern
	 
		public static void main(String[] args) 
{

		for (int i = 1; i <= 5; i++) // Each time I will be incremented J will print @
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print('@');
			}
			System.out.println();
		}
	} */

}
