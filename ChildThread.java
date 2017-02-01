package com.toy.mythread;

public class ChildThread extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
		System.out.println(i+"ChildThread");
	}
	
}
	public void start(){
		super.start();
		System.out.println("check im start");
		
	}
}