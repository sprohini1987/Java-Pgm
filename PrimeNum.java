package com.cts.cond;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int n=0,m=0;
		Scanner prime=new Scanner(System.in);
		System.out.println("Enter the value of a=");
		int a=prime.nextInt();
		m=a/2;
		for(int i=2;i<=m;i++)
		{
		if(a%i==0)
		{
			System.out.println("It is not Prime Number");
			break;
		}
			else
		{
			System.out.println("It is a Prime Number");
		}
	}

}
}