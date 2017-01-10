package com.ctc.innerclass;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // ClassA n=new ClassA();
             ClassB n1=new ClassA().new ClassB();
             n1.test();
             new ClassA().check();
             
	}
	private void check() {
	ClassB n=new ClassB();
	n.test();
		
	}
	class  ClassB{
		private String a="rohini";
		//ClassB n=new ClassB();
		public void test() {		
		System.out.println("hai");
	}
	}
}
