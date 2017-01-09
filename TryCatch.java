package com.ccc.inter;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
	   TryCatch c=new TryCatch();
	   divide();
	   	}
	private static void divide() {
		Scanner s=new Scanner(System.in);
		   System.out.println("enter the values");
		   int a=s.nextInt();
		   int b=s.nextInt();
		try{
		
			System.out.println(a/b);
	}
		catch(ArrayIndexOutOfBoundsException e){
	 System.out.println("check the values");
	 divide();
 }
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception");
		}
		catch(Exception e){
			System.out.println("Exception base class");
			divide();
		}
		finally{
			System.out.println("close the program");
		}
}
}