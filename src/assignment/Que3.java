package assignment;

import java.util.Scanner;

/*
 * 	W.A.J.P to find factorial for Given Number.
 */
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);
	}

}
