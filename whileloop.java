package com.cts.cond;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		int f=1;
		while(f==1){
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			float c;
			System.out.println("Enter Ur Choice");
			System.out.println("Press 1 for Add");
			System.out.println("Press 2 for sub");
			System.out.println("Press 3 for mul");
			System.out.println("Press 4 for div");
			int ch=s.nextInt();
		if(ch==1){
			c=a+b;
			System.out.println("add="+c);
		}
		else if(ch==2){
			c=a-b;
			System.out.println("sub="+c);
		}
		else if(ch==3){
			c=a*b;
			System.out.println("Mul="+c);
		}
		else if(ch==4){
			c=a/b;
			System.out.println("Div="+c);
		}
		c=a;
	
			System.out.println("do u want to continue");
			System.out.println("1.yes||2.No");
			f=s.nextInt();
	}
	}

}
