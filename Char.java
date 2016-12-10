package com.tcs.array;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("enter the value n=");
		int n=k.nextInt();
		char []g=new char[n];
		System.out.println("Enter the character");
		for(int i=0;i<n;i++){
			g[i]=k.next().charAt(i);
			if(g[i]=='a'||g[i]=='e'||g[i]=='i'||g[i]=='o'||g[i]=='u')
			{
				System.out.println(g[i]);
			}
			if(g[i]=='A'||g[i]=='E'||g[i]=='I'||g[i]=='O'||g[i]=='U')
			{
			System.out.println(g[i]);
		
			}
	}

}
}
