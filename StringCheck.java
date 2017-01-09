package com.ccc.inter;


	public class StringCheck {

		public static void main(String[] args) {
			String a = "Good"; 
			String b = new String("Good"); 
			if(a==b) 
				System.out.println("a & b are equal");
			else System.out.println("Not Equal");
			if(a.equals(b)){
				System.out.println("a is equal to b");
			}
			else{
				System.out.println("a not equal to b");
			}

		}

	}
