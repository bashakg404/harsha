/*package com.workbench.practice;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadingPC {

	public static void main(String args[]) {
		Vector sharedQueue = new Vector();
		int size = 4;
		Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
		Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
		prodThread.start();
		consThread.start();
	}
}

class Producer implements Runnable {

	private final Vector sharedQueue;
	private final int SIZE;

	public Producer(Vector sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
	}

	private void produce(int i) throws InterruptedException {

		// wait if queue is full
		while (sharedQueue.size() == SIZE) {
			synchronized (sharedQueue) {
				System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "
						+ sharedQueue.size());

				sharedQueue.wait();
			}
		}

		// producing element and notify consumers
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
	}
}

class Consumer implements Runnable {

	private final Vector sharedQueue;
	private final int SIZE;

	public Consumer(Vector sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
	}

	private int consume() throws InterruptedException {
		// wait if queue is empty
		while (sharedQueue.isEmpty()) {
			synchronized (sharedQueue) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ sharedQueue.size());

				sharedQueue.wait();
			}
		}

		// Otherwise consume element and notify waiting producer
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return (Integer) sharedQueue.remove(0);
		}
	}
}


//Another Example

import java.util.LinkedList;
 
public class Threadexample
{
    public static void main(String[] args)
                        throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();
 
        // Create producer thread
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
 
        // Create consumer thread
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
 
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
 
    // This class has a list, producer (adds items to list
    // and consumber (removes items).
    public static class PC
    {
        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
 
        // Function called by producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true)
            {
                synchronized (this)
                {
                    // producer thread waits while list
                    // is full
                    while (list.size()==capacity)
                        wait();
 
                    System.out.println("Producer produced-"
                                                  + value);
 
                    // to insert the jobs in the list
                    list.add(value++);
 
                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();
 
                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(1000);
                }
            }
        }
 
        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true)
            {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size()==0)
                        wait();
 
                    //to retrive the ifrst job in the list
                    int val = list.removeFirst();
 
                    System.out.println("Consumer consumed-"
                                                    + val);
 
                    // Wake up producer thread
                    notify();
 
                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}

*/