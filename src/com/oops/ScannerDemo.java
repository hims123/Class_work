package com.oops;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter value of a :");
		a= sc.nextInt();
		System.out.println("Enter value of b :");
		b = sc.nextInt();
		
		System.out.println("Sum is : "+(a+b));
		
		char ch;
		System.out.println("Enter character value  :");
		ch = sc.next().charAt(0);
		
		System.out.println("character value is : "+ch);
		
		String name;
	//	sc.nextLine();
		
		System.out.println("enter your name = ");
		name = sc1.nextLine();
		
		System.out.println("your name is : "+name);
		
	}

}
