package Core_Java_Training;

public class Abstract_Access_Demo {

	public static void main(String[] args) {
	
 //abs a=new abs(); //cannot create objects for abstract class...//Create child class to create object and accses method

Scooty c=new Scooty(); // To access method of abstract class

c.Wheels(); 
		
	}

}

abstract class Vehicle // Abstract class

{
	
abstract void Wheels(); //abstract Method ..Dont have body
abstract void engine_no(); 
	
	
}

class Scooty extends Vehicle //We should implement all abstract methods // if dont want to do it then declare this class as abstract

{

	void Wheels() {
			
	}

	@Override
	void engine_no() {
		// TODO Auto-generated method stub
		
	}
	
	
}