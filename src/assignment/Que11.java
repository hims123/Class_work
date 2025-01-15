package assignment;

import java.util.Scanner;

/*
 * 	WAP to find the index of an array element.
 */
public class Que11 {

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
	    
	    System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        
        int index = -1; 
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        
	}

}
