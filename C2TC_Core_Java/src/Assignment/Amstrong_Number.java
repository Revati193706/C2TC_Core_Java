package Assignment;

import java.util.Scanner;  
import java.lang.Math;  

public class Amstrong_Number

{  

	static boolean isArmstrong(int n)   

	{   

		int temp, digits=0, cubeDigit=0, sum=0;   

		temp=n;    // To calculate the nuber of digits
		while(temp>0)     //1 st iteration..temp=371,temp=371/10..37,digit=1
		{   
			temp = temp/10;  // 2nd iteration..temp=37,temp/10....3,digit=2
			digits++;        
		}               // 3 rd iteration temp=3,temp/10..0,digit=3


		temp = n;   // To perform the Addition
		while(temp>0)   // 1st iteration..temp=371,cubedigit=371%10..1,sum=1*1*1,temp/10..37
		{       
			cubeDigit = temp % 10;  // 2nd iteration..temp=37,cubedigit=37%10..7,sum=7*7*7,temp/10..3  
			sum +=  (Math.pow(cubeDigit, digits));    
			temp = temp/10;    // 3rd iteration..temp=3,cubedigit=3%10..3,sum=3*3*3,3/10..0

		}  

		if(n==sum)    
			return true;      

		else return false;  

	}   

	public static void  main(String args[])    

	{     

		int num;   

		System.out.print("Enter the number: "); 
		Scanner sc= new Scanner(System.in);    
		num=sc.nextInt();

		if(isArmstrong(num))  
		{  
			System.out.print("Entered Number is Armstrong Number ");  
		}  

		else   
		{  
			System.out.print("Entered Number is Not Armstrong Number ");  
		}  

	}   

} 

/* output */

/* 

 Enter the number: 153
Entered Number is Armstrong Number  

 */