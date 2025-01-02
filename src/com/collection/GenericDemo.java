package com.collection;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(500);
		a1.add(500);
		a1.add(98794568);
		a1.add(123123);
		a1.add(10);
		
		System.out.println(a1);
		
		for (Integer i : a1) {
			System.out.println(i);
		}
		
		
	}

}
