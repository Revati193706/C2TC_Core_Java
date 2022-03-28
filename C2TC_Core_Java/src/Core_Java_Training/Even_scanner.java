package Core_Java_Training;

import java.util.*;

public class Even_scanner {
	
	public static void main(String[] args) {
		
		int x;
		
		System.out.println("\n The program for Even Number");
		
		System.out.println("\n Enter your number");
		
		Scanner e=new Scanner(System.in);
		
		x=e.nextInt();
		
		if(x%2==0)
			System.out.println("Even Number");
		
		else
			System.out.println("odd Number");
	}

}
