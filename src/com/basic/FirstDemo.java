package com.basic;

public class FirstDemo {

	public static void main(String[] args) {
		
		int bsal = 18500;
		double callo,hallo ;
		callo = bsal*0.4;
		hallo = bsal*0.2;
		
		
		
		System.out.println("input basic salary ="+bsal);
		
		System.out.println("gross salary = "+(bsal+callo+hallo));
	}
}
