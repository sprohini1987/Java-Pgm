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
	System.out.println("press 1 for add;  2 for sub;   3 for multiplication;  4 for division");
	int g=s.nextInt();
	for(int i=1;i<=g;i++){
	switch(g){
	case 1:
		c=a+b;
		System.out.println("add="+c);
		break;
	case 2:
		c=a-b;
		System.out.println("sub="+c);
		break;
	case 3:
		c=a+b;
		System.out.println("mul="+c);
		break;
	case 4:
		c=a/b;
		System.out.println("div="+c);
	}
	}
	System.out.println("do u want to continue the operation");
	System.out.println("press 1 for yes ");
	int yes=s.nextInt();
	if(yes==1){
		System.out.println("q=");
		int q=s.nextInt();
		System.out.println("t=");
		int t=s.nextInt();
		float cc;
		System.out.println("press e for add;  f for sub;   h for multiplication;  j for division");
	String k=s.next();
	switch(k){
	case "e":
		cc=q+t;
		System.out.println("add="+cc);
		break;
	case "f":
		cc=q-t;
		System.out.println("sub="+cc);
		break;
	case "h":
		cc=q*t;
		System.out.println("mul="+cc);
		break;
	case "j":
		cc=q/t;
		System.out.println("div="+cc);
	}
	}
	else {
		System.out.println("stop");
	}
	}
	}
	
		
	

	
	

