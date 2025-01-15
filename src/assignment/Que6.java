package assignment;

import java.util.Scanner;

/*
 * 	W.A.J.P for create Fibonacci Series.
 */
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        
        int a = 0, b = 1, temp;
        
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
	}

}
