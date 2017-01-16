package com.ctc.innerclass;

public class otherClass {
public static void main(String[] args) {
	NormalInnerClassA.ClassB h=new NormalInnerClassA().new ClassB();
	new NormalInnerClassA().new ClassB().test();
}
}
