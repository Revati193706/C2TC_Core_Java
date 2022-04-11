package Core_Java_Training;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Lambda_Demo 
{

	public static void main()
	{
		
	List<Integer>list=new ArrayList<Integer>();
	
list.add(23);
list.add(73);
list.add(35);
list.add(0);
list.add(96);

System.out.println(list); 

/*List<Integer>Evenlist=new ArrayList<Integer>();  

for( Integer i:list)
{
	if(i%2==0)
	{
		Evenlist.add(i);
	}
}
	
System.out.println(Evenlist);*/


Stream<Integer>stream=list.stream();
List<Integer> EvenList=stream.filter(i->i%2==0).collect(Collectors.toList());

System.out.println(EvenList);

/* Stream is it supports sequential operation with stream such as filter,map
 stream is method that returns the sequential stream of collection elements
 
  so now stream contains list provided by stream() and to perform aggregate operations like filter  on it we have to useStream*/
}

}
