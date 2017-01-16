package com.ctc.innerclass;

public class AnonymousinnerClassA {

	public static void main(String[] args) {
		//AnonymousinnerClassA a=new AnonymousinnerClassA();
		AnonymousinnerClassA b=new AnonymousinnerClassA()
				{
			
			void test(){
				System.out.println("inner class test");
			}
				};
				AnonymousinnerClassA a=new AnonymousinnerClassA();
				a.test();

}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println("outer class");
	}
}