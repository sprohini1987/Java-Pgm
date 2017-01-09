package com.ccc.inter;

public class TryCatchExpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchExp tcd = new TryCatchExp(); 
		try{
		tcd.tryThis(2, 0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check values");
		}
		
		tcd.add(5,5); 

	}
}
