package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h1 = new HashSet();
		
		System.out.println("default value is : "+h1);
		System.out.println("default size is : "+h1.size());
		
		h1.add(500);
		h1.add(50);
		h1.add(9879456850l);
		h1.add(123.123f);
		h1.add('H');
		h1.add(new Integer(50));
		h1.add("Himanshu");
		
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		h1.add(500);
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		h1.remove(500);
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
	//	Iterator i1 = h1.iterator();
		
	//	while (i1.hasNext()) {
	//		System.out.println(i1.next());
			
	//	}
		
		for (Iterator iterator = h1.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
	}

}
