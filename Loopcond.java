package com.cts.cond;

import java.util.Scanner;

public class Loopcond {

	public static void main(String[] args) {
		Loopcond s=new Loopcond();
		int student=0;
		int subject=0;
		
		while(student<5){
			
	    String StudentName;
		Scanner Name=new Scanner(System.in);
		student=student+1;
		subject=subject+1;
		System.out.println("Print Student Name=");
		String StdName=Name.nextLine();
		
		System.out.println("Enter the Marks=");
		int mark1=Name.nextInt();
		int mark2=Name.nextInt();
		int mark3=Name.nextInt();
		int mark4=Name.nextInt();
		int mark5=Name.nextInt();
		int total=s.add(mark1,mark2,mark3,mark4,mark5);
		System.out.println("total mark is"+s.add(mark1,mark2,mark3,mark4,mark5));
		System.out.println("Percentage of Marks"+s.percentage(total));
	}
	}

	private int add(int a, int b, int c, int d, int e) {
		int total=a+b+c+d+e;
		return total;
	}
	private int percentage(int a) {
		int percentage=a/5;
		return percentage;
		
		
	}
}