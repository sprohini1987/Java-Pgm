package com.cts.cond;

import java.util.Scanner;

public class ReverseLastNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int reminder;
			reminder=number%10;
			System.out.print(reminder);
			int num=number/10;
			System.out.println(num);
		
	}

}

