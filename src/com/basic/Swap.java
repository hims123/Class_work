package com.basic;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any two numbers = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Two numers are = "+x+" "+y);
		
		int t;
		t=x;
		x=y;
		y=t;
		
		System.out.println("After swap Two numers are = "+x+" "+y);
		
		/*		without temp variable
		 * 	x=x+y;
		 * x=x-y;
		 * y=x-y;
		 
		 */
	}

}
