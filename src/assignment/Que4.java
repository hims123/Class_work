package assignment;

import java.util.Scanner;

/*
 * 	W.A.J.P to check given number is Prime or not?
 */
public class Que4 {

	public static boolean prime(int n) {
		
		if (n<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n) ; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = s.nextInt();
		
		if (prime(n)) {
			System.out.println(n+ " is prime number");
		} else {
			System.out.println(n+ " is not prime number");
		}
		
	}

}
