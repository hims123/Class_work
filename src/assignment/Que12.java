package assignment;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 	WAP to find the maximum and minimum value of an array.
 */
public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the size of the array: ");
	    int size = sc.nextInt();
	       
	    int[] a = new int[size];

	    System.out.println("Enter the elements of the array:");
	    for (int i = 0; i < size; i++) {
	            a[i] = sc.nextInt();
	     }
	    
	    Arrays.sort(a);
	    System.out.println("the minimum value of array is : "+a[0]);
	    System.out.println("the maximum value of array is : "+a[size-1]);
	    
	    
	}

}
