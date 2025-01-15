package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		
		int cap = a1.size();
		
		System.out.println("capacity : "+cap);
		
		System.out.println("default value is : "+a1);
		System.out.println("default size is : "+a1.size());
		
		a1.add(500);
		a1.add(500);
		a1.add(9879456850l);
		a1.add(123.123f);
		a1.add('H');
		a1.add(new Integer(50));
		a1.add("Himanshu");
		
		System.out.println("now value is : "+a1);
		System.out.println("now size is : "+a1.size());
		
		a1.remove(1);
		System.out.println("now value is : "+a1);
		System.out.println("now size is : "+a1.size());
		
		
		Iterator i1 = a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		
	}

}
