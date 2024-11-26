package com.basic;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input number = ");
		int n = sc.nextInt();
		
		if ((n%2) == 0) {
			System.out.println("It is Even number");
		} else {
			System.out.println("It is Odd number");
		}
		
		
	}

}
