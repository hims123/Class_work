package com.basic;
import java.util.*;

public class CityDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input city 1 distance =");
		int c1= sc.nextInt();
		System.out.println("Input city 2 distance =");
		int c2= sc.nextInt();
		double d = (double)c1-c2;
		System.out.println("distance between city1 and city2 is ="+d+"KM");
		
		System.out.println("distance between two city (in meter) is ="+d*1000+"M");
		System.out.println("distance between two city (in foot) is ="+d*3280.839895+"ft");
		System.out.println("distance between two city (in inches) is ="+d*39370.07874+"inch");
		System.out.println("distance between two city (in centimeter) is ="+d*100000+"CM");
		
	}

}
