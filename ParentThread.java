package com.toy.mythread;

public class ParentThread {
	
	public static void main(String[] args) {
		ChildThread ct=new ChildThread();
		ct.start();
		System.out.println(ct.getPriority());
		System.out.println(ct.getId());
		System.out.println(ct.getName());
		System.out.println(ct.getState());
       for(int i=0;i<5;i++){
    	   System.out.println(i+"parentthread");
       }
	}

}
