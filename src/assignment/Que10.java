package assignment;

import java.util.Scanner;

/*
 * 	WAP to calculate the average value of array elements.
 */
public class Que10 {

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
	    float avg = (float)sum/size;
	    System.out.println("the average of arry element is :"+avg);
	      
		
	}

}
