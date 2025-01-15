package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 	WAP to demonstrate multiple catch blocks
 */
public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter the number a: ");
		a= sc.nextInt();
		System.out.println("enter the number b: ");
		b= sc.nextInt();
		
		
			System.out.println("divisin is = "+(a/b));
			
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("enter valid number");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid number");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("division by zero not allowed");
			e.printStackTrace();
		} finally {
			System.out.println("This program is written by Himanshu !!!");
		}
		
	}

}
