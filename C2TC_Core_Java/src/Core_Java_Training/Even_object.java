package Core_Java_Training;

//demo of calculating even_ odd number by creating object and accessing method through objects

public class Even_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Even_odd e; // create a object
		
		e=new Even_odd(); // Initialize object
		
		e.even(); // method call
	}

}

class Even_odd{
	
	public void even() // method deceleration
	{
              int a=10;
	if(a%2==0) 
	{
		System.out.println("even");
	}
	
	else 
	{
		System.out.println("odd");
	}	
}

}




