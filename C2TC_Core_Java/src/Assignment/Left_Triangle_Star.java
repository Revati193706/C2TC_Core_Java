package Assignment;

public class Left_Triangle_Star {

	public static void main(String[] args) {


		int i, j,k;

		for (i=0; i<5; i++) // i is for row 	

		{

			for (j=2*(5-i+1); j>=0; j--)  // It Create white spacesof j value and then print the star 
			{
				System.out.print(" "); 		
			}   

			for (k=0; k<=i; k++ )   
			{        
				System.out.print("* "); //evry row will contain stars equal to row no 

			}   

			System.out.println(); 

		}   
	}

}

