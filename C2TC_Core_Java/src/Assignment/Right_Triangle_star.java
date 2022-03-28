package Assignment;

import java.util.Scanner;

public class Right_Triangle_star 

{

	public static void main(String[] args)

	{
		
		System.out.println("Enter the Nuber of Rows");

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		for (int i = 1; i <= row; i++) // Each time I will be incremented J will print *
		{
			for (int j = 1; j <=i; j++) // i is the row count and it is equal to no of stars to be printed in row
			{
				System.out.print('*');

				System.out.println(); // Throws cursor to next line

			}

		} 


	}

}