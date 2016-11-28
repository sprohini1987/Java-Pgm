package com.cts.cond;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int reminder;
		while(number>0){
			reminder=number%10;
			System.out.print(reminder);
			number=number/10;
		}

	}

}
