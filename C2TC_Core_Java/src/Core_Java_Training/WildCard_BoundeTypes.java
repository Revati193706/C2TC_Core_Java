package Core_Java_Training;

import java.util.*;

public class WildCard_BoundeTypes {

	public static void main(String[] args)
	{
		
	List<Integer>list=Arrays.asList(1); 
	// List is type of collection ,Arrays.aslist will return the list to list obj
	
	System.out.println(sum(list)); 
	// this will print the addition of the list and the list obj will be passed to method sum
	
	}

	static double sum(List <? extends Number>list1) // This will have list through list obj
	{
		
		double sum=0.0;
		
		for(Number i:list1) 
			//This loop will perform addition of i to list numbers
			
		{
			sum+=i.intValue(); //.. sum=1...sum=1+2..sum=3...sum=3+3..sum=
			// This will give addition of i to list numbers
			
		}
		return sum;
		
	}
}