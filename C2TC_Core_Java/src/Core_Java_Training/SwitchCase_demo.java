package Core_Java_Training;

public class SwitchCase_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=20;
		final int z=30;
		
	/*	switch(x)
		{
		
		System.out.println("Engineers");  //every statement should be part of case or default case.
		
		}
		*/
		
		/* switch(x)
		{
		
		case 10:
		System.out.println("Engineers"); 
		break;
		
		case y: 
			System.out.println("Software Engineers"); //case label should be constant
			break;
		
		case z: 
			System.out.println("Software Engineers"); //case label z is constant declared as final
			break;
			
		}	*/	
		
	/*	switch(x+1) 
		{
		
		case 10:
		System.out.println("Engineers"); 
		break;
		
		case 11:
			System.out.println("Software Engineers"); 
			break;
			
		case 100+200:  //constant expression is valid as case label
			System.out.println(300);
		    break;
			
		}	*/
		
		/*int b=10;
		
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
		}*/
		

		byte k=10;
	
/*		switch(b) //cannot pass variable here
	{
	
	case 10:
		System.out.println(10); 
		break;
		
	case 1000: 
			
		System.out.println(1000); 
		break;
			
	}*/
	
		}

}