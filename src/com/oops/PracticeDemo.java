package com.oops;

import java.util.Scanner;

class factorial{
	
	int fact(int n) {
		
		int f;
		if(n==0 || n==1) return 1;
		f=fact(n-1)*n;
		
		return f;
		
	}
	
}

public class PracticeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial f = new factorial();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value of n : ");
		int n = scanner.nextInt();
		System.out.println("factorial of "+n+" is : "+f.fact(n));
	}

}
