package Core_Java_Training;

public class Runnable_Thread_Demo implements Runnable

{

	public void run() //Thread1
	{
		System.out.println("Thread1 has Ended");	
	}


	public static void main(String[] args) throws InterruptedException {

		Runnable_Thread_Demo r=new 	Runnable_Thread_Demo();
		Thread t=new Thread(r);	

		t.start();
		
	try {
		t.join(); //Generates checked exception needs to be handled by throws/try-catch
// Two friends want to go to beach....
		
	} 
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Thread.yield(); //Gives the thread chance to execute while other thread is executing (Ticket Counter)

		//Generates checked exception needs to be handled by throws/try-catch
	//	Thread.sleep(6000); //It waits for the specified time and then executes 
	
		for(int i=0;i<=5;i++) //Thread2
		{
			
		System.out.println("Main Thread");
		
		}
		
	}

}
