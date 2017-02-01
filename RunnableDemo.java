package com.toy.mythread;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable m=new MyRunnable();
		Thread t=new Thread(m);
		//m.run();
		t.start();
		t.interrupt();
	     try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++){
			System.out.println(i+"Parent");
		}

	}

}
