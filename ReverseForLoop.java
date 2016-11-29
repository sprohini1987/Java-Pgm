package com.cts.cond;

import java.util.Scanner;

public class ReverseForLoop {
	public static void main(String[] args) {
		Scanner d= new Scanner(System.in);
		int num=d.nextInt();
		int reminder;
		for(num=num; num>0;num=num/10){
			reminder=num%10;
			System.out.print(reminder);
		}
		
	}

}
