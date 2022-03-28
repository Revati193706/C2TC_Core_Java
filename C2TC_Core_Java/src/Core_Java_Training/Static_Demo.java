package Core_Java_Training;

public class Static_Demo {

	public static void main(String[] args) {

System.out.print(" \n Hi M11 Students");            //Will be printed Last

	}

	static 
	
	{	
		System.out.print(" \n Good Morning");		//Will be printed first //Static block will be executed first before main method
	}
	
	static 
	
	{	
		System.out.print(" \n Good Afternoon");		//Will be printed second
	}
	
	static 
	
	{	
		System.out.print(" \n Good Night");		   //Will be printed Third
	}
	
}
