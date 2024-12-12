package com.oops;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int rown;
		System.out.println("enter number of row = ");
		rown = scanner.nextInt();
		
		int[][] a = new int[rown][];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter no of col for row "+i+" =");
			a[i] = new int[scanner.nextInt()];
			
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=j+1;
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
