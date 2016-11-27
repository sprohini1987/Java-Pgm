package com.cts.cond;

public class NestedDoWhile {

	public static void main(String[] args) {
		int a=0;
		do{
			int b=5;
			while(b>0){
				System.out.print(b);
				b--;
			}
			System.out.println("  a is ="+a);
			a++;
		}while(a<=5);

	}

}
