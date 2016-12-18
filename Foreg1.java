package com.tcs.array;

public class Foreg1 {

	public static void main(String[] args) {
		int a=0,b=0;
		for(int i=0;i<5;i++){
			if(++a>2||++b>2){
				System.out.println(a);
				System.out.println(b);
				a++;
			}
		}
		System.out.println("a ="+a+"b="+b);
	}

}
