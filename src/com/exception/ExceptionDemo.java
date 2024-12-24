package com.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter the number a: ");
		a= sc.nextInt();
		System.out.println("enter the number b: ");
		b= sc.nextInt();
		
		try {
			System.out.println("divisin is = "+(a/b));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("this is written in finally block !!!");
		}
		
		
		
		System.out.println("this is himanshu patel");
		System.out.println("this code is executed!!!");
		
	}

}
