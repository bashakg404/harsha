package com.workbench.threads;

public class JoinMethodThread {

	public static void main(String args[])throws InterruptedException{
		Thread thread1=new Thread(new A(), "Thread-1");
		Thread thread2=new Thread(new B(), "Thread-2");
		thread1.start();
		thread1.join();
		thread2.start();
	}
}

class A implements Runnable{
	public void run(){
		synchronized(String.class){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "has aquired String lock and waiting for Object lock");
			synchronized(Object.class){
				try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
				System.out.println(Thread.currentThread().getName()+ "has aquired on object lock");
		}
	}
		System.out.println(Thread.currentThread().getName()+"has Ended");
}}

class B extends Thread{
	public void run(){
		synchronized(Object.class){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"has Aquired Object lock waiting for String lock");
			synchronized (String.class) {
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"has aquired string lock");
				
			}
		}
		System.out.println(Thread.currentThread().getName()+"has ENDED");
	}
}