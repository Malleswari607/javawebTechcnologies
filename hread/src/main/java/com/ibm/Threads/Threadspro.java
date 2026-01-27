package com.ibm.Threads;
class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("The current state of the thread "+Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public class Threadspro {
	public static void main(String[] args) {
		Runner runner=new Runner();
		Thread producer=new Thread(runner,"Producer");
		Thread consumer=new Thread(runner,"consumer");
		producer.start();
		consumer.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(producer.getState());
		System.out.println(consumer.getState());	
		System.out.println("The End"); 
	}

}
