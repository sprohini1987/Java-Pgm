package com.cts.cond;

import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		IfElse d=new IfElse();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c;
		System.out.println("Enter Ur Choice");
		System.out.println("Press 1 for Add");
		System.out.println("Press 2 for sub");
		System.out.println("Press 3 for mul");
		System.out.println("Press 4 for div");
		int ch=s.nextInt();
		if(ch==1){
			c=a+b;
			System.out.println(c);
		}
		else if(ch==2){
			c=a-b;
			System.out.println(c);
		}
		else if(ch==3){
			c=a*b;
			System.out.println(c);
		}
		else if(ch==4){
			c=a/b;
			System.out.println(c);
		}
		c=a;
		System.out.println("do u want to continue");
		Scanner g=new Scanner(System.in);
	
			}
			
			
			
			
	

