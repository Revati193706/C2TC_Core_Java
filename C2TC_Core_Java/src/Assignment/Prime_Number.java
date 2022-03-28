package Assignment;

import java.util.Scanner;

public class Prime_Number 

{

	public static void main(String[] args) {

		int num;

		System.out.println("enter the number to check");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		int flag = 0;

		for (int i = 2; i <= num / 2; ++i) 
		{
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag==0)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}

}
