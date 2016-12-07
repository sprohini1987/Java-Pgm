package com.tcs.array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the Reverse Name");
		String name=k.nextLine();
		for(int i=name.length()-1;i>=0;i--){
			char ch=name.charAt(i);
			System.out.println(ch);
			}
		}
		
		
	}


