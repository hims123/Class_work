package com.basic;

import java.util.*;

public class AreaOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("For Rectangle==>");
		System.out.println("Enter length of rectangale = ");
		int l = sc.nextInt();
		System.out.println("Enter width of rectangale = ");
		int w = sc.nextInt();
		
		System.out.println("Area of rectangale = "+(l*w));
		System.out.println("Perimeter of rectangale = "+(l+w)*2);
		
		
		System.out.println("For Circle==>");
		float pi = (float)3.14;
		
		System.out.println("Enter radius of circle = ");
		int r = sc.nextInt();
		
		System.out.println("Area of circle = "+pi*r*r);
		System.out.println("Circumference of circle = "+2*pi*r);
		
		
		
		
	}

}
