/*package com.workbench.practice;

public class MultiThreadBasics {
	public static void main(String args[])
	{
		int n=5;
		for(int i=0; i<=5; i++ ){
			MultithreadingDemo object= new MultithreadingDemo();
			object.start();
		}
	}

}
class MultithreadingDemo extends Thread{
	public void run(){
		try{
			System.out.println("Thread" + Thread.currentThread().getId()  + "is running");
		}catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.workbench.practice;

public class MultiThreadBasics {
	public static void main(String args[])
	{
		int n=5;
		for(int i=0; i<=5; i++ ){
		Thread object= new Thread(new MultithreadingDemo());
			object.start();
		}
	}

}
class MultithreadingDemo implements Runnable{
	public void run(){
		try{
			System.out.println("Thread" + Thread.currentThread().getId()  + "is running");
		}catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}

	public static void main(String[] args) throws InterruptedException{
		System.out.println("in main method");
		MyRunnable runnable =new MyRunnable();
		Thread thread1=new Thread(runnable);
		Thread thread2=new Thread(runnable);
		System.out.println("before run/start method");
		
		
		thread1.start();
	System.out.println("after start/run method");
	System.out.println("ThreadName="+Thread.currentThread().getName() );
		thread2.start();
		thread2.join();
		System.out.println("end on main()");
		
		
	}

}
	class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("in run() method");
		
			System.out.println("ThreadName="+Thread.currentThread().getName() );
		
		
	}
		
	}*/