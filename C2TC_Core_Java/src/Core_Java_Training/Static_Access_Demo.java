package Core_Java_Training;

public class Static_Access_Demo {

	String name;
	int addhar;
	
static	String Vaccine="Covi-shield"; //static variable is class bound // It will not change its value at evry instantiate step.

public Static_Access_Demo(String name, int addhar) //constructor to initailize the object

{
	
	this.name = name;
	this.addhar = addhar;
	
}

static void change() // static methods can be used to change the value of static variable // No need to create object to call satic method
{
	
	Vaccine="co-vaccine"; 
}

void display()

{
	
	System.out.println(name+" "+addhar+" "+Vaccine);
	
}

public static void main(String args[])

{
	
	change(); // call static method change
	
	Static_Access_Demo.change(); // another way to call static method change
	
	
Static_Access_Demo p1=new Static_Access_Demo("Revati",2435); // Passing value to objects //Vaccine= Co-vaccine

Static_Access_Demo p2=new Static_Access_Demo("Shweta",7635); // Passing value to objects //Vaccine= Co-vaccine

p1.display();
p2.display();

}

}
