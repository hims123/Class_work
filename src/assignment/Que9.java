package assignment;

import java.util.Scanner;

/*
 * 	WAP to sum values of an array.
 */
public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the size of the array: ");
	     int size = sc.nextInt();
	       
	     int[] array = new int[size];

	     System.out.println("Enter the elements of the array:");
	     for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }

	        int sum = 0;
	        for (int n : array) {
	            sum = sum + n;
	        }
	        
	        System.out.println("The sum of the array elements is: " + sum);
		
	        
	}
	

}
