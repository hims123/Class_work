package com.basic;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=15,b=64,c=135;
	/*	if (a>b) {
			if (a>c) {
				System.out.println("A is grater");
			}else {
				System.out.println("c is grater");
			}
			
		}else {
			if (b>c) {
				System.out.println("b is grater");
			}else {
				System.out.println("C is grater");
			}
			
		}
		*/
		
		if (a>b && a>c) {
			System.out.println("A is grater");
		}else if (b>a && b>c) {
			System.out.println("B is grater");
		}else if (c>a && c>b) {
			System.out.println("C is grater");
		}
		
		//grade
		
		// vowel or consonant
		char ch ='h';
		if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
			
			System.out.println("Vowel");
		} else {
			
			System.out.println("Consonant");
		}
		
	}

}
