package com.toy.mythread;

public class MyThread extends Thread {
	Display d;
	String name;
	public MyThread(Display d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
  public void run(){
	  d.wish(name);
  }
}
