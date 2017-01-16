package com.ctc.innerclass;

public class StaticNestedInnerClass {
		int a=677;
		static int b=376;
		
	public static void main(String[] args) {

		StaticNestedInnerClass d= new StaticNestedInnerClass();
}
  static class StaticInnerClass{
	  public static void main(String[] args) {
		StaticInnerClass s=new StaticInnerClass();
		System.out.println(b);
	}
  }
}
