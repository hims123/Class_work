package com.cmn_class;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "This is Tops Technology....";
		
		System.out.println("Orignal string is : "+s1);
		System.out.println("length of string is :"+s1.length());
		
		System.out.println("String to lower case : "+s1.toLowerCase());
		System.out.println("String to upper case : "+s1.toUpperCase());
		System.out.println("SunString : "+s1.substring(2));
		System.out.println("SunString : "+s1.substring(0, 9));
		
		if (s1.equals("This is Tops Technology....")) {
			System.out.println("Same String");
		} else {
			System.out.println("Differnt String");

		}
		
		
	}

}
