package com.basic;
import java.util.*;

public class SumFiveDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e;
		System.out.println("Enter the 5 digit number = ");
		int num = sc.nextInt();
		
		e = (num%10);
		d = (num/10)%10;
		c = (num/100)%10;
		b = (num/1000)%10;
		a = (num/10000)%10;
		
		//System.out.println("abcde="+a+b+c+d+e);
		
		System.out.println("The sum of each digit of number "+num+" is = "+(a+b+c+d+e));
		
		
	}

}
