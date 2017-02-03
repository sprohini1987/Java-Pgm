package com.gom.collections;

import java.util.ArrayList;

public class Arraylist {
			public static void main(String[] args) {
				ArrayList al=new ArrayList();
				System.out.println(al);
				System.out.println("Size:"+al.size());
				System.out.println("Size:"+al.hashCode());
				System.out.println("Empty:"+al.isEmpty());
				System.out.println("ToString"+al.toString());
				al.add(5600);
				al.add("rohini");
				System.out.println(al.get(1));
				al.add(456);
				al.add("shalini");
				System.out.println(al);
				al.remove(2);
				System.out.println(al);
				ArrayList a2=new ArrayList();
				
			}
}
