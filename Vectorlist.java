package com.gom.collections;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Vectorlist {
	
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		Vector b=new Vector();
		Stack c=new Stack();
		System.out.println("linkedList output");
		a.add("rohini");
		a.add(3);
		a.add("goms");
		System.out.println(a.size());
		a.remove("rohini");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		System.out.println("vector output");
		b.add('s');
		b.add("gomathi");
		b.add('k');
		b.add(5);
		System.out.println(b);
		b.add(3,"rohini");
		System.out.println(b);
		b.remove(2);
		System.out.println(b);
		System.out.println("stack output");
		c.add("rohini");
		c.add("rohini");
		c.add(5);
		c.add('g');
		c.add(2456);
		System.out.println(c);
		c.pop();
		System.out.println(c);
		c.push("goms");
		System.out.println(c);
		c.peek();
		System.out.println(c);
	}

}
