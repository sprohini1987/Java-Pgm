package com.toy.mythread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			Thread.yield();
//			try {
//				Thread.sleep(1000);
//			
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(i+"child");
			//System.out.println(Thread.currentThread().getName());
			//Thread.currentThread().setName("Mother");
			Thread.currentThread().setPriority(5);
			System.out.println(Thread.currentThread().getPriority());
		}
	}

}
