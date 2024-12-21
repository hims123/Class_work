package com.cmn_class;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s2;
		System.out.println("enter String :");
		s2=sc.nextLine();
		StringBuffer s1=new StringBuffer(s2);
		
		System.out.println("original string is :"+s1);
		System.out.println("length of string is :"+s1.length());
		
		s1.insert(0, "Hii ");
		System.out.println("original string is :"+s1);
		System.out.println("length of string is :"+s1.length());
		
		s1.append("Surat");
		System.out.println("original string is :"+s1);
		System.out.println("length of string is :"+s1.length());
		
		s1.replace(0, 3, "hello");
		System.out.println("original string is :"+s1);
		System.out.println("length of string is :"+s1.length());
		
		s1.delete(0, 5);
		System.out.println("original string is :"+s1);
		System.out.println("length of string is :"+s1.length());
	}

}
