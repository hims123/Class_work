package assignment;

import java.util.Scanner;

/*
 * 	W.A.J.P to Take three numbers from the user and print the greatest number.
 */
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 3 numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("your numbers are :"+a+" "+b+" "+c);
		
		if (a>=b && a>=c) {
			System.out.println(a+" is greater number");
		}else if (b>=a && b>=c) {
			System.out.println(b+" is greater number");
		}else {
			System.out.println(c+" is greater number");
		} 

		
	}

}
