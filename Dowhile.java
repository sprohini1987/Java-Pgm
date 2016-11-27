package com.cts.cond;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		int c;
		do{
			c=a*b;
			System.out.println(c);
			a=a+1;
		}
		while(a<=10);
	}

}
