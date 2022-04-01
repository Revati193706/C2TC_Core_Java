package Core_Java_Training;

public class Thread_Demo extends Thread //Thread1

{

	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("I am My Thread");
		}
	}
	
	public static void main(String[] args) //Thread2
	
	{
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//Display currentThread,name,parent,group
		
		Thread_Demo r=new Thread_Demo();
		
		Thread t=new Thread(r);	
		
		t.start();
		
	for(int i=0;i<=3;i++)
	{
		System.out.println("I am  Main Thread");
	}
	
}
	
}

