package com.cts.cond;

public class NestedWhile {

	public static void main(String[] args) {
		int a=0;
		while(a<=5){
			int b=5;
			while(b>0){
				System.out.print(b);
				b--;
			}
			System.out.println("  a is="+a);
			a++;
		}

	}

}
