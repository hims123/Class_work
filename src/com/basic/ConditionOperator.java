package com.basic;

public class ConditionOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		if(a>10) {
			System.out.println("a is > 10");
		}
		else {
			System.out.println("a is < 10");
		}
		
		int n1=15,n2=25;
		if (n1>n2) {
			System.out.println("n1 is grater");
		}
		else {
			System.out.println("n2 is grater");
		}
		
		System.out.println("max number is "+Math.max(n1, n2));
		System.out.println("min number is "+Math.min(n1, n2));
		
		
	}

}
