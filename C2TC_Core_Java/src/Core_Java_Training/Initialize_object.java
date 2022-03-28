package Core_Java_Training;

public class Initialize_object                        
  {

int id;
String name;
	
	
	public Initialize_object(int id,String name) //Creating constructor
		
	 { 
	
this.name=name; //.name is variable and =name is parameter of constructor
this.id=id;	 //use to initialize class members it is keyword
			
	}

	public static void main(String[] args) {

Initialize_object i=new Initialize_object(1,"Revati"); //creating and initializing object using constructor
		
System.out.println(i.name+" "+i.id);
		
	}

}