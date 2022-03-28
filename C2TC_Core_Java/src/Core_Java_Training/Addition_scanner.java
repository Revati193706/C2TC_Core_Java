package Core_Java_Training;


import java.util.*;

public class Addition_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,result;
		
System.out.println("\n The program for Addition of Number : ");
		
		System.out.println("\n Enter your first number :");
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
				
		System.out.println("\n Enter your second number : ");
		
		Scanner s2=new Scanner(System.in);
		
		b=s2.nextInt();
		
		result=a+b;
		
		System.out.println("\n The Addition is : \n"  +result);
		
	}

}
