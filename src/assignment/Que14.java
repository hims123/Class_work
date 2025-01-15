package assignment;

import java.util.Scanner;

/*
 * 	WAP to concatenate a given string to the end of another string.
 */
public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
		
        System.out.println("the concated string is : "+(str1 + str2));
        System.out.println("the concated string is : "+(str1.concat(str2)));
        
	}

}
