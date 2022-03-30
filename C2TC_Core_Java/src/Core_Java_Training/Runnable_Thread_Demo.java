package Core_Java_Training;

public class Runnable_Thread_Demo implements Runnable

{

	public void run() //Thread1
	{
		System.out.println("Thread1 has Ended");
	}


	public static void main(String[] args) {

		Runnable_Thread_Demo r=new 	Runnable_Thread_Demo();
		Thread t=new Thread(r);	

		t.start();
		
		for(int i=0;i<=5;i++) //Thread2
		{
			
		System.out.println("Main Thread");
		
		}
		
	}

}
