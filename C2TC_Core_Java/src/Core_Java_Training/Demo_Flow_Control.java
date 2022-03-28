package Core_Java_Training;

import java.util.Scanner;

public class Demo_Flow_Control {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
					//Demo of if-else
					
	if(a<b)
		{
			System.out.println("a");
		}
		
		else
			System.out.println("b"); 
	
	//Demo of Switch
	
	 int choice,result;
	
	System.out.println("Enter Your Choice");
	
	Scanner s1=new Scanner(System.in);
	
	choice=s1.nextInt();
	
	switch(choice)
	
	{
	
	case 1:  result=a+b;
	           System.out.println("result is : "   +result);
	           break;
	           
	case 2:  result=a-b;
               System.out.println("result is : "   +result);  
               break;
               
	case 3: result=a*b;
              System.out.println("result is : "   +result);
              break;
	}
	
	//Demo of while
	
	int i=0;
	
	while(i<10) {
		
if(i==5)
	break;

System.out.println(i);

i++;

	}
	
	//Demo of Do-while
	
	do {
		
	System.out.println(i);
		
		i++;
		
	} while(i<5); 
	
	
	//Demo Of For Loop
	
	int arr []= {10,20,30};
	
	for(int j=0;j<=2;j++) 
		
	{
		System.out.println(arr[j]);
	}
	
}

}