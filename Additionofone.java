package com.cts.cond;

import java.util.Scanner;

public class Additionofone {
	public static void main(String[] args) {
		Scanner d =new Scanner (System.in);
		System.out.println("Enter your digit");
		int num=d.nextInt();
		int sum=0;
		while(num!=0){
			int lastdigit=num%10;
			System.out.println("Value is="+lastdigit);
			sum=sum+lastdigit;
			System.out.println("sum="+sum);
			num=num/10;
		}
		}}