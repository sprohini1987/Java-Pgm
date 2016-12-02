package com.tcs.array;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int i;
		int Marks[]={56,89,60,100,35};
		for(i=0;i<5;i++)
			if(Marks[i]>=65){
				System.out.println("Grade A");
			}
		   else
				{
			   System.out.println("Retry");
		   }
		}

	}


