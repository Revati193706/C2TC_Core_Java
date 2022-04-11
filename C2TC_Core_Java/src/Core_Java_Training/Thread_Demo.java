package Core_Java_Training;

import java.util.concurrent.locks.ReentrantLock;

public class Thread_Demo extends Thread //Thread1

{
	
	
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("I am Thread1");
		}
		
	
	}
	

	public static void main(String[] args) //Thread2
	
	{
		ReentrantLock l=new ReentrantLock();		
		l.lock();
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//Display currentThread,name,parent,group
		
		Thread_Demo r=new Thread_Demo();
		
		Thread t=new Thread(r);	
		
		t.start();
			
		System.out.println(l.isLocked()); 
		System.out.println(l.getQueueLength());
		
	for(int i=0;i<=3;i++)
	{
		System.out.println("I am  Main Thread");
	}

}
	
	

	public void display()
	{
		System.out.println("Hello");
	}
	
	
	
}

