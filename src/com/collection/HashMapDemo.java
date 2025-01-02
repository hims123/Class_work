package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap h1 = new HashMap();
		
		System.out.println("default value is : "+h1);
		System.out.println("default size is : "+h1.size());
		
		h1.put(500, 5000);
		h1.put("hims", "himanshu");
		h1.put(100, "roshan");
		h1.put("himanshu", "patel");
		h1.put("paratixa", 20);
		
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		h1.put(100, "hims");
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		h1.put(20, 200);
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		h1.remove("paratixa");
		System.out.println("now value is : "+h1);
		System.out.println("now size is : "+h1.size());
		
		
		Set s1 = h1.entrySet();
		
		Iterator i1 = s1.iterator();
		
	//	while (i1.hasNext()) {
	//		System.out.println(i1.next());
			
	//	}
		
		while (i1.hasNext()) {
			
			Map.Entry me =(Map.Entry) i1.next();
			
			System.out.println("The key is : "+me.getKey());
			System.out.println("The value is : "+me.getValue());
		}
		
	
		
	}

}
