package com.toy.mythread;

public class Display {
	
	public void wish(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
	}
	}

