package Assignment;

import java.util.Scanner;

public class Calculator_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of 1st number ::");
		int a = sc.nextInt();

		System.out.println("Enter value of 2nd number ::");
		int b = sc.nextInt();

		System.out.println("Select operation");

		System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: Modulo-r: ");
		char choice = sc.next().charAt(0);

		switch(choice)

		{

		case 'a' :
			System.out.println("Sum of the given two numbers: "+(a+b));
			break;

		case 's' :
			System.out.println("Difference between the two numbers: "+(a-b));
			break;

		case 'm' :
			System.out.println("Product of the two numbers: "+(a*b));
			break;

		case 'd' :
			System.out.println("Result of the division: "+(a/b));
			break;

		case 'r' :
			System.out.println("Result of the division: "+(a%b));
			break;

		default :
			System.out.println("Invalid Operation");

		}

	}

}

