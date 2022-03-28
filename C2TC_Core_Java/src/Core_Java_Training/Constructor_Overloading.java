package Core_Java_Training;

public class Constructor_Overloading {

	int Employee_No;
	String Employee_Name;
	String Address;
	
 Constructor_Overloading(int a_no,String name,String a) 
 
 {
	
		Employee_No = a_no;
		Employee_Name = name;
		Address=a;
		
}

  
	int Experience;
	String Speciality;
	
Constructor_Overloading(int e,String s) 
{

	Experience=e;
	Speciality=s;
	
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Constructor_Overloading c=new Constructor_Overloading(1,"Revati","Soba Opptima");

System.out.println("Retriving Employee Personal Details");

System.out.println("\n Employee id:"+c.Employee_No +"\n Employee Name:"+c.Employee_Name+"\n Employee Address:"+c.Address);


Constructor_Overloading c1=new Constructor_Overloading(2,"java");
	
System.out.println("\n Retriving Employee Professional Details");

System.out.println("\n Employee Experience:"+c1.Experience +"\n Employee Speciality:"+c1.Speciality);


	}
	
}
