package com.cts.cond;

import java.util.Scanner;


public class Switchcase {
	public static void main(String[] args) {
		Switchcase d=new Switchcase();
	Scanner s=new Scanner(System.in);
	System.out.println("a=");
	int a=s.nextInt();
	System.out.println("b=");
	int b=s.nextInt();
	float c;
	String g=s.next();{
	switch(g){
	case "e":
		c=a+b;
		System.out.println("add="+c);
		break;
	case "f":
		c=a-b;
		System.out.println("sub="+c);
		break;
	case "h":
		c=a+b;
		System.out.println("mul="+c);
		break;
	case "j":
		c=a/b;
		System.out.println("div="+c);
	}
	
	}
}
}