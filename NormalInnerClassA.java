package com.ctc.innerclass;

public class NormalInnerClassA {
	static int b=20;
	String name="gomathi";
	private String name1="shalini";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // ClassA n=new ClassA();
             ClassB n1=new NormalInnerClassA().new ClassB();
             n1.test();
             new NormalInnerClassA().check();
             System.out.println(n1);
             
	}
	private void check() {
	ClassB n=new ClassB();
	//n.test();
		
	}
	class  ClassB{
		private String a="rohini";
	  //  ClassB n=new NormalInnerClassA().new ClassB();
		public void test() {	
			String name="goms";
		System.out.println("inside inner class");
		System.out.println(name);
		System.out.println("inner class "+this.a);
		System.out.println("outer class "+NormalInnerClassA.this.name);
		
		
	}
	}
}
