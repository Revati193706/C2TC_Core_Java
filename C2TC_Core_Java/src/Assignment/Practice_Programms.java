package Assignment;

public class Practice_Programms {

	/* Primitive Datatype - Float 
	
	  public static void main(String[] args) {
		
			int value1 = 9/2; //since integer datatype shows only integer value
			
		float value2 = 10f/6f;  // It shows the reminder since the range is high shows entire output
		
		double value3 = 10d/6d; // It shows the reminder since the range is high shows entire output
		
		System.out.println("value  1 = "+ value1);
		System.out.println("value  2 = "+ value2);
		System.out.println("value  3 = "+ value3);  
	
	   int marker = 512;
	    double percentage = marker * 0.46f;	// since the percentage variable is of double type shows entire result. 
	    
	    System.out.println("percentage:"+percentage); 
	    
	} */

	/* Primitive Datatype - Boolean & Unicode

public static void main(String[] args) {
	
	boolean var = false;
	System.out.println(var);

	char var1 = '\u00A7'; //.It is unicode character which is  encoding standerd used by system internally
	char var2 = '\u0061';
	
	System.out.println(var1); //  Prints Symbol associated with it
	
	System.out.println(var2); // Prints Character associated with it
	
} */

	/* String Data Type
	
	public static void main(String[] args)
	
	{
		String var = new String("Hello world");
		
		System.out.println(var); //Prints Entire String.
		
	} */

	/* Type Casting 
	
	public static void main(String[] args) {
		
	       float f = 10.532f;
	       
	       long l = (long) f; //Long data type will consider only complete number/integer number
	      
	       System.out.println(l); //prints value 10.

		} */

	 /* Arithmatic Operator
	
	 	public static void main(String[] args) {
		
		int x = 10, y=20;
		
		System.out.println(x+y); //Addition
		System.out.println(--x); //Pre-Decrement
		System.out.println(++y);  //Pre-increment
		

	 	} */

/*  Decision making With operators
 
  	public static void main(String[] args) 

	{
	
		int x = 5;
		
          if(x != 5) // X=5 so it will execute else block  (Not Equal operator)
          
          {
        	  System.out.println("Value of x is not 5");
        	  
          }
          
          else
          
          {
          
          System.out.println("Value of x is 5");
          
          }
          
	}  */

	/*  Decision making With operators 
	
		public static void main(String[] args) 
		
	{
			
		int x = 8, y = 7;
		
           if(x >= y) // X is greater than Y so excute if block (Greater than)
           {
        	   System.out.println("true");
           }
           
           else
           {
        	   System.out.println("false");
           }
           
	} */

	/*  Decision making With operators
	
	public static void main(String[] args) {
		
		 int x = 10; int y = 11;
		  
		  if(!(x < y) || (x == y)) // x is not less than Y Nor X is equal to Y (Not operator ,Logical OR and equal to operator)
		
		  { 
			
			  System.out.println("Condition is TRUE");
		  
		  }
		  
		  else
		  
		  { 
			
			  System.out.println("Condition is FALSE"); 
		
		}

		  int ageOfBoy = 36;
			int ageOfGirl = 25;

			if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) //  girl>18 and boy>21  so execute if part (Logical and operator)
			
			{
				System.out.println("ready to get married!");
			
			} 
			
			else 
			
			{
			
				System.out.println("Wait for it kiddo!");
			}
			
		  
	} */
	
	
	/* Ternary Operator
	
	public static void main(String[] args) 
	{
		int x = 10;
		
		x = (10 == x) ? 2 : 0;
		
		System.out.println(x);
     
	} */

	/*	 Assignment  Operator

public static void main(String[] args) 

	{
	
		int x = 4;
		
		x += 5; // x = x + 5  Performs addition
	x -= 5; // x = x - 5 Performs substraction
	
	    x *= 5; // x = x * 5 Performs multiplication
		x /= 4; // x = x / 4  Performs Division
		
		x %= 5;   // x = x % 5 Performs Division returns reminder
		
		System.out.println(x); 
	}  */ 
			
}
