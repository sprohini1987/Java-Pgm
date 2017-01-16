package com.ctc.innerclass;

public class MethodLocalInnerClassA {

	public static void main(String[] args) {
		MethodLocalInnerClassA m=new MethodLocalInnerClassA();
		m.test();

	
	}

	private void test() {
		// TODO Auto-generated method stub
		int marks=35;
		System.out.println("i am test method");
  class ClassB{
	  void write()
	  {
		  int mark=45;
		  int marks=20+mark;
		  mark++;
		  System.out.println("going to write test");
		  System.out.println(marks);
		  System.out.println(mark);
	  }
  }
  ClassB b=new ClassB();
   b.write();
}

}

