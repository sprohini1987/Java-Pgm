package com.tcs.array;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("enter the d value=");
		int d=f.nextInt();
		int num[]=new int[d];
    for(int j=0;j<d;j++){
    	 System.out.println("enter the values=");
    	num[j]=f.nextInt();
       
    }
		int sum=0;
		for(int i=0;i<num.length;i++)
		sum=sum+num[i];
		double avg=sum/num.length;
		System.out.println("Avg value="+avg);
		}
	}
	

