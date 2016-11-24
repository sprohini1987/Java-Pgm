package com.cts.cond;

import java.util.Scanner;

public class Cond {

	public static void main(String[] args) {
		Cond sub=new Cond();
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
		int total=sub.add(tamil,english,maths,science,social);
		System.out.println("Total Marks="+sub.add(tamil,english,maths,science,social));
		sub.percentage(total);
	}
	private void percentage(int a) {
		int per=a/5;
		System.out.println("Percentage="+per);
		if(per>=65){
			if(per>=85)
			{
			System.out.println("Ist Class with Distinction");
			}
			else
			{
				System.out.println("Ist Class");
			}
		}
			else if(per<65 && per>=40){
				System.out.println("IInd class");
			}
			else{
				System.out.println("Re Appear");
			}
				
	}	 
	private int add(int a, int b, int c, int d, int e) {
		int total=a+b+c+d+e;
		return total;
	}
}	

	

