package Core_Java_Training;

public class Generics_Demo {

	public static void main(String[] args)
	{
		gen<Integer> g = new gen<Integer>();
		gen<Float> g1 = new gen<Float>(); // Not here <> this must be a wrapper class/T

		g.value = 2;
		g1.value=2.88f;
		
		g1.display();
		g.display();
		
	}
}

class gen<T> // Here T is data type generics allows us to provide different datatype for single generics
{

	T value;

	void display() {
		System.out.println(value);
	}

}

