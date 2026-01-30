package com.ibm.Threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable{
	int count;
	Task1(int count){
		this.count=count;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"--->"+count);
		System.out.println(new Date());
		try {
			Thread.sleep(2000);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
public class ThreadExample2 {
	public static void main(String[] args) {
		int Vcpus=Runtime.getRuntime().availableProcessors();
		System.out.println(Vcpus);
		ScheduledExecutorService service=Executors.newScheduledThreadPool(Vcpus);
		System.out.println(new Date());
//		service.schedule(new Task1(1),4, TimeUnit.SECONDS);
//		service.scheduleAtFixedRate(new Task1(2), 10, 5, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new Task1(3),10, 5,TimeUnit.SECONDS);
		System.out.println("The End");
		
	}

}
