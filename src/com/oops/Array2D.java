package com.oops;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[4][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" "+(j+1));
			}
			System.out.println();
		}
		
	}

}
