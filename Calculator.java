package org.cts.javapgm;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	 
		Calculator k = new Calculator();
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		k.add(a,b);
		
	}

	private void add(int g, int h) {
		int c=g+h;
		System.out.println(c);
		
	}
}
