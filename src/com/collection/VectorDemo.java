package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1 = new Vector(6,1);
		
		System.out.println("default value is : "+v1);
		System.out.println("default size is : "+v1.size());
		System.out.println("default capacity is : "+v1.capacity());
		
		v1.add(500);
		v1.add(500);
		v1.add(9879456850l);
		v1.add(123.123f);
		v1.add('H');
		v1.add(new Integer(50));
		v1.add("Himanshu");
		
		System.out.println("now value is : "+v1);
		System.out.println("now size is : "+v1.size());
		System.out.println("now capacity is : "+v1.capacity());
		
		
	/*	Iterator i1 = v1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	*/
		
		Enumeration e1 = v1.elements();
		
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
		
	}

}
