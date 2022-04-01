package Core_Java_Training;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Concurrent_Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concurrent_Demo d=new Concurrent_Demo();
		
		ReentrantLock l=new ReentrantLock();		
		l.lock();//Applies the lock
		l.unlock();//Releases the locks
		
		System.out.println(l.isLocked()); //To check whether lock is applied or not
		System.out.println(l.getQueueLength());//How many threads are waiting to acquire this lock
		System.out.println(l.isHeldByCurrentThread());//returns true if current thread holds this lock
		System.out.println(l.getHoldCount());//returns the no of thread holding this lock
	
	}

}
