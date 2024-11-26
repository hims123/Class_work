package com.basic;
import java.util.*;


public class StudMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks = ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
/*		if (m1>100 & m2>100 & m3>100 & m4>100 & m5>100) {
			System.out.println("ok");
		}
		else {
			System.out.println("Marks out of bound!!");
		}
		*/
		double aggmark = (double) (m1+m2+m3+m4+m5);
		double avg = (double) aggmark/5;
		double percentage =(double) (aggmark/500)*100;
		
		System.out.println("Aggrigate mark of student is = "+aggmark);
		System.out.println("Average mark of student is = "+avg);
		System.out.println("Percentage mark of student is = "+percentage+"%");
		
		
	}

}
