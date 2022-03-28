package Assignment;

public class Operating_System_Details 
{

	public static void main(String[] args) {

		String operatingSystemName = System.getProperty("os.name");
		System.out.println(operatingSystemName);

		String operatingSystemVersion = System.getProperty("os.version");
		System.out.println(operatingSystemVersion);

	}

}
