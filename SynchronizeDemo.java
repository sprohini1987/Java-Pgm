package com.toy.mythread;

public class SynchronizeDemo {
	public static void main(String[] args) {
		Display d1=new Display();
		MyThread t1=new MyThread(d1,"rohini");
		MyThread t2=new MyThread(d1,"shalini");
		t1.start();
		t2.start();
		t2.setPriority(3);
	}
	
	
}
