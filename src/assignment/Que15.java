package assignment;

import java.util.Scanner;

/*
 * 	WAP to demonstrate try catch block.
 */
public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter the number a: ");
		a= sc.nextInt();
		System.out.println("enter the number b: ");
		b= sc.nextInt();
		
		try {
			System.out.println("divisin is = "+(a/b));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("division by zero not allowed");
			e.printStackTrace();
		} finally {
			System.out.println("This program is written by Himanshu !!!");
		}
		
	}

}
