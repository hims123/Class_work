package com.oops;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value "+(i+1)+" : ");
			a[i] =  sc.nextInt();
		}
		
		System.out.println("values : ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
