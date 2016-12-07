package com.tcs.array;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=k.nextLine();
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
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
