package com.tcs.array;

import java.util.Scanner;

public class Fibbonic {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter a=");
		int a=d.nextInt();
		System.out.println("enter b=");
		int b=d.nextInt();
		//int a =0,b=1;
		for(int i=0;i<=10;i++){
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}

}
