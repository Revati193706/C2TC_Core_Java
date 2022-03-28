package Assignment;

import java.util.*;

public class Leap_Year {

	public static void main(String[] args) {

		int year;

		System.out.println("Program for finding leap year");

		System.out.println("Enter the year");

		Scanner s=new Scanner(System.in);
		year=s.nextInt();

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("Specified year is Leap year");	
		}

		else
			System.out.println("Specified year is not a leap year");

	}

}