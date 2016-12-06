package com.tcs.array;

import java.util.Scanner;

public class TenthMarkArray {

	public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
		System.out.println("Enter the j value=");
		int j=g.nextInt();
		int Mark[]=new int[j];
		
		for(int i=0;i<j;i++){
			Mark[i]=g.nextInt();
		}
		for(int i=0;i<j;i++){
			System.out.println(Mark[i]);
			{
			if(Mark[i]>=65){
				System.out.println("Grade A");
			}
		   else
				{
			   System.out.println("Retry");
		   }
	}

}
	}
}
