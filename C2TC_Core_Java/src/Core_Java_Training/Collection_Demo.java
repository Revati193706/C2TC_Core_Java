package Core_Java_Training;

import java.util.*;

public class Collection_Demo {

	public static void main(String[] args) {
	
		ArrayList l=new ArrayList();
		
		l.add(23); // Elements in the list
		l.add(null); //Elements in the list
		l.add("M11 Batch "); //Elements int he list
	
		
		System.out.println(l.getClass()); // displays class name class java.util.ArrayList
		
		System.out.println(	l.size()); //Displays the size of collection
		System.out.println(	l.get(0)); //Displays element present at the 0 index
		System.out.println(	l); //Displays the list
	
		String [] arr=new String[3];

		arr[0]="Revati";
		arr[1]="Shweta";		
	/*	arr[2]=10; */ // this will give error since arrays provide type safety i.e once we have declare array name as string we cannot change the data type of that variable.
		
		             ArrayList l1=new ArrayList(); // We cannot provide data type here. This can accept data of any type so doesnt provide type saftey.
	
		             /*String name0=l1.get(0);  here we need to do type casting collections doesn't provide type safety as arrays.  */ 
		             String name0=(String) l1.get(0); 
		             
		            /* String name1=l1.get(1); */
		               String name1=(String) l1.get(1); 
		               
		             /*  int name2=l1.get(1);*/
		               int name2=(int) l1.get(2); // Will accpet the same and thus doesn't provide type safety so java 1.5 introduced generics

	
	}

}