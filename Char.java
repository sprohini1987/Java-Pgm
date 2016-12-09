package com.tcs.array;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the j=");
		int j=n.nextInt();
		char a[]=new char[j];
		System.out.println("enter the char");
		for(int i=0;i<j;i++){
			char ch=n.next().charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			System.out.println(ch);
		
			}
	}

}
}
