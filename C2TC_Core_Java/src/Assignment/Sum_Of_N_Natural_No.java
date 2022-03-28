package Assignment;

import java.util.Scanner;

public class Sum_Of_N_Natural_No {

	public static void main(String[] args) 
	{

		int i,j;
		int sum=0;

		System.out.println("Program for finding sum of Natural Numbers");

		System.out.println(" enter the starting value");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();

		System.out.println("enter the Ending value");
		Scanner s1=new Scanner(System.in);
		j=s.nextInt();

		while(i<=j) //dont Know till what value we have to iterate it
		{	
			sum=sum+i;
			i++;
		}

		System.out.println(" Sum Of N Natural Numbers is:" +sum);	

	}

}
