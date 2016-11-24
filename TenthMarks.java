package com.cts.cond;

import java.util.Scanner;

public class TenthMarks {

	public static void main(String[] args) {
		TenthMarks sub=new TenthMarks();
		Scanner marks=new Scanner(System.in);
		System.out.println("Enter the Marks");
		int tamil=marks.nextInt();
		int english=marks.nextInt();
		int maths=marks.nextInt();
		int science=marks.nextInt();
		int social=marks.nextInt();
		System.out.println("Tamil="+tamil);
		System.out.println("English="+english);
		System.out.println("Maths="+maths);
		System.out.println("Science="+science);
		System.out.println("Social="+social);
		int total=sub.add(tamil,english,maths,social,science);
		System.out.println("Total Marks="+sub.add(tamil,english,maths,social,science));
		System.out.println("Percentage of Marks="+sub.percentage(tamil,english,maths,social,science));

		
	}

	private int percentage(int a, int b, int c, int d, int e) {
		int percentage=(a+b+c+d+e)/5;
		return percentage;
	}

	private int add(int a, int b, int c, int d, int e) {
		int total=a+b+c+d+e;
		return total;
	}
	

}
