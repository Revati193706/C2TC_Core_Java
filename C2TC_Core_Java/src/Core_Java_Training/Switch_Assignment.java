package Core_Java_Training;

public class Switch_Assignment {

	public static void main(String[] args) {
	
		
		/* Assignment*/
			
			/*switch(x) // This switch will not print any thing as there is no case matching value of 'x' parameter
			{
		
			case 'a':  //Showing Duplicate case error because 97=a as per unicode system
				
				System.out.println(a); //We cannot use a variable which is not declared before switch here
				
				break;	
				
			case 97 : //Showing Duplicate case error because a is having value 97 as per the unicoode 

			System.out.println("97"); 
			break;

			default:
				break;

	}*/
					
			// Solution
		
int x=10;			
			switch(x) 
			{
			
			case 'a':  
				System.out.println("a"); 
				break;	
				
			case 10 : 
			System.out.println("97"); 
			break;

			default:
				break;
				
			}
			

	
		
			//............
			
	/*		switch(3)
			{
			
			default:System.out.println("default"); //printed

			//No break execute default and 0 case
			 
			case 0:
			System.out.println(0); //printed
	         break;

			case 1: 
				System.out.println(1); 
			break;
			
			case 2: 
				System.out.println(2); 
			break;
						
			}
	*/
				
			/* switch(3)
			{
			
			default:System.out.println("default"); //printed
             break;
			 
			case 0: //doesn't execute as earlier due to break
			System.out.println(0); 
	         break;

			case 1: 
				System.out.println(1); 
			break;
			
			case 2: 
				System.out.println(2); 
			break;
						
			}*/
				
				/* switch(3)
					{
					
					
					case 0:
					System.out.println(0); 
			         break;

					case 1: 
						System.out.println(1); 
					break;
					
					case 2: 
						System.out.println(2); 
					break;
							
					default:System.out.println("default"); //printed
		             break;
					 
					}*/
			

			
		switch(0)
			{
			
			default:System.out.println("default"); // Not executed
             break;
		
			case 0:
			System.out.println(0);//printed
	         break;

			case 1: 
				System.out.println(1); 
			break;
			
			case 2: 
				System.out.println(2); 
			break;
						
			} 
		
	int b=10;
		
		switch(b) 
		{
		
		case 10:
			System.out.println("Happy Woman's Day");  //printed
			break;
			
		case 1000: 
			System.out.println("Happy men's Day"); 
			break;
			
			default:
				System.out.println("Tuesday"); 
		}
		
		}

	}


